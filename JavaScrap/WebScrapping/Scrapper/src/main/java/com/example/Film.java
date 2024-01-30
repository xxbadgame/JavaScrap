package com.example;

public class Film {
        private String titre;
        private String anneeSortie;
        private String tempsFilm;
        private String type;
        private float note;
        private int vues;
    
        public Film(String titre, String anneeSortie, String tempsFilm, String type, float note, int vues) {
            this.titre = titre;
            this.anneeSortie = anneeSortie;
            this.tempsFilm = tempsFilm;
            this.type = type;
            this.note = note;
            this.vues = vues;
        }
    
        public String getTitre() {
            return titre;
        }
    
        public String getAnneeSortie() {
            return anneeSortie;
        }
    
        public String getTempsFilm() {
            return tempsFilm;
        }
    
        public String getType() {
            return type;
        }
    
        public float getNote() {
            return note;
        }
    
        public int getVues() {
            return vues;
        }
}
