/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

/**
 *
 * @author Fafa
 */
public class Laporan {

    Laporan() {
        //To change body of generated methods, choose Tools | Templates.
    }
    public void laporan(JenisLaundry barang){ //method
        int x=barang.getJmlJenisLaundry(); //field value dari x terdekat yaitu parameter
    

        System.out.println(); 
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi/jam \tHarga"); 
        for (int i = 0; i < x; i++) {
        System.out.println(barang.getJenisLaundry(i)+"\t"+ barang.getDurasi(i)+"\t\t"+barang.getHarga(i));
        }//construktor
    }
    public void laporan (Petugas petugas){ //method
        System.out.println("Nama Petugas \t\tAlamat \t\tTelepon \tJabatan");
        System.out.println(petugas.getNama(0)+"\t"+"\t"+"\t"+petugas.getAlamat(0)+"\t"+"\t"+petugas.getTelepon(0)+"\t"+petugas.getJabatan(0));
        System.out.println(petugas.getNama(1)+"\t"+"\t"+"\t"+petugas.getAlamat(1)+"\t"+"\t"+petugas.getTelepon(1)+"\t"+petugas.getJabatan(1));
        System.out.println(petugas.getNama(2)+"\t"+"\t"+"\t"+petugas.getAlamat(2)+"\t"+"\t"+petugas.getTelepon(2)+"\t"+petugas.getJabatan(2));
        System.out.println(petugas.getNama(3)+"\t"+"\t"+"\t"+petugas.getAlamat(3)+"\t"+"\t"+petugas.getTelepon(3)+"\t"+petugas.getJabatan(3));
        //constructor
        }
    public void laporan(Client member){ //method
            int x=member.getJmlClient(); //field value dari x terdekat yaitu parameter

        System.out.println(); 
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Tabel Pelanggan "); 
        System.out.println();
        System.out.println("Nama \t\tAlamat \t\tKelamin \tTelepon \tSaldo"); 
        for (int i = 0; i < x; i++) {
        System.out.println(member.getNama(i)+"\t"+"\t"+member.getAlamat(i)+"\t"+"\t"+member.getKelamin(i)+"\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
        } //constructor
    }
    public void laporan(Transaksi transaksi, JenisLaundry barang){ 
            int x=transaksi.getJmlTransaksi(); //field value dari x terdekat yaitu parameter
            
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tTotal \tHarga \tJumlah");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
                    total+=jumlah; 
                            
                System.out.println(barang.getJenisLaundry(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
            } //menghitung total harga laundry yang telah diinputkan user
            System.out.println("Total Omset ="+total);
            }

    Laporan(Petugas p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            }
