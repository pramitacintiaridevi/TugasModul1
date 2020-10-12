package com.Cintiari.TugasModul1;

import java.util.Scanner;
public class PendaftaranKuliah {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);



        System.out.println("==============PENDAFTARAN MAHASISWA/MAHASISWI================");
        String Nama,tempattanggallahir,sekolah , Umur , alamat,JenisKelamin,agama,nim;
        int nilai=0;
        int nilaiinggris=0;
        int nilaimtk=0;
        int nilaibhs=0;
        int nilaiPraktek=0;


        int jurusan;
        System.out.print("Masukan Nama Lengkap                   : ");
        Nama = in.nextLine();
        System.out.print("Masukan Tempat Tanggal lahir           : ");
        tempattanggallahir = in.nextLine();
        System.out.print("Masukan Asal Sekolah                   : ");
        sekolah = in.nextLine();
        System.out.print("Masukan Umur                           : ");
        Umur = in.nextLine();
        System.out.print("Masukan Alamat Lengkap                 : ");
        alamat = in.nextLine();
        System.out.print("Masukan Jenis Kelamin                  : ");
        JenisKelamin = in.nextLine();
        System.out.print("Masukan Agama                          : ");
        agama = in.nextLine();
        System.out.print("Masukan Nim                            : ");
        nim = in.nextLine();
        System.out.print("Masukan Nilai HASIL UN BAHASA INGGRIS  : ");
        nilaiinggris=in.nextInt();
        System.out.print("Masukan Nilai HASIL UN MATEMATIKA      : ");
        nilaimtk=in.nextInt();
        System.out.print("Masukan Nilai HASIL UN BAHASA INDONESIA: ");
        nilaibhs=in.nextInt();
        System.out.print("Masukan Nilai HASIL UN PRAKTEK         : " );
        nilaiPraktek=in.nextInt();

        System.out.println("==================================================");
        System.out.print("Pilihan Jurusan : \n 1. Sistem Informasi \n 2. Rekayasa Perangkat Lunak \n 3. Teknik Informatika \n 4. Teknik Elektro \n 5. Teknik Industri \n 6. DKV   \n\n Masukan pilihan :");

        jurusan = in.nextInt();

        nilai=( (nilaiinggris+nilaimtk+nilaibhs+nilaiPraktek)/5);

        System.out.println("Nilai Akhir "+nilai);
        System.out.println("======================HASIL SELEKSI================");
        if (nilai>=80);

        if(nilai>=80){
            System.out.println(" Grade = LULUS");
            System.out.println(" Grade = A");
        }else if(nilai>=55){
            System.out.println(" Grade = LULUS");
            System.out.println(" Grade = B");
        }else if(nilai>=50){
            System.out.println(" Grade = TIDAK LULUS");
            System.out.println(" Grade = C");
        }else if(nilai>=45){
            System.out.println(" Grade = TIDAK LULUS");
            System.out.println(" Grade = D");
        }else {
            System.out.println(" Grade = TIDAK LULUS");
            System.out.println(" Grade = E");
        }


        {




            switch (jurusan){
                case 1: System.out.println("memilih jurusan Sistem Informasi");
                    break;

                case 2: System.out.println("memilih jurusan Teknik Industri");
                    break;
                case 3: System.out.println("memilih jurusan Teknik Informatika");
                    break;
                case 4: System.out.println("memilih jurusan Teknik Elektro");
                    break;
                case 5: System.out.println("memilih jurusan Teknik Kimia");
                    break;
                case 6: System.out.println("memilih jurusan Teknik mesin");
                    break;
            }
        }

    }
}