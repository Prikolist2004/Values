package com.example.strani_dengi_stolici;

public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviationID;

    private int CapitalID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _CapitalID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        CapitalID = _CapitalID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getCapitalID() {
        return CapitalID;
    }
}

