package com.poly.qlhhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FristActivity extends BaseActivity {
ImageView imgFirst;
    @Override
    public int setLayout() {
        return R.layout.activity_frist;
    }

    @Override
    public void initView() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);

        imgFirst=findViewById(R.id.imgFirst);
        imgFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(MainActivity.class);
            }
        });
    }
}
