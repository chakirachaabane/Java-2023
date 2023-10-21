package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Terrestrial ,Aquatic {

        private  String family;
        private String name;
        private int age;
        private boolean isMammal;

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        // Instruction 18
        public void setAge(int age) {
            if (age>=0){
                this.age = age;}else {
                System.out.println("L age doit etre superieur a zero");
            }
        }


        public boolean isMammal() {
            return isMammal;
        }

        public void setMammal(boolean mammal) {
            isMammal = mammal;
        }

        public Animal(){

        }
        //Instruction 6 :
        public Animal(String family, String name, int age, boolean isMammal) {
            this.family=family;
            this.name=name;
            this.age=age;
            this.isMammal=isMammal;
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



