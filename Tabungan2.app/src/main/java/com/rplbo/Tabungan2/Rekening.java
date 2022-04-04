package com.rplbo.Tabungan2;

public class Rekening {
    private String pemilik;
    private int saldo;
    private int noRek;
    private static int nextID = 1;

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }
    public Rekening(int jumlah,String p){
        if(jumlah>0)
            saldo = jumlah;
        else saldo = 0;
        pemilik = p;
        noRek = nextID;
        nextID++;

    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Rekening.nextID = nextID;
    }

    public void penarikan(int jumlah){
        if(jumlah > 0 && saldo>=jumlah){
            saldo = saldo - jumlah;
        }
    }

    public void penyetoran(int jumlah){
        if(jumlah > 0){
            saldo = saldo + jumlah;
        }
    }

    public int getSaldo(){
        return saldo;
    }

    public String getPemilik(){
        return pemilik;
    }
    public void setPemilik(String p){
        pemilik = p;
    }

    public void transfer(int jumlah, Rekening r){
        penarikan(jumlah);
        r.penyetoran(jumlah);
    }
}
