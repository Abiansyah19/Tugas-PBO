/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
public class Lion_Air extends tiket {
        private int jumlahPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;

        public Lion_Air(int jumlahPenumpang, String kotaTujuan, String kotaAsal, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, int harga) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumlahPenumpang = jumlahPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }


    public String getKotaTujuan() {
        return kotaTujuan;
    }
    
    public String getNoPesawat() {
        return noPesawat;
    }
        public int getHarga() {
        if (getKotaAsal().equalsIgnoreCase("surabaya")) {
            if (getKotaTujuan().equalsIgnoreCase("bali")||getKotaTujuan().equalsIgnoreCase("lombok")) {
                harga = 500000;
            }else if(getKotaTujuan().equalsIgnoreCase("jakarta")||getKotaTujuan().equalsIgnoreCase("yogyakarta")){
                harga = 600000;
            }else if(getKotaTujuan().equalsIgnoreCase("balikpapan")||getKotaTujuan().equalsIgnoreCase("makassar")){
                harga = 800000;
            }else{
              harga = 0;
            }

            
        }else if (getKotaAsal().equalsIgnoreCase("jakarta")){
            if (getKotaTujuan().equalsIgnoreCase("bali")||getKotaTujuan().equalsIgnoreCase("lombok")) {
                harga = 500000 + 200000;
            }else if(getKotaTujuan().equalsIgnoreCase("jakarta")||getKotaTujuan().equalsIgnoreCase("yogyakarta")){
                harga = 600000 + 150000;
            }else if(getKotaTujuan().equalsIgnoreCase("balikpapan")||getKotaTujuan().equalsIgnoreCase("makassar")){
                harga = 800000;
            }else{
              harga = 0;
            }
        }else {
            System.out.println("Kota Tidak Ada");
            harga = 0;
        }
        return harga;
    }
    public String getNoKursi() {
        return noKursi;
    }

    @Override
    public void infotiket() {
        super.infotiket(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void total() {
        System.out.println("Jumlah Penumpang = "+ getJumlahPenumpang());
        System.out.println("Harga = "+ getHarga());
        System.out.println("Kota Tujuan = "+ getKotaTujuan());
        System.out.println("Nomor Pesawat = "+ getNoPesawat());
        System.out.println("Kotal Asal = "+ getKotaAsal());
        System.out.println("Nomor Kursi = "+ getNoKursi());
        System.out.println("Total = "+(getJumlahPenumpang()*getHarga()));
        
    }
    
}
