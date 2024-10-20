package tn.esprit.gestionzoo.entities;

public abstract  class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
    //constructor
    public Animal( String family,String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    //ToString
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public void displayAnimal() {
        System.out.println("Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", Mammifère: " + isMammal);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age &&
                isMammal == animal.isMammal &&
                family.equals(animal.family) &&
                name.equals(animal.name);
    }
}
