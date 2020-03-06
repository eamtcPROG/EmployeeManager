package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List employeeList = new ArrayList();
    public void Add(int id,String nume,String prenume,String idnp, String gen ){
        Employee em = new Employee();
        em.setId(id);
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.add(id,em);
    }

}
