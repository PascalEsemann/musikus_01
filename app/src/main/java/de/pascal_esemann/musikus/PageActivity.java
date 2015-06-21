package de.pascal_esemann.musikus;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.graphics.Color.parseColor;


public class PageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        Bundle b = getIntent().getExtras();
        String value = b.getString("page");

        buildgui(value);

    }

    private void buildgui(String value) {
        Datafactory datastore = new Datafactory(this);
        Pages Pageobject = new Pages();

        for(Pages p : datastore.getPages()){
            if(p.getTitle().equals(value)){
                Pageobject = p;
            }
        }

        ViewGroup screen = (ViewGroup) findViewById(R.id.screen);
        //Farben holen
        //Startwerte
        int bgcolor = parseColor("#ffffff");
        int txtcolor = parseColor("#000000");
        int txt2color = parseColor("#ffffff");
        int fgcolor = parseColor("#000000");
        int fg2color = parseColor("#bebcba");
        try{
            Farben[] colors = datastore.getFarben();
            for (int i = 0; i < colors.length; i++) {
                if (colors[i].getName() == "bgcolor") {
                    bgcolor = colors[i].getColor();
                } else if (colors[i].getName() == "txtcolor") {
                    txtcolor = colors[i].getColor();
                } else if (colors[i].getName() == "txt2color") {
                    txt2color = colors[i].getColor();
                } else if (colors[i].getName() == "fgcolor") {
                    fgcolor = colors[i].getColor();
                } else if (colors[i].getName() == "fg2color") {
                    fg2color = colors[i].getColor();
                }
            }
        } catch (Exception ex) {}

        //Gui bauen
        //Background
        screen.setBackgroundColor(fgcolor);

        TextView txttoptitle = (TextView) findViewById(R.id.txtTopTitle);
        txttoptitle.setText(datastore.getTitle());
        txttoptitle.setTextColor(txt2color);
        txttoptitle.setBackgroundColor(fgcolor);

        TextView txtactview = (TextView) findViewById(R.id.txtTopview);
        txtactview.setText(Pageobject.getTitle());
        txttoptitle.setTextColor(txt2color);
        txttoptitle.setBackgroundColor(fgcolor);

        try{
            ImageView img = (ImageView) findViewById(R.id.imgh);

            img.setImageResource(R.drawable.logo);
        }
        catch(Exception ex){}

        //specific
        TextView txth = (TextView) findViewById(R.id.txth);
        TextView txti = (TextView) findViewById(R.id.txti);
        txth.setBackgroundColor(bgcolor);
        txth.setText(Pageobject.getTitle());
        txth.setTextColor(txtcolor);
        txti.setTextColor(txtcolor);
        txti.setBackgroundColor(bgcolor);
        txti.setText(Html.fromHtml(Pageobject.getText()));


    }


}
