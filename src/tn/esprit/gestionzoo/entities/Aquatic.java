package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {

    protected String habitat;


    public Aquatic(){

    }

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super( family, name, age, isMammal);
        this.habitat=habitat;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() +" "+ habitat;
    }


//    public void swim(){
//        System.out.println("This aquatic animal is swimming.");
//    }

    // Instruction 28
    public abstract void swim();

    // Instruction 31
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj instanceof Aquatic aquatic){
            return getAge() == aquatic.getAge() && getName().equals(aquatic.getName()) && habitat.equals(aquatic.habitat);
        }

        return false;
    }

}



