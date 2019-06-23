package com.share.investment.service.impl;

import com.share.investment.model.dao.Price;
import com.share.investment.model.dao.Share;
import com.share.investment.service.FinanceAPIService;
import com.share.investment.service.PriceService;
import com.share.investment.service.ShareService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class FinanceAPIServiceImpl implements FinanceAPIService {

    @Autowired
    ShareService shareService;

    @Autowired
    PriceService priceService;

    private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(String shareName) throws MalformedURLException {
        this.url = new URL("https://financialmodelingprep.com/api/v3/stock/real-time-price/" + shareName);
    }

    public JSONObject getValuesByFinanceAPI() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getUrl().openStream(), "UTF-8"))) {

            StringBuilder stringBuilder = new StringBuilder();

            for (String line; (line = reader.readLine()) != null; ) {
                stringBuilder.append(line);
            }

            return new JSONObject(stringBuilder.toString());

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void updatePriceByFinanceAPI() throws MalformedURLException {

        //todo
        System.out.println("updatePriceByFinanceAPI is called");


        List<Share> shareList = shareService.listShare();
        for (Share share : shareList) {
            setUrl(share.getShareName());
            saveShareValues(getValuesByFinanceAPI(), share);
        }
    }

    private void saveShareValues(JSONObject valuesByFinanaceAPI, Share share) {

        String shareName = valuesByFinanaceAPI.getString("symbol");
        BigDecimal sharePrice = new BigDecimal(valuesByFinanaceAPI.getDouble("price"));

        Price price = priceService.getPriceByShareId(share.getShareId());

        if (price != null) {
            priceService.updatePrice(price.getPriceId(), share.getShareId(), sharePrice);

        } else {
            priceService.addPrice(share.getShareId(), sharePrice);
        }
    }
}