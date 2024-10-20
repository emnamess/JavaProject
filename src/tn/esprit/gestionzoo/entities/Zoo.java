package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;
    private final int MAX_AQUATIC_ANIMALS = 10;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS]; // Initialize aquatic animals array
        this.nbrAnimals = 0;
        this.nbrAquaticAnimals = 0; // Initialize aquatic animal count
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Méthode pour ajouter un animal dans le zoo
    public boolean addAnimal(Animal animal) {
        // Check if the zoo is full before adding the animal
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal : " + animal.getName());
            return false;
        }

        // Check if the animal already exists in the zoo
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.getName() + " est déjà dans le zoo.");
            return false;
        }

        // Add the animal to the zoo
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("L'animal " + animal.getName() + " a été ajouté.");
        return true;
    }
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= MAX_AQUATIC_ANIMALS) {
            System.out.println("Impossible d'ajouter " + aquatic.getName() + ": le tableau des animaux aquatiques est plein.");
            return false;
        }

        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
        System.out.println(aquatic.getName() + " a été ajouté aux animaux aquatiques.");
        return true;
    }
    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages);
        System.out.println("Nombre d'animaux dans le zoo: " + nbrAnimals);
    }

    // Méthode pour afficher tous les animaux du zoo
    public void displayAnimalsInZoo() {
        System.out.println("--- Liste des animaux dans le zoo ---");
        if (nbrAnimals == 0) {
            System.out.println("Il n'y a pas d'animaux dans le zoo.");
        } else {
            for (Animal animal : animals) {
                if (animal != null) {
                    animal.displayAnimal();
                }
            }
        }
    }
    public void displayAquaticAnimals() {
        System.out.println("--- Liste des animaux aquatiques dans le zoo ---");
        if (nbrAquaticAnimals == 0) {
            System.out.println("Il n'y a pas d'animaux aquatiques dans le zoo.");
        } else {
            for (Aquatic aquatic : aquaticAnimals) {
                if (aquatic != null) {
                    aquatic.displayAnimal(); // Assuming displayAnimal method exists in Aquatic
                }
            }
        }
    }
    // Méthode pour chercher un animal par son nom dans le zoo
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);  // Chercher l'animal dans le zoo
        if (index != -1) {
            // Décaler les éléments pour remplir l'espace laissé par l'animal supprimé
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];  // Décaler les animaux
            }
            animals[nbrAnimals - 1] = null;  // Supprimer la dernière case
            nbrAnimals--;  // Diminuer le compteur d'animaux
            System.out.println("L'animal " + animal.getName() + " a été supprimé.");
            return true;  // Suppression réussie
        } else {
            System.out.println("L'animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
            return false;  // L'animal n'a pas été trouvé
        }
    }
    // New method to check if the zoo is full
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // If both zoos have the same number of animals
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Method to display the number of aquatic animals by type
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de Dauphins: " + dolphinCount);
        System.out.println("Nombre de Pingouins: " + penguinCount);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", aquaticAnimals=" + Arrays.toString(aquaticAnimals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    public void displayAquaticSwimActions() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null) {
                aquaticAnimals[i].swim(); // Calls the swim() method of each aquatic animal
            }
        }
    }
}



