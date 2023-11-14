package tn.esprit.gestionEmploye.main;
import tn.esprit.gestionEmploye.entities.*;
public class Main {
    public static void main(String[] args) {
        IGestion<Employe> societe = new SocieteArrayList();

        Employe e1 = new Employe(1,"chakira","chaabane","IT",7);
        Employe e2 = new Employe(4,"sana","chaabane","SC",5);
        Employe e3 = new Employe(6,"safa","chaabane","SC",3);
        Employe e4 = new Employe(3,"torki","chaabane","IT",6);
        Employe e5 = new Employe(3,"toto","chaabane","ARC",8);
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.displayEmploye();
        System.out.println("Existe? "+societe.rechercherEmploye(e1));
        System.out.println("Existe? "+societe.rechercherEmploye(e5));
        societe.supprimerEmploye(e2);
        System.out.println("**Liste apres suppression: ");
        societe.displayEmploye();
        societe.trierEmployeParId();
        System.out.println("**Liste triée par id:");
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("**Liste triée par nomDep et grade:");
        societe.displayEmploye();

    }
}