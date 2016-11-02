package com.example.jco.android_image_slider_tutorial;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class android_image_slider_activity extends AppCompatActivity {


    ///http://codeoncloud.blogspot.ca/2013/07/android-mysql-php-json-tutorial.html

    TextView descriptionTextView;
    String[] textArray;
    int positionOfImage;
    private String url = "127.01.01/architectureDaily/fetch_json_from_DB";

    float x1, x2, y1, y2;
    Button viewDbButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_android_image_slider_activity);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mViewPager.setAdapter(adapterView);
        viewDbButton = (Button)findViewById(R.id.dbButton);





        viewDbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android_image_slider_activity.this, listOfObjects.class);
                startActivity(intent);
            }
        });







    }





}

