package de.pascal_esemann.musikus;


public class Pages {
    //Attributs
    private String title = new String();
    private String text = new String();

    //Methods
    public Pages(Data pdata) {
        setTitle((String) pdata.getValues()[0]);
        setText((String) pdata.getValues()[1]);
    }
    public Pages(String pTitle, String pText) {
        setTitle((String) pTitle);
        setText((String) pText);
    }

    public  Pages(){

    }

    //get/set

    public String getTitle() {
        return title;
    }

    public void setTitle(String ptitle) {
        title = ptitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String ptext) {
        text = ptext;
    }


}
