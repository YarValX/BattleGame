public abstract class Wizard extends BasicHero {

    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, initiative);
        this.heal = heal;
    }

    public int heal;

    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " " + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase);
    }

    @Override
    public void step() {

    }
}
