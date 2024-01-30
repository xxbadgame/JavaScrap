package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class TopFilms {

     private String url;
     

    public TopFilms() {

        this.url = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";


    }

    public void CreationListesFilms(){
        
        try {
            Document doc = Jsoup.connect(url).get();

            // ***********************************************************
            // Travaille des titres
            // ***********************************************************

            Elements titlesTop = doc.getElementsByClass("ipc-title__text");
            //Pattern pattern = Pattern.compile("^\\d+\\.\\s(.+)", Pattern.MULTILINE);

            for(Element title : titlesTop){
                String texte = title.text();

                //System.out.println(texte);
            }


            
            // ***********************************************************
            // Travaille des annee sortie / temps / typeEntree
            // ***********************************************************
            
        
    
            //*[@id="__next"]/main/div/div[3]/section/div/div[2]/div/div[1]/span
            int NumFilm = 250;

            //Element InfosFilms = doc.select("#__next > main > div > div.ipc-page-content-container.ipc-page-content-container--center > section > div >div.ipc-page-grid.ipc-page-grid--bias-left > div > ul >li:nth-child("+NumFilm+") > div.ipc-metadata-list-summary-item__c > div > div > div.sc-1e00898e-7.hcJWUf.cli-title-metadata > span:nth-child(1)").first();

            //System.out.println(InfosFilms);

            ArrayList<Integer> anneesSorties = new ArrayList<>();
            ArrayList<String> tempsFilms = new ArrayList<>();
            ArrayList<String> typeEntree = new ArrayList<>();

            /*for(int i=1 ; i <= NumFilm; i++){
                String annees = doc.select("#__next > main > div > div.ipc-page-content-container.ipc-page-content-container--center > section > div >div.ipc-page-grid.ipc-page-grid--bias-left > div > ul >li:nth-child("+i+") > div.ipc-metadata-list-summary-item__c > div > div > div.sc-1e00898e-7.hcJWUf.cli-title-metadata > span:nth-child(1)").first().text();
                System.out.println(annees);
            }*/

            // ***********************************************************
            // Note et vues
            // ***********************************************************

            Elements notes = doc.getElementsByClass("ipc-rating-star ipc-rating-star--base ipc-rating-star--imdb ratingGroup--imdb-rating");

            for(Element note : notes){
                String texte = note.text();

                //System.out.println(texte);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Affichage(){
        try {
            
            Document doc = Jsoup.connect(url).get();
            Elements TextesActualites = doc.getElementsByClass("ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent");

            for(Element actualite : TextesActualites){
                String texte = actualite.text();
                System.out.println(texte);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    
}
