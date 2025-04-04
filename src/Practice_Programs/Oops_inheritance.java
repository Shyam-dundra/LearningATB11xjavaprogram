package Practice_Programs;

public class Oops_inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.BHK2();

        Son s1 = new Son();
        System.out.println(s1.gold);
        s1.BHK2();
        s1.BHK3();
        
    }

}
class Father{
    int gold = 1000;
    void BHK2 (){
        System.out.println("BHK2");
    }
}
class Son extends Father {
    void BHK3 (){
        System.out.println("BHK3");
    }
}
