package com.java8.practice.usecases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Set {

    public static void main(String... args) {

        Employee e1 = new Employee(11, "ramu", "M", 12345.67, "HR", LocalDate.of(2000, 06, 28));

        Employee e2 = new Employee(12, "Sujatha", "F", 3455.67, "HR", LocalDate.of(1999, 06, 1));

        Employee e3 = new Employee(13, "Vinutha", "F", 50000.67, "IT", LocalDate.of(2002, 12, 28));
        Employee e4 = new Employee(14, "Krishna", "M", 35000.67, "Marketing", LocalDate.of(1998, 06, 28));

        Employee e5 = new Employee(15, "John", "M", 8900.67, "IT", LocalDate.of(2020, 06, 8));

        Employee e6 = new Employee(16, "Sandhya", "F", 9000.67, "IT", LocalDate.of(2004, 06, 2));
        List<Employee> employess = Arrays.asList(e1, e2, e3, e4, e5, e6);

        long maleCount = employess.stream().filter(e -> e.getGender().equals("M")).count();
        long femaleCount = employess.stream().filter(e -> e.getGender().equals("F")).count();
        List<Employee> men = employess.stream().filter(e -> e.getGender().equals("M")).collect(Collectors.toList());
        List<Employee> women = employess.stream().filter(e -> e.getGender().equals("F")).collect(Collectors.toList());

        men.stream().forEach(e -> System.out.println(e));
        women.stream().forEach(e -> System.out.println(e));

        System.out.println("male " + maleCount);

        System.out.println("Female " + femaleCount);

        java.util.Set<String> depts = employess.stream().map(e -> e.getDept()).collect(Collectors.toSet());
        System.out.println(depts);

        Employee maxSalEmp = employess.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxSalEmp);

        Employee minSalEmp = employess.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(minSalEmp);
        System.out.println("*********************");
        List<Employee> newJoinees = employess.stream().filter(e -> e.getJoingDate().getYear() >= 2000)
                .collect(Collectors.toList());

        newJoinees.forEach(e -> System.out.println(e));

        Map<String, List<Employee>> groupByDept = employess.stream().collect(Collectors.groupingBy(Employee::getDept));

        Map<String, Long> countByDept = employess.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(groupByDept);
        countByDept.forEach((dept, count) -> System.out.println("Dept : "+dept + " Count : "+ count));
        
        /**
         * Average salary of each dept.
         */
       Map<String, Double> avgSalByDept =
               employess.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
       avgSalByDept.forEach((dept, avgSal)->System.out.println("Dept: "+ dept+ " Avg sal: "+avgSal));
       
       
       /**
        * Most senior employee.
        * Comparing for sorting, minimum record considered as early joined.
        */
       Employee senior = employess.stream().min(Comparator.comparing(Employee::getJoingDate)).get();
       System.out.println(senior);
       
       /** 
        * How many male and Female employees in IT dept.
        */
       Map<String, Long> itEmployees = 
               employess.stream().filter(e->e.getDept().equalsIgnoreCase("IT")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
       itEmployees.forEach((g, c)->System.out.println("Gender: "+g +" - Count: "+c));
       
       /**
        * Avg and total salary of Org.
        */
       double avgSal = employess.stream().mapToDouble(e->e.getSalary()).average().getAsDouble();
       System.out.println(avgSal);
       double total = employess.stream().mapToDouble(e->e.getSalary()).sum();
       System.out.println(total);
       
       
       /**
        * Other way fo get avg and sum of the salary in org.
        */
       DoubleSummaryStatistics empStats = employess.stream().mapToDouble(e->e.getSalary()).summaryStatistics();

       System.out.println("Avg sal: "+ empStats.getAverage()+" Total sal: "+ empStats.getSum());
       
       /**
        * Sort the employees in desc by salary
        */
       List<Employee> sortedEmps = 
               employess.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
       sortedEmps.forEach(e->System.out.println(e));
       
       
       /**
        * Top 3 employees.
        *
        */
       System.out.println("Top 3 salaried employees:");
       List<Employee> topSalaried = 
               employess.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
       topSalaried.forEach(e-> System.out.println(e));
       
       /**
        * Average salary of male and Female
        */
       System.out.println("Average salary by Gender in org!");
       Map<String, Double> salaryByGender = 
               employess.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
       System.out.println(salaryByGender);
       
       
    }
}

class Employee {

    public Employee(int id, String name, String genger, Double salary, String dept, LocalDate of) {
        this.id = id;
        this.name = name;
        this.gender = genger;
        this.salary = salary;
        this.dept = dept;
        this.joingDate = of;

    }

    int id;
    String name;
    String gender;
    Double salary;
    LocalDate joingDate;

    String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getJoingDate() {
        return joingDate;
    }

    public void setJoingDate(LocalDate joingDate) {
        this.joingDate = joingDate;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getName() + " " + this.getGender() + " " + this.getSalary() + " "
                + this.getDept() + " " + this.getJoingDate();
    }
}