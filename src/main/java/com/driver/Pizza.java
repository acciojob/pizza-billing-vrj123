package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeawayAdded;
//    private int takeawayPrice;
    private int cheesePrice;
    private int toppingsPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){this.price=300;}
        else{this.price=400;}
        isCheeseAdded=false;
        isToppingsAdded=false;
        isTakeawayAdded=false;
        cheesePrice=0;
        toppingsPrice=0;
//        takeawayPrice=0;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isCheeseAdded=true;
        cheesePrice+=80;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        isToppingsAdded=true;
        if(isVeg){
            toppingsPrice+=70;
            price+=70;
        }
        else {
            toppingsPrice += 120;
            toppingsPrice+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        isTakeawayAdded=true;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        int basePrice=0;
        if(isVeg){
            basePrice=300;
        }
        else{
            basePrice=400;
        }
        bill="Base Price Of The Pizza: "+basePrice+"\n";
        if(isCheeseAdded){
            bill+="Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isToppingsAdded){
            bill+="Extra Toppings Added: "+toppingsPrice+"\n";
        }
        if(isTakeawayAdded){
            bill+="Paperbag Added: "+20+"\n";
        }
        bill+="Total Price: "+price;
        return this.bill;
    }
}
