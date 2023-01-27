public class App {
    public static void main(String[]args) throws Exception{
        System.out.println("hahahahaha");

           Person me = new Person("Kate", 19);
           Person friend = new Person("Kate", 20);
           me.addFriend(friend);

           Pet dog = new Pet ("Tobleron", 3, me);
           dog.showOwner();

           Person classmate = new Person("Kent", 19);
           Person classmate2 = new Person("Tina", 20);
           Person classmate3 = new Person("Gen", 18);
           me.addClassMate(classmate);
           me.addClassMate(classmate2);
           me.addClassMate(classmate3);

           Car sportsCar = new Car ("Ferrari Sports Car", "Red",  me);
           sportsCar.showOwner();


    }
}

