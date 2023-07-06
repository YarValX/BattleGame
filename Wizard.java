public abstract class Wizard extends BasicHero{

    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.heal = heal;
        this.attackLevelBase = attackLevelBase;
    }
    public int attackLevelBase;


    @Override
    public String toString() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " " + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase);
    }
    public int heal;
}
