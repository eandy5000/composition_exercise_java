package com.company;

/**
 * Created by eandreweccleston on 2/15/18.
 */
public class Bed {
    private String model;
    private String size;
    StainGuard bedProtect;

    public Bed (String model, String size, StainGuard bedProtect) {
        this.model = model;
        this.size = size;
        this.bedProtect = bedProtect;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }
}
