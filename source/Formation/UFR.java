package Formation;

public class UFR {
    String nomUFR;
    String numUFR;
    public UFR(String nomUFR,String numUFR){
        this.nomUFR=nomUFR;
        this.numUFR=numUFR;
    }
    public void affichage(){
        System.out.println("Nom de l'UFR:"+nomUFR);
        System.out.println("Numéro de l'UFR:"+numUFR);
    }
}
