package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee  {
    private String nume;
    private String prenume;
    private String idnp;
    private Gender gen;
    private LocalDate dataNastere;

    public void setNume(String pNume){
        nume = pNume;
    }
    public void setPrenume(String pPrenume){
        prenume = pPrenume;
    }
    public void setIdnp(String pidnp){
        idnp = pidnp;
    }
    public void setGen(Gender pGen){
        gen = pGen;
    }
    public void setDataNastere(LocalDate pData){
        dataNastere = pData;
    }


    public String getNume(){
        return this.nume;
    }
    public String getPrenume(){
        return this.prenume;
    }
    public String getIdnp(){
        return this.idnp;
    }
    public Gender getGen(){
        return this.gen;
    }
    public LocalDate getDataNastere(){
        return this.dataNastere;
    }

}

