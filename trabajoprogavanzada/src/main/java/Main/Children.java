/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Heras
 */
public class Children extends Thread {
    
    private String id;
    
    public Children(int startid) {
        this.id = "N" + String.format("%04d", startid);
    }
}
