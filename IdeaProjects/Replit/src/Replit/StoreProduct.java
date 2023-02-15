package Replit;

class StoreProduct {

    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label,double price,String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

   public StoreProduct(String label,double price,int stock){
        this(label,price,"misc",false,stock);
    }

    public StoreProduct(String label,double price){
        this(label,price,"misc",false,0);

    }
    void printInfo() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}




