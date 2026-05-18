package model;

public class PaymentDetail {
    private String namaItem; 
    private double biaya;    

    public PaymentDetail(String namaItem, double biaya) {
        this.namaItem = namaItem;
        this.biaya = biaya;
    }

    public String getNamaItem() { return namaItem; }
    public double getBiaya() { return biaya; }
}
