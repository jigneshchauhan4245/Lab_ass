package pack8;

public class Patient extends Doctor {
    String patientName;
    double consultationFee;

    public Patient(String hospitalName, String location, String doctorName, String specialization,
                   String patientName, double consultationFee) {
        super(hospitalName, location, doctorName, specialization);
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    @Override
    public void showDetails() {
        super.showDetails();

        System.out.println("Patient Name: " + patientName);

        if (consultationFee >= 1000) {
            double discount = consultationFee * 0.10;
            consultationFee = consultationFee - discount;
            System.out.println("10% Discount Applied");
        }

        System.out.println("Final Consultation Fee: " + consultationFee);
    }
}