package units;

import java.util.ArrayList;

public class Peasant extends BasicHero{

    public Peasant(String name, int x, int y) {
        super(6, 100, name, "units.Peasant", 1, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }

    @Override
    public String getInfo() {
        return ("NAME: " + name + " TYPE: " + type + " ID = " + id + " HEALTH = " + healthLevel
                + " INITIATIVE = " + initiative + " X = " + place.x + " Y = " + place.y);
    }
}