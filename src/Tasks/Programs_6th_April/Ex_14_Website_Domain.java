package Tasks.Programs_6th_April;

import java.util.Scanner;

public class Ex_14_Website_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter site URL to check : ");
        String url = sc.nextLine().toLowerCase();

        if (url.endsWith(".com") ){
            System.out.println("The website type is: Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else{
            url.endsWith(".xyz");
            System.out.println("The website type is: Unknown or other types of websites");
        }
        sc.close();
    }
}
