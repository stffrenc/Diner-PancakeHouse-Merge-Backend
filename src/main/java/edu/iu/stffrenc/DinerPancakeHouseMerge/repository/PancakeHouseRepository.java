package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.Menu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository
public class PancakeHouseRepository {
    public List<MenuItem> getTheMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        return pancakeHouseMenu.getMenuItems();
    }
    public Iterator<MenuItem> getTheMenuIterator() {
        Menu pancakeHouseMenu = (Menu) new PancakeHouseMenu();
        return pancakeHouseMenu.createIterator();
    }
}
