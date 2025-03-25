package Practice_Programs;

public class multiple_array {
    public static void main(String[] args) {
        int [][] arr = { {0,1,2}, {3,4,5}, {6,7,8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {

//                System.out.print(arr[i][j] + " ");

//            }

                if (i == 0 && j==2) {
                    System.out.println("print the 0,2 value " + arr[i][j]);

                } else if (i == 1 && j==1) {
                    System.out.println("Print the 1, 1 value " + arr[i][j]);

                } else if (i == 2&& j==0) {
                    System.out.println("print the 2, 0 value " + arr[i][j]);
                }
//                 else {
//
//                    System.out.println("");
//                }
            }

        }

    }



}
