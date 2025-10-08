import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String nim;
    private String name;
    private LocalDate dob;
    private String address;

    public Student(String nim, String name, LocalDate dob, String address) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return nim + " | " + name + " | " + dob.format(formatter) + " | " + address;
    }
}
