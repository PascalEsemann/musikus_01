package de.pascal_esemann.musikus;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import static android.graphics.Color.parseColor;


public class motherActivity extends Activity {


    //Attributes
    private ViewGroup screen = (ViewGroup) findViewById(R.id.screen);


    //Methodes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother);
    }


    private void buildgui() {

        //Farben holen
        //Startwerte
        int bgcolor = Color.parseColor("#fff");
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
        }
        catch(Exception ex) { }
        }

    }
}