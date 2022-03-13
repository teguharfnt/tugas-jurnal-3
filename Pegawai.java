package com.example;

public class Pegawai {
    private final String nama, nip, divisi;

    public Pegawai(String nama, String nip, String divisi) {
        this.nama = nama;
        this.nip = nip;
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "nama='" + nama + '\'' +
                ", nip='" + nip + '\'' +
                ", divisi='" + divisi + '\'' +
                '}';
    }
}
