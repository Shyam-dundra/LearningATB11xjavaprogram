package ex_06_Oops_inheritance;

public class ex_03_Oops_Multilevel {
    public static void main(String[] args) {
        childclass c1 = new childclass();
        c1.childmethod();
        c1.Grandmethod();
        c1.fathermethod();

    }
}
class GrandFather {
    void Grandmethod(){
        System.out.println("This is Base class ");
    }
}
class fatherclass extends GrandFather {
    void fathermethod(){
        System.out.println("This is child class ");
    }
}
class  childclass extends fatherclass {

    void childmethod (){
        System.out.println("This is grand child class");
    }
}
