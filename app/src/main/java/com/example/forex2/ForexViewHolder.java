package com.example.forex2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ForexViewHolder extends RecyclerView.ViewHolder {
    TextView kodeTextView, kursTextView, namaTextView;
    public ForexViewHolder(@NonNull View itemView) {
        super(itemView);
        kodeTextView = itemView.findViewById(R.id.kodeTextView);
        kursTextView = itemView.findViewById(R.id.kursTextView);
        namaTextView = itemView.findViewById(R.id.namaTextView);

    }
}
