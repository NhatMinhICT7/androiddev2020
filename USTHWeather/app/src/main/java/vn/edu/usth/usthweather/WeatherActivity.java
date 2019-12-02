package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    public void onPause() {
        super.onPause();
        Log.i("cmt:","Weather activity is being paused");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart","Weather activity is being started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","Weather activity is being resumed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","Weather activity is being stopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroyed","Weather activity is being destroyed");
    }

    //initial creation of the fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("cmt:","onCreate method");

        ForecastFragment t= new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, t).commit();

    }
  }
