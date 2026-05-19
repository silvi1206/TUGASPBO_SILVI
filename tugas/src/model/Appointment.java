package model;

public class Appointment {
    private String idAppointment;     
    private String tanggalPemeriksaan;  
    private String keluhan;
    private String statusPemeriksaan;  

    public Appointment(String idAppointment, String tanggalPemeriksaan, String keluhan) {
        this.idAppointment = idAppointment;
        this.tanggalPemeriksaan = tanggalPemeriksaan;
        this.keluhan = keluhan;
        this.statusPemeriksaan = "DIPROSES";
    }

    public String getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }

    public void setTanggalPemeriksaan(String tanggalPemeriksaan) {
        this.tanggalPemeriksaan = tanggalPemeriksaan;
    }

    public String getKeluhan() {
        return keluhan;
    }
    public String getStatusPemeriksaan() {
        return statusPemeriksaan;
    }

    public void selesaiPemeriksaan() {
        this.statusPemeriksaan = "SELESAI";
        System.out.println("Status appointment " + this.idAppointment + " diubah menjadi SELESAI.");
    }

    public String getIdAppointment() {
        return idAppointment;
    }
}
