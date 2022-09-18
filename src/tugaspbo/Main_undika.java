/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author haris fajar
 */
import java.io.*;
public class Main_undika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
        mahasiswa a = new mahasiswa();
        karyawan b = new karyawan();
        undika c = new undika();
        try{
            while (true) {
        System.out.println("========MENU=========");
        System.out.println("1 : Cek SPP Mahasiswa");
        System.out.println("2 : Cek Gaji Karyawan");
        System.out.println("3 : Exit");
        System.out.println("Masukkan Angka :");
        int angka=Integer.parseInt(k.readLine());
        System.out.println("---------------------");
        switch(angka){
        case 1:   
        System.out.println("========Input Menu=========");
            System.out.println("Nama :");
            c.setnama(k.readLine());
            System.out.println("Alamat :");
            c.setalamat(k.readLine());
            System.out.println("NIM :");
            a.setnim(k.readLine());
            System.out.println("Prodi :");
            a.setprodi(k.readLine());
            System.out.println("Angkatan :");
            a.setangkatan(Integer.parseInt(k.readLine()));
            a.setSPP();
            System.out.println("Semester :");
            a.setsemester(Integer.parseInt(k.readLine()));
            
            System.out.println("======== SPP Mahasiswa =======");
            System.out.println("Nama : " + c.getnama());
            System.out.println("Alamat : " + c.getalamat());
            System.out.println("NIM : " + a.getnim());
            System.out.println("Prodi : " + a.getprodi());
            System.out.println("Angkatan : " + a.getangkatan());
            System.out.println("Semester : " + a.getsemester());
            System.out.println("SPP : " + a.getSPP());
        break;
        case 2:
        System.out.println("========Input Menu=========");
            System.out.println("Nama :");
            c.setnama(k.readLine());
            System.out.println("Alamat :");
            c.setalamat(k.readLine());
            System.out.println("NIK :");
            b.setnik(k.readLine());
            System.out.println("Bagian :");
            b.setbagian(k.readLine());
            System.out.println("Kehadiran :");
            b.setkehadiran(Integer.parseInt(k.readLine()));
            System.out.println("Gaji per hari :");
            b.setgaji_per_hari(Integer.parseInt(k.readLine()));
            
            System.out.println("======== Gaji Karyawan =======");
            System.out.println("Nama : " + c.getnama());
            System.out.println("Alamat : " + c.getalamat());
            System.out.println("NIK : " + b.getnik());
            System.out.println("Bagian : " + b.getbagian());
            System.out.println("Angkatan : " + b.getkehadiran());
            System.out.println("Gaji : " + b.getgaji());
        break;
        case 3:
        
        System.exit(0);
        
        break;
        }
            }
            
        } catch (Exception e){
            System.out.println("yang anda inputkan salah");  
        }
    }
    
}
