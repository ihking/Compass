package com.example.han.compass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by han on 16. 8. 19..
 */
@EActivity
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
        @Override
    protected void onDestroy() {

        super.onDestroy();
    }

}
