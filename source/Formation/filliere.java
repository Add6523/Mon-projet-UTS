package Formation;

public class filliere {
    String nomFilliere;
    String numFilliere;
    public filliere(String nomFilliere,String numFilliere){
        this.nomFilliere=nomFilliere;
        this.numFilliere=numFilliere;
    }
    public void affichage(){
        System.out.println("Nom de la filière:"+nomFilliere);
        System.out.println("Numéro de la filière:"+numFilliere);
    }
}
