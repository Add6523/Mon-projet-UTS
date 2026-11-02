package ressources_materielle;

public class salle {
    String numSalle;
    String nomSalle;
    String typeSalle;
    String capaSalle;
    String dispoSalle;
    public salle(String numSalle,String nomSalle,String typeSalle,String capaSalle,String dispoSalle){
        this.numSalle=numSalle;
        this.nomSalle=nomSalle;
        this.typeSalle=typeSalle;
        this.capaSalle=capaSalle;
        this.dispoSalle=dispoSalle;

    }
    public void affichage(){
        System.out.println("Numero:"+numSalle);
        System.out.println("Nom:"+nomSalle);
        System.out.println("Type:"+typeSalle);
        System.out.println("Capacite:"+capaSalle);
        System.out.println("Disponibilite:"+dispoSalle);
    }
}
