package com.company;

/**
 * Created by eandreweccleston on 2/16/18.
 */
public class Rug {
    private String rugType;
    private int length;
    private int height;
    StainGuard rugGuard;

    public Rug (String rugType, int length, int height, StainGuard rugGuard) {
        this.rugType = rugType;
        this.length = length;
        this.height = height;
        this.rugGuard = rugGuard;
    }

    public int getArea () {
        return this.length * this.height;
    }

    public String getRugType() {
        return rugType;
    }
}
