/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
public class mahasiswa {
    private String nim,prodi;
    private int angkatan,semester,SPP,bayar_spp_semester;
    public void setnim(String nim){
        this.nim = nim;
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    public void setangkatan(int angkatan){
        this.angkatan = angkatan;
    }
    public void setsemester(int semester){
        this.semester = semester;
    }
    public void setSPP() {
        if (getangkatan() > 17) {
            bayar_spp_semester = 15000000;
        } else {
            bayar_spp_semester = 12000000;
        }
    }
    public String getnim(){
        return nim;
    }
    public String getprodi(){
        return prodi;
    }
    public int getangkatan (){
        return angkatan;
    }
    public int getsemester (){
        return semester;
    }
    
    public int getSPP (){
      int SPP = bayar_spp_semester * getsemester();
        return SPP;
    }
    }
