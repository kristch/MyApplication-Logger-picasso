package com.android.tedcoder.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 在加载完图片之后进行转换
        Picasso.with(this).load(R.drawable.test).transform(new CropCircleTransformation()).into((ImageView) findViewById(R.id.testimage));

    }
}