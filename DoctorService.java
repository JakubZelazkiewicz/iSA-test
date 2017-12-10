import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Marcinnn", "Leczniczny"));
        this.doctors.add(new Doctor("Bonifacy", "Killer"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
