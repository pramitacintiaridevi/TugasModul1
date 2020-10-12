package com.Cintiari.TugasModul1;

import javax.swing.JOptionPane;

public class konversi_suhu {
    public static void main (String[] args){
        //membuat variable
        String a = "";
        String b = "";
        double suhuC = 0;
        double suhuR = 0;
        double suhuF = 0;
        double suhuK = 0;

        //memasukkan rumus
        a = JOptionPane.showInputDialog("Pilih suhu yang akan dikonversikan (Celcius atau Reamur atau Fahrenheit atau Kelvin)");
        switch (a) {
            case "Celcius":
            {
                b = JOptionPane.showInputDialog("Inputkan Suhu :"); //membuat inputan besar suhu
                int y = Integer.valueOf(b).intValue(); // konversi dari string ke int
                suhuR = (y * 0.8);
                suhuF = (1.8 * y + 32);
                suhuK = (y + 273);
                System.out.println ("Hasil Konversi dari Celcius ke Reamur:" +suhuR);
                System.out.println ("Hasil Konversi dari Celcius ke Fahrenheit:" +suhuF);
                System.out.println ("Hasil Konversi dari Celcius ke Kelvin :" +suhuK);
                System.out.println ("Good Job");
                break;
            }
            case "Reamur":
            {
                b = JOptionPane.showInputDialog("Inputkan Suhu :");
                int y = Integer.valueOf(b).intValue(); // konversi dari string ke int
                suhuC = (y * 1.25);
                suhuF = (2.25 * y + 32);
                suhuK = ((y/0.8) + 273);
                System.out.println ("Hasil Konversi dari Reamur ke Celcius:" +suhuC);
                System.out.println ("Hasil Konversi dari Reamur ke Fahrenheit:" +suhuF);
                System.out.println ("Hasil Konversi dari Reamur ke Kelvin :" +suhuK);
                System.out.println ("Good Job");
                break;
            }
            case "Fahrenheit":
            {
                b = JOptionPane.showInputDialog("Inputkan Suhu :");
                int y = Integer.valueOf(b).intValue(); // konversi dari string ke int
                suhuC = 0.56 *(y - 32);
                suhuR = 0.4 *(y - 32);
                suhuK = (y + 459) / 1.8;
                System.out.println ("Hasil Konversi dari Fahrenheit ke Celcius:" +suhuC);
                System.out.println ("Hasil Konversi dari Fahrenheit ke Reamur:" +suhuR);
                System.out.println ("Hasil Konversi dari Fahrenheit ke Kelvin :" +suhuK);
                System.out.println ("Good Job");
                break;
            }
            case "Kelvin":
            {
                b = JOptionPane.showInputDialog("Inputkan Suhu :");
                int y = Integer.valueOf(b).intValue(); // konversi dari string ke int
                suhuC = y - 273;
                suhuR = (y - 273) * 0.8;
                suhuF = (y * 1.8) - 459;
                System.out.println ("Hasil Konversi dari Kelvin ke Celcius:" +suhuC);
                System.out.println ("Hasil Konversi dari Kelvin ke Reamur:" +suhuR);
                System.out.println ("Hasil Konversi dari Kelvin ke Fahrenheit :" +suhuF);
                System.out.println ("Good Job");
                break;
            }
            default:
                System.out.println("Anda tidak menghitung apa-apa");
                System.out.println ("Masukkan pilihan hanya Celcius atau Reamur atau Fahrenheit atau Kelvin");
                System.out.println ("Perhatikan penulisan huruf besar dan kecilnya");
                System.out.println("Silahkan coba lagi");
                break;
        }
    }
}


