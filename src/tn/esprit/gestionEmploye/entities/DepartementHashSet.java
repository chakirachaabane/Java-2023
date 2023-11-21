package tn.esprit.gestionEmploye.entities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departementSet = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement d) {
    departementSet.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d: departementSet ){
            if (d.getNomDep().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departementSet.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
       if(departementSet.remove(d)) {
           System.out.println("Supression effectuée");
       }
      else{
          System.out.println("Supression non effectuée");
      }
    }

    @Override
    public void displayDepartement() {
        //System.out.println(departementSet);
        Iterator<Departement> it = departementSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet treeset = new TreeSet<>(departementSet);
       return treeset;
    }
}
