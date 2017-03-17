package com.example.dany.reactnativedemo;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OriginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= 23 ){
                    if(!Settings.canDrawOverlays(OriginActivity.this)){
                        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                        startActivity(intent);
                        return;
                    }
                }else{

                }
                Intent intent = new Intent(OriginActivity.this,MyReactActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_hybrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= 23 ){
                    if(!Settings.canDrawOverlays(OriginActivity.this)){
                        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                        startActivity(intent);
                        return;
                    }
                }else{

                }
                Intent intent = new Intent(OriginActivity.this,HybridActivity.class);
                startActivity(intent);
            }
        });


    }
}
