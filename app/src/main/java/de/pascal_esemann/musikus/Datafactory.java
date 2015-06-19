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
    private static final Datafactory datastore = new Datafactory();
    private Data[] datas;
    private Farben[] farben;
    private String logoname;
    private String title;
    private Pages[] pages;
    private Museumsdatas[] museumsdata;
    private Fragen[] fragen;


    //Methods
    public Datafactory(){
    getDBData();
    }
    //singleton
    public static Datafactory getInstance(){
        return datastore;
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
        Data[] data = MainActivity.database.onSelect();

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
        }
    }



}
