/*package de.pascal_esemann.musikus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Pascal_2 on 19.06.2015.
 */
/*public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private MainActivity mact;

    public DatabaseHelper(Context context) {
        super(context,
                context.getResources().getString(R.string.dbname),
                null,
                Integer.parseInt(context.getResources().getString(R.string.version)));
        this.context=context;
    }*/


   /* public Data[] onSelect() {
       /* //Arraylänge bestimmen
        int zaehler = 0;
        for (String sqltable : context.getResources().getStringArray(R.array.select)) {
            try {
                Cursor result = mact.getConnection(mact.getDatabase()).rawQuery("SELECT * FROM " + sqltable, null);
                zaehler += result.getCount();
            }
            catch(Exception ex){}
        }
        Data[] data = new Data[zaehler];

        int count = 0;


        }

        return data;
    } */

   /* @Override
    public void onCreate(SQLiteDatabase db){
        for(String sql : context.getResources().getStringArray(R.array.create)) {
            db.execSQL(sql);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int a, int b){}
}*/


