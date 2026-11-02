package Formation;

public class departement {
    String nomDepartement;
    String numDepartement;
    public departement(String nomDepartement,String numDepartement){
        this.nomDepartement=nomDepartement;
        this.numDepartement=numDepartement;
    }
    public void affichage(){
        System.out.println("Nom du département:"+nomDepartement);
        System.out.println("Numéro du département:"+numDepartement);
    }
}
