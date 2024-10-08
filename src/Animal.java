public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;
    //constructeur
    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
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
}
