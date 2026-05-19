package model;

    public class Pasien extends Person {
    private String nomorPasien;

    public Pasien(String name, String alamat, String nomorTelepon, String nomorPasien) {
        super(name, alamat, nomorTelepon);
        this.nomorPasien = nomorPasien;
    }

    public Appointment membuatJanjiPemeriksaan(Dokter dokter, String tanggal, String keluhan) {
        String idApp = "APP-" + (System.currentTimeMillis() % 10000);
        Appointment app = new Appointment(idApp, tanggal, keluhan);
        System.out.println("Pasien " + this.name + " (No. Pasien: " + this.nomorPasien + ") membuat janji pemeriksaan dengan Dokter " + dokter.getName());
        return app;
    }
    

    
}

