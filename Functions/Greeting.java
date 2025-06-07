// This Java program defines a class `Greeting` with two static methods: `Morning` and `Evening`. 
public class Greeting {
    public static void Morning(String name){
        System.out.println("Good Morning, " + name + "!");
    }

    public static void Evening(String name){
        System.out.println("Good Evening, "+ name + "!");
    }

    public static void main(String[] args) {
        Morning("Nam");
        Evening("Nam");
    }
}
