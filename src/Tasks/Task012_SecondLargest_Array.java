package Tasks;

public class Task012_SecondLargest_Array {

    public static void main(String[] args) {
        int array[] = {12, 15, 17, 18, 21, 24, 25, 35, 39};
        int max = array[0];
        int SE_max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                SE_max = max;
                max = array[i];
            } else if (array[i] > SE_max && array[i] != max) {
                SE_max = array[i];
            }
        }
        System.out.println("First Max_number" + max);
        System.out.println("Second Max_number" + SE_max);
    }

}
