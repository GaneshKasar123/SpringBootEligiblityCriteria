package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeDaoImpl employeeDao;

    public void saveData(Employee employee) {
        employeeDao.saveData(employee);
    }

    public boolean checkLoanEligibilty(int empId) {
        return employeeDao.checkLoanEligiblity(empId);
    }
}
