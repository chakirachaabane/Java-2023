package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food>{
    private int  nbrLegs;
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(){

    }

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs){
        super( family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }


    // Instruction 37:
    @Override
    public void eatPlantAndMeat(Food both) {
        if (both.equals(Food.BOTH)) {
            System.out.println("This terrestrial eats everything: Omnivore");
        } else System.out.println("This terrestrial doesn't eat everything: Not omnivore");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat.equals(Food.MEAT)) {
            System.out.println("This terrestrial eats meat: Carnivore");
        } else System.out.println("This terrestrial doesn't eat meat: Not carnivore");

    }

    @Override
    public void eatPlant(Food plant) {
        if (plant.equals(Food.PLANT)) {
            System.out.println("This terrestrial eats plants: Herbivore");
        } else System.out.println("This terrestrial doesn't eat plants: Not herbivore");
    }
}
