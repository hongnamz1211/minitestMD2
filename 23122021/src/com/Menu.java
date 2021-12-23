package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Sửa thông tin sinh viên");
            System.out.println("5. Tìm sinh viên theo id");
            System.out.println("6. Sinh viên có điểm cao nhất");
            System.out.println("7. Danh sách sắp xếp theo điểm trung bình");
            System.out.println("0. Exit");
            System.out.println("--------------");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = manager.createStudent();
                    manager.addStudent(student);
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên muốn xóa");
                    int id3 = scanner.nextInt();
                    System.out.println("Thông tin sinh viên đã xóa");
                    System.out.println(manager.deleteStudent(id3));
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên muốn sửa");
                    int id4 = scanner.nextInt();
                    manager.editStudent(id4);
                    break;
                case 5:
                    System.out.println("Nhập id sinh viên muốn tìm");
                    int id5 = scanner.nextInt();
                    manager.displayStudent(id5);
                    break;
                case 6:
                    System.out.println("Sinh viên có điểm trung bình cao nhất");
                    ArrayList<Student> students = manager.pointHightAvg();
                    System.out.println(students);
                    break;
                case 7:
                    System.out.println("Danh sách sắp xếp theo điểm trung bình");
                    manager.studentSort();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
