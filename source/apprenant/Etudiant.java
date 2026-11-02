package apprenant;

public class Etudiant {
    String numEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    String dateNaissanceEtudiant;
    String telEtudiant;
    String filiereEtudiant;
    public Etudiant(String numEtudiant,String nomEtudiant,String prenomEtudiant,String dateNaissanceEtudiant,String telEtudiant,String filiereEtudiant){
        this.numEtudiant=numEtudiant;
        this.nomEtudiant=nomEtudiant;
        this.prenomEtudiant=prenomEtudiant;
        this.dateNaissanceEtudiant=dateNaissanceEtudiant;
        this.telEtudiant=telEtudiant;
        this.filiereEtudiant=filiereEtudiant;

    }
    public void affichage(){
        System.out.println("Numéro d'étudiant:"+numEtudiant);
        System.out.println("Nom:"+nomEtudiant);
        System.out.println("Prénom:"+prenomEtudiant);
        System.out.println("Date de naissance:"+dateNaissanceEtudiant);
        System.out.println("Téléphone:"+telEtudiant);
        System.out.println("Filière:"+filiereEtudiant);
    }
}

