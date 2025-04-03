package Practice_Programs;

public class New_pattern_4_rows {
    public static void main(String[] args) {
        int n = 4;
        int number = 1;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                    
                System.out.print(number + " ");
                number++;
            }
            
            System.out.println();
            
        }
        
    }

}
