package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ManagerHuman managerHuman = new ManagerHuman();
        int choice;
        do {
            System.out.println("-------------");
            System.out.println("Menu sinh viên");
            System.out.println("100. Thêm thông tin");
            System.out.println("1. Hiện danh sách");
            System.out.println("00. Thêm sinh viên");
            System.out.println("3. Tìm sinh viên");
            System.out.println("00. Xóa sinh viên");
            System.out.println("5. Sửa thông tin");
            System.out.println("00. Sắp xếp theo điểm trung bình");
            System.out.println("7. Tổng điểm trung bình");
            System.out.println("0. Exit");
            System.out.println("-------------");
            choice = scanner.nextInt();
            switch (choice) {
                case 100:
                    managerHuman.createHuman();
                    break;
                case 1:
                    managerHuman.displayHuman();
                    break;
                case 2:
                    managerHuman.addHumam();
                    break;
                case 3:
                    managerHuman.findHuman();
                    break;
                case 4:
                    managerHuman.delHuman();
                    break;
                case 5:
                    managerHuman.editHuman();
                    break;
                case 6:
                    managerHuman.sortHuman();
                    break;
                case 7:
                    managerHuman.totalAvg();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
