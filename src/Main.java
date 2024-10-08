
import java.util.Scanner;

class ZooManagement {

    private int nbrCages=20;
    private String zooName="my zoo";
    public static void main(String[] args) {

        // Création d'un zoo avec un constructeur paramétré
        Zoo zoo1 = new Zoo("Zoo 1", "City A");
        Zoo zoo2 = new Zoo("Zoo 2", "City B");

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Sheru", 4, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal giraffe = new Animal("Giraffidae", "Melman", 8, true);

        // Add animals to the first zoo
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);

        // Add animals to the second zoo
        zoo2.addAnimal(elephant);
        zoo2.addAnimal(giraffe);
        zoo2.addAnimal(lion);


        // Check if the zoo is full
        System.out.println("\nLe zoo 1 est plein : " + zoo1.isZooFull());
        System.out.println("Le zoo 2 est plein : " + zoo2.isZooFull());

        // Compare the two zoos and find the one with the most animals
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        if (biggerZoo != null) {
            System.out.println("\nLe zoo avec le plus d'animaux est : " + biggerZoo.name);
        }

        // Display the animals in zoo1
        System.out.println("\n--- Animaux dans le zoo 1 ---");
        zoo1.displayAnimalsInZoo();

        // Display the animals in zoo2
        System.out.println("\n--- Animaux dans le zoo 2 ---");
        zoo2.displayAnimalsInZoo();


        // Recherche d'un animal par son nom
        System.out.println("\n--- Recherche de Simba dans le zoo ---");
        int index = zoo1.searchAnimal(lion);
        if (index != -1) {
            System.out.println("Simba trouvé à l'indice: " + index);
        } else {
            System.out.println("Simba n'a pas été trouvé.");
        }

        // Supprimer un animal
        System.out.println("\n--- Suppression de Simba ---");
        zoo1.removeAnimal(lion);

        // Afficher les animaux après la suppression
        System.out.println("\n--- Animaux après suppression ---");
        zoo1.displayAnimalsInZoo();

        

    }}