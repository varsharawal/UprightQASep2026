package methodReturn;

public class MethodReturnDemo {
    String name;


    public int printAge(){
        name = "Varsha";
        int age = 100;
        //return name;
        return age;
    }

    public static void main(String[] args) {
        MethodReturnDemo obj = new MethodReturnDemo();
               // obj.printName();

        System.out.println(obj.printAge());


    }
}
