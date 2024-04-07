package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MergerRepository {
    public  List<MenuItemRecord> getTheMenuItems() {
        MenuComponent allMenus = new Menu("all", "The menus");
        allMenus.add(new PancakeHouseMenu("pancake house", "breakfast"));
        allMenus.add(new CafeMenu("lunch", "lunch"));
        allMenus.add(new DinerMenu("diner", "diner"));

        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }
}