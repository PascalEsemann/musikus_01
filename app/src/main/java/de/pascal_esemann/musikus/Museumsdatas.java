package de.pascal_esemann.musikus;


public class Museumsdatas {
    private String signatur = new String();
    private String sachbegriff = new String();
    private String titel = new String();
    private String geoBezug = new String();
    private Boolean bild = new Boolean(false);
    private Boolean video = new Boolean(false);
    private Boolean audio = new Boolean(false);
    private String wikipedia = new String();

    //Methodes
    public Museumsdatas(){
        setSignatur("");
        setSachbegriff("");
        setTitel("");
        setGeoBezug("");
        setWikipedia("");
        setBild(false);
        setVideo(false);
        setAudio(false);
        setWikipedia("");
    }

    public Museumsdatas(Data pdata)
    {
        setSignatur((String) pdata.getValues()[0]);
        setSachbegriff((String) pdata.getValues()[1]);
        setTitel((String) pdata.getValues()[2]);
        setGeoBezug((String) pdata.getValues()[3]);
        if (pdata.getValues()[4] == "1") {setBild(true);}
        else{setBild(false);}
        if (pdata.getValues()[5] == "1") {setVideo(true);}
        else{setVideo(false);}
        if (pdata.getValues()[6] == "1") {setAudio(true);}
        else{setAudio(false);}
        setWikipedia((String) pdata.getValues()[7]);
    }

    //get/set
    public String getSignatur() {
        return signatur;
    }

    public void setSignatur(String psignatur) {
        signatur = psignatur;
    }

    public String getSachbegriff() {
        return sachbegriff;
    }

    public void setSachbegriff(String psachbegriff) {
        sachbegriff = psachbegriff;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String ptitel) {
        titel = ptitel;
    }

    public String getGeoBezug() {
        return geoBezug;
    }

    public void setGeoBezug(String pgeobezug) {
        geoBezug = pgeobezug;
    }

    public Boolean getBild () { return bild;}

    public void setBild (Boolean pbild) { bild = pbild; }

    public Boolean getVideo () { return video;}

    public void setVideo (Boolean pvideo) { video = pvideo; }

    public Boolean getAudio () { return audio;}

    public void setAudio (Boolean paudio) { audio = paudio; }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String pwikipedia) {
        wikipedia = pwikipedia;
    }
}
