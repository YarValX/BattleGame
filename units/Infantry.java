package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

    public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x, int y) {
        super(id, healthLevel, name, type, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;


    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " " +
                "" + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase + "X = " + place.x + "Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}
