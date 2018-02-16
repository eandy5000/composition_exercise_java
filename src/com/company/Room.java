package com.company;

/**
 * Created by eandreweccleston on 2/15/18.
 */
public class Room {
    Bed bed;
    Rug rug;

    public Room (Bed bed, Rug rug) {
        this.bed = bed;
        this.rug = rug;
    }

    public Bed getBed() {
        return bed;
    }

}
