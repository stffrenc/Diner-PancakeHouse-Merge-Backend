package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.Menu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.MenuItem;

import java.util.Iterator;

public class CafeRepository {
    public MenuItem[] getTheMenu() {
        CafeMenu cafeMenu = new CafeMenu();
        MenuItem[] menuItems = new MenuItem[3];
        for(int i = 0; i < menuItems.length; i++){
            menuItems[i] = cafeMenu.createIterator().next();
        }
        return menuItems;
    }

    public Iterator<MenuItem> getTheMenuIterator() {
        CafeMenu cafeMenu = new CafeMenu();
        return cafeMenu.createIterator();
    }

}
