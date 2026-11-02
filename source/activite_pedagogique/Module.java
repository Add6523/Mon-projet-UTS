package activite_pedagogique;

public class Module {
    String codeModule;
    String nomModule;
    String volumeHoraireModule;
    public Module(String codeModule,String nomModule,String volumeHoraireModule){
        this.codeModule=codeModule;
        this.nomModule=nomModule;
        this.volumeHoraireModule=volumeHoraireModule;
    }
    public void affichage(){
        System.out.println("Code:"+codeModule);
        System.out.println("Nom:"+nomModule);
        System.out.println("Volume horaire:"+volumeHoraireModule);
    }
}
