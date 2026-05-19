package model;

// Abstract class sebagai parent utama sesuai diagram UML
public abstract class Person {
    protected String name;           
    protected String alamat;        
    protected String nomorTelepon;   

    public Person(String name, String alamat, String nomorTelepon) {
        this.name = name;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getName() { 
        return name; 
    }
    
    public void setNama(String name) { 
        this.name = name;
        System.out.println("Nama berhasil diubah.");
    }
    
  
}