// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class ZooManagement {

    private int nbrCages=20;
    private String zooName="my zoo";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        System.out.print("veuillez entrer le nom du zoo: ");
        zoo.zooName = scanner.nextLine();
        System.out.print("veuillez entrer le nombre des cages: ");

        while (!scanner.hasNextInt()) {
            System.out.print("svp veuillez entrez une valeur valide: ");
            scanner.next();
        }
        zoo.nbrCages = scanner.nextInt();
        System.out.println(zoo.zooName+"comports"+zoo.nbrCages+"cages" );
        scanner.close();
    }
}