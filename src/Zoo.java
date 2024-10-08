import java.util.Arrays;

public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    private int nbrCages;

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }

    // Méthode pour afficher les attributs du Zoo
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: ");
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


