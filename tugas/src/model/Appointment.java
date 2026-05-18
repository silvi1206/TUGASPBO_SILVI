package model;

public class Appointment {
    private String idAppointment;     
    private String tanggalPemeriksaan; 
    private String kalunan;            // Menjaga typo 'kalunan' dari dokumen aslimu
    private String statusPemeriksaan;  

    public Appointment(String idAppointment, String tanggalPemeriksaan, String kalunan) {
        this.idAppointment = idAppointment;
        this.tanggalPemeriksaan = tanggalPemeriksaan;
        this.kalunan = kalunan;
        this.statusPemeriksaan = "DIPROSES";
    }

    public String getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }

    public void setTanggalPemeriksaan(String tanggalPemeriksaan) {
        this.tanggalPemeriksaan = tanggalPemeriksaan;
    }

    public String getKalunan() {
        return kalunan;
    }

    public void setKalunan(String kalunan) {
        this.kalunan = kalunan;
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
