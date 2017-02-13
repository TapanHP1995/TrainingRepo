package com.reversebits.projects.app.training.context_demo;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.reversebits.projects.app.training.MainActivity;
import com.reversebits.projects.app.training.R;

import java.util.ArrayList;


/**
 * Created by TapanHP on 2/12/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.VHMain> {

    private ArrayList<String> texts = new ArrayList<>();
    private Activity context;

    public MainAdapter(Activity context) {
        this.context = context;
        for (int i = 1; i < 21; i++) {
            texts.add("Text " + i);
        }
    }

    @Override
    public VHMain onCreateViewHolder(ViewGroup parent, int viewType) {
        /*LayoutInflater.from(Context context);
        * first point where we need context
        *
        * you can use : parent.getContext()
        *
        */
        return new VHMain(LayoutInflater.from(context).inflate(R.layout.row_main, parent, false));
    }

    @Override
    public void onBindViewHolder(final VHMain holder, int position) {
        holder.tvMain.setText(texts.get(position));
        holder.tvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* here to call startActivity method we ll need context*/
                context.startActivity(new Intent(context, MainActivity.class));

                //here make use of application class context as static implementation for global usage
                // use both test cases for static implementation as well as singleton pattern

                //App.getContext() or App.getInstance()
                Toast.makeText(context, "TextView " + (holder.getAdapterPosition() + 1) + " clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }


    class VHMain extends RecyclerView.ViewHolder {

        TextView tvMain;

        public VHMain(View itemView) {
            super(itemView);
            tvMain = (TextView) itemView.findViewById(R.id.tv_main_row);
        }
    }
}

