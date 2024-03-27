package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.Menu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MergerRepository {

    public ArrayList<Menu> getTheMenus() {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new DinerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new CafeMenu());
        return menus;
    }


}
