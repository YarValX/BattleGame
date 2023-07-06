public abstract class BasicHero implements Actions{
    int id;
    int healthLevel;
    String name;
    String type;
    int attackLevelBase;
    int initiative;

    public BasicHero(int id, int healthLevel, String name, String type, int initiative) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
    }
    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " " + "INITIATIVE = " + initiative);
    }
}
