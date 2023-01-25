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
    Address currentAddress;
    Address permAddress;
    ContactInfo officeContact;
    ContactInfo personalContact;
    
    public Student()
    {
        this.fName ="";
        this.lName = "";
        this.NUID = 0;
        this.CollegeName ="";
        this.currentAddress = new Address();
        this.permAddress=new Address();
        this.officeContact = new ContactInfo();
        this.personalContact=new ContactInfo();            
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

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }

    public ContactInfo getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(ContactInfo officeContact) {
        this.officeContact = officeContact;
    }

    public ContactInfo getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(ContactInfo personalContact) {
        this.personalContact = personalContact;
    }


}
