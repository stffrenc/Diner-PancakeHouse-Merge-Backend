package edu.iu.stffrenc.DinerPancakeHouseMerge.controllers;

import edu.iu.stffrenc.DinerPancakeHouseMerge.model.MenuItemRecord;
import edu.iu.stffrenc.DinerPancakeHouseMerge.repository.MergerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }

    @GetMapping
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> items = mergerRepository.getTheMenuItems();
        return items;
    }

    @GetMapping("/breakfast")
    public List<MenuItemRecord> getBreakfastItems() {
        return mergerRepository.getBreakfastItems();
    }

    @GetMapping("/lunch")
    public List<MenuItemRecord> getLunchItems() {
        return mergerRepository.getLunchItems();
    }

    @GetMapping("/diner")
    public List<MenuItemRecord> getDinnerItems(){
        return mergerRepository.getDinnerItems();
    }
}


