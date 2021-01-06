package ir.mohammadrezaarabi.dagger2.ConstructorInjection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Mobile;

import ir.mohammadrezaarabi.dagger2.R;

public class ConstructorInjectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*
        //Create Screen
        Lcd lcd = new Lcd();
        Touch touch = new Touch();
        mScreen screen = new mScreen(lcd, touch);

        //Create Board
        Camera camera = new Camera();
        Storage storage = new Storage();
        Board board = new Board(camera, storage);

        // بدون دگرر۲ ما نیاز داریم برای ساخت یک کلاس موبایل تمامی کلاس هایی که نیاز داریم رو هر بار بسازیم

        //Create Mobile
        Mobile mobile = new Mobile(screen, board);
        mobile.run();
        */


        //With Dagger2
        ConstructorMobileComponent component = DaggerConstructorMobileComponent.create();
        Mobile mobile = component.buildMobile();
        mobile.run();

    }
}