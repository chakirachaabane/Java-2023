package tn.esprit.gestionEmploye.main;
import tn.esprit.gestionEmploye.entities.*;

import java.util.Map;
import java.util.TreeMap;

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

        //*************************************************        Prosit 10 *************************************************//
        IDepartement<Departement> gestionDep = new DepartementHashSet();
        Departement d0 =new Departement(0,"Dep0",30);
        Departement d1 =new Departement(1,"Dep1",15);
        Departement d2 =new Departement(2,"Dep2",20);
        Departement d3 =new Departement(3,"Dep3",18);
        Departement d4 =new Departement(4,"Dep4",30);


        gestionDep.ajouterDepartement(d4);
        gestionDep.ajouterDepartement(d1);
        gestionDep.ajouterDepartement(d0);
        gestionDep.ajouterDepartement(d2);
        gestionDep.ajouterDepartement(d3);

        gestionDep.displayDepartement();

        System.out.println("Nom dep existant? "+gestionDep.rechercherDepartement("Dep5"));
        System.out.println("Departement existant? "+gestionDep.rechercherDepartement(d2));
        gestionDep.supprimerDepartement(d0);
        System.out.println("La liste apres supression:");
        gestionDep.displayDepartement();
        System.out.println("La liste triée: "+ gestionDep.trierDepartementById());
//*************************************************        Prosit 11 *************************************************//
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(e1,d4);
        affectationHashMap.ajouterEmployeDepartement(e2, d2);
        affectationHashMap.ajouterEmployeDepartement(e3, d2);
        affectationHashMap.ajouterEmployeDepartement(e5, d1);


        System.out.println("\nAffichage initial :");
        affectationHashMap.afficherEmployesEtDepartements();

        affectationHashMap.ajouterEmployeDepartement(e1, d3);

        System.out.println("\nAffichage après la tentative d'ajout du même employé à un autre département :");
        affectationHashMap.afficherEmployesEtDepartements();

        affectationHashMap.supprimerEmploye(e3);
        System.out.println("\nAffichage après la suppression d'un employé :");
        affectationHashMap.afficherEmployesEtDepartements();

        affectationHashMap.supprimerEmployeEtDepartement(e2,d2);
        System.out.println("\nAffichage après la suppression d'un employé d'un département spécifique :");
        affectationHashMap.afficherEmployesEtDepartements();

        System.out.println("La liste des employes: ");
        affectationHashMap.afficherEmployes();

        System.out.println("La liste des departements: ");
        affectationHashMap.afficherDepartements();

        System.out.println("\nRecherche de l'employé  : " + affectationHashMap.rechercherEmploye(e1));
        System.out.println("\nRecherche de l'employé  : " + affectationHashMap.rechercherDepartement(d1));

        System.out.println( "La liste triée par l id des employes");
        TreeMap<Employe,Departement> sortedMap = affectationHashMap.trierMap();
        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey().getNom() + " -> " + entry.getValue().getNomDep());
        }
    }
}