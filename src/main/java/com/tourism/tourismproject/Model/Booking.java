package com.tourism.tourismproject.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    private String cusname;
    private String cusaddress;
    private String cusid;
    private String cusemail;
    private long cusphone;
    private String idnumber;
    private int person;
    private String package1;
    private String transport;
    
   
    

    
    public Booking() {
    }
    public Booking (String cusname,String cusaddress,String cusid,String cusemail,long cusphone,String idnumber,int person,String package1,String transport){
 

        this.cusname = cusname;

        this.cusaddress = cusaddress;

        this.cusid =  cusid;

        this.cusemail = cusemail;

        this.cusphone = cusphone;

        this. idnumber =  idnumber;
        
        this.person = person;

        this.package1 = package1;

        this.transport = transport;
    }
    public void save(Booking b) {

    }

    public String getCusname() {
        return cusname;
    }
    public void setCusname(String cusname) {
        this.cusname = cusname;
    }
    public String getCusaddress() {
        return cusaddress;
    }
    public void setCusaddress(String cusaddress) {
        this.cusaddress =cusaddress;
    }
    public String getCusid() {
        return cusid;
    }
    public void setCusid(String cusid) {
        this.cusid = cusid;
    }
    public String getCusemail() {
        return cusemail;
    }
    public void setCusemail(String cusemail) {
        this.cusemail = cusemail;
    }
    public long getCusphone() {
        return cusphone;
    }
    public void setCusphone(long cusphone) {
        this.cusphone = cusphone;
    }
    public String getIdnumber() {
        return  idnumber;
    }
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber; 
    }
    public int getPerson() {
            return person;
    }
    public void setPerson(int person) {
        this.person = person;
    }
    
    public String getPackage1() {
        return package1;
    }
    public void setPackage1(String package1) {
        this.package1 = package1;
    }
    public String getTransport() {
        return transport;
    }
    public void setTransport(String transport) {
        this.transport = transport;

    }


}


    

