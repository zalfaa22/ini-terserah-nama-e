package ukl.laundry;

import java.util.ArrayList;
// interface

public class Client implements User { 
    //modifierimplement
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    private ArrayList<String> kelamin = new ArrayList<String>();
 
    
    public Client(){ //constructor
        this.namaClient.add("Grisel");
        this.alamat.add("Turen");
        this.telepon.add("081249699404");
        this.saldo.add(50000);
        this.kelamin.add("Perempuan");
        
        this.namaClient.add("Rifa");
        this.alamat.add("Blitar");
        this.telepon.add("081252191827");
        this.saldo.add(100000);
        this.kelamin.add("Perempuan");
        
        this.namaClient.add("Aurel");
        this.alamat.add("Kediri");
        this.telepon.add("0857008830732");
        this.saldo.add(55000);
        this.kelamin.add("perempuan");
        //this menyatakan objek sekarang
    }
    public void setSaldo(int saldo){ //mengatur 
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){ //mendapatkan
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    //return this mengembalikan nilai
    
    @Override //ini tempat override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    @Override
    public void setKelamin(String kelamin) {
        this.kelamin.add(kelamin);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaClient.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
        //override nama dan isi implementasi methodnya sama 
    }
    
    @Override
    public String getKelamin(int idMember) {
        return this.kelamin.get(idMember);

    }

    
    }

    


