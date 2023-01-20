public class Exercise3 {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        Weapon sword = new Weapon();

        sword.name = "Excalibur";
        sword.damage = 30;
        sword.rarity = "Epic";
        System.out.println(sword.sayMyName());
        sword.sayMyDamage();
        sword.addDamage( 50);

        Character archer = new Character();

        archer.strength = 10;
        archer.agility = 15;
        archer.intelligence = 10;
        archer.name = "Dawn of Silence";
        archer.attack();
    }
}
