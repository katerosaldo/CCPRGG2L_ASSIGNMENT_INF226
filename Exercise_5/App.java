public class Exercise5 {
    public static void main (String[] args) throws Exception{
        
        Person me = new Person();
        
        me.setName("Kate");

        System.out.println(me.getName());
        
        Daughter myself = new Daughter();
        System.out.println(myself.surname);

        myself.showSurname();

    } 
}
