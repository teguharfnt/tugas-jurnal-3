package com.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int select;

        String nama, nip, divisi;

        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

        do {
            System.out.println("1. Input\n2. Cetak list pegawai\n3. Delete \n4. Exit");
            select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1 -> {
                    System.out.println("Input data pegawai : ");
                    System.out.print("Nama pegawai : ");
                    nama = br.readLine();
                    System.out.print("NIP pegawai : ");
                    nip = br.readLine();
                    System.out.print("Divisi pegawai : ");
                    divisi = br.readLine();
                    linkedList.insertAtFront(new Pegawai(nama, nip, divisi));
                }
                case 2 -> linkedList.print();
                case 3 -> linkedList.removeFromBack();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
        while (true);

    }
}
