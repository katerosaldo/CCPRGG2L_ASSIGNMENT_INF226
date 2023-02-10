public class Exercise6 {
    
    public static void main(String[] args) throws Exception {

        GroceryItem item1 = new Diaper();
        item1.name = "Huggies";
        item1.price = 230;
        item1.showItemName();

        GroceryItem item2 = new IceCream();
        item2.name = "Magnum";
        item2.price = 90;
        item2.showItemName();

        //parameter
        Cashier c1 = new Cashier();
        c1.checkOut(item1);
        c1.showPrice(item1);
        c1.checkOut(item2);
        c1.showPrice(item2);

        //polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;
         
        double totalAmount = 0.00;
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            itemArray[i].showItemPrice();
            
            totalAmount = totalAmount + itemArray [i].price;
        }
        System.out.println("Item total is " + totalAmount);
        

        Rat myRat = new Rat();
        myRat.eat();

        Pig myPig = new Pig();
        myPig.fight();
        myPig.run();
}
}
