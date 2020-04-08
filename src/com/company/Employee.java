package com.company;

public class Employee  {
    private String nume;
    private String prenume;
    private String idnp;
    private Gender gen;

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

}

