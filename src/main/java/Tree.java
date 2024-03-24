import java.util.Scanner;

public class Tree {
    public void show() {

        System.out.println("Podaj liczbę ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // Górna część choinki
        for (int i = 0; i < n; i++) {
            // Wyświetlamy odstępy czyli tam gdzie nie widać gwiazdek
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            // Wyświetlamy gwiazdki
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}