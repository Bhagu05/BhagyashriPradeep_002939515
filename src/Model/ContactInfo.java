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
public class ContactInfo {
   String officeEmail;
   String personalEmail;
   long officePhone;
   long personalPhone;
   
   public ContactInfo()
   {
       this.officeEmail="";
       this.personalEmail="";
       this.officePhone = 0;
       this.personalPhone =0;
       
   }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public long getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(long officePhone) {
        this.officePhone = officePhone;
    }

    public long getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(long personalPhone) {
        this.personalPhone = personalPhone;
    }
   
}
