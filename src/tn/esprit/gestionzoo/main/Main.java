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
        Animal lion = new Animal("cat", "Yaghorta", 2, true);
        Animal chat = new Animal("cat", "Ragdoola", -10, true);
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
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(chat));
//        System.out.println(myZoo.addAnimal(rat));
//        System.out.println(myZoo2.addAnimal(chat4));


        // Instruction 32+33+34 :
        try{
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux dans le zoo: "+myZoo.getNumberOfAnimals());
            myZoo.addAnimal(giraffe);
            System.out.println("Nombre d'animaux dans le zoo: "+myZoo.getNumberOfAnimals());
            myZoo.addAnimal(giraffe2);
            System.out.println("Nombre d'animaux dans le zoo: "+myZoo.getNumberOfAnimals());
            myZoo.addAnimal(rat);
            System.out.println("Nombre d'animaux dans le zoo: "+myZoo.getNumberOfAnimals());

        }catch (ZooFullException e){
            System.err.println("Erreur:" + e.getMessage());
        }catch(InvalidAgeException e){
            System.err.println("Erreur:" + e.getMessage());
        }

        try{
            myZoo5.addAnimal(chat);
            System.out.println("Nombre d'animaux dans le zoo: "+myZoo.getNumberOfAnimals());
        }catch (ZooFullException e){
            System.err.println("Erreur:" + e.getMessage());
        }catch(InvalidAgeException e){
            System.err.println("Erreur:" + e.getMessage());
        }



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
       // Aquatic aquatic1= new Aquatic("fish", "Yaghorta", 10, true,"Tunisia"); //classe abstract
        Terrestrial terrestrial1 =new Terrestrial("cat2", "Yaghorta1", 10, true,4);
        Dolphin dolphin1 = new Dolphin("cat", "Yaghorta", 10, true,"Tunisia",11);
        Dolphin dolphin2 = new Dolphin("cat", "Yaghorta22", 10, true,"Tunisia",11);
        Penguin penguin1 = new Penguin("cat2", "Yaghorta1", 5, true,"Tunisia",11);
        Penguin penguin2 = new Penguin("cat2", "Yaghorta1", 5, true,"Tunisia",20);
        Penguin penguin3 = new Penguin("cat2", "Yaghorta1", 10, true,"Tunisia",5);
        Penguin penguin4 = new Penguin("cat", "Yaghorta1", 5, true,"Tunisia",17);
        // Instruction 23
       // System.out.println(aquatic1.toString());
        System.out.println(dolphin1.toString());
        System.out.println(penguin1.toString());

        // Instruction 24
       // aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();

        //Instruction 26
        //myZoo.addAquaticAnimal(aquatic1);
        myZoo.addAquaticAnimal((Aquatic)dolphin1);
        myZoo.addAquaticAnimal((Aquatic)dolphin2);
        myZoo.addAquaticAnimal((Aquatic)penguin1);
        myZoo.addAquaticAnimal((Aquatic)penguin2);
        myZoo.addAquaticAnimal((Aquatic)penguin3);
        myZoo.addAquaticAnimal((Aquatic)penguin1);

        myZoo.showSwimAquatic(); //affiche aquatic animal / dolphin / aquatic animal


        System.out.println("la profondeur maximale: "+ myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(penguin1.equals(dolphin1)); //false
        System.out.println(penguin1.equals(penguin3)); //false
        System.out.println(penguin1.equals(penguin4)); //true

    }
}
