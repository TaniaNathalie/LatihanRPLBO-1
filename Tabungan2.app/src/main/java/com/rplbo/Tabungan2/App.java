package com.rplbo.Tabungan2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void tampilRekening(Rekening r){
        System.out.println("Nama: "+r.getPemilik());
        System.out.println("Saldo: "+r.getSaldo());
    }
    public static void main( String[] args )
    {
        /*Rekening rekAnton = new Rekening();
        rekAnton.pemilik = "Anton";
        rekAnton.saldo = 1000;
        System.out.println("Nama: "+rekAnton.getPemilik());
        System.out.println("Nama: "+rekAnton.getSaldo());
        rekAnton.penyetoran(250);
        System.out.println("Saldo: "+rekAnton.getSaldo());
        rekAnton.penarikan(450);
        System.out.println("Saldo: "+rekAnton.getSaldo());*/

        Rekening A = new Rekening(300,"A");
        Rekening B = new Rekening(1200,"B");
        //A.Saldo = 300;
        //A.pemilik = "A";
        //B.saldo = 1200;
        //B.pemilik = "B";
        //A.penyetoran(300);
        //A.setPemilik("A");
        //B.penyetoran(1200);
        //B.setPemilik("B");
        System.out.println("No Rek A: "+A.getNoRek());
        System.out.println("No Rek B: "+B.getNoRek());


        tampilRekening(A);
        tampilRekening(B);

        A.penarikan(150);
        B.penyetoran(300);
        B.penarikan(-500);
        A.penyetoran(-1000);
        System.out.println("Saldo A: "+A.getSaldo());
        System.out.println("Saldo B: "+B.getSaldo());

        B.transfer(150,A);
        System.out.println("Saldo A: "+A.getSaldo());
        System.out.println("Saldo B: "+B.getSaldo());
    }
}
