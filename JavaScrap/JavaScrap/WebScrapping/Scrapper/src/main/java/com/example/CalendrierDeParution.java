package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CalendrierDeParution {

    String url;

    public CalendrierDeParution() {

        this.url = "https://www.imdb.com/calendar/?ref_=nv_mv_cal";

    }

    public void Affichage(){
        try {
            Document doc = Jsoup.connect(url).get();
            Elements calendrierParution = doc.getElementsByClass("ipc-metadata-list-summary-item ipc-metadata-list-summary-item--click sc-8c2b7f1f-0 eWVqBf");
            System.out.println(calendrierParution.text());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
