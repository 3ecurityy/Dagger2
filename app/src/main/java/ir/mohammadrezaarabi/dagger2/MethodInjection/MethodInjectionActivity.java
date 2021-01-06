package ir.mohammadrezaarabi.dagger2.MethodInjection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;


import ir.mohammadrezaarabi.dagger2.MethodInjection.Mobile.Mobile;
import ir.mohammadrezaarabi.dagger2.R;

public class MethodInjectionActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //With Dagger2
        MethodMobileComponent component = DaggerMethodMobileComponent.create();
        component.injectField(this);
        mobile.run();

    }
}