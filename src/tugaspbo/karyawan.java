/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
public class karyawan {
    private String nik,bagian;
    private int kehadiran,gaji_per_hari,total_gaji;
    public void setnik (String nik){
        this.nik = nik;
    }
    public void setbagian (String bagian){
        this.bagian = bagian;
    }
    public void setkehadiran (int kehadiran){
        this.kehadiran = kehadiran;
    }
    public void setgaji_per_hari (int gaji_per_hari){
        this.gaji_per_hari = gaji_per_hari;
    }
    public String getnik (){
        return nik;
    }
    public String getbagian (){
        return bagian;
    }
    public int getkehadiran (){
        return kehadiran;
    }
    public int getgaji_per_hari(){
        return gaji_per_hari;
    }
    public int getgaji (){
        int total_gaji = getkehadiran() * getgaji_per_hari();
        return total_gaji;
    }
}
