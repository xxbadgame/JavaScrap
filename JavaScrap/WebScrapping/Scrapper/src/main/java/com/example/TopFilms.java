package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

// Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopFilms {

     private String url;
     

    public TopFilms() {

        this.url = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";


    }

    public void CreationListesFilms(){
        
        try {
            Document doc = Jsoup.connect(url).get();

            Elements TextesActualites = doc.getElementsByClass("ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent");
            Pattern patternAnnee = Pattern.compile("\\d{4}");

            for(Element actualite : TextesActualites){
                String texteActu = actualite.text();


                Matcher matcher = patternAnnee.matcher(texteActu);
                if (matcher.find()) {

                    int premierEspace = texteActu.indexOf(" ");

                    if (premierEspace != -1) {
                    // Extraire le titre
                        String texte = texteActu.substring(premierEspace + 1, matcher.start()).trim();
                        System.out.println(texte);
                    // Reste des traitements pour extraire les autres informations...
                }
                
            }
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
