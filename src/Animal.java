public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;
    //constructeur
    public Animal( String family,String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
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
