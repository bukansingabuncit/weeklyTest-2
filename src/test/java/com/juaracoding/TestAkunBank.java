package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestAkunBank {
    public static void main(String[] args) {
        testAkunBank();
    }

//    AkunBank akunbank;

    private static void testAkunBank() {
        AkunBank akun = new AkunBank("Trisna", 1000000.0);

        akun.deposit(500000.0);
        cetakAkun(akun);

    }

    @Test
    public void testDeposit(){
        AkunBank akun = new AkunBank("Trisna" , 1500000.0);
        akun.deposit(500000.0);
        Assert.assertEquals(akun.getSaldo(), 1000000);
    }


    private static void cetakAkun(AkunBank akun) {
        System.out.println("Akun BANK = " + akun.getNamaAkun());
        System.out.println("Saldo akhir = " + akun.getSaldo());
    }

}
