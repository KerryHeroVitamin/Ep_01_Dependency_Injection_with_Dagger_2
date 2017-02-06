package co.herovitamin.depedencyinjectionwithcaptainamerica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import co.herovitamin.depedencyinjectionwithcaptainamerica.models.CapAmerica;

public class MainActivity extends AppCompatActivity {

    @Inject
    CapAmerica mHero;

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.test_text);

        ((MainApp) getApplicationContext()).getWeaponComponent().inject(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        mTextView.setText(mHero.getWeaponName());
    }
}