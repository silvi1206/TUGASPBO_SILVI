package model;

public class Medicine {
    private String namaObat; 
    private String dosis;    

    public Medicine(String namaObat, String dosis) {
        this.namaObat = namaObat;
        this.dosis = dosis;
    }

    public String getNamaObat() { return namaObat; }
    public String getDosis() { return dosis; }
}
