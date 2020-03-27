package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public void Add(ArrayList employeeList,String nume,String prenume,String idnp, Gender gen ) {
        Employee em = new Employee();
        em.setNume(nume);
        em.setPrenume(prenume);
        em.setIdnp(idnp);
        em.setGen(gen);
        employeeList.add(em);
    }
    public void EditGen(ArrayList employeeList,int id, Gender gen) {
        Employee em = (Employee) employeeList.get(id);
        em.setGen(gen);
        employeeList.set(id,em);
    }
    public void EditNume(ArrayList employeeList,int id,String nume) {
        Employee em = (Employee) employeeList.get(id);
        em.setNume(nume);
        employeeList.set(id,em);
    }
    public void EditPrenume(ArrayList employeeList,int id,String prenume) {
        Employee em = (Employee) employeeList.get(id);
        em.setPrenume(prenume);
        employeeList.set(id,em);
    }
    public void EditIdnp(ArrayList employeeList,int id,String idnp) {
        Employee em = (Employee) employeeList.get(id);
        em.setIdnp(idnp);
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
           Gender gen = em.getGen();

           System.out.println("| " + i + " | " + nume + " | "+ prenume+" | "+ idnp + " | "+ gen + " |");
           System.out.println("|--------------------------------------------------------------------------|");
       }
    }
}
