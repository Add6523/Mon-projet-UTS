package resource_humaine;

public class Personne {
    String matriPersonne;
    String nomPersonne;
    String prenomPersonne;
    String numeroPersonne;
    public Personne(String matriPersonne,String nomPersonne,String prenomPersonne,String numeroPersonne){
        this.matriPersonne=matriPersonne;
        this.nomPersonne=nomPersonne;
        this.prenomPersonne=prenomPersonne;
        this.numeroPersonne=numeroPersonne;

    }
    public void affichage(){
        System.out.println("Matricule:"+matriPersonne);
        System.out.println("Nom:"+nomPersonne);
        System.out.println("Prénom:"+prenomPersonne);
        System.out.println("Numéro:"+numeroPersonne);
    }
}
