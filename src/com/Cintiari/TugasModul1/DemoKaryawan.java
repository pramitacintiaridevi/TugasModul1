package com.Cintiari.TugasModul1;

public class DemoKaryawan {
        public static void main(String[] args) {
            Karyawan karyawanTanpa = new Karyawan();//inputan
            System.out.println("==========Detail Karyawan TB.Berkah Klahang==========");
            karyawanTanpa.setNama("Rudi");
            karyawanTanpa.setUmur(21);
            karyawanTanpa.setGaji(1200000);
            karyawanTanpa.setJabatan("Kurir");

            //Output
            System.out.println("Karyawan 1");
            System.out.println("Nama: " + karyawanTanpa.getNama());
            System.out.println("Umur: " + karyawanTanpa.getUmur());
            System.out.println("Gaji: " + karyawanTanpa.getGaji());
            System.out.println("Jabatan: " + karyawanTanpa.getJabatan());
            System.out.println();

            Karyawan karyawan = new Karyawan("Melvin", "Kasir", 25, 4000000);
            //Output
            System.out.println("Karyawan 2");
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Umur: " + karyawan.getUmur());
            System.out.println("Gaji: " + karyawan.getGaji());
            System.out.println("Jabatan: " + karyawan.getJabatan());

        }
    }
