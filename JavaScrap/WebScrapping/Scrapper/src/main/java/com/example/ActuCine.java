package com.example;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ActuCine {

    String url;

    public ActuCine() {

        this.url = "https://www.imdb.com/news/movie/?ref_=nv_nw_mv";

        
    }

    

    public void Affichage(){
        try {
            Document doc = Jsoup.connect(url).get();
            Elements TextesActualites = doc.getElementsByClass("ipc-list-card--border-line ipc-list-card sc-43930a5b-0 leyzYS ipc-list-card--base");
            System.out.println(TextesActualites.text());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        

        
}