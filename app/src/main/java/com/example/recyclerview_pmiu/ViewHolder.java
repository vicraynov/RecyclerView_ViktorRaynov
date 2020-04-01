package com.example.recyclerview_pmiu;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView genre;
    private TextView year;

    public ViewHolder( View itemView){
        super(itemView);
        title =itemView.findViewById(R.id.textView);
        genre =itemView.findViewById(R.id.textView2);
        year =itemView.findViewById(R.id.textView3);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title.toString());
    }

    public TextView getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.setText(genre.toString());
    }

    public TextView getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year.setText(year.toString());
    }
}
