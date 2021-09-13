
import helper.ScannerCus;
import helper.Validator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaine
 */
public class ClockList extends LinkedList<Clock> {
    ScannerCus sc = new ScannerCus();
    
    public void addClock() {
        Clock clk = new Clock();
        clk.input();
        
        if (this.add(clk) == true) {
            System.out.println("Added Successfully.");
        } else {
            System.out.println("Added failed");
        }
    }
    
    private int search(String id) {
        return this.indexOf(new Clock(id));
    }
    
    public void removeClock() {
        String id;
        
        id = sc.getString(Validator.StringType.STRING, 0, 255, "Input clock id which will be removed: ");
        
        int pos = search(id);
        
        if (pos < 0) System.out.println("Not found!");
        else {
            this.remove(pos);
            System.out.println("Clock " + id + " was deleted.");
        }
    }
    
    public void updateClock() {
       String id = sc.getString(Validator.StringType.STRING, 0, 255, "Input clock id which will be updated: ");
       int pos = search(id);
       
       if (pos < 0) System.out.println("Not found!");
        else {
           this.get(pos).input();
           System.out.println("Clock " + id + " was updated");
        }
    }
 
    public void print() {
        for (Clock clk: this) System.out.println(clk);
    }
    
    public void printPrice() {
        System.out.println("Input price range.");
        int price1 = sc.getInt(0, Integer.MAX_VALUE, "Invalid value", "Price 1:");
        int price2 = sc.getInt(0, Integer.MAX_VALUE, "Invalid value", "Price 2:");
        
        if (price1 > price2) {
            int temp = price1;
            price1 = price2;
            price2 = temp;
        }
        
        for (Clock clk : this) {
            int price = clk.getPrice();
            if (price >= price1 && price <= price2) {
                System.out.println(clk);
            }
        }
    }
}
