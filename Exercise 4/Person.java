public class Person{
    int age;
    String name;

    Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;
    }

    void addFriend(Person friend){
        System.out.println(this.name + " is friends with " + friend.name);
    }

    void addClassMate(Person classmate){
        System.out.println(classmate.name + " is classmate with " + this.name);
    }
    
}