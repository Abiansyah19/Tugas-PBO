/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
public class hewan {
    private String Tipe, Suara;
    private int usia;
    public void setTipe(String Tipe){
        this.Tipe = Tipe;
    }
    public void setSuara(String Suara){
        this.Suara=Suara;
    }
    public void setUsia(int usia){
        this.usia=usia;
    }
    public String getTipe(){
        return this.Tipe;
    }
    public String getSuara(){
        return this.Suara;
    }
    public int getusia(){
        return this.usia;
    }
}
