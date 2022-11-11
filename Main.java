package com.company;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList AList = new ArrayList();
    // Menambahkan Data
    AList.add("Raviko Muhammad Raihan Yusi");
    AList.add(2003);
    AList.add("Teknik Informatika");
    AList.add(19);
    AList.add("UIN SUSKA RIAU");
    System.out.println(AList);
        System.out.println("_____________________");

        //menampilkan jumlah atau besaran Array:
        System.out.println(AList.size());

        // menambahkan list pada array :
        AList.add(2 , "Fakultas Sains & Teknologi");
        System.out.println("_____________________");

        // menampilkan output array
        System.out.println();
        System.out.println(AList);
        System.out.println("_____________________");

        //Menghapus data pada ArrayList
        AList.remove(2);
        AList.remove(true);
        System.out.println("Hasil Remove Data ArrayList :");
        System.out.println(AList);
        System.out.println("_____________________");

        //Menampilkan seluruh data ArrayList dengan metode Perulangan
        for(int idx = 0 ; idx < AList.size();idx++){
            System.out.println(AList.get(idx));
        }



    }
}
