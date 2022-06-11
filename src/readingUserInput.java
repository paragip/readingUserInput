import java.util.Scanner;

public class readingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // ahhoz kell, hogy ellenőrizzük hogy az évszámnál valóban számokat kaptunk-e

        if (hasNextInt){ // csak akkor hajtjuk végre a követkeőket, ha valóban számot kaptunk az évszámnál, nem stringet
            int yearOfBirth = scanner.nextInt(); // int bekérése
            scanner.nextLine(); // fontos, enélkül nem adna időt a követkeő név beírására, csak továbbugrana rajta

            System.out.println("Enter your name: "); // bekéri az adatot
            String name = scanner.nextLine(); // String bekérése

            int age = 2022 - yearOfBirth;

            if (age > 0 && age < 100) {
                System.out.println("Your name is " + name + " and your age is " + age + " years old"); // kiírja a bekért adatot
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }

}
