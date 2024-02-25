import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student by Roll Number");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Total Number of Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    studentManager.addStudent(new Student(name, rollNumber, age, grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("All Students:");
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRollNumber = scanner.nextInt();
                    Student foundStudent = studentManager.findStudentByRollNumber(searchRollNumber);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter roll number to update: ");
                    int updateRollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Student existingStudent = studentManager.findStudentByRollNumber(updateRollNumber);
                    if (existingStudent != null) {
                        System.out.print("Enter updated name: ");
                        String updatedName = scanner.nextLine();
                        System.out.print("Enter updated age: ");
                        int updatedAge = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter updated grade: ");
                        String updatedGrade = scanner.nextLine();

                        studentManager.updateStudent(updateRollNumber, new Student(updatedName, updateRollNumber, updatedAge, updatedGrade));
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRollNumber = scanner.nextInt();
                    studentManager.deleteStudent(deleteRollNumber);
                    System.out.println("Student deleted successfully!");
                    break;
                case 6:
                    System.out.println("Total number of students: " + studentManager.getTotalStudents());
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
