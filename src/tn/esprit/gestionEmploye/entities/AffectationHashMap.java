package tn.esprit.gestionEmploye.entities;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectationMap;

    public AffectationHashMap() {
        this.affectationMap = new HashMap<>();
    }

   public void ajouterEmployeDepartement( Employe e,Departement d){
        affectationMap.put(e,d);
    }
   public void afficherEmployesEtDepartements(){
       for (Map.Entry<Employe,Departement> entry : affectationMap.entrySet()){
           System.out.println(entry.getKey().getNom() + ":" + entry.getValue().getNomDep());
       }
   }

   public void supprimerEmploye (Employe e){
        affectationMap.remove(e);
       System.out.println("Employé supprimé: "+e.getNom());
   }

   public void supprimerEmployeEtDepartement (Employe e, Departement d){
        if (affectationMap.containsKey(e) && affectationMap.get(e).equals(d)){
            affectationMap.remove(e);
            System.out.println(("Employé supprimé : "+e.getNom() + " du departement " +d.getNomDep()));
        }else {
            System.out.println("Suppression non effectuée");
        }
   }

   public void afficherEmployes (){
        for (Employe e : affectationMap.keySet()){
            System.out.println(e.getNom());
        }
   }

   public void afficherDepartements(){
        for (Departement d : affectationMap.values()){
            System.out.println((d.getNomDep()));
        }
   }
   public boolean rechercherEmploye (Employe e){
        return affectationMap.containsKey(e);
   }

   public boolean rechercherDepartement (Departement d){
        return affectationMap.containsValue(d);
   }

   public TreeMap<Employe, Departement> trierMap(){
    TreeMap<Employe,Departement> sortedMap = new TreeMap<>(new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return  Integer.compare(e1.getId(), e2.getId());
        }
    });
       sortedMap.putAll(affectationMap);
       return sortedMap;
   }


}
