package com.nomadlab.myappone;

public class Student {

    private String name;
    private int grade;

    // 기본 생성자를 private 으로 정의
    private Student() {
    }

    public static class MyBuilder {
        private String name;
        private int grade;

        public MyBuilder setName(String name) {
            this.name = name;
            return this; // 중요 !
        }

        public MyBuilder setGrade(int grade) {
            this.grade = grade;
            return  this; // !!
        }

        // 핵심
        public Student build() {
            Student student = new Student();
            student.name = name;
            student.grade = grade;
            return student;
        }
    }

    public static void main(String[] args) {
        // main 실행 설정 Project -> .idea -> gradle.xml
        // https://daldalhanstory.tistory.com/280
        Student studentKim = new MyBuilder().setName("티모").setGrade(10).build();
        System.out.println(studentKim.name);
    }

}
