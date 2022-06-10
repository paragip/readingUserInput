import java.util.Scanner;

public class readingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt(); // int bekérése
        scanner.nextLine(); // fontos, enélkül nem adna időt a követkeő név beírására, csak továbbugrana rajta

        System.out.println("Enter your name: "); // bekéri az adatot
        String name = scanner.nextLine(); // String bekérése

        System.out.println("Your name is " + name); // kiírja a bekért adatot

        int age = 2022 - yearOfBirth;
        System.out.println("Your age is " + age + " year");

        scanner.close();
    }

}
