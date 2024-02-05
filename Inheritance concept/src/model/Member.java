package model;

public class Member {
    String name;
    int age;
    String contact;
    String address;
    double salaryPerDay;

    public Member(String name, int age, String contact, String address, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salaryPerDay = salaryPerDay;
    }

    public double calculateSalary(int leaves) {
        int workingDays = 24 - leaves;
        return workingDays * salaryPerDay;
    }
}



