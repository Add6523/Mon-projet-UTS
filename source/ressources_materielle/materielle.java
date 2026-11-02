package ressources_materielle;

public class materielle {
    String codMaterielle;
    String nomMaterielle;
    String dispoMaterielle;
    String etatMaterielle;
    public materielle(String codMaterielle,String nomMaterielle,String dispoMaterielle,String etatMaterielle){
        this.codMaterielle=codMaterielle;
        this.nomMaterielle=nomMaterielle;
        this.dispoMaterielle=dispoMaterielle;
        this.etatMaterielle=etatMaterielle;

    }
    public void affichage(){
        System.out.println("Code:"+codMaterielle);
        System.out.println("Nom:"+nomMaterielle);
        System.out.println("Disponibilite:"+dispoMaterielle);
        System.out.println("Etat:"+etatMaterielle);
    }
}
