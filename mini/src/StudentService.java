import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // ✅ Tambahkan student baru
    public void addStudent() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Masukkan Alamat: ");
        String address = scanner.nextLine();

        students.add(new Student(nim, name, dob, address));
        System.out.println("✅ Data mahasiswa berhasil ditambahkan!");
    }

    // ✅ Menampilkan daftar student
    public void showStudents() {
        System.out.println("\nDaftar Mahasiswa:");
        if (students.isEmpty()) {
            System.out.println("(Belum ada data mahasiswa)");
        } else {
            System.out.println("NIM | Nama | Tanggal Lahir | Alamat");
            System.out.println("--------------------------------------------");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // ✅ Hapus student berdasarkan NIM
    public void deleteStudent() {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();

        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNim().equalsIgnoreCase(nim)) {
                iterator.remove();
                found = true;
                System.out.println("🗑️ Data mahasiswa dengan NIM " + nim + " berhasil dihapus.");
                break;
            }
        }

        if (!found) {
            System.out.println("⚠️ Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
