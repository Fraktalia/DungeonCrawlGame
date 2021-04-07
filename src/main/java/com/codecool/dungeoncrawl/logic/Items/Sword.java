package com.codecool.dungeoncrawl.logic.Items;

import com.codecool.dungeoncrawl.logic.Cell;
import com.codecool.dungeoncrawl.logic.actors.Player;

public class Sword extends Item{
    public Sword(Cell cell){
        super(cell, "Sword");
    }

    public void addDamage(Player player){
    }

    @Override
    public String getTileName() {
        return "sword";
    }
}

