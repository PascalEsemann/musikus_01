package de.pascal_esemann.musikus;


public class Museumsdatas {
    private String signatur = new String();
    private String sachbegriff = new String();
    private String titel = new String();
    private String geoBezug;
    private Boolean bild;
    private Boolean video;
    private Boolean audio;
    private String wikipedia = new String();

    //Methodes
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
        return geoBezug;
    }

    private void setGeoBezug(String pgeobezug) {
        geoBezug = pgeobezug;
    }

    public Boolean getBild () { return bild;}

    private void setBild (Boolean pbild) { bild = pbild; }

    public Boolean getVideo () { return video;}

    private void setVideo (Boolean pvideo) { video = pvideo; }

    public Boolean getAudio () { return audio;}

    private void setAudio (Boolean paudio) { audio = paudio; }

    public String getWikipedia() {
        return wikipedia;
    }

    private void setWikipedia(String pwikipedia) {
        wikipedia = pwikipedia;
    }
}
