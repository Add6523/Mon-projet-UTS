package ressources_materielle;

public class batiments {
    String nomBatiment;
    String numBatiment;
    String positBatiment;
    public batiments(String nomBatiment,String numBatiment,String positBatiment){
        this.nomBatiment=nomBatiment;
        this.numBatiment=numBatiment;
        this.positBatiment=positBatiment;

    }
    public void affichage(){
        System.out.println("Nom:"+nomBatiment);
        System.out.println("Numero:"+numBatiment);
        System.out.println("position:"+positBatiment);
    }
}
