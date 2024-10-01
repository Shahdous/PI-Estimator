/**
 * This class represents an estimated value of PI
 * author: Shahdous Zaman Khan Prohor
 */
import java.lang.Math;

public class EstimatingPi {
    public static void main(String[] args) {
        final int TOTAL_ITERATIONS = 20;
        double denominator = 1.0;
        double estimatedPi = 0.0;
        double term = 4.0 / denominator;
        int n = 0;

        System.out.printf("  n    denominator               term           estimatedPi\n");
        System.out.printf("===  =============  =======================  ===================\n");

        while (Math.abs(term) > 0.00000001) {
            estimatedPi += term;
            if (n < TOTAL_ITERATIONS) {
                System.out.printf("%2d%15.1f%25.15f%22.15f\n", n + 1, denominator, Math.abs(term), estimatedPi);
            }
            n++;
            denominator += 2.0;
            if (n % 2 == 0) {
                term = 4.0 / denominator;
            } else {
                term = -4.0 / denominator;
            }
        }

        System.out.println("\nThe number of iterations was: " + n);
        System.out.println("The estimated pi is: " + estimatedPi);
        System.out.printf("%20s %.16f\n", "Math.PI:", Math.PI);
    }
}
