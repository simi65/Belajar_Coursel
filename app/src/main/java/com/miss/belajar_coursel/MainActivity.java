package com.miss.belajar_coursel;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImage = {R.drawable.misbaha, R.drawable.misbahb , R.drawable.misbahs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final Handler handler=new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
          startActivity(new Intent(MainActivity.this,Home.class));
          finish();
        }
    },2000L);


        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImage.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImage[position]);

        }
    };
}
