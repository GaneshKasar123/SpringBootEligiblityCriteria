package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepo employeeRepo;

    public void saveData(Employee employee) {
        employeeRepo.save(employee);
    }

    public  boolean checkLoanEligiblity(int empId) {
        boolean status=false;

        for (Employee emp:employeeRepo.findAll()){
            if (emp.getEmpId()==empId && emp.getEmpSalary()>=50000){
                status=true;
            }

        }

        return status;
    }
}
