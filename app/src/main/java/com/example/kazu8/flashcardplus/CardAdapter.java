package com.example.kazu8.flashcardplus;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class CardAdapter extends ArrayAdapter<card>{
    List<card> mCards;

    public CardAdapter(Context context, int  layoutResorseId, List<card> oblects){
        super(context, layoutResorseId, oblects);
        mCards = oblects;
    }

    @Override
    public int getCount(){
        return mCards.size();
    }

    @Override
    public card getItem(int position){
        return mCards.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        final ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card,null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final card item =getItem(position);

        if (item != null){
            viewHolder.iconImageView.setBackgroundResource(item.imageId);
            viewHolder.titleTextView.setText(item.title);
            viewHolder.contentTextView.setText(item.content);
            viewHolder.likebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    item.likenum++;
                    viewHolder.likeTextView.setText(item.likenum + "Likes");

                }

            });
            viewHolder.iconImageView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Toast.makeText(getContext(),item.meaning, Toast.LENGTH_SHORT).show();
                }
            });
        }

        return convertView;
    }

    private class ViewHolder{
        ImageView iconImageView;
        TextView titleTextView;
        TextView likeTextView;
        TextView contentTextView;
        ImageView likebutton;

        public ViewHolder(View view){
            iconImageView =(ImageView)view.findViewById(R.id.icon);
            titleTextView =(TextView)view.findViewById(R.id.title_textView);
            likeTextView = (TextView)view.findViewById(R.id.like_textView);
            contentTextView = (TextView)view.findViewById(R.id.content);
            likebutton = (ImageView)view.findViewById(R.id.like_button);

        }

    }
}
