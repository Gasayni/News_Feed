package com.gas.news_feed;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.gith

public class MainActivity extends AppCompatActivity {
    NewsApiClient newsApiClient = new NewsApiClient("YOUR_API_KEY");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}