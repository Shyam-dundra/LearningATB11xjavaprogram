package ex_10_Access_Modifiers;

public class ex_12_Private_Nested_Class {
    public static void main(String[] args) {
        outer_class out = new outer_class();

        out.create_inner();

    }

}
class outer_class {
    private class inner_class {
        public void display(){
            System.out.println("This a Private Inner class");
        }
    }
    public void create_inner(){
        inner_class inner = new inner_class();
        inner.display();
    }
}
