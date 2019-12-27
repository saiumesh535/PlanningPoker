package com.su.planningpoker.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.su.planningpoker.R;
import com.su.planningpoker.activities.SingleCardActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainCardsAdapter extends RecyclerView.Adapter<MainCardsAdapter.MyHolder> {

    private Context context;
    private ArrayList<Integer> list;

    public MainCardsAdapter(Context context, ArrayList<Integer> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_cards_adapter, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.cardImage.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    class MyHolder extends  RecyclerView.ViewHolder{
        ImageView cardImage;
        MyHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.cardImage);
            cardImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SingleCardActivity.class);
                    intent.putExtra("IMAGE_ID", list.get(getAdapterPosition()));
                    Activity activity = (Activity) context;
                    activity.startActivity(intent);
                    activity.overridePendingTransition(R.anim.flipfadeout, R.anim.flipfadein);
                }
            });
        }
    }
}
