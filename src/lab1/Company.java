/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author sanandamirtharaj
 */
public class Company {
    private HRManager hr;
    
    public Company(){
        hr=new HRManager();
    }
    
    public void hireEmployee(String firstName,String lastName,String ssn){
        
    }

    public void setHr(HRManager hr) {
        this.hr = hr;
    }

    public HRManager getHr() {
        return hr;
    }
    
    
}

