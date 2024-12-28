import java.net.SocketOption;
import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int delivery = 20;

    private int basePizzaPrice;

    private Boolean isExtraCheeseAdded=false;
    private Boolean isExtraToppingsAdded=false;
    private Boolean isDelivery=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 249;
        }
        else{
            this.price = 349;
        }

        basePizzaPrice=this.price;
    }

   public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }


    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price+=extraToppingsPrice;
    }


    public void parcel(){
        isDelivery=true;
        this.price+=delivery;

    }


    public void getBill(){
        String bill ="";
        System.out.println("Pizza : " +basePizzaPrice);

        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added :"+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings Added :"+extraToppingsPrice+ "\n";
        }
        if(isDelivery){
            bill+="Ready for Take Away :" +delivery+ "\n";
        }
        bill+="Bill : "+this.price + "\n";
        System.out.println(bill);

    }



}
