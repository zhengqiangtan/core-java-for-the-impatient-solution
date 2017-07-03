package com.blaze.corejava.helpchapter04;

import java.util.Objects;

/**
 * Created by sherlockblaze on 04/07/2017.
 */
class Item{
    private String description;
    private double price;

    public boolean equals(Object otherObj){
        if(this == otherObj) return true;
        if(otherObj == null) return false;
        if(getClass() != otherObj.getClass()) return false;
        Item other = (Item)otherObj;
        return Objects.equals(description,other.description) && Objects.equals(price,other.price);
    }
}

class DiscountedItem extends Item{
    private double discount;

    public boolean equals(Object otherObj){
        if(! super.equals(otherObj))return false;
        DiscountedItem other = (DiscountedItem)otherObj;
        return discount == discount;
    }
}

public class HelpQuestion6 {

}
