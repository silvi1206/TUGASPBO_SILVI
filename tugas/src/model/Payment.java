package model;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private String idPayment;                  
    private String tanggalBayar;               
    private double totalBayar;                 
    private String statusPembayaran;           
    private List<PaymentDetail> listDetail;    // Wadah komposisi multiplicity *

    public Payment(String idPayment, String tanggalBayar) {
        this.idPayment = idPayment;
        this.tanggalBayar = tanggalBayar;
        this.totalBayar = 0.0;
        this.statusPembayaran = "BELUM_BAYAR";
        this.listDetail = new ArrayList<>(); // Instansiasi di dalam constructor (Komposisi)
    }

    public void tambahPaymentDetail(PaymentDetail detail) {
        this.listDetail.add(detail);
        System.out.println("[Payment " + this.idPayment + "] Detail ditambahkan: " + detail.getNamaItem());
    }

    public void hitungTotalBayar() {
        this.totalBayar = 0.0;
        for (PaymentDetail detail : listDetail) {
            this.totalBayar += detail.getBiaya();
        }
        System.out.println("[Payment " + this.idPayment + "] Total Bayar dihitung: " + this.totalBayar);
    }

    public String getIdPayment() {
        return idPayment;
    }

    public String getTanggalBayar() {
        return tanggalBayar;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }
}
