
import helper.ScannerCus;
import helper.Validator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaine
 */
public class Clock {
    String id = "", manufact = "";
    int price = 0, guarantee = 0;
    ScannerCus sc = new ScannerCus();

    public Clock() {
    }

    public Clock(String id) {
        this.id = id;
    }
    
    public Clock(String id, String manufact, int price, int guarantee) {
        this.id = id;
        this.manufact = manufact;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
    
    @Override
    public String toString() {
        return id + ", " + manufact + ", " + price + ", " + guarantee;
    }
    
    public void input() {
        setId(sc.getString(Validator.StringType.STRING, 0, 255, "Enter id: "));
        setManufact(sc.getString(Validator.StringType.STRING, 0, 255, "Enter manufact: "));
        setPrice(sc.getInt(0, Integer.MAX_VALUE, "Invalid value", "Enter price: "));
        setGuarantee(sc.getInt(0, Integer.MAX_VALUE, "Invalid value", "Enter guaramtee: "));
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Clock)obj).id);
    }
}
