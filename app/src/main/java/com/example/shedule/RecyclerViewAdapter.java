package com.example.shedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        private final LayoutInflater inflater;
        private final List<Model> time_list;
        public RecyclerViewAdapter(Context context, List<Model> time_list){
            this.time_list = time_list;
            this.inflater = LayoutInflater.from(context); }
        @NonNull
        @Override
        public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.item,parent,false);
            return new ViewHolder(view); }
        @Override
        public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
            Model model = time_list.get(position);
            holder.nameDay.setText(model.getName_day());
            holder.address_learn.setText(model.getAddress());
            holder.name_1_1.setText(model.getName1_1());
            holder.name_1_2.setText(model.getName1_2());
            holder.pr_1_1.setText(model.getPr1_1());
            holder.pr_1_2.setText(model.getPr1_2());

            holder.name_2_1.setText(model.getName2_1());
            holder.name_2_2.setText(model.getName2_2());
            holder.pr_2_1.setText(model.getPr2_1());
            holder.pr_2_2.setText(model.getPr2_2());

            holder.name_3_1.setText(model.getName3_1());
            holder.name_3_2.setText(model.getName3_2());
            holder.pr_3_1.setText(model.getPr3_1());
            holder.pr_3_2.setText(model.getPr3_2());

            holder.name_4_1.setText(model.getName4_1());
            holder.name_4_2.setText(model.getName4_2());
            holder.pr_4_1.setText(model.getPr4_1());
            holder.pr_4_2.setText(model.getPr4_2());

            holder.name_5_1.setText(model.getName5_1());
            holder.name_5_2.setText(model.getName5_2());
            holder.pr_5_1.setText(model.getPr5_1());
            holder.pr_5_2.setText(model.getPr5_2());


        }
        @Override
        public int getItemCount() { return time_list.size(); }
        public static  class ViewHolder extends RecyclerView.ViewHolder{
            final TextView nameDay;
            final TextView address_learn;
            final TextView name_1_1;
            final TextView name_1_2;
            final TextView pr_1_1;
            final TextView pr_1_2;

            final TextView name_2_1;
            final TextView name_2_2;
            final TextView pr_2_1;
            final TextView pr_2_2;

            final TextView name_3_1;
            final TextView name_3_2;
            final TextView pr_3_1;
            final TextView pr_3_2;

            final TextView name_4_1;
            final TextView name_4_2;
            final TextView pr_4_1;
            final TextView pr_4_2;

            final TextView name_5_1;
            final TextView name_5_2;
            final TextView pr_5_1;
            final TextView pr_5_2;


            ViewHolder(View view){
                super(view);
                nameDay = view.findViewById(R.id.day);
                address_learn = view.findViewById(R.id.address);
                name_1_1 = view.findViewById(R.id.lesson1_1);
                name_1_2 = view.findViewById(R.id.lesson1_2);
                pr_1_1 = view.findViewById(R.id.prepod_1_1);
                pr_1_2 = view.findViewById(R.id.prepod_1_2);

                name_2_1 = view.findViewById(R.id.lesson2_1);
                name_2_2 = view.findViewById(R.id.lesson2_2);
                pr_2_1 = view.findViewById(R.id.prepod_2_1);
                pr_2_2 = view.findViewById(R.id.prepod_2_2);

                name_3_1 = view.findViewById(R.id.lesson3_1);
                name_3_2 = view.findViewById(R.id.lesson3_2);
                pr_3_1 = view.findViewById(R.id.prepod_3_1);
                pr_3_2 = view.findViewById(R.id.prepod_3_2);

                name_4_1 = view.findViewById(R.id.lesson4_1);
                name_4_2 = view.findViewById(R.id.lesson4_2);
                pr_4_1 = view.findViewById(R.id.prepod_4_1);
                pr_4_2 = view.findViewById(R.id.prepod_4_2);

                name_5_1 = view.findViewById(R.id.lesson5_1);
                name_5_2 = view.findViewById(R.id.lesson5_2);
                pr_5_1 = view.findViewById(R.id.prepod_5_1);
                pr_5_2 = view.findViewById(R.id.prepod_5_2);
                //
            }}
    }


