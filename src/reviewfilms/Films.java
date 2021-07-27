/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewfilms;

/**
 *
 * @author Moi
 */
public class Films {

    private String image;
    private String titre;
    private String auteur;
    private int note;
    private int nbExemplaires;

    public void setNbExemplaires(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public Films(String titre, String image, int note, String auteur) {
        this.image = image;
        this.titre = titre;
        this.note = note;
        this.auteur = auteur;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "titre= " + titre + ", image= " + image + ", note= " + note + ", auteur= " + auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public String getTitre() {
        return titre;
    }
}
