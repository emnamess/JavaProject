import java.util.Arrays;

public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    private final int nbrCages=25;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }
    // Méthode pour ajouter un animal dans le zoo
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.getName() + " est déjà dans le zoo.");
            return false;
        }

        // Vérifier s'il reste de la place dans le zoo
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("L'animal " + animal.getName() + " a été ajouté.");
            return true;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal : " + animal.getName());
            return false;
        }
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
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


