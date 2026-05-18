package model;

import java.util.ArrayList;
import java.util.List;

public class Prescription {
    private String idPrescription;       
    private List<Medicine> listMedicine; // Wadah komposisi multiplicity *

    public Prescription(String idPrescription) {
        this.idPrescription = idPrescription;
        this.listMedicine = new ArrayList<>(); // Instansiasi di dalam constructor (Komposisi)
    }

    public String getIdPrescription() {
        return idPrescription;
    }

    public void tambahMedicine(Medicine medicine) {
        this.listMedicine.add(medicine);
        System.out.println("Medicine " + medicine.getNamaObat() + " dimasukkan ke resep.");
    }

    public void hapusSemuaMedicine() {
        this.listMedicine.clear();
        System.out.println("Seluruh medicine di dalam prescription ini otomatis dihapus.");
    }
}
