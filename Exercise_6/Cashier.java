public class Cashier {
    

    public void checkOut(GroceryItem item){
        System.out.println("You have purchased " + item.name);

    }
    public void showPrice(GroceryItem item){
        System.out.println( "Item price is " + item.price);
    }
}
