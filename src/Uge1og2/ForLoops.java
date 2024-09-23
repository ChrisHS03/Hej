package Uge1og2;

public class ForLoops {
    public static void main(String[] args) {

        System.out.println("Opgave 1:");
        for (int i = 1; i <= 4; i++) {
            System.out.println(" 2 gange " + i + " = " + 2 * i);
        }
        System.out.println(" ");

        System.out.println("Opgave 2:");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + i + " ");
        }
        System.out.println(" ");

        for (int i = 4; i <= 79; i += 15) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 30; i >= -20; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = -7; i <= 13; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 97; i >= 82; i -= 3) {
            System.out.print(i + " ");
        }
    }
}
