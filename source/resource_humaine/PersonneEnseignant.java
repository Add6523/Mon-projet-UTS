package resource_humaine;

public class PersonneEnseignant extends Personne {
    String nomFilliere;
    public PersonneEnseignant(String matriPersonne,String nomPersonne,String prenomPersonne,String numeroPersonne,String nomFilliere){
        super(matriPersonne,nomPersonne,prenomPersonne,numeroPersonne);
        this.nomFilliere=nomFilliere;
    }
    @Override
    public void affichage(){
        super.affichage();
        System.out.println("Filière:"+nomFilliere);
    }
}
