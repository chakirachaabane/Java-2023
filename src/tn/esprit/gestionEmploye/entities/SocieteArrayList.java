package tn.esprit.gestionEmploye.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employeList= new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe e) {
    employeList.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e:employeList){
           if (e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
       return employeList.contains(e); // or with equals
    }

    @Override
    public void supprimerEmploye(Employe e) {
    if (employeList.remove(e)) {
        System.out.println("Element supprimé");
    }else{
        System.out.println("Element introuvable");
    }
    }

    @Override
    public void displayEmploye() {
        //System.out.println(employeList);
        for(Employe e:employeList){
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade()  {
      Collections.sort(employeList,new NomDepartementComparator().thenComparing(new GradeComparator()));
    }
}
