package com.codecool.acsbencetamas.pa.kitchen;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Kitchen {
    private List<Employee> employees = new LinkedList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Helper> getHelpers() {
        return employees.stream()
                .filter(employee -> employee instanceof Helper)
                .map(employee -> (Helper) employee)
                .collect(Collectors.toList());
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
