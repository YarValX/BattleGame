public abstract class Shooters extends BasicHero{
    public Shooters(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.attackLevelBase = attackLevelBase;
    }
    public int attackLevelBase;


    @Override
    public String toString() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " " + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase);
    }
}
