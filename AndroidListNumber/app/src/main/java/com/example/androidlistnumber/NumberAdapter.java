package com.example.androidlistnumber;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {
    int[] numbers;

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.number_item, parent, false);

        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.number.setText(""+numbers[position]);
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{
        TextView number;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.text_number);
        }
    }
}
