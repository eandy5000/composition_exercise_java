package com.company;

/**
 * Created by eandreweccleston on 2/16/18.
 */
public class StainGuard {
    private String brand;
    private String protectionType;

    public StainGuard(String brand, String protectionType) {
        this.brand = brand;
        this.protectionType = protectionType;
    }

    public void checkWarrenty (){
        System.out.println(this.brand + " " + this.protectionType);
    }
}
