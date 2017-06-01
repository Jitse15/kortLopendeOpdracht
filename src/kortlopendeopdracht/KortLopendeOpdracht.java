/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kortlopendeopdracht;
/**
 *
 * @author 10572
 */
public class KortLopendeOpdracht {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int uitkomst = somFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5+6 = ";
        int antwoord = vermenigvuldigFunctie(3,4);
        String begeleidendeTekst2 = "de uitkomst van 3*4 = ";
        int antwoord2 = faculteitFunctie(8);
        String begeleidendeTekst3 = "de uitkomst van 8! = "; 
        printFunctie(begeleidendeTekst, uitkomst);
        printFunctie(begeleidendeTekst2, antwoord); 
        printFunctie(begeleidendeTekst3, antwoord2); 
    }
    public static int somFunctie(int getal1, int getal2){
        int optelling = getal1+getal2;
        
        return optelling;
    }
    
    public static int vermenigvuldigFunctie(int getal1, int getal2){
        int vermenigvuldiging = getal1 * getal2;
        
        return vermenigvuldiging;
    }
    
    public static int faculteitFunctie(int getal1){
    int n = getal1;
    int antwoord2 = 1;
    for (int i = 1; i <= n; i++) {
    antwoord2 = antwoord2 * i;
}
    return antwoord2; 
    } 
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }
}

   
    
