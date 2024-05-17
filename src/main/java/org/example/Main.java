package com.main;

import java.util.ArrayList;
import java.util.Scanner;

class InputMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> mahasiswa = new ArrayList<>();
        String nama;
        int count = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + count + ": ");
            nama = scanner.nextLine().trim();

            try {
                if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                } else if (nama.equalsIgnoreCase("selesai")) {
                    break;
                } else {
                    mahasiswa.add(nama);
                    count++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String mhs : mahasiswa) {
            System.out.println("- " + mhs);
        }

        scanner.close();
    }
}