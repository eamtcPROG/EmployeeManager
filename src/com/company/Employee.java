package com.company;

public class Employee {
    public int id;
    public String nume;
    public String prenume;
    public String idnp;
    public String gen;

    public void setId(int pId){
        id = pId;
    }
    public void setNume(String pNume){
        nume = pNume;
    }
    public void setPrenume(String pPrenume){
        prenume = pPrenume;
    }
    public void setIdnp(String pidnp){
        idnp = pidnp;
    }
    public void setGen(String pGen){
        gen = pGen;
    }

    public int getId(){
        return this.id;
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
    public String getGen(){
        return this.gen;
    }
}
