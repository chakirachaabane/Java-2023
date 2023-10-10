package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Zoo1", "Tunis");
        Zoo myZoo2 = new Zoo("Zoo2","Bizerte");
        Zoo myZoo5 = new Zoo(); //test instruction 18
        myZoo5.setName("");
        myZoo5.setCity("Bardo");
        myZoo.displayZoo();
        myZoo2.displayZoo();
        myZoo5.displayZoo();

        Animal giraffe5=new Animal();
        giraffe5.setName("Jiraa");
        giraffe5.setFamily("cat");
        giraffe5.setAge(-23);
        giraffe5.setMammal(true);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        Animal lion = new Animal("cat", "Yaghorta", 10, true);
        Animal chat = new Animal("cat", "Ragdoola", 10, true);
        Animal chat2 = new Animal("cat", "Maher", 10, true);
        Animal chat3 = new Animal("cat", "Sosi", 10, true);
        Animal rat = new Animal("rat", "Ja3", 10, true);
        Animal rat1 = new Animal("rat", "Ja3jouna", 10, true);
        Animal chat4 = new Animal("cat", "Yaghorta2", 10, true);
        Animal giraffe = new Animal("giraffe", "jiraa1", 10, true);
        Animal giraffe1 = new Animal("giraffe", "jiraa2", 10, true);
        Animal giraffe2 = new Animal("giraffe", "jiraa3", 10, true);
        lion.displayAnimal();
        System.out.println(lion);
        System.out.println(lion.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(chat));
        System.out.println(myZoo.addAnimal(rat));
        System.out.println(myZoo2.addAnimal(chat4));
        myZoo.afficherAnimaux();
        System.out.println("l indice est: "+myZoo.searchAnimal(rat1));
        System.out.println(myZoo.addAnimalUnique(chat2));
        System.out.println(myZoo.addAnimalUnique(rat));
        System.out.println(myZoo.addAnimalUnique(rat1));
        System.out.println(myZoo.addAnimalUnique(chat3));
        System.out.println(myZoo.addAnimalUnique(giraffe));
        System.out.println(myZoo.addAnimalUnique(giraffe1));
        System.out.println(myZoo.addAnimalUnique(giraffe2));
        myZoo.removeAnimal(lion);
        myZoo.removeAnimal(chat3);
        myZoo.removeAnimal(chat);
        myZoo.afficherAnimaux();
        System.out.println("Is the zoo full?"+ myZoo.isZooFull());
        System.out.println("Le zoo qui contient plus d'animaux : "+ Zoo.comparerZoo(myZoo, myZoo2));

        //Instruction 21
        /*
        Aquatic aquatic1= new Aquatic();
        Terrestrial terrestrial1 =new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();
        */

        // Instruction 22
        Aquatic aquatic1= new Aquatic("fish", "Yaghorta", 10, true,"Tunisia");
        Terrestrial terrestrial1 =new Terrestrial("cat2", "Yaghorta1", 10, true,4);
        Dolphin dolphin1 = new Dolphin("cat", "Yaghorta", 10, true,"Tunisia",11);
        Penguin penguin1 = new Penguin("cat2", "Yaghorta1", 5, true,"Tunisia",11);

        // Instruction 23
        System.out.println(aquatic1.toString());
        System.out.println(dolphin1.toString());
        System.out.println(penguin1.toString());

        // Instruction 24
        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();



    }
}
