package Codeup;

import java.util.*;

class Student {
    private String processCode;
    private int studentId;
    private String name;

    public Student(String processCode, int studentId, String name) {
        this.processCode = processCode;
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getProcessCode() {
        return processCode;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) // 객체의 주소가 같은 경우
            return true;
        if (o == null || getClass() != o.getClass()) // 두 객체가 다른 클래스의 인스턴스인 경우
            return false;

        Student student = (Student) o; // 객체를 Student 형으로 캐스팅한다.

        return studentId == student.studentId; // 학번이 같으면 같은 객체로 판단한다.
    }
}

public class Codeup3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String processCode, int studentId, String name) {
        return new Student(processCode, studentId, name);
    }

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getStudentId() == student.getStudentId()) return true;
        }
        return false;
    }

    private void addAStudent(Student pStudent) {
        if (!isExist(pStudent)) {
            students.add(pStudent);
        }
    }

    private void deleteStudent(Student pStudent) {
//            if (isExist(pStudent)){
//                List<Student> removeObject = new ArrayList<>();
//                for (Student student : students) {
//                    if(student.getStudentId() == pStudent.getStudentId()) removeObject.add(student);
//                }
//                students.removeAll(removeObject);
//            }
//        if(isExist(pStudent)){
//            for (int i = students.size() - 1; i > -1; i--) {
//                if (students.get(i).getStudentId() == pStudent.getStudentId()) students.remove(i);
//            }
//        }
        if(isExist(pStudent)) {
            students.remove(pStudent);
        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getProcessCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getProcessCode(), student.getStudentId(), student.getName());
        }
    }

    public void printSpecificStudents(int[] arr) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentId() - o2.getStudentId();
            }
        });
        for (int item : arr) {
            Student student = students.get(item - 1);
            System.out.printf("%s %s\n", student.getStudentId(), student.getName());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeup3108 codeup3108 = new Codeup3108();
        int size = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < size; i++) {
            codeup3108.process(sc.nextLine());
        }
        String[] indexStr = sc.nextLine().split(" ");
        int[] indexArr = new int[indexStr.length];

        for(int i = 0; i < indexStr.length; i++) {
            indexArr[i] = Integer.parseInt(indexStr[i]);
        }
        codeup3108.printSpecificStudents(indexArr);
    }
}
/*
10
I 1011 한라산
I 999 백두산
I 999 오대산
D 999 백두산
I 800 백두산
D 500 한라산
I 900 남산
I 950 금강산
I 1205 지리산
I 700 북한산
1 2 4 5 6
*/
