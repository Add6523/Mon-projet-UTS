package resource_humaine;

public class Enseignant {
    String matriEnseignant;
    String nomEnseignant;
    String prenomEnseignant;
    String dispoEnseignant;
    String telEnseignant;
    public Enseignant(String matriEnseignant,String nomEnseignant,String prenomEnseignant,String dispoEnseignant,String telEnseignant){
        this.matriEnseignant=matriEnseignant;
        this.nomEnseignant=nomEnseignant;
        this.prenomEnseignant=prenomEnseignant;
        this.dispoEnseignant=dispoEnseignant;
        this.telEnseignant=telEnseignant;

    }
    public void affichage(){
        System.out.println("Matricule:"+matriEnseignant);
        System.out.println("Nom:"+nomEnseignant);
        System.out.println("Prénom:"+prenomEnseignant);
        System.out.println("Disponibilite:"+dispoEnseignant);
        System.out.println("Téléphone:"+telEnseignant);
    }
}
