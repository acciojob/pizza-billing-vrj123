package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeawayAdded;
    private boolean isBillGenerated;
//    private int takeawayPrice;
//    private int cheesePrice;
//    private int toppingsPrice;

    public void setCheeseAdded(boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public void setToppingsAdded(boolean toppingsAdded) {
        isToppingsAdded = toppingsAdded;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=300;
        else this.price=400;
        isCheeseAdded=false;
        isToppingsAdded=false;
        isTakeawayAdded=false;
        this.bill="";
        isBillGenerated=false;
//        cheesePrice=0;
//        toppingsPrice=0;
//        takeawayPrice=0;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isCheeseAdded=true;
//        cheesePrice+=80;
//        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        isToppingsAdded=true;
//        if(isVeg){
//            toppingsPrice+=70;
//            price+=70;
//        }
//        else {
//            toppingsPrice += 120;
//            toppingsPrice+=120;
//        }
    }

    public void addTakeaway(){
        // your code goes here
        isTakeawayAdded=true;
//        takeawayPrice+=20;
//        price+=20;
    }

    public String getBill(){
        // your code goes here
//        int basePrice=0;
//        if(isVeg){
//            basePrice=300;
//        }
//        else{
//            basePrice=400;
//        }
        if(!isBillGenerated){
            bill="Base Price Of The Pizza: "+price+"\n";
            if(isCheeseAdded){
                price+=80;
                bill+="Extra Cheese Added: "+80+"\n";
            }
            if(isToppingsAdded){
                if(isVeg){
                    price+=70;
                    bill+="Extra Toppings Added: "+70+"\n";
                }
                else {
                    price += 120;
                    bill+="Extra Toppings Added: "+120+"\n";
                }
            }
            if(isTakeawayAdded){
                price+=20;
                bill+="Paperbag Added: "+20+"\n";
            }
            bill+="Total Price: "+price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
