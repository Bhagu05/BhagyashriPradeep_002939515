/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bhagy
 */
public class Student {
    String fName;
    String lName;
    String CollegeName;
    long NUID;
    Address address;
    ContactInfo info;
    
    public Student()
    {
        this.fName ="";
        this.lName = "";
        this.NUID = 0;
        this.CollegeName ="";
        this.address = new Address();
        this.info = new ContactInfo();
        
        
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getInfo() {
        return info;
    }

    public void setInfo(ContactInfo info) {
        this.info = info;
    }
    
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.setNUID(2939);
        obj.setfName("Bhagyashri");
        obj.setlName("Chavan");
        obj.setCollegeName("Northeastern - COE");
        
        Address addr = obj.getAddress();
        addr.setCurrentAptNo(416);
        addr.setCurrentCity("Boston");
        addr.setCurrentStreetName("Alphonsus Street");
        addr.setCurrentZipCode(02120);
        addr.setPermAptNo(703);
        addr.setPermCity("Kalyan");
        addr.setPermStreetName("Mangeshi flora");
        addr.setPermZipCode(421301);
        
 
        ContactInfo cinfo = obj.getInfo();
        cinfo.setOfficeEmail("chavan.b@northeastern.edu");
        cinfo.setOfficePhone(0);
        cinfo.setPersonalEmail("bhagyashrichavan1997@gmail.com");
        cinfo.setPersonalPhone(0);
        
        System.out.println(obj.getfName() + " " + obj.getlName() + " " + obj.getCollegeName() + " " + obj.getNUID() + " " + obj.getAddress().currentStreetName + " " + obj.getInfo().officeEmail);
        
        
        
        
        
    }
}
