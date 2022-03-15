import java.util.Scanner;

public class ChineseZodiacSignCalculation {
    public static void main(String[] args) {
        int birthYear, zodiac;

        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter your birth year: ");
        birthYear = input.nextInt();
        zodiac = birthYear/100;


        if (zodiac%12 == 0) {
            System.out.println("Maymun");
        } else if (zodiac %12 == 1) {
            System.out.println("Köpek");
        } else if (zodiac %12 == 2) {
            System.out.println("Domuz");
        } else if (zodiac %12 == 3) {
            System.out.println("Fare");
        } else if (zodiac %12 == 4) {
            System.out.println("Öküz");
        } else if (zodiac %12 == 5) {
            System.out.println("Kaplan");
        } else if (zodiac %12 == 6) {
            System.out.println("Tavşan");
        } else if (zodiac %12 == 7) {
            System.out.println("Ejderha");
        } else if (zodiac %12 == 8) {
            System.out.println("Yılan");
        } else if (zodiac %12 == 9) {
            System.out.println("At");
        } else if (zodiac %12 == 10) {
            System.out.println("Koyun");
        }

    }
}