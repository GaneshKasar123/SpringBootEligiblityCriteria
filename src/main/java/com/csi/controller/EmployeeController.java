package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Employee employee){
        employeeService.saveData(employee);
        return "save data successfully";
    }
    @GetMapping("/checkloaneligibility/{empId}")
    public boolean checkLoanEligibilty(@PathVariable int empId){
        return employeeService.checkLoanEligibilty(empId);
    }
}
