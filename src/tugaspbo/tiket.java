/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
public class tiket {
    private String bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal;

    public tiket(String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tglBerangkat = tglBerangkat;
        this.tglKembali = tglKembali;
        this.kotaAsal = kotaAsal;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
    public void infotiket(){
        System.out.println("Booking ID = "+ getBookingID());
        System.out.println("Nomor Induk Kependudukan = "+ getNik());
        System.out.println("Nama = "+ getNama());
        System.out.println("Jenis Kelamin = "+ getJenis_kelamin());
        System.out.println("Tanggal Berangkat = "+ getTglBerangkat());
        System.out.println("Tanggal Kembali = "+ getTglKembali());
        System.out.println("Kota Asal = "+ getKotaAsal());
        
    }
    
}
