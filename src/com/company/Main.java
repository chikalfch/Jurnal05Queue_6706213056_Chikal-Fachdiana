package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        Scanner input = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\t Todolist");
            System.out.println("1. Input Pekerjaan ");
            System.out.println("2. Tampilkan Pekerjaan yang dilakukan ");
            System.out.println("3. Delete Pekerjaan");
            System.out.println("4. Tampilkan Seluruh List Pekerjaan");
            System.out.println("5. Keluar");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("masukkan pekerjaan");
                    queue.enqueue(input.next());
                    break;
                case 2:
                    queue.printQueue();
                    break;
                case 3:
                    queue.dequeue();
                    break;
                case 4:
                    queue.list();
                    break;
                case 5:
                    kondisi = false;
                    break;
            }
        }
    }
}
