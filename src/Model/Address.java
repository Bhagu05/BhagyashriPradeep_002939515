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
public class Address {
    String currentStreetName;
    String currentCity;
    int currentAptNo;
    long currentZipCode;
    String permStreetName;
    String permCity;
    int permAptNo;
    long permZipCode;
    
    public Address(){
        this.currentAptNo=0;
        this.currentCity ="";
        this.currentStreetName="";
        this.currentZipCode=0;
        this.permAptNo=0;
        this.permCity="";
        this.permStreetName="";
        this.permZipCode=0;
        
    }

    public String getCurrentStreetName() {
        return currentStreetName;
    }

    public void setCurrentStreetName(String currentStreetName) {
        this.currentStreetName = currentStreetName;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public int getCurrentAptNo() {
        return currentAptNo;
    }

    public void setCurrentAptNo(int currentAptNo) {
        this.currentAptNo = currentAptNo;
    }

    public long getCurrentZipCode() {
        return currentZipCode;
    }

    public void setCurrentZipCode(long currentZipCode) {
        this.currentZipCode = currentZipCode;
    }

    public String getPermStreetName() {
        return permStreetName;
    }

    public void setPermStreetName(String permStreetName) {
        this.permStreetName = permStreetName;
    }

    public String getPermCity() {
        return permCity;
    }

    public void setPermCity(String permCity) {
        this.permCity = permCity;
    }

    public int getPermAptNo() {
        return permAptNo;
    }

    public void setPermAptNo(int permAptNo) {
        this.permAptNo = permAptNo;
    }

    public long getPermZipCode() {
        return permZipCode;
    }

    public void setPermZipCode(long permZipCode) {
        this.permZipCode = permZipCode;
    }
    
    
}
