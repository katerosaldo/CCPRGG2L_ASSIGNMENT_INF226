public class Car {
    String name, color;
    Person owner;

    Car(String carName, String color, Person ownerName){
        this.name = carName;
        this.color = color;
        this.owner = ownerName;
    }

    void showOwner(){
        System.out.println(owner.name + " recieve a " + this.name + " " + this.color);
    }
}
