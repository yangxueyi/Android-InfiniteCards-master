package com.example.zhang.mycard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bakerj.infinitecards.InfiniteCardView;

public class MainActivity extends AppCompatActivity {

    private InfiniteCardView mCardView;

    //图片数组
    private int [] cardId = {R.mipmap.pic1,R.mipmap.pic2,R.mipmap.pic3,R.mipmap.pic4,R.mipmap.pic5};
    private CardAdapter cardAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardView = (InfiniteCardView) findViewById(R.id.view);
        cardAdapter = new CardAdapter(cardId);
        mCardView.setAdapter(cardAdapter);

    }

}
