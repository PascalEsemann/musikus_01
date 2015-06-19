package de.pascal_esemann.musikus;


import android.graphics.Color;

public class Farben {

    //Attributs
    private int color;
    private String title;

    //Methods
    public Farben(Data pdata) {
        setColor(Color.parseColor((String) pdata.getValues()[0]));
        setTitle((String) pdata.getName());
    }

    public Farben(String pname, String pcolor) {
        setColor(Color.parseColor(pcolor));
        setTitle(pname);
    }

    //get/set

    public String getName(){
        return title;
    }

    private void setTitle(String ptitle){
        title = ptitle;
    }

    public int getColor() {
        return color;
    }

    private void setColor(int pcolor) {
        color = pcolor;
    }

}
