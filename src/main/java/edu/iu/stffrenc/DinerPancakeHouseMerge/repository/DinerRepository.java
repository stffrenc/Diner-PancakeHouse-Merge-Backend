package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.Menu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public class DinerRepository {

    public MenuItem[] getTheMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        return dinerMenu.getMenuItems();
    }

    public Iterator<MenuItem> getTheMenuIterator() {
        Menu dinerMenu = new DinerMenu();
        return dinerMenu.createIterator();
    }
}

