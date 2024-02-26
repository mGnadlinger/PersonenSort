import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.*;

public class PersonenSortierer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        List<Person> liste = new ArrayList<Person>();

        do {
            System.out.println(
                    "1 ... Person eingeben\n" +
                    "2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben\n" +
                    "3 ... Liste nach Alter absteigend ausgeben\n" +
                    "4 ... Liste nach Größe aufsteigend ausgeben\n" +
                    "0 ... Programm beenden \n" +
                    "Was möchtest du machen ?");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Geben Sie einen Vornamen ein");
                String firstname = scanner.next();
                System.out.println("Geben Sie einen Nachnamen ein");
                String lastname = scanner.next();
                System.out.println("Geben Sie ihr Geburtsdatum ein (DD.MM.YYYY");
                String date = scanner.next();

                DateTimeFormatter df = DateTimeFormatter.ofPattern("d.MM.yyyy");

                LocalDate dob = LocalDate.parse(date, df);
                System.out.println("Geben Sie Ihre Größe ein");
                int sizeInCm = scanner.nextInt();

                liste.add(new Person(firstname, lastname, sizeInCm, dob));
            } else if (choice == 2) {
                Collections.sort(liste);
                for (Person p : liste) {
                    System.out.println(p.toString());
                }
            }
            else if (choice == 3) {
                Collections.sort(liste, new PersonAgeComperator());
                for (Person p : liste) {
                    System.out.println(p.toString());
                }
            }

            else if (choice == 4) {
                Collections.sort(liste, new PersonSizeComperator());
                for (Person p : liste) {
                    System.out.println(p.toString());
                }
            }


        }while (choice != 0);
    }


}
