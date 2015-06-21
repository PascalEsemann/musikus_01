package de.pascal_esemann.musikus;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pascal_2 on 19.06.2015.
 */
public class Datafactory {
    //Attributs

    private Data[] datas;
    private Farben[] farben;
    private String logoname;
    private String title;
    private Pages[] pages;
    private Museumsdatas[] museumsdata;
    private Fragen[] fragen;
    private MainActivity mact;


    //Methods
    public Datafactory(MainActivity pmact){
        mact = pmact;
        getDBData();
    }


    //get/set - Accestories
    public String getTitle(){
        return title;
    }

    private void setTitle(String ptitle){
        title = ptitle;
    }

    public Pages[] getPages(){
        return pages;
    }

    private void setPages(Pages[] ppages){
        pages = ppages;
    }

    private void addPage(Pages ppage){
        pages[pages.length] = ppage;
    }

    public Museumsdatas[] getMuseumsdata(){
        return museumsdata;
    }

    private void setMuseumsdata(Museumsdatas[] pmuseumsdata){
        museumsdata = pmuseumsdata;
    }

    public String getLogoname(){
        return logoname;
    }

    private void setLogoname(String plogoname){
        logoname = plogoname;
    }

    public Farben[] getFarben(){
        return farben;
    }

    private void setFarben(Farben[] pfarben){
        farben = pfarben;
    }

    public Fragen[] getFragen(){
        return fragen;
    }

    private void setFragen(Fragen[] pfragen){
        fragen = pfragen;
    }

    private void getDBData(){

        //Farben

        Farben[] farben = new Farben[5];

        farben[0] = new Farben("bgcolor",mact.getResources().getString(R.string.bgcolor));
        farben[1] = new Farben("txtcolor",mact.getResources().getString(R.string.txtcolor));
        farben[2] = new Farben("txt2color",mact.getResources().getString(R.string.txt2color));
        farben[3] = new Farben("fgcolor",mact.getResources().getString(R.string.fgcolor));
        farben[4] = new Farben("fg2color",mact.getResources().getString(R.string.fg2color));

        setFarben(farben);


        //Pages

        //Zählen
        int count = 0;
        int a = 0;
        for(String p : mact.getResources().getStringArray(R.array.pages)) {

            if (a % 2 == 0) {
                count += 1;
            }
            a += 1;
        }
        //Daten holen
        Pages[] page = new Pages[count];
        int c=0;
        int d=0;
        for(String p : mact.getResources().getStringArray(R.array.pages)){
            if(c % 2 == 0){
                page[d] = new Pages("a","b");
                page[d].setTitle(p);
                c += 1;
            }
            else if(c%2 != 0){
                page[d].setText(p);
                c+=1;
                d+=1;
            }
        }
        setPages(page);

        //Museumsdatas
        //Zählen
        int mcount = 0;
        int ma = 0;
        for(String p : mact.getResources().getStringArray(R.array.museumsdatas)) {

            if (ma % 7 == 0) {
                mcount += 1;
            }
            ma += 1;
        }

        //Daten holen
        Museumsdatas[] mdatas = new Museumsdatas[mcount];
        int mc=0;
        int md=0;

        for(String p : mact.getResources().getStringArray(R.array.museumsdatas)){
            if(mc == 0){
                mdatas[md] = new Museumsdatas();
                mdatas[md].setSignatur(p);
                mc += 1;
            }
            else if(mc == 1){
                mdatas[md].setSachbegriff(p);
                mc +=1;
            }
            else if(mc == 2){
                mdatas[md].setTitel(p);
                mc += 1;
            }
            else if(mc == 3){
                mdatas[md].setGeoBezug(p);
                mc += 1;
            }
            else if(mc == 4){
                if(new Boolean(p) == false) {
                    mdatas[md].setBild(false);
                }
                else if(new Boolean(p) == true){
                    mdatas[md].setBild(true);
                }
                mc += 1;
            }
            else if(mc == 5){
                if(new Boolean(p) == false) {
                    mdatas[md].setVideo(false);
                }
                else if(new Boolean(p) == true){mdatas[md].setVideo(true);}
                mc += 1;
            }
            else if(mc == 6){
                if(new Boolean(p) == false) {
                    mdatas[md].setAudio(false);
                }
                else if(new Boolean(p) == true){mdatas[md].setAudio(true);}
                mc += 1;
            }
            else if(mc == 7){
                mdatas[md].setWikipedia(p);
                mc = 0;
                md+=1;
            }
        }
        setMuseumsdata(mdatas);


        //fragen
        //Zählen
        int fcount = 0;
        int fa = 0;
        for(String p : mact.getResources().getStringArray(R.array.fragen)) {

            if (fa % 7 == 0) {
                fcount += 1;
            }
            fa += 1;
        }

        //Daten holen
        Fragen[] fdatas = new Fragen[fcount];
        int fc=0;
        int fd=0;

        for(String p : mact.getResources().getStringArray(R.array.fragen)){
            if(fc == 0){
                fdatas[fd] = new Fragen();
                fdatas[fd].setQuestion(p);
                fc += 1;
            }
            else if(fc == 1){
                fdatas[fd].setCaw(p);
                fc +=1;
            }
            else if(fc == 2){
                fdatas[fd].setIncaw1(p);
                fc += 1;
            }
            else if(fc == 3){
                fdatas[fd].setIncaw2(p);
                fc += 1;
            }
            else if(fc == 4){
                fdatas[fd].setIncaw3(p);
                fc += 1;

            }
            else if(fc == 5){
                if(new Boolean(p) == false) {
                    fdatas[fd].setBild(false);
                }
                else if(new Boolean(p) == true){
                    fdatas[fd].setBild(true);
                }
                fc += 1;
            }
            else if(fc == 6){
                if(new Boolean(p) == false) {
                    fdatas[fd].setVideo(false);
                }
                else if(new Boolean(p) == true){fdatas[fd].setVideo(true);}
                fc += 1;
            }
            else if(fc == 7){
                if(new Boolean(p) == false) {
                    fdatas[fd].setAudio(false);
                }
                else if(new Boolean(p) == true){fdatas[fd].setAudio(true);}
                fc = 0;
                fd+=1;
            }
        }
        setFragen(fdatas);


        //rest
        setTitle(mact.getResources().getString(R.string.title));
        setLogoname(mact.getResources().getString(R.string.logoname));






        /*Data[] data = new DatabaseHelper(mact).onSelect();

        //Zählen für Array-länge
        int count_farben = 0;
        int count_pages = 0;
        int count_mdata = 0;
        int count_fragen = 0;
        for (Data d : data){
            if ((String) d.getType()=="Farben"){
                count_farben += 1;
            }
            else if ((String) d.getType()=="Pages"){
                count_pages += 1;
            }
            else if ((String) d.getType()=="Museumsdatas"){
                count_mdata += 1;
            }
            else if ((String) d.getType()=="Fragen"){
                count_fragen += 1;
            }
        }

        farben = new Farben[count_farben];
        fragen = new Fragen[count_fragen];
        museumsdata = new Museumsdatas[count_mdata];
        pages = new Pages[count_pages];



        int c_farben = 0;
        int c_pages = 0;
        int c_mdata = 0;
        int c_fragen = 0;

        for (Data d : data){
            if ((String) d.getType()=="Farben"){
                farben[c_farben] = new Farben(d);
                c_farben += 1;
            }
            else if ((String) d.getType()=="Pages"){
                pages[c_pages] = new Pages(d);
                c_pages += 1;
            }
            else if ((String) d.getType()=="Museumsdatas"){
                museumsdata[c_mdata] = new Museumsdatas(d);
                c_mdata += 1;
            }
            else if ((String) d.getType()=="Fragen"){
                fragen[c_fragen] = new Fragen(d);
                c_fragen += 1;
            }
            else if ((String) d.getType()=="rest"){
                setTitle(d.getValues()[0]);
                setLogoname(d.getValues()[1]);
            }
        }*/
    }



}
