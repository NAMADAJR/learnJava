package Classes;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Student student = new Student("Bob", 20, "S123");

        // Call introduce
        person.introduce();      // From Person
        student.introduce();     // Overridden in Student

        // Print objects directly (uses toString)
        System.out.println(person);
        System.out.println(student);

        // Use setters
        student.setAge(21);
        student.setStudentId("S456");
        student.introduce();
    }
}

