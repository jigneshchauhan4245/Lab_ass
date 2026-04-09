package pack8;

public class Doctor extends Hospital {
    String doctorName;
    String specialization;

    public Doctor(String hospitalName, String location, String doctorName, String specialization) {
        super(hospitalName, location);
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}