public class Main {
    public static void main(String[] args){
        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.parcel();
        p.getBill();

    }
}