package tn.esprit.gestionEmploye.entities;

import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDep;
    private int nbEmployes;

    public Departement(){}

    public Departement(int id, String nomDep, int nbEmployes) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbEmployes = nbEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Departement d) {
            return id == d.id && nomDep.equals(d.nomDep);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return id+nomDep.hashCode();
    }

    @Override
    public int compareTo(Departement d) {
        return id-d.id;
    }
}
