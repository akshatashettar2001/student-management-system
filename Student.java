import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int rollNumber;
    private int age;
    private String grade;

    public Student(String name, int rollNumber, int age, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age + ", Grade: " + grade;
    }
}
