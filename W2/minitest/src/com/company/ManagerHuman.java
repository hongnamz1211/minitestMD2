package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman implements Manager{
    Scanner scanner = new Scanner(System.in);

//    private Object[] humans;
    ArrayList<MyHuman> humans = new ArrayList<MyHuman>();

    public ManagerHuman() {
        this.humans = humans;
    }

    @Override
    public MyStudent createHuman() {
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm trung bình");
        double avg = scanner.nextDouble();
        return new MyStudent(id,name,age,avg);
    }

    @Override
    public void displayHuman() {
        System.out.println("Danh sách");
        for (MyHuman h:humans) {
            System.out.println(h);
        }
    }

    @Override
    public void addHumam() {

    }

    @Override
    public void findHuman() {
        System.out.println("Nhập id của người muốn tìm");
        int id = scanner.nextInt();
        for (MyHuman h : humans) {
            if (h instanceof MyHuman) {
                if (h.getId() == id) {
                    System.out.println(h);
                }
            }
        }
    }

    @Override
    public void delHuman() {
//        System.out.println("Nhập id của người muốn xóa");
//        scanner.nextLine();
//        int id = scanner.nextInt();
//        int index = 0;
//        MyHuman humansList = new MyHuman[humans.length];
//        for (MyHuman h : humans) {
//            if (h instanceof MyHuman) {
//                if (h != null && !((h.getId()) == id)) {
//                    humansList[index] = humans;
//                    index++;
//                }
//            }
//        }
//        humans = humansList;
    }

    @Override
    public void editHuman() {
        System.out.println("Nhập id của người muốn sửa");
        int editId = scanner.nextInt();
        for (MyHuman h:humans) {
            if (h instanceof MyHuman) {
                if (editId == h.getId()) {
                    System.out.println("Nhập id");
                    int id = scanner.nextInt();
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi:");
                    int age = scanner.nextInt();
                    System.out.println("Nhập điểm trung bình");
                    double avg = scanner.nextDouble();
                }
            }
        }
    }

    @Override
    public void sortHuman() {
//        Arrays.sort(humans, new Comparator<MyStudent>(){
//
//            @Override
//            public int compare(MyStudent o1, MyStudent o2) {
//                if (o1.getAvg() > o2.getAvg()) return 1;
//                if (o1.getAvg() < o2.getAvg()) return -1;
//                return 0;
//            }
//        });
    }

    @Override
    public void totalAvg() {
        System.out.println("Tổng điểm trung bình");
        double totalAvg = 0;
        for (MyHuman h: humans) {
            if (h instanceof MyStudent) {
                totalAvg += ((MyStudent)h).getAvg();
            }
        }
        System.out.println(totalAvg);
    }
}
