package de.pascal_esemann.musikus;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import static android.graphics.Color.parseColor;


public class MainActivity extends Activity{

    private String actView = "Menü";

   /* public SQLiteDatabase getConnection(SQLiteOpenHelper dbhelper){

        return dbhelper.getWritableDatabase();
    }


    public SQLiteOpenHelper getDatabase(){
        return new DatabaseHelper(this);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* try {
            SQLiteOpenHelper database = new DatabaseHelper(this);
            SQLiteDatabase connection = database.getWritableDatabase();
            database.onCreate(connection);
        }catch(Exception ex){}*/

        buildgui();


  }





    private void buildgui() {

            Datafactory datastore = new Datafactory(this);

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
            txtactview.setText(actView);
            txttoptitle.setTextColor(txt2color);
            txttoptitle.setBackgroundColor(fgcolor);

            try{
                ImageView img = (ImageView) findViewById(R.id.imgh);

                img.setImageResource(R.drawable.logo);
            }
            catch(Exception ex){}

            //Buttons
            ViewGroup lview = (ViewGroup) findViewById(R.id.linview);

            //weitere Buttons einfügen
            for(Pages p : datastore.getPages()){
                Button btn = new Button(this);
                btn.setText(p.getTitle());
                btn.setWidth(LinearLayout.LayoutParams.FILL_PARENT);
                btn.setHeight(LinearLayout.LayoutParams.WRAP_CONTENT);
                ViewGroup linview = (ViewGroup) findViewById(R.id.linview);
                final String pa = (String) btn.getText();
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(MainActivity.this,PageActivity.class);
                        Bundle b = new Bundle();
                        b.putString("page", pa); //Your id
                        in.putExtras(b);
                        startActivity(in);
                    }
                });
                linview.addView(btn);
            }

            for(int wnum=0; wnum<lview.getChildCount(); wnum ++){
                    try{
                        Button btn = (Button)lview.getChildAt(wnum);
                        btn.setTextColor(txt2color);
                        btn.setBackgroundColor(fg2color);
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                        params.setMargins(0, 2, 0, 0);
                        btn.setLayoutParams(params);
                    }catch(Exception ex){}
            }




    }




}
