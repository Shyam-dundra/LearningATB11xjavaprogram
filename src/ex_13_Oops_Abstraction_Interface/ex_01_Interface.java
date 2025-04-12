package ex_13_Oops_Abstraction_Interface;

public class ex_01_Interface {
    public static void main(String[] args) {
        child C2 = new child();
        C2.money();
    }
}
interface mother {
    void money();
}
interface father{
    void money();

}
class child implements mother, father {
    public void money(){
        System.out.println("Child gets money only from mother or Father");
    }
}