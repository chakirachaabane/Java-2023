package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NUMBER_OF_CAGES = 25; // Instruction 14

    private static final int NUMBER_OF_AQUATICS = 10;
    private Aquatic[] aquaticAnimals = new Aquatic[NUMBER_OF_AQUATICS]; // Instruction 25
    private int nbrAquatic = 0;


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
            this.name = name;
        } else {
            System.out.println("Le nom du zoo doit etre saisi");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Zoo() {
        animals = new Animal[NUMBER_OF_CAGES
                ];
    }

    //Instruction 6 :
    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES
                ];
        this.name = name;
        this.city = city;


    }

    //Instruction 10 :
    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < NUMBER_OF_CAGES
                ; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    //Instruction 8 :
    public void displayZoo() {
        System.out.println("Name: " + this.name + " City: " + this.city + " Number of cages:" + NUMBER_OF_CAGES
        );
    }

    //Instruction 9 :
    @Override
    public String toString() {
        return (name + " " + city + " " + NUMBER_OF_CAGES
        );
    }

    //Instruction 11 :
    public void afficherAnimaux() {

        for (int i = 0; i < NUMBER_OF_CAGES
                ; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    //Instruction 11 :
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NUMBER_OF_CAGES
                ; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }

    //Instruction 12 :
    public boolean addAnimalUnique(Animal animal) {

        /*for (int i = 0; i < NUMBER_OF_CAGES
; i++) {
            if ((animals[i] == null) && (searchAnimal(animal) == -1)) {
                animals[i] = animal;
                return true;
            }
        }
        return false;*/
        // Instruction 17
        int nbAnimals = countAnimal();
        for (int i = 0; i < NUMBER_OF_CAGES; i++) {
            if ((!isZooFull()) && (searchAnimal(animal) == -1)) {
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
        }
        System.out.println("Deleting: failed");
        return false;

    }

    // Instruction 15
    public int countAnimal() {
        int nbAnimals = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                nbAnimals++;
            }
        }
        return nbAnimals;
    }

    public boolean isZooFull() {
        int j = countAnimal();
        return j >= NUMBER_OF_CAGES
                ;
    }

    // Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.countAnimal() > z2.countAnimal()) {
            return z1;
        } else if (z2.countAnimal() > z1.countAnimal()) {
            return z2;
        }
        return null;
    }

    // Instruction 26
    public void addAquaticAnimal(Aquatic aquatic) {
        //1ere methode
     for (int i=0;i<nbrAquatic;i++) {
         if (aquaticAnimals[i].equals(aquatic)) {
             System.out.println("L'animal aquatique existe déja !!!");
             return;
         }
     }
        if (nbrAquatic < NUMBER_OF_AQUATICS) {
           aquaticAnimals[nbrAquatic] = aquatic;
            nbrAquatic++;
        } else System.out.println("Le zoo est complet pour les aquatiques ");


     }

        //2eme methode
//        if (nbrAquatic < NUMBER_OF_AQUATICS) {
//            aquaticAnimals[nbrAquatic] = aquatic;
//            nbrAquatic++;
//        } else System.out.println("Le zoo est complet pour les aquatiques ");




    // Instruction 27
    public void showSwimAquatic() {
        for (int i = 0; i < nbrAquatic; i++) {
            aquaticAnimals[i].swim();
        }
    }

    //Instruction 29
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < nbrAquatic; i++) {
            // 1 ere methode
            // if (aquaticAnimals[i] instanceof Penguin ) {
            //float penguinSwimmingDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();

            // 2 eme methode
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                float penguinSwimmingDepth = penguin.getSwimmingDepth();
                if (penguinSwimmingDepth > maxDepth) {
                    maxDepth = penguinSwimmingDepth;
                }
            }
        }
        return maxDepth;

    }
    // Instruction 30
    public void displayNumberOfAquaticsByType(){
        int nbDolphins=0;
        int nbPenguins=0;
        for(int i=0; i<nbrAquatic ;i++){
            if (aquaticAnimals[i] instanceof Dolphin){
                nbDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin){
                nbPenguins++;
            }
        }
        System.out.println("Le nombre de dauphins est: "+ nbDolphins + " et le nombre de penguins est: "+ nbPenguins);
    }

}


