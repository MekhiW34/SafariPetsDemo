package safari;

import java.util.Arrays;

public class Main {

    //public static void printPetsGreetings(IPet[] passMeAnArrayOfPets) {
        //for (IPet pet : passMeAnArrayOfPets) {
            //pet.greetOwner();
        //}
    //}

    public static void printPets(IPet[] passMeAnArrayOfPets) {
        for (IPet pet : passMeAnArrayOfPets) {
            System.out.println("Printing Pet: " + pet.getClass().getSimpleName());
        }
    }
        public static void main(String[] args) {


        //Step 4 Create New Obj

//        turtle.moveAnimal(5);


//        System.out.println(dog);
//        dog.moveAnimal(5);
//
//        Animal animal = new dog("corgi");
//        animal.moveAnimal(5);
//
//        System.out.println(animal);

        Dog dog = new Dog("german", "mekhi");
        Turtle turtle = new Turtle("ugly", "bob");
        DigitalSnail digitalSnail = new DigitalSnail();


        IPet[] arrayOfPets = {dog, turtle, digitalSnail};

        printPets(arrayOfPets);

        //printPetsGreetings(arrayOfPets);

        //sing the method

            //Creating the method
//        public Animal[] printAnimals(Animal[] passMeAnArrayOfAnimals){
//            return passMeAnArrayOfAnimals;
//        }
//        public void printAnimals(Animal[] passMeAnArrayOfAnimals){
//            System.out.println(Arrays.toString(passMeAnArrayOfAnimals));
//        }


//        for(IPet x : pets){
//            x.greetOwner();
//        }




    }
}



