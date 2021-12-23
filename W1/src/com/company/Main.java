package com.company;

import java.util.Arrays;
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
            Product product = inputProduct(scanner);
            products[i] = product;
        }
//        System.out.println(Arrays.toString(products));
//        for (Product i : products) {
//            System.out.println(i);
//        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }

        sum(products);

        findPro(scanner, products);

        changePro(scanner, products);

        delPro(scanner, products);
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

    public static double sum(Product[] products) {
        double sumPri = 0;
        for (int i = 0; i < products.length; i++) {
            sumPri += products[i].getPrice();
        }
        System.out.println("Tổng giá các sản phẩm: " + sumPri);
        return sumPri;
    }

    public static void findPro(Scanner scanner, Product[] products) {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String inputName = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (inputName == products[i].getName()) {
                System.out.println(products[i]);
                break;
            }
        }
    }
    public static void delPro(Scanner scanner, Product[] products) {
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            while (id == products[i].getId()) {
                System.arraycopy(products, i + 1, products, i, products.length - 1 - i);
            }
        }
        System.out.print(Arrays.toString(products));
    }

    public static void changePro(Scanner scanner, Product[] products) {
        System.out.print("Nhập id sản phẩm cần sửa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (id == products[i].getId()) {
                System.out.print("id: " + id);
                scanner.nextLine();
                System.out.print("\n" + "Nhập tên: ");
                products[i].setName(scanner.nextLine());
                System.out.print("Nhập giá: ");
                products[i].setPrice(scanner.nextDouble());
                System.out.print("Nhập loại: ");
                scanner.nextLine();
                products[i].setType(scanner.nextLine());
                System.out.println("Nhập loại tiền: ");
                scanner.nextLine();
                products[i].setMoneyType(scanner.nextLine());
            }
        }
    }

}
