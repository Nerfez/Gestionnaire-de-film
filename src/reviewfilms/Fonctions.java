package reviewfilms;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fonctions {

    IHMPrincipale ihm;

    public void Review() {
        try {
            File file = new File("src/names/reviews.txt");
            FileReader fr = new FileReader(file); 
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            ihm.review(sb.toString());
        } catch (Exception ex) {
            return;
        }
    }

    public void reviewSave(String debut, String phrase) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/names/reviews.txt"));
            bw.write(debut + "\n");
            bw.write(phrase + "");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Fonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ReadProfil(String pseudo, String image, String imgun, String imgdeux, String imgtrois, String bio, String filmvu) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/names/profil.txt"));
            bw.write(pseudo + "\n");
            bw.write(image + "\n");
            bw.write(imgun + "\n");
            bw.write(imgdeux + "\n");
            bw.write(imgtrois + "\n");
            bw.write(bio + "\n");
            bw.write(filmvu + "\n");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Fonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void WriteProfil() {
        try {
            InputStream ips = new FileInputStream("src/names/profil.txt");
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String pseudo = br.readLine();
            String image = br.readLine();
            String imgun = br.readLine();
            String imgdeux = br.readLine();
            String imgtrois = br.readLine();
            String bio = br.readLine();
            String filmvu = br.readLine();
            ihm.Profil(pseudo, image, imgun, imgdeux, imgtrois, bio, filmvu);
        } catch (IOException ex) {
            Logger.getLogger(Fonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setIhm(IHMPrincipale ihm) {
        this.ihm = ihm;
    }

}
