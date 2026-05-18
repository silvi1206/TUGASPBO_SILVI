package service;

import model.Payment;

public class PaymentService {
    
    // Hubungan Dependency ditandai dengan penggunaan class Payment sebagai parameter lokal saja
    public void prosesPembayaran(Payment payment) {
        System.out.println("Memproses pembayaran via PaymentService...");
    }

}
