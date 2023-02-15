package Replit;

public class StoreProductT {
    public static void main(String[] args) {
        StoreProduct sp=new StoreProduct("Eggs",3,"Produce",true,10);
        sp.printInfo();
        StoreProduct sp1=new StoreProduct("Paper Towels",2,"misc",false,24);
        sp1.printInfo();
        StoreProduct sp2=new StoreProduct("Paper Towels",2,"null",false,0);
        sp2.printInfo();
    }}