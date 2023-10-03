package tn.esprit.gestionzoo.entities;

public class Zoo  {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=25; // Instruction 14

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;}else {
            System.out.println("Le nom du zoo doit etre saisi");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public  Zoo(){
        animals = new Animal[nbrCages];
    }
    //Instruction 6 :
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;


    }
    //Instruction 10 :
    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    //Instruction 8 :
    public void displayZoo() {
        System.out.println("Name: " + this.name + " City: " + this.city + " Number of cages:" + this.nbrCages);
    }

    //Instruction 9 :
    @Override
    public String toString() {
        return (name + " " + city + " " + nbrCages);
    }
    //Instruction 11 :
    public void afficherAnimaux() {

        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }
    //Instruction 11 :
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }
    //Instruction 12 :
    public boolean addAnimalUnique(Animal animal) {

        /*for (int i = 0; i < nbrCages; i++) {
            if ((animals[i] == null) && (searchAnimal(animal) == -1)) {
                animals[i] = animal;
                return true;
            }
        }
        return false;*/
        // Instruction 17
        int nbAnimals= countAnimal();
        for (int i=0;i<nbrCages; i++){
            if ((isZooFull() == false) && (searchAnimal(animal)== -1) ){
                animals[nbAnimals] = animal;
                return true;
            }

        }
        return false;
    }
    //Instruction 13 :
    public boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);
        if (indice != -1) {
            animals[indice] = null;
            System.out.println("Animal deleted successfully");
            return true;
        }System.out.println("Deleting: failed");
        return false;

    }

    // Instruction 15
    public int countAnimal(){
        int nbAnimals=0;
        for (Animal animal: animals){
            if (animal != null){
                nbAnimals++ ;
            }
        }
        return nbAnimals;
    }
    public boolean isZooFull(){
        int j=countAnimal();
        return j >= nbrCages;
    }

    // Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.countAnimal()>z2.countAnimal()) {
            return z1;
        }
        else if (z2.countAnimal()>z1.countAnimal()){
            return z2;
        }
        return null;
    }




}
