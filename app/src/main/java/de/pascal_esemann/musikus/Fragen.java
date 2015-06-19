package de.pascal_esemann.musikus;


public class Fragen {
    //Atributs
    private String question = new String();
    private String caw = new String();
    private String incaw1 = new String();
    private String incaw2 = new String();
    private String incaw3 = new String();
    private Boolean bild;
    private Boolean video;
    private Boolean audio;

    //Methodes
    public Fragen (Data pdata)
    {
        setQuestion((String) pdata.getValues()[0]);
        setCaw((String) pdata.getValues()[1]);
        setIncaw1((String) pdata.getValues()[2]);
        setIncaw2((String) pdata.getValues()[3]);
        setIncaw3((String) pdata.getValues()[4]);
        if (pdata.getValues()[5] == "1") {setBild(true);}
        else{setBild(false);}
        if (pdata.getValues()[6] == "1") {setVideo(true);}
        else{setVideo(false);}
        if (pdata.getValues()[7] == "1") {setAudio(true);}
        else{setAudio(false);}



    }

    //get/set
    public String getQuestion() {
        return question;
    }

    private void setQuestion(String pquestion) {
        question = pquestion;
    }

    public String getCaw() {
        return caw;
    }

    private void setCaw(String pcaw) {
        caw = pcaw;
    }

    public String getIncaw1() {
        return incaw1;
    }

    private void setIncaw1(String pincaw1) {
        incaw1 = pincaw1;
    }

    public String getIncaw2() {
        return incaw2;
    }

    private void setIncaw2(String pincaw2) {
        incaw2 = pincaw2;
    }

    public String getIncaw3() {
        return incaw3;
    }

    private void setIncaw3(String pincaw3) {
        incaw3 = pincaw3;
    }

    public Boolean getBild () { return bild;}

    private void setBild (Boolean pbild) { bild = pbild; }

    public Boolean getVideo () { return video;}

    private void setVideo (Boolean pvideo) { video = pvideo; }

    public Boolean getAudio () { return audio;}

    private void setAudio (Boolean paudio) { audio = paudio; }
}
