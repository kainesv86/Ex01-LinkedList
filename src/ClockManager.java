
import helper.MenuHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaine
 */
public class ClockManager {
    public static void main(String[] args) {
        MenuHelper menu = new MenuHelper(6);
        menu.add("Add new clock");
        menu.add("Remove a clock");
        menu.add("Update a clock");
        menu.add(("List all clocks"));
        menu.add("List all clocks in range");
        menu.add("Quit");
        ClockList list = new ClockList();
        int choice;
        
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addClock();
                    break;
                case 2:
                    list.removeClock();
                    break;
                case 3:
                    list.updateClock();
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.printPrice();
                    break;
            }
        } while (choice >= 0 && choice < 6);
        
    }
}
