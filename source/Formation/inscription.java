package Formation;

public class inscription {
    String numInscription;
    String dateInscription;
    String montantInscription;
    public inscription(String numInscription,String dateInscription,String montantInscription){
        this.numInscription=numInscription;
        this.dateInscription=dateInscription;
        this.montantInscription=montantInscription;
    }
    public void affichage(){
        System.out.println("Numéro d'inscription:"+numInscription);
        System.out.println("Date d'inscription:"+dateInscription);
        System.out.println("Montant d'inscription:"+montantInscription);
    }
}
