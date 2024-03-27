package edu.iu.stffrenc.DinerPancakeHouseMerge.model;

public record MenuItemRecord(String name,
                             String description,
                             boolean vegetarian,
                             double price) {
}