package com.example.zhang.mycard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Zhang on 2017/6/21.
 */

public class CardAdapter extends BaseAdapter {
    int [] cardId = {};
    public CardAdapter( int [] cardId){
        this.cardId=cardId;
    }
    @Override
    public int getCount() {
        return cardId.length;
    }

    @Override
    public Object getItem(int i) {
        return cardId[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
//             view = View.inflate(viewGroup.getContext(), R.layout.item_card, null);
        }

        view.setBackgroundResource(cardId[i]);
        return view;
    }
}
