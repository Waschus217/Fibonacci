import java.util.Scanner;       // Scanner class importieren
public class Fibonacci {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);                                         // Scanner erstellen
        System.out.println("Wie viele Fibonacci Zahlen möchtest du haben?");
        int n = x.nextInt();                                                        // user input ablesen
        System.out.println("");
        int[] fibonacci = new int[n];                                               // Anzahl der Fibonacci-Zahlen, die generiert werden sollen
        fibonacci[0] = 0;                                                           // die erste Fibonacci-Zahl ist 0
        fibonacci[1] = 1;                                                           // die erste Fibonacci-Zahl ist 1

        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];     // berechnen der nächsten Fibonacci-Zahl
        }

        // Ausgabe der Fibonacci-Zahlen
        for(int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + " ");
        }
    }
}
