/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisvina;


public class Motherboard {
    
    private int  harga;
    private String merek, warna, tanggal_pembelian, jenis;

    public Motherboard(int id, int harga, String merek, String warna, String tanggal_pembelian, String jenis) {
        
        this.harga = harga;
        this.merek = merek;
        this.warna = warna;
        this.tanggal_pembelian = tanggal_pembelian;
        this.jenis = jenis;
    }

   public Motherboard() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
   
    
}
