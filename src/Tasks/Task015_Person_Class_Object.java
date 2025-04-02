package Tasks;


public class Task015_Person_Class_Object {
    public static void main(String[] args) {

        person p1 = new person();
        p1.Sleep();
        p1.married();
        p1.greet_with_details("shyam",24,70000);
        p1.Person_name("Krishna");



    }
}
    class  person {
        String name;
        String mobile;
        double weight;
        float height;
        int legs;
        byte age;
        double salary;
        boolean is_male;
        boolean is_married;

        void   Sleep(){
            System.out.println("Person is sleeping ");

        }
        boolean married(){
            is_married = true;
            System.out.println("Is Married " + is_married);
            return is_married;
        }
        void greet_with_details(String name, int age , double salary){
            System.out.println("Your name is -> " + name + "\nYour age is " + age +"\nyour salary is " + salary);
        }
        String Person_name(String name){
            System.out.println("name is "+ name);
            return name;
        }


    }


