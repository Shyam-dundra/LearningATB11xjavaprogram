package Practice_Programs;

public class New_Root {
    public static void main(String[] args) {
        double number = 120.0; // The number for which we find the cube root
        double precision = 0.0001; // Desired precision

        double low = 0;
        double high = number;
        double mid = 0;

        while ((high - low) > precision) {
            mid = (low + high) / 2;
            double cube = mid * mid * mid;

            if (Math.abs(cube - number) < precision) {
                break; // Close enough to the cube root
            } else if (cube < number) {
                low = mid; // Search in the right half
            } else {
                high = mid; // Search in the left half
            }
        }

        System.out.println("Cube root of " + number + " is approximately: " + mid);
    }
}
