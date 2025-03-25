package Practice_Programs;

public class Problem {
    public static void main(String[] args) {
        double number = 120;
        double precision = 0.0001;

        double low = 0;
        double high = number;
        double mid = 0;

        while ((high - low)>precision) {
            mid = (low + high) / 2;
            double cube = mid * mid * mid;

            if (Math.abs(cube - number) < precision){
                break;
            }else if (cube < number)
            {
               low = mid;

            } else
            {
              high = mid;
            }

            }
        System.out.println("  "+ number + "  "+ mid );
        }



    }

