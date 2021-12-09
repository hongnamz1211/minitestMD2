package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Product[] products;
        System.out.print("Nhập số lượng sản phẩm: ");
        int size = scanner.nextInt();
        products = new Product[size];
        for (int i = 0; i < products.length; i++) {
                products[i] = inputProduct(scanner);
        }
//        String nameProduct = scanner.nextLine();
//        int count = 0;
//        for (int i = 0; i < products.length; i++) {
//            if (products[i].ge
//        }
    }

    public static Product inputProduct(Scanner scanner) {
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = scanner.nextDouble();
        System.out.print("Nhập loại: ");
        String type = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Nhập loại tiền: ");
        String moneyType = scanner.nextLine();
        return new Product(id, name, price, type, moneyType);
    }



}
