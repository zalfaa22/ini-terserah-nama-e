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
public class Jalan {
    public static void main (String [] args){
    Client c = new Client (); 
    Petugas p = new Petugas (); 
    JenisLaundry j = new JenisLaundry (); 
    Transaksi t = new Transaksi ();
    Laporan l = new Laporan ();
    
    l.laporan(p);
    l.laporan(j);
    l.laporan(c);
    l.laporan(t, j);
    t.prosesTransaksi(c, t, j);
    l.laporan(t, j);
    l.laporan(j);
    l.laporan(c);
}
}
