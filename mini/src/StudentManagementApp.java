import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        int option = 0;
        while (option != 99) {
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Delete Student");
            System.out.println("99. Exit");
            System.out.print("Pilih menu: ");
            option = scanner.nextInt();
            scanner.nextLine(); // hapus newline

            switch (option) {
                case 1:
                    service.addStudent();
                    break;
                case 2:
                    service.showStudents();
                    break;
                case 3:
                    service.deleteStudent();
                    break;
                case 99:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
