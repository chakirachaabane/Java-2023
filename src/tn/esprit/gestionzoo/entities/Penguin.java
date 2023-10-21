package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }


    public Penguin() {

    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    // Instruction 23

    @Override
    public String toString() {
        return super.toString() + " " + swimmingDepth;
    }


    // Instruction 28
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

