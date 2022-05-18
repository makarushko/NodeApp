package com.example.nodeapp;

import androidx.cardview.widget.CardView;

import com.example.nodeapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
