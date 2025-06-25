package Classes;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() +
                           ", I'm " + getAge() +
                           " years old and I'm a student with ID " + studentId + ".");
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() +
               "', age=" + getAge() +
               ", studentId='" + studentId + "'}";
    }
}
