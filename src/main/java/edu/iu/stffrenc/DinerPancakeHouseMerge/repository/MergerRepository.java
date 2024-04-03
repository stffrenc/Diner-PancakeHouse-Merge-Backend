package edu.iu.stffrenc.DinerPancakeHouseMerge.repository;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class MergerRepository {
    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined") {
            @Override
            public Iterator<MenuComponent> createIterator() {
                return null;
            }
        };
        allMenus.add(new DinerMenu());
        allMenus.add(new PancakeHouseMenu());
        allMenus.add(new CafeMenu());
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }

    public List<MenuItemRecord> getBreakfastItems(){
        MenuComponent allMenus = new Menu("BREAKFAST MENU", "All Breakfast items") {
            @Override
            public Iterator<MenuComponent> createIterator() {
                return null;
            }
        };
        allMenus.add(new PancakeHouseMenu());
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }

    public List<MenuItemRecord> getDinnerItems(){
        MenuComponent allMenus = new Menu("DINNER MENU", "All Dinner items") {
            @Override
            public Iterator<MenuComponent> createIterator() {
                return null;
            }
        };
        allMenus.add(new DinerMenu());
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }

    public List<MenuItemRecord> getLunchItems(){
        MenuComponent allMenus = new Menu("LUNCH MENU", "All Lunch items") {
            @Override
            public Iterator<MenuComponent> createIterator() {
                return null;
            }
        };
        allMenus.add(new CafeMenu());
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }

}
