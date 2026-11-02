package activite_pedagogique;

public class Cours {
    String numCours;
    String datedebutCours;
    String datefinCours;
    public Cours(String numCours,String datedebutCours,String datefinCours){
        this.numCours=numCours;
        this.datedebutCours=datedebutCours;
        this.datefinCours=datefinCours;
    }
    public void affichage(){
        System.out.println("Numéro:"+numCours);
        System.out.println("Date de début:"+datedebutCours);
        System.out.println("Date de fin:"+datefinCours);
    }
}
