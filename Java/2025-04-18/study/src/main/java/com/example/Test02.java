package com.example;

import java.util.*;

abstract class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }

    abstract int calculatePay();

    String getName(){
        return name;
    }
}

class FullTimeEmployee extends Employee{
    int monthlySalary;

    FullTimeEmployee(String name, int monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public int calculatePay(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    int hourlyWage;
    int hoursWorked;


    PartTimeEmployee(String name, int hourlyWage, int hoursWorked){
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int calculatePay(){
        return hourlyWage * hoursWorked;
    }
}

class Company{
    Employee[] employees;
    int num = 0;

    Company(int num){
        employees = new Employee[num];
    }

    //정직원 또는 알바
    void addEmployee(Employee emp){
        employees[num] = emp;
        ++num;
    }

    void printPays(){
        for(Employee i : employees){
            try{
                System.out.printf("%s: %d원\n",i.getName(), i.calculatePay());
            } catch (NullPointerException e){
                break;
            }
        }
    }
}

public class Test02 {
    public static void main(String[] args){
        Company c = new Company(4);
        Scanner s = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("직원 관리 프로그램 2.0");
        System.out.println("---------------------");
        System.out.println();
        System.out.println("1.정직원 등록");
        System.out.println("2.아르바이트 등록");
        System.out.println("3.모든 급여 출력");
        System.out.println("0.종료");
        int num = 0;
        while (true){
            System.out.print(">> ");
            try{
                num = s.nextInt();
                s.nextLine();
            } catch(InputMismatchException e) {
                System.out.print("숫자를 입력하세요!");
            }

            if(num == 1){
                String name;
                int pay;
                System.out.print("이름: ");
                name = s.nextLine();
                System.out.print("월급: ");
                pay = s.nextInt();
                s.nextLine();
                c.addEmployee(new FullTimeEmployee(name, pay));
                System.out.println("등록 완료!");
            } else if(num == 2){
                String name;
                int pay;
                int time;
                System.out.print("이름: ");
                name = s.nextLine();
                System.out.print("시급: ");
                pay = s.nextInt();
                s.nextLine();
                System.out.print("근무시간: ");
                time = s.nextInt();
                s.nextLine();
                c.addEmployee(new PartTimeEmployee(name, pay, time));
                System.out.println("등록 완료!");
            } else if(num == 3){
                System.out.println("[직원 목록]");
                c.printPays();
            } else if(num == 0){
                break;
            }
        }
    }
}
