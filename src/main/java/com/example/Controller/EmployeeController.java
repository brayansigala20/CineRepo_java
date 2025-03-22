package com.example.Controller;

import java.io.File;
import java.util.List;
import com.example.models.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeController {

    public EmployeeController() {
    }

    public List<Employee> getEmployees() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/java/com/example/util/Employee.json");

        if (!file.exists()) {
            System.out.println("Error: El archivo Employee.json no existe.");
            return null;
        }

        try {
            List<Employee> employees = objectMapper.readValue(file, new TypeReference<List<Employee>>() {
            });

            if (employees.isEmpty()) {
                System.out.println("No hay empleados en la lista.");
            }
            return employees;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }

    }

}
