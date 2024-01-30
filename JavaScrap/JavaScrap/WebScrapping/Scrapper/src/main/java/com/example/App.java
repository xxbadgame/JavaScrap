package com.example;


import java.util.Scanner;
//import java.io.IOException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;



public class App {
    public static void main(String[] args) {
        

        ActuCine lesActues = new ActuCine();
        CalendrierDeParution calendrier = new CalendrierDeParution();
        HoraireTicket horaireEtticket = new HoraireTicket();
        FilmsRegarde filmsPlusRegarde = new FilmsRegarde();
        SommetBoxOffice sommetBF = new SommetBoxOffice();
        TopFilms topFilms = new TopFilms();



        System.out.println("=========================================================================================================");


        System.out.println("     ____.  _________   _________      _________                          .__                ");
        System.out.println("    |    | /  _  \\   \\ /   /  _  \\    /   _____/ ________________  ______ |__| ____    ____  ");
        System.out.println("    |    |/  /_\\  \\   Y   /  /_\\  \\   \\_____  \\_/ ___\\_  __ \\__  \\ \\____ \\|  |/    \\  / ___\\ ");
        System.out.println("/\\__|    /    |    \\     /    |    \\  /        \\  \\___|  | \\// __ \\|  |_> >  |   |  \\/ /_/  >");
        System.out.println("\\________\\____|__  /\\___/\\____|__  / /_______  /\\___  >__|  (____  /   __/|__|___|  /\\___  / ");
        System.out.println("                 \\/              \\/          \\/     \\/           \\/|__|           \\//_____/  ");

        System.out.println("");

        System.out.println("1. Calendrier de parution");
        System.out.println("2. Top 250 des films");
        System.out.println("3. Films les plus regardés");
        System.out.println("4. Sommet du box-office");
        System.out.println("5. Horaire et ticket");
        System.out.println("6. Actualité du cinéma");

        System.out.println("");
        
        System.out.println("========================================================================================================");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez une option : ");
        int input = scanner.nextInt();
        System.out.println("Vous avez entré : " + input);
        scanner.close();
            
        switch (input) {
            case 1:
                System.out.println("Calendrier de parution");
                calendrier.Affichage();
                break;

            case 2:
                System.out.println("Top 250 des films");
                topFilms.CreationListesFilms();
                break;

            case 3:
                System.out.println("Films les plus regardés");
                filmsPlusRegarde.Affichage();
                break;

            case 4:
                System.out.println("Sommet du box-office");
                sommetBF.Affichage();
                break;

            case 5:
                System.out.println("Horaire et ticket");
                horaireEtticket.Affichage();
                break;

            case 6:
                System.out.println("Actualité du cinéma");
                lesActues.Affichage();
                break;

            default:
                System.out.println("Il faut séléctionner une des options");
        }
    }
}

