package model;

// Abstract class sebagai parent utama sesuai diagram UML
public abstract class Person {
    protected String name;           
    protected String Falamat;        
    protected String nomorTelepon;   

    public Person(String name, String Falamat, String nomorTelepon) {
        this.name = name;
        this.Falamat = Falamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getName() { 
        return name; 
    }
    
    public void setNama() { 
        System.out.println("Nama berhasil diubah.");
    }
}