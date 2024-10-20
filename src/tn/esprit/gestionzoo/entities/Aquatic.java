package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);  // Call to the parent class constructor
        this.habitat = habitat;
    }
    // Getter and Setter for habitat
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic [Habitat=" + habitat + ", " + super.toString() + "]";

    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}

