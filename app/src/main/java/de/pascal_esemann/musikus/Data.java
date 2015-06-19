package de.pascal_esemann.musikus;


public class Data {

    //Attributs
    private String name;
    private String[] values;
    private String type;



    //get/set

    public String getName() {
        return name;
    }

    public void setName(String pname) {
        name = pname;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] pvalues) {

        values = pvalues;
    }

    public String getType() {
        return type;
    }

    public void setType(String ptype) {
        type = ptype;
    }

}