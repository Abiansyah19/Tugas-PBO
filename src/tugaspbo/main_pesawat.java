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
public class main_pesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader a = new BufferedReader (new InputStreamReader (System.in));
        citilink C = new citilink(0,"","","","","","","","","","",0);
        Lion_Air L = new Lion_Air(0,"","","","","","","","","","",0);
        while (true) {
        System.out.println("========MENU=========");
        System.out.println("1 : beli tiket citilink");
        System.out.println("2 : beli tiket lion air");
        System.out.println("3 : Exit");
        System.out.println("Masukkan Angka :");
        int angka=Integer.parseInt(a.readLine());
        System.out.println("---------------------");
        switch(angka){
            case 1: 
            int h = 0;
            System.out.println("isi jumlah penumpang =");
            int jp = Integer.parseInt(a.readLine());
            System.out.println("isi kota tujuan =");
            String kj = a.readLine();
            System.out.println("isi kota asal =");
            String k = a.readLine();
            System.out.println("isi No Pesawat =");
            String np = a.readLine();
            System.out.println("isi no kursi =");
            String nk = a.readLine();
            System.out.println("isi bookingID =");
            String bi = a.readLine();
            System.out.println("isi nik =");
            String n = a.readLine();
            System.out.println("isi nama =");
            String na = a.readLine();
            System.out.println("isi jenis kelamin =");
            String j = a.readLine();
            System.out.println("isi tanggal berangkat =");
            String tb = a.readLine();
            System.out.println("isi tanggal kembali =");
            String tk = a.readLine();
            
            C = new citilink(jp,kj,k,np,nk,bi,n,na,j,tb,tk,0);
            C.total();
            break;
            case 2:
            
            System.out.println("isi jumlah penumpang =");
            int jump = Integer.parseInt(a.readLine());
            System.out.println("isi kota tujuan =");
            String kt = a.readLine();
            System.out.println("isi kota asal =");
            String ka = a.readLine();
            System.out.println("isi No Pesawat =");
            String npe = a.readLine();
            System.out.println("isi no kursi =");
            String nok = a.readLine();
            System.out.println("isi bookingID =");
            String bid = a.readLine();
            System.out.println("isi nik =");
            String nik = a.readLine();
            System.out.println("isi nama =");
            String nm = a.readLine();
            System.out.println("isi jenis kelamin =");
            String jk = a.readLine();
            System.out.println("isi tanggal berangkat =");
            String tbe = a.readLine();
            System.out.println("isi tanggal kembali =");
            String tke = a.readLine();
            
            L = new Lion_Air(jump,kt,ka,npe,nok,bid,nik,nm,jk,tbe,tke,0);
            L.total();
            break;
            case 3:
            System.exit(0);
        }
        }   
          
    }
    }
    
    


    
    

