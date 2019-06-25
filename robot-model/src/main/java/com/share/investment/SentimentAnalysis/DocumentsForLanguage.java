package com.share.investment.SentimentAnalysis;

import java.util.ArrayList;
import java.util.List;

class Document {
    public String id, text;

    public Document(String id, String text){
        this.id = id;
        this.text = text;
    }
}

public class DocumentsForLanguage {
    public List<Document> documents;

    public DocumentsForLanguage() {
        this.documents = new ArrayList<Document>();
    }
    public void add(String id, String text) {
        this.documents.add (new Document (id, text));
    }
}