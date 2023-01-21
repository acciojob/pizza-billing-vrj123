package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean takeawayAdded;
    private boolean billGenerated;
    private int cheese;
    private int toppings;
    private int bag;

    public void setCheeseAdded(boolean cheeseAdded) {
        this.cheeseAdded = cheeseAdded;
    }

    public void setToppingsAdded(boolean toppingsAdded) {
        this.toppingsAdded = toppingsAdded;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) this.price=300;
        else this.price=400;
        cheeseAdded=false;
        toppingsAdded=false;
        takeawayAdded=false;
        billGenerated=false;
        cheese=80;
        if (isVeg) toppings=70;
        else toppings=120;
        bag=20;
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            price+=cheese;
            cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded){
            price+=toppings;
            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeawayAdded){
            price+=bag;
            takeawayAdded=true;
        }
    }

    public String getBill(){
        if (!billGenerated){
            if(cheeseAdded){
                bill+="Extra Cheese Added: "+cheese+"\n";
            }
            if(toppingsAdded){
                bill+="Extra Toppings Added: "+toppings+"\n";
            }
            if(takeawayAdded){
                bill+="Paperbag Added: "+bag+"\n";
            }
            bill+="Total Price: "+price+"\n";
        }
        return this.bill;
    }
}
