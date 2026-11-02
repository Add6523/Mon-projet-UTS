package application;

import apprenant.Etudiant;
import Formation.UFR;
import Formation.departement;
import Formation.filliere;
import Formation.inscription;
import activite_pedagogique.Cours;
import activite_pedagogique.Devoir;
import activite_pedagogique.Module;
import resource_humaine.Enseignant;
import resource_humaine.Personnel;
import resource_humaine.PersonneAdministration;
import resource_humaine.PersonneEnseignant;
import ressources_materielle.batiments;
import ressources_materielle.materielle;
import ressources_materielle.salle;

public class main {
    public static void main(String[] args) {
        System.out.println("===== FORMATION =====");
        UFR ufr = new UFR("Sciences et Techniques", "UFR01");
        ufr.affichage();
        System.out.println();

        departement dep = new departement("Informatique", "DEP01");
        dep.affichage();
        System.out.println();

        filliere fil = new filliere("Génie Logiciel", "FIL01");
        fil.affichage();
        System.out.println();

        inscription ins = new inscription("INS001", "02/11/2026", "150000");
        ins.affichage();
        System.out.println();

        System.out.println("===== APPRENANTS =====");
        Etudiant etu = new Etudiant("ETU001", "Sawadogo", "Adama", "01/01/2004", "70123456", "Génie Logiciel");
        etu.affichage();
        System.out.println();

        System.out.println("===== ACTIVITES PEDAGOGIQUES =====");
        Cours cours = new Cours("COURS01", "02/11/2026", "20/12/2026");
        cours.affichage();
        System.out.println();

        Module mod = new Module("MOD01", "Programmation Java", "40h");
        mod.affichage();
        System.out.println();

        Devoir dev = new Devoir("DEV001", "Devoir de Java", "02/11/2026", "09/11/2026");
        dev.affichage();
        System.out.println();

        System.out.println("===== RESSOURCES HUMAINES =====");
        Enseignant ens = new Enseignant("ENS001", "Ouedraogo", "Paul", "Disponible", "70000000");
        ens.affichage();
        System.out.println();

        Personnel pers = new Personnel("PER001", "Kabore", "Awa", "Secrétaire");
        pers.affichage();
        System.out.println();

        PersonneEnseignant persEns = new PersonneEnseignant("PE001", "Zongo", "Ibrahim", "70111111", "Génie Logiciel");
        persEns.affichage();
        System.out.println();

        PersonneAdministration persAdm = new PersonneAdministration("PA001", "Compaore", "Mariam", "70222222", "Directrice des études");
        persAdm.affichage();
        System.out.println();

        System.out.println("===== RESSOURCES MATERIELLES =====");
        batiments bat = new batiments("Bâtiment A", "BAT01", "Nord");
        bat.affichage();
        System.out.println();

        salle sal = new salle("S101", "Amphi 1", "Amphithéâtre", "300", "Disponible");
        sal.affichage();
        System.out.println();

        materielle mat = new materielle("MAT001", "Vidéoprojecteur", "Disponible", "Bon");
        mat.affichage();
    }
}
