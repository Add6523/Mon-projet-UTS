package activite_pedagogique;

public class Devoir {
    String numDevoir;
    String nomDevoir;
    String datedebutDevoir;
    String datefinDevoir;
    public Devoir(String numDevoir,String nomDevoir,String datedebutDevoir,String datefinDevoir){
        this.numDevoir=numDevoir;
        this.nomDevoir=nomDevoir;
        this.datedebutDevoir=datedebutDevoir;
        this.datefinDevoir=datefinDevoir;

    }
    public void affichage(){
        System.out.println("Numéro:"+numDevoir);
        System.out.println("Nom:"+nomDevoir);
        System.out.println("Date de début:"+datedebutDevoir);
        System.out.println("Date de fin:"+datefinDevoir);
    }
}
