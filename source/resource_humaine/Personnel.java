package resource_humaine;

public class Personnel {
    String matriPersonnel;
    String nomPersonnel;
    String prenomPersonnel;
    String postPersonnel;
    public Personnel(String matriPersonnel,String nomPersonnel,String prenomPersonnel,String postPersonnel){
        this.matriPersonnel=matriPersonnel;
        this.nomPersonnel=nomPersonnel;
        this.prenomPersonnel=prenomPersonnel;
        this.postPersonnel=postPersonnel;

    }
    public void affichage(){
        System.out.println("Matricule:"+matriPersonnel);
        System.out.println("Nom:"+nomPersonnel);
        System.out.println("Prénom:"+prenomPersonnel);
        System.out.println("Poste:"+postPersonnel);
    }
}
