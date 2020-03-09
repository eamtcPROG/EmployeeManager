package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public void Add(List employeeList,int id,String nume,String prenume,String idnp, String gen ){
        Employee em = new Employee();
        em.setId(id);
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.add(id,em);
    }
    public void Edit(List employeeList,Employee em,int id,String nume,String prenume,String idnp, String gen ){
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.set(id,em);
    }
    public void Delete(List employeeList,int id){
        employeeList.remove(id);
    }
    public void View(List employeeList){
        System.out.print("| Id |      Nume      |      Prenume      |      Idnp      |      Gen      |");
        System.out.print("----------------------------------------------------------------------------");
        for (int i = 0;i< employeeList.size();i++){
           Employee em = (Employee) employeeList.get(i);
           String nume = em.getNume();
           String prenume = em.getPrenume();
           String idnp = em.getIdnp();
           String gen = em.getGen();
           int id = em.getId();
           System.out.println("| " + id + " | " + nume + " | "+ prenume+" | "+" | "+ idnp + " | "+ gen + " |");
            System.out.print("----------------------------------------------------------------------------");
       }
    }
}
