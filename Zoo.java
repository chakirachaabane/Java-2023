//Instruction 5 :
class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    //Instruction 6 :
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    //Instruction 9 :
    public void displayAnimal() {
        System.out.println("Family: " + this.family + " name: " + this.name + " Age:" + this.age + " Is it mammal? " + this.isMammal);
    }

    @Override
    public String toString() {
        return (family+" "+ name+" "+ age + " "+isMammal);
    }

}
//Instruction 5 :
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    //Instruction 6 :
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

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

        for (int i = 0; i < nbrCages; i++) {
            if ((animals[i] == null) && (searchAnimal(animal) == -1)) {
                animals[i] = animal;
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

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Zoo1", "Tunis", 25);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        Animal lion = new Animal("cat", "Yaghorta", 10, true);
        Animal chat = new Animal("cat", "Ragdoola", 10, true);
        Animal chat2 = new Animal("cat", "Maher", 10, true);
        Animal chat3 = new Animal("cat", "Sosi", 10, true);
        Animal rat = new Animal("rat", "Ja3", 10, true);
        Animal rat1 = new Animal("rat", "Ja3jouna", 10, true);
        lion.displayAnimal();
        System.out.println(lion);
        System.out.println(lion.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(chat));
        System.out.println(myZoo.addAnimal(rat));
        myZoo.afficherAnimaux();
        System.out.println("l indice est: "+myZoo.searchAnimal(rat1));
        System.out.println(myZoo.addAnimalUnique(chat2));
        System.out.println(myZoo.addAnimalUnique(rat));
        System.out.println(myZoo.addAnimalUnique(rat1));
        System.out.println(myZoo.addAnimalUnique(chat3));
        myZoo.removeAnimal(lion);
        myZoo.removeAnimal(chat3);
        myZoo.removeAnimal(chat);
        myZoo.afficherAnimaux();
    }
}

