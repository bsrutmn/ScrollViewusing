package com.busra.lenovo.scrollviewusing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mWeatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeatherTextView=(TextView)findViewById(R.id.tv_weather_display);
        String[] WeatherData={
                "Today , August 28 - Partly cloudy -29°C/20°C",
                "Tomorrow-Partly cloudy -28°C/20°C",
                "Wednesday-Rainy- 23°C/19°C",
                "Thursday-Partly cloudy -24°C/18°C",
                "Friday-Sunny-26°C/18°C",
                "Saturday-Sunny-27°C/19°C",
                "Sunday - Sunny - 29°C / 20°C",
                "Monday - Sunny - 28°C / 20°C",
                "Tue, Sep 5 - Partly cloudy - 26°C / 20°C",
                "Wed, Sep 6 - Cloudy - 25°C / 20°C",
                "Thu, Sep 7 - Partly Sunny - 25°C / 18°C",
                "Fri, Sep 8 - Mostly Sunny - 24°C / 17°C",
                "Sat, Sep 9 - Probability of rain- 16°C / 7°C",
                "Sun, Sep 10 - Sunny - 24°C / 20°C",
                "Mon, Sep 11 - Mostly Sunny - 24°C / 19°C",
        };
        for(String weatherDatas:WeatherData){mWeatherTextView.append(weatherDatas+"\n\n\n");
        }
    }

}
