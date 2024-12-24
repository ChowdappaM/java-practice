package com.java8.practice.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Integer> function = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * t;
            }
        };

        System.out.println(function.apply(3));

        Function<Employee, EmployeeDto> empToDtoConverter = new Function<Employee, EmployeeDto>() {

            @Override
            public EmployeeDto apply(Employee t) {
                EmployeeDto dto = new EmployeeDto(t);
                return dto;
            }
        };
        List<Employee> employees = new ArrayList<Employee>();
        // convert all employees to employee dtos
        List<EmployeeDto> empDtos = employees.stream().map(emp -> new EmployeeDto(emp)).collect(Collectors.toList());

        List<EmployeeDto> empDtos2 = employees.stream().map(empToDtoConverter).collect(Collectors.toList());

        // Line 32 and 35 are same, the function implementation is done at 22.
        
        
    }

}


class Employee{
    private int id;
    
    private String fname;
    
    private String lname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
}

class EmployeeDto {
    public EmployeeDto(Employee e) {
        this.empNo = e.getId();
        this.firstName = e.getFname();
        this.lastName = e.getLname();
    }

    private int empNo;
    private String firstName;
    private String lastName;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}