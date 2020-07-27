package edu.utep.cs5381.platformer;

import android.graphics.Color;

import java.util.ArrayList;

public class LevelDesert extends LevelData{

    //A level with one fixed parallax background

    LevelDesert() {
        tiles = new ArrayList<String>();
        this.tiles.add("p................................................................................................2222222222222..........");
        this.tiles.add("........................................................................................................................");
        this.tiles.add("................................2...2....2.....................................................2........................");
        this.tiles.add(".........................2..............................................................................................");
        this.tiles.add(".............................................2..........................................2....2......................t...");
        this.tiles.add("............................22....................................................2......................................");
        this.tiles.add(".................................................2......................................................................");
        this.tiles.add(".......2...................2....................................................2.......................................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add("..2.......................2..........................2.......................2..........................................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add(".......2.....2...2..2...2...............................2.................2.............................................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add(".....2.2....................................................2..2..222222................................................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add(".2....x....2x.2....x.........x..........x.................x..............x..........x.........x........x................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add("...2....2............ecu................................................................................................");
        this.tiles.add("........................................................................................................................");
        this.tiles.add("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");

        // Declare the values for the teleports in order of appearance
        locations = new ArrayList<Location>();
        this.locations.add(new Location("LevelCave", 1f, 16f));

        backgroundDataList = new ArrayList<BackgroundData>();
        this.backgroundDataList.add(new BackgroundData("mountain", true, -2, -5, 6, 4, 11 ));
        this.backgroundDataList.add(new BackgroundData("mountainside", true, -1, 6, 20, 8, 14 ));
        this.backgroundDataList.add(new BackgroundData("grass", true, 1,19, 23, 16, 4 ));
    }
}

