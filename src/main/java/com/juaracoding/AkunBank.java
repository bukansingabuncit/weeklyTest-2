package com.juaracoding;

public class AkunBank {

    public double deposit;
    private String namaAkun;
    private double saldo;

    public AkunBank(String namaAkun, double initialSaldo){
        this.namaAkun = namaAkun;
        this.saldo = initialSaldo;
    }
//    getNamaAkun() {
//        return namaAkun;

//    public void setNamaAkun(String namaAkun) {
//        this.namaAkun = namaAkun;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(double saldo) {
//        this.saldo = saldo;

    public String getNamaAkun() {
        return namaAkun;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo -= jumlah;
            System.out.println("deposit = " + jumlah);
        } else {
//            saldo = saldo - amt;
            System.out.println("Saldo tidak sesuai");
        }
//        return saldo;
    }

    public void setAkun(String trisna) {
        this.namaAkun = trisna;
    }


}
