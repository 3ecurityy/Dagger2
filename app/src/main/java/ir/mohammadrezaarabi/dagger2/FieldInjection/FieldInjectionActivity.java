package ir.mohammadrezaarabi.dagger2.FieldInjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Mobile;
import ir.mohammadrezaarabi.dagger2.R;

public class FieldInjectionActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        //With Dagger2
        FieldMobileComponent component = DaggerFieldMobileComponent.create();
        mobile = component.buildMobile();
        mobile.run();

    }
}