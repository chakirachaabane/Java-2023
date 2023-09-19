import java.util.Scanner;
public class ZooManagement {
    // First instruction
    int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement zmn = new ZooManagement();
        System.out.println(zmn.zooName + " comporte " + zmn.nbrCages);

        // Second instruction

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire le nb des cages: ");
        int nbDonne = scanner.nextInt();
        System.out.println("Ecrire le nom du zoo: ");
        String zooDonne = scanner.next();
        ZooManagement zmn1 = new ZooManagement();
        zmn1.nbrCages = nbDonne;
        zmn1.zooName = zooDonne;

        // Third instruction

        System.out.println(zmn1.zooName+ " comporte " +zmn1.nbrCages);

    }}
