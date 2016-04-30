package com.example.mrlui.android_app4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mrlui on 30/04/2016.
 */
public class Settings extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.settings);

    }

    @Override
    public void onBackPressed()
    {
        EditText ipaddr = (EditText) findViewById(R.id.editText);
        String ip = ipaddr.getText().toString();

        Intent goBack = new Intent();

        goBack.putExtra("ip",ip);

        setResult(RESULT_OK, goBack);

        finish();
    }

    public void goBack(View view) {
        this.onBackPressed();
    }

}
