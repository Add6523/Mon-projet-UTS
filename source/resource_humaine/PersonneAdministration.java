package resource_humaine;

public class PersonneAdministration extends Personne {
    String poste;
    public PersonneAdministration(String matriPersonne,String nomPersonne,String prenomPersonne,String numeroPersonne,String poste){
        super(matriPersonne,nomPersonne,prenomPersonne,numeroPersonne);
        this.poste=poste;
    }
    @Override
    public void affichage(){
        super.affichage();
        System.out.println("Poste:"+poste);
    }
}
