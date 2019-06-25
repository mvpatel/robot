package com.share.investment.SentimentAnalysis;

import java.util.ArrayList;
import java.util.List;

class DocumentForSentimentAnalysis {
    public String id, language, text;

    public DocumentForSentimentAnalysis(String id, String language, String text){
        this.id = id;
        this.language = language;
        this.text = text;
    }
}

public class DocumentsForSentimentAnalysis {
    public List<DocumentForSentimentAnalysis> documents;

    public DocumentsForSentimentAnalysis() {
        this.documents = new ArrayList<DocumentForSentimentAnalysis>();
    }
    public void add(String id, String language, String text) {
        this.documents.add (new DocumentForSentimentAnalysis(id, language, text));
    }
}