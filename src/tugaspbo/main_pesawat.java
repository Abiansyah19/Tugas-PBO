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
        System.out.println("masukkan jumlah penumpang : ");
            int jp = Integer.parseInt(a.readLine());
            citilink C[] = new citilink[jp];
            Lion_Air L[] = new Lion_Air[jp];
            System.out.println("kota asal : ");
            String k = a.readLine();
            System.out.println("pilihan rute tujuan kota tujuan :\nBali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
            String kj = a.readLine();
            System.out.println("Tanggal Berangkat :");
            String tb = a.readLine();
            System.out.println("Pesan pulang-pergi? (Y/N) : ");
            String jawaban = a.readLine();
            if (jawaban.equalsIgnoreCase("y")){
            System.out.println("Tanggal kembali : ");
            String tk = a.readLine();
            System.out.println("");
            while (true) {
        System.out.println("-- Pilih Maskapai --");
        System.out.println("1. Lion Air");
        System.out.println("2. Citilink");
        System.out.println("Masukkan Angka :");
        int angka=Integer.parseInt(a.readLine());
        System.out.println("");
        switch(angka){
            case 1: 
            System.out.println("-- Selamat datang di Lion Air --");
            for(int i=0; i<L.length;i++){
            System.out.println("Silahkan data penumpang");
            System.out.println("Booking ID : ");
            String bi = a.readLine();
            System.out.println("NIK : ");
            String n = a.readLine();
            System.out.println("Nama : ");
            String na = a.readLine();
            System.out.println("Jenis kelamin (P/L) : ");
            String j = a.readLine();
            System.out.println("No Pesawat : ");
            String np = a.readLine();
            System.out.println("No kursi : ");
            String nk = a.readLine();                                  
            C[i] = new citilink(jp,kj,k,np,nk,bi,n,na,j,tb,tk,0);
            }
            System.out.println("================================");
            for(int i=0; i<L.length;i++){
            C[i].total();
            }
            break;
            case 2:
            for(int i=0; i<L.length;i++){    
            System.out.println("-- Selamat datang di Citilink --");    
            System.out.println("Silahkan data penumpang");
            System.out.println("Booking ID : ");
            String bid = a.readLine();
            System.out.println("NIK : ");
            String nik = a.readLine();
            System.out.println("Nama : ");
            String nm = a.readLine();
            System.out.println("Jenis kelamin (P/L) : ");
            String jk = a.readLine();
            System.out.println("No Pesawat : ");
            String npe = a.readLine();
            System.out.println("No kursi : ");
            String nok = a.readLine();            
            L[i] = new Lion_Air(jp,kj,k,npe,nok,bid,nik,nm,jk,tb,tk,0);
            }
            System.out.println("================================");
            for(int i=0; i<L.length;i++){
            L[i].total();
            }
            break;
            case 3:
            System.exit(0);
        }
        }   
            }else{
            while (true) {
        System.out.println("-- Pilih Maskapai --");
        System.out.println("1. Lion Air");
        System.out.println("2. Citilink");
        System.out.println("Masukkan Angka :");
        int angka=Integer.parseInt(a.readLine());
        System.out.println("");
        switch(angka){
            case 1: 
            System.out.println("-- Selamat datang di Lion Air --");
            for(int i=0; i<C.length;i++){
            System.out.println("Silahkan data penumpang");
            System.out.println("Booking ID : ");
            String bi = a.readLine();
            System.out.println("NIK : ");
            String n = a.readLine();
            System.out.println("Nama : ");
            String na = a.readLine();
            System.out.println("Jenis kelamin (P/L) : ");
            String j = a.readLine();
            System.out.println("No Pesawat : ");
            String np = a.readLine();
            System.out.println("No kursi : ");
            String nk = a.readLine();                            
            C[i] = new citilink(jp,kj,k,np,nk,bi,n,na,j,tb,null,0);
            }
            System.out.println("================================");
            for(int i=0; i<L.length;i++){
            C[i].total();
            }
            break;
            case 2:
            System.out.println("-- Selamat datang di Citilink --");
            for(int i=0; i<L.length;i++){
            System.out.println("Silahkan data penumpang");
            System.out.println("Booking ID : ");
            String bid = a.readLine();
            System.out.println("NIK : ");
            String nik = a.readLine();
            System.out.println("Nama : ");
            String nm = a.readLine();
            System.out.println("Jenis kelamin (P/L) : ");
            String jk = a.readLine();
            System.out.println("No Pesawat : ");
            String npe = a.readLine();
            System.out.println("No kursi : ");
            String nok = a.readLine();            
            L[i] = new Lion_Air(jp,kj,k,npe,nok,bid,nik,nm,jk,tb,null,0);
            }
            System.out.println("================================");
            for(int i=0; i<L.length;i++){
            L[i].total();
            }
            break;
            case 3:
            System.exit(0);
        }
        }       
            }
        
          
    }
    }
    
    


    
    

