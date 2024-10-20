package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class ZooManagement {

    private int nbrCages=20;
    private String zooName="my zoo";
    public static void main(String[] args) {

        // Création d'un zoo avec un constructeur paramétré
        Zoo zoo1 = new Zoo("Zoo 1", "City A");
        Zoo zoo2 = new Zoo("Zoo 2", "City B");

        Aquatic whale = new Aquatic("Cetacea", "Blue Whale", 30, true, "Ocean");
        Terrestrial elephant = new Terrestrial("Elephantidae", "Dumbo", 10, true, 4);

        // Create specific animals
        Dolphin dolphin= new Dolphin("Delphinidae", "Flipper", 7, true, "Sea", 35.6f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, true, "Antarctica", 150.0f);
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        // Call the swim method for Aquatic, Dolphin, and Penguin
        whale.swim();
        dolphin.swim();
        penguin.swim();

        zoo1.addAnimal(elephant);  // Adding a Terrestrial animal
        zoo2.addAnimal(whale);     // Adding an Aquatic animal
        zoo2.addAnimal(dolphin);   // Adding a specific Aquatic animal
        zoo2.addAnimal(penguin);   // Adding another specific Aquatic animal


        // Display animals in each zoo
        System.out.println("\n--- Animaux dans le zoo 1 ---");
        zoo1.displayAnimalsInZoo();

        System.out.println("\n--- Animaux dans le zoo 2 ---");
        zoo2.displayAnimalsInZoo();



    }}