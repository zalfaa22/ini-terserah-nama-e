package ukl.laundry;

import java.util.ArrayList;
//interface
public class Petugas implements User{ 
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){ //keywoard this buat pemanggil methods kelas itu sendiri , pembuatan kelas untuk menyatakan objek
    this.namaPetugas.add("Fadhila");
    this.alamat.add("Malang");
    this.telepon.add("085604441400");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Zalfa");
    this.alamat.add("Malang");
    this.telepon.add("085604441401");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Alisya");
    this.alamat.add("Malang");
    this.telepon.add("085604441402");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Fafa");
    this.alamat.add("Malang");
    this.telepon.add("085604441403");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){ 
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
} //constructor

    @Override //mengimplementasi kembali subclas
    public void setNama(String namaKaryawan) { //mutator method = mengubah/memberi nilai
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) { //asesor method = memanggil/membaca nilai
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    //override = nama method dan isi implementasi methodnya sama

    @Override
    public void setKelamin(String kelamin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKelamin(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
