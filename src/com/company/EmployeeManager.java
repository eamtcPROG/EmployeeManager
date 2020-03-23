package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public void Add(ArrayList employeeList,String nume,String prenume,String idnp, String gen ) {
        Employee em = new Employee();
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.add(em);
    }
    public void Edit(ArrayList employeeList,int id,String nume,String prenume,String idnp, String gen ) {
        Employee em = (Employee) employeeList.get(id);
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.set(id,em);
    }
    public void Delete(ArrayList employeeList,int id){
        employeeList.remove(id);
    }
    public void View(ArrayList employeeList) {
        System.out.println("| Nr |      Nume      |      Prenume      |      Idnp      |      Gen      |");
        System.out.println("|--------------------------------------------------------------------------|");
        for (int i = 0;i< employeeList.size();i++){
           Employee em = (Employee) employeeList.get(i);
           String nume = em.getNume();
           String prenume = em.getPrenume();
           String idnp = em.getIdnp();
           String gen = em.getGen();

           System.out.println("| " + i + " | " + nume + " | "+ prenume+" | "+ idnp + " | "+ gen + " |");
           System.out.println("|--------------------------------------------------------------------------|");
       }
    }
}
