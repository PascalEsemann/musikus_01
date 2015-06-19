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
    private Data[] datas = new Data();
    private Farben[] farben = new Farben();
    private String logoname = new String();
    private String title = new String();
    private Pages[] pages = new Pages();
    private Museumsdatas[] museumsdata = new Museumsdatas();
    private Fragen[] fragen = new Fragen();


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

    private Data[] getDBData(){

        for(String sql : context.getResources().getStringArray(R.array.select)) {
            Cursor rawQuery (String sql, String[]selectionArgs);
        }
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

}
