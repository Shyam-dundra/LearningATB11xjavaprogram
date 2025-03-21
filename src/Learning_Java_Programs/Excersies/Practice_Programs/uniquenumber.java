package Practice_Programs;

public class uniquenumber {
    public static void main(String[] args) {
        int[] arr = {5,3,2,3,2,1};
        int unique = 0;
        for (int num : arr){
            unique ^= num;
        }
        System.out.println(unique);


    }
}
