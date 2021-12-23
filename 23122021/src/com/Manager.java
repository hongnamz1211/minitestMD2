package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.students = new ArrayList<>();
    }

    public Student createStudent() {
        System.out.println("Nhập mã");
        int id = scanner.nextInt();
        for (Student s :
                students) {
            if (s.getId() == id) {
                System.out.println("Trùng mã sinh viên. Nhập lại");
                return null;
            }
        }
        System.out.println("Nhập tên");
        String name = scanner.next();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm toán");
        double pointMath = scanner.nextDouble();
        System.out.println("Nhập điểm lý");
        double pointPhis = scanner.nextDouble();
        System.out.println("Nhập điểm hóa");
        double pointChemistry = scanner.nextDouble();
        return  new Student(id, name, age, pointMath, pointPhis, pointChemistry);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student s :
                students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        int index = students.indexOf(student);
        return students.remove(index);
    }

    public Student editStudent(int idS) {
        Student student = null;
        for (Student s :
                students) {
            if (s.getId() == idS) {
                student = s;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println("Nhập lại id");
            int id = scanner.nextInt();
            for (Student s :
                    students) {
                if (s.getId() == id) {
                    System.out.println("Trùng mã sinh viên. Nhập lại");
                    return null;
                }
            }
            student.setId(id);
            System.out.println("Nhập lại tên");
            String name = scanner.next();
            student.setName(name);
            System.out.println("Nhập lại tuổi");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhập lại điểm toán");
            double pointMath = scanner.nextDouble();
            student.setPointMath(pointMath);
            System.out.println("Nhập lại điểm lý");
            double pointPhis = scanner.nextDouble();
            student.setPointPhis(pointPhis);
            System.out.println("Nhập lại điểm hóa");
            double pointChemistry = scanner.nextDouble();
            student.setPointChemistry(pointChemistry);
            students.set(index, student);
        }
        return student;
    }

    public void displayAll() {
        for (Student s :
                students) {
            System.out.println(s);
        }
    }

    public void displayStudent(int id) {
        Student student = null;
        for (Student s :
                students) {
            if (s.getId() == id)     {
                student = s;
            }
        }
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

//    public void pointAvg() {
//        Student student = null;
//        double hightPointAvg = 0;
//        for (Student s :
//                students) {
//            if (s.pointAvg() > hightPointAvg) {
//                student = s;
//            }
//        }
//        if (student != null) {
//            System.out.println(student);
//        }
//    }

    public ArrayList<Student> pointHightAvg() {
        ArrayList<Student> studentHightAvg = new ArrayList<>();
        double hightPointAvg = 0;
        for (Student s :
                students) {
            if (s.pointAvg() > hightPointAvg) {
                hightPointAvg = s.pointAvg();
            }
        }
        for (Student s :
                students) {
            if (s.pointAvg() == hightPointAvg) {
                studentHightAvg.add(s);
            }
        }
        return studentHightAvg;
    }

    public void studentSort() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.pointAvg() - o2.pointAvg() > 0) {
                    return 1;
                } else if (o1.pointAvg() - o2.pointAvg() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Danh sách sau khi sắp xếp");
        displayAll();
    }
}
