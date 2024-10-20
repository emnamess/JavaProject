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
    @Override
    public boolean equals(Object obj) {
        // Check if the object is being compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or if the classes are not the same
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Aquatic to compare specific attributes
        Aquatic other = (Aquatic) obj;

        // Compare the attributes: name, age, and habitat
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.getHabitat());
    }

}

