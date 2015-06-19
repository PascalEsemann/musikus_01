package de.pascal_esemann.musikus;


public class Museumsdatas {
    private String signatur = new String();
    private String sachbegriff = new String();
    private String titel = new String();
    private String geoBezug = new String();
    private Boolean bild = new Boolean();
    private Boolean video = new Boolean();
    private Boolean audio = new Boolean();
    private String wikipedia = new String();

    //Methodes
    puplic Museumsdatas (Data pdata) {
        ();
    }

    //get/set
    public String getSignatur() {
        return sigantur;
    }

    private void setSignatur(String psignatur) {
        signatur = psignatur;
    }

    public String getSachbegriff() {
        return sachbegriff;
    }

    private void setSachbegriff(String psachbegriff) {
        sachbegriff = psachbegriff;
    }

    public String getTitel() {
        return titel;
    }

    private void setTitel(String ptitel) {
        titel = ptitel;
    }

    public String getGeoBezug() {
        return pgeobezug;
    }

    private void setGeoBezug(String pgeobezug) {
        geobezug = pgeobezug;
    }

    public Boolean getBild () { return pbild;}

    private void setBild (Boolean pbild) { bild = pbild; }

    public Boolean getVideo () { return pvideo;}

    private void setVideo (Boolean pvideo) { video = pvideo; }

    public Boolean getAudio () { return paudio;}

    private void setAudio (Boolean paudio) { audio = paudio; }

    public String getWikipedia() {
        return wikipedia;
    }

    private void setWikipedia(String pwikipedia) {
        wikipedia = pwikipedia;
    }
}9
