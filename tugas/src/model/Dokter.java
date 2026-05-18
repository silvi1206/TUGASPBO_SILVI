package model;

public class Dokter extends Person {
    private String spesialisasi;

    public Dokter(String name, String Falamat, String nomorTelepon, String spesialisasi) {
        super(name, Falamat, nomorTelepon);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void mendiagnosisPasien(Pasien pasien, String diagnosis) {
        System.out.println("Dokter " + this.name + " mendiagnosis pasien " + pasien.getName() + ". Hasil: " + diagnosis);
    }

    public Prescription membuatResepObat(Appointment app) {
        System.out.println("Dokter " + this.name + " membuat resep untuk Appointment ID: " + app.getIdAppointment());
        // Instansiasi Prescription baru yang terikat dengan Appointment
        Prescription prescription = new Prescription("RX-" + app.getIdAppointment());
        return prescription;
    }
}