package ex_04_Arrays;

public class ex_03_Max_Min {
    public static void main(String[] args) {
        int array[] = {10,20,24,35,46,57,89,92};

        int max_out = give_me_Max(array);
        int min_out = give_me_min(array);

        System.out.println(max_out);
        System.out.println(min_out);

    }
    static int give_me_Max(int[] array){
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i]>max){
                max=array[i];
            }
        }
        return max;

    }
    static int give_me_min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }

        }
        return min;
    }
}
