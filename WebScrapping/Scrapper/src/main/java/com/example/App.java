package com.example;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;;

public class App 
{
    public static void main( String[] args )
    {
        //AMAZON et BEST BUY
        String url = "https://www.amazon.fr/";
        try {
            Document doc = Jsoup.connect(url).get();
            Element elementByID = elementByID.getElementById("")

            

        } catch (IOException e) {
            e.printStackTrace();
        }
          
    }
}
