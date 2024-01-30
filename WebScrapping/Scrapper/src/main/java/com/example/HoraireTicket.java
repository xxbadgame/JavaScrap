package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class HoraireTicket {

    String url;

    public HoraireTicket() {

        this.url = "https://www.imdb.com/showtimes/?ref_=nv_mv_sh";

    }

    public void Affichage(){
        try {
            Document doc = Jsoup.connect(url).get();
            Elements horaireTicket = doc.getElementsByClass("list_item");
            System.out.println(horaireTicket.text());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
