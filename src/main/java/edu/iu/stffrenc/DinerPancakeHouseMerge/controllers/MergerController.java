package edu.iu.stffrenc.DinerPancakeHouseMerge.controllers;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.Menu;
import edu.iu.stffrenc.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.stffrenc.DinerPancakeHouseMerge.repository.MergerRepository;
import edu.iu.stffrenc.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    MergerRepository mergerRepository;
    public MergerController(MergerRepository mergerRepository) {this.mergerRepository = mergerRepository;}

    @GetMapping
    public List<MenuItem> get() {
        List<MenuItem> menuItems = new ArrayList<>();
        Iterator<Menu> menuIterator = mergerRepository.getTheMenus().iterator();
        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            Iterator<MenuItem> iterator = menu.createIterator();
            while(iterator.hasNext()){
                MenuItem menuItem = iterator.next();
                menuItems.add(menuItem);
            }
        }
        return menuItems;
    }
}
