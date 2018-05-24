package com.example.maxim.marvelheroeswithactiveandroidandpicasso;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HeroAdapter extends BaseAdapter {
    public List<Hero>heroList;
    public Context context;

    public HeroAdapter(Context context,List<Hero> heroList){
        super();
        this.context=context;
        this.heroList=heroList;
    }

    @Override
    public int getCount() {
        return heroList.size();
    }

    @Override
    public Hero getItem(int position) {
        return heroList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.herolayout,parent,false);
        Hero singleHero=getItem(position);
        TextView heroNameText=(TextView) convertView.findViewById(R.id.heroName);
        TextView heroRealNameText=(TextView) convertView.findViewById(R.id.heroRealName);
        ImageView heroImageView=(ImageView) convertView.findViewById(R.id.heroImage);
        heroNameText.setText(singleHero.getName());
        heroRealNameText.setText(singleHero.getRealname());
        Picasso.with(context).load(singleHero.getImageurl()).into(heroImageView);

        return convertView;
    }
}
