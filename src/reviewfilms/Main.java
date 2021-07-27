package reviewfilms;

/*
 * @author Zefren
 */
public class Main {

    public static void main(String[] args) {
        IHMPrincipale ihm = new IHMPrincipale();
        Fonctions function = new Fonctions();
        function.setIhm(ihm);
        ihm.setFonctions(function);
        ihm.setVisible(true);
    }
    
}
