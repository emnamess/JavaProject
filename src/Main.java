
import java.util.Scanner;

class ZooManagement {

    private int nbrCages=20;
    private String zooName="my zoo";
    public static void main(String[] args) {
        // Créer un animal
        Animal lion = new Animal("Simba", "Felidae", 5, true);
        Animal[] animals = {lion};

        // Créer un zoo
        Zoo myZoo = new Zoo("My Awesome Zoo", "Wildtown");


        myZoo.displayZoo();
        lion.displayAnimal();


    }}