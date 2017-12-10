import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("m", "Nowakowska1", 13));
        this.patients.add(new Patient("mm", "Nowakowska2", 13));
        this.patients.add(new Patient("mmm", "Nowakowska3", 13));
        this.patients.add(new Patient("das", "Nowakowska3", 13));
        this.patients.add(new Patient("ostateczny", "ostateczny", 15));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
