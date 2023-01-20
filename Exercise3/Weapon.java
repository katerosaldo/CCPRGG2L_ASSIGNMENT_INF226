public class Weapon {
    String name;
    String rarity;
    int damage;
    
    String sayMyName(){
        return this.name + " " + this.rarity;
    }
    
    public void addDamage (int additionalDamage){
       int newDamage = this.damage + additionalDamage;

        System.out.println("Damage has increase from "+ "" + this.damage + " to " + newDamage);
        this.damage = newDamage;
    }
    
    public void sayMyDamage() {
        System.out.println("Damage : " + damage );
    }
}
