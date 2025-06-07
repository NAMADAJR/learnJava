package Loops;
// This is a simple Java program that demonstrates the use of a for-each loop.
public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Nam", "Ali", "Zara"};

        for (String name : names){
            System.out.println("Hello, " + name + ". How was your day?");
        }
    }
}
