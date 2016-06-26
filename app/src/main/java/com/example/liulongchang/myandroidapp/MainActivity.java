package com.example.liulongchang.myandroidapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import android.widget.AdapterView.OnItemClickListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridView = (GridView) findViewById(R.id.gridView);
        ArrayList<HashMap<String, Object>> listImageItem = new ArrayList<HashMap<String, Object>>();
        for (int i = 1; i < 10; i++) {

            HashMap<String, Object> map = new HashMap<String, Object>();
            if (i == 1) {
                map.put("ItemImage", R.drawable.g11);
                map.put("ItemText", getResources().getString(R.string.gridView1));
            }
            if (i == 2) {
                map.put("ItemImage", R.drawable.g12);
                map.put("ItemText", getResources().getString(R.string.gridView2));
            }
            if (i == 3) {
                map.put("ItemImage", R.drawable.g13);
                map.put("ItemText", getResources().getString(R.string.gridView3));
            }
            if (i == 4) {
                map.put("ItemImage", R.drawable.g14);
                map.put("ItemText", getResources().getString(R.string.gridView4));
            }
            if (i == 5) {
                map.put("ItemImage", R.drawable.g15);
                map.put("ItemText", getResources().getString(R.string.gridView5));
            }
            if (i == 6) {
                map.put("ItemImage", R.drawable.g16);
                map.put("ItemText", getResources().getString(R.string.gridView6));
            }
            if (i == 7) {
                map.put("ItemImage", R.drawable.g17);
                map.put("ItemText", getResources().getString(R.string.gridView7));
            }
            if (i == 8) {
                map.put("ItemImage", R.drawable.g18);
                map.put("ItemText", getResources().getString(R.string.gridView8));
            }
            if (i == 9) {
                map.put("ItemImage", R.drawable.g19);
                map.put("ItemText", getResources().getString(R.string.gridView9));
            }
            listImageItem.add(map);

        }


        SimpleAdapter saImageItems = new SimpleAdapter(this, listImageItem, R.layout.grid_item,
                new String[]{"ItemImage", "ItemText"}, new int[]{R.id.ItemImage, R.id.ItemText});
        gridView.setAdapter(saImageItems);
        gridView.setOnItemClickListener(new ItemClickListener());

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.liulongchang.myandroidapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.liulongchang.myandroidapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


    class ItemClickListener implements OnItemClickListener {

        @SuppressWarnings("unChecked")

        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {


            HashMap<String, Object> item = (HashMap<String, Object>)
                    arg0.getItemAtPosition(arg2);


            if (item.get("ItemText").equals(getResources().getString(R.string.gridView1))) {
                Toast.makeText(MainActivity.this, R.string.gridView1, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView2))) {
                Toast.makeText(MainActivity.this, R.string.gridView2, Toast.LENGTH_LONG).show();
            }


            if (item.get("ItemText").equals(getResources().getString(R.string.gridView3))) {
                Toast.makeText(MainActivity.this, R.string.gridView3, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView4))) {
                Toast.makeText(MainActivity.this, R.string.gridView4, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView5))) {
                Toast.makeText(MainActivity.this, R.string.gridView5, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView6))) {
                Toast.makeText(MainActivity.this, R.string.gridView6, Toast.LENGTH_LONG).show();
            }

            if (item.get("ItemText").equals(getResources().getString(R.string.gridView7))) {
                Toast.makeText(MainActivity.this, R.string.gridView7, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView8))) {
                Toast.makeText(MainActivity.this, R.string.gridView8, Toast.LENGTH_LONG).show();
            }
            if (item.get("ItemText").equals(getResources().getString(R.string.gridView9))) {
                Toast.makeText(MainActivity.this, R.string.gridView9, Toast.LENGTH_LONG).show();
            }

        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
