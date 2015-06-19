package de.pascal_esemann.musikus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Pascal_2 on 19.06.2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;

    DatabaseHelper(Context context){
        super(
                context,
                context.getResources().getString(R.string.dbname),
                null,
                Integer.parseInt(context.getResources().getString(R.string.version)));
        this.context=context;
    }

    @Override
    public Data[] onCreate(SQLiteDatabase db) {

        Data[] data = new Data();


        for (String sqltable : context.getResources().getStringArray(R.array.select)) {
            try {
                Cursor result=MainActivity.connection.rawQuery("SELECT * FROM " + sqltable , null);
                while(result.moveToNext ()){
                    data[data.length].setName(result.getString(1));
                    String[] value = new String[result.getColumnCount()-2];
                    for (int i = 2; i < result.getColumnCount(); i++) {
                        value[i-2] = result.getString(i);
                    }
                data[data.length].setValues(value);
                data[data.length].setType(sqltable);
                }
            }
            catch(Exception ex){}

        }
        return data;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}