package com.Cintiari.TugasModul1;

public class Karyawan {
        private String nama, jabatan;
        private int umur;
        private double gaji;

        public Karyawan() {
        }

        public Karyawan(String nama, String jabatan, int umur, double gaji) {
            this.nama = nama;
            this.jabatan = jabatan;
            this.umur = umur;
            this.gaji = gaji;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJabatan() {
            return jabatan;
        }

        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }

        public double getGaji() {
            return gaji;
        }

        public void setGaji(double gaji) {
            this.gaji = gaji;
        }
    }

