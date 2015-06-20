package de.pascal_esemann.musikus;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.graphics.Color.parseColor;


public class MainActivity extends Activity {

    public SQLiteDatabase getConnection(){
        return new DatabaseHelper(this).getWritableDatabase();
    }


    public DatabaseHelper getDatabase(){
        return new DatabaseHelper(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            DatabaseHelper database = new DatabaseHelper(this);
            SQLiteDatabase connection = database.getWritableDatabase();
            database.onCreate(connection);
        }catch(Exception ex){}
  }





    private void buildgui() {

        Datafactory datastore = new Datafactory();

        ViewGroup screen = (ViewGroup) findViewById(R.id.screen);
        //Farben holen
        //Startwerte
        int bgcolor = parseColor("#fff");
        int txtcolor = parseColor("#000");
        int txt2color = parseColor("#fff");
        int fgcolor = parseColor("#934ebf");
        int fg2color = parseColor("#bebcba");

        try {



            Farben[] colors = datastore.getFarben();
            for (int i = 0; i < colors.length; i++) {
                if (colors[i].getName() == "bgcolor") {
                    bgcolor = colors[i].getColor();
                } else if (colors[i].getName() == "txtcolor") {
                    txtcolor = colors[i].getColor();
                } else if (colors[i].getName() == "txt2color") {
                    txtcolor = colors[i].getColor();
                } else if (colors[i].getName() == "fgcolor") {
                    txtcolor = colors[i].getColor();
                } else if (colors[i].getName() == "fg2color") {
                    txtcolor = colors[i].getColor();
                }
            }
        } catch (Exception ex) {
        }



        //Gui bauen
        //Background
        screen.setBackgroundColor(bgcolor);
        LinearLayout hzl = new LinearLayout(this);
        screen.addView(hzl);
        //Topbar
        TextView txttoptitle = new TextView(this);
        txttoptitle.setHeight(screen.getHeight()/100*5);
        txttoptitle.setWidth(screen.getWidth());
        txttoptitle.setText(datastore.getTitle());
        txttoptitle.setTextColor(txt2color);
        txttoptitle.setTextSize(20);
        screen.addView(txttoptitle);


    }




}
