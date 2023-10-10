package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public Dolphin(){

    }

    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family, name, age, isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString()+"  "+swimmingSpeed;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
