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
        Dolphin dolphin2= new Dolphin("Delphinidae", "Flipper", 7, true, "Sea", 35.6f);

        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, true, "Antarctica", 150.0f);
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        System.out.println(dolphin.equals(dolphin2)); // true








        zoo1.addAnimal(elephant);
        zoo2.addAquaticAnimal(whale);
        zoo2.addAquaticAnimal(dolphin);
        zoo2.addAquaticAnimal(penguin);


        // Display animals in each zoo
        System.out.println("\n--- Animaux dans le zoo 1 ---");
        zoo1.displayAnimalsInZoo();

        System.out.println("\n--- Animaux dans le zoo 2 ---");
        zoo2.displayAquaticAnimals();
        zoo2.displayNumberOfAquaticsByType();
        System.out.println("Profondeur maximale de nage des pingouins: " + zoo1.maxPenguinSwimmingDepth());
        zoo2.displayAquaticSwimActions();



    }}