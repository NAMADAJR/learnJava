package Data;

// This code demonstrates various data types in Java including String, Array, Class, Interface, and Enum.
// It also shows how to use these data types in a simple Java program.

// Enum: Fixed set of constants
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Class: Custom data type
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

// Interface: Abstract behavior
interface Greetable {
    void greet(String name);
}

public class DataTypes {
    public static void main(String[] args) {
        // String
        String message = "Welcome to Java data types!";

        // Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Class usage
        Person p = new Person("Nam", 20);
        p.sayHello();

        // Interface usage
        Greetable greeter = (name) -> System.out.println("Hello, " + name + "!");
        greeter.greet("Nam");

        // Enum usage
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Output array
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Print message
        System.out.println("\nMessage: " + message);
    }
}



