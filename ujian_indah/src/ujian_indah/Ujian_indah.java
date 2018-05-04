/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_indah;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Ujian_indah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah_pesanan,tanggal,harga = 0,total;
        String nama_pemesan,rute_kereta,kode_kelas,kelas,nama_rute,Eko = null,Bis = null,Eks = null;
        
        Scanner inputan = new Scanner (System.in);
        
        
         for (int i=1;i<=2;i++) {
             
             System.out.println("1. Jakarta - Bandung");
            System.out.println("Ekonomi : 90.000");
            System.out.println("Bisnis : 130.000");
            System.out.println("Eksekutif : 170.000");
            System.out.println("2. Jakarta - Yogyakarta");
            System.out.println("Ekonomi : 100.000");
            System.out.println("Bisnis : 180.000");
            System.out.println("Eksekutif : 250.000");
            
            
            
            System.out.print("Nama Pemesan : ");
            nama_pemesan=inputan.nextLine();
            System.out.print("Rute Kereta [1/2] : ");
            rute_kereta=inputan.nextLine();
            System.out.print("Kelas [Eko/Bis/Eks] : ");
            kode_kelas=inputan.nextLine();
            System.out.print("Jumlah Kursi : ");
            jumlah_pesanan=inputan.nextInt();
            System.out.print("Tanggal Keberangkatan : ");
            tanggal=inputan.nextInt ();
            
            
            switch (rute_kereta) {
                case "1" :
            nama_rute="Jakarta-Bandung";
            if ("Eko".equals(kode_kelas))
            {
                harga=90000;
                kelas=Eko;
            }
            else if ("Bis".equals(kode_kelas))
            {
                harga=130000;
                kelas=Bis;
            }
            else if ("Eks".equals(kode_kelas))
            {
                harga=170000;
                kelas=Eks;
            }
                break;
            
                
             case "2" :
            nama_rute="Jakarta_Yogyakarta";
            if ("Eko".equals(kode_kelas))
            {
                harga=100000;
                kelas=Eko;
            }
            else if ("Bis".equals(kode_kelas))
            {
                harga=180000;
                kelas=Bis;
            }
            else if ("Eks".equals(kode_kelas))
            {
                harga=250000;
                kelas=Eks;
            }
            
            break;
            
             default :
                 nama_rute="Maaf Silahkan Input Ulang";
                
            }
            
            if (jumlah_pesanan>=1 && jumlah_pesanan<=3); {
                    
             total=harga*jumlah_pesanan;
             
            System.out.println("Terimakasih anda telah memesan tiket kereta dengan rincian sebagai berikut ");
            System.out.println("Tanggal keberangkatan : "+tanggal);
            System.out.println("Nama : " +nama_pemesan);
            System.out.println("Rute : "+ rute_kereta);
            System.out.println("Kelas : " +kode_kelas);
            System.out.println("Harga Satuan : " + harga);
            System.out.println("Jumlah Kursi : "+jumlah_pesanan);
            System.out.println("Total Bayar : Rp. " +total);
            System.out.println("Silahkan membayar di indomaret terdekat");
    }
    
}
    }
}
