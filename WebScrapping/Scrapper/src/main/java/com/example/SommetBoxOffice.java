package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SommetBoxOffice {

    String url;

    public SommetBoxOffice() {

        this.url = "https://www.imdb.com/chart/boxoffice/?ref_=nv_ch_cht";

    }

    public void Affichage(){
        try {
            
            Document doc = Jsoup.connect(url).get();
            Elements TextesActualites = doc.getElementsByClass("ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent");
            System.out.println(TextesActualites.text());

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    
}
