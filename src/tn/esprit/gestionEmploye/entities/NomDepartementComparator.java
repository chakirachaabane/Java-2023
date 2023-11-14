package tn.esprit.gestionEmploye.entities;

import java.util.Comparator;

public class NomDepartementComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getDepartement().compareTo(e2.getDepartement());
    }
}
