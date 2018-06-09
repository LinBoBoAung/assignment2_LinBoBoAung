package adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.ted_assignment2.R;

import delegates.NewsDelegate;
import viewholders.NewsViewHolder;

public class NewsAdapter extends RecyclerView.Adapter {
    private NewsDelegate mNewsDelegate;
    public NewsAdapter(NewsDelegate newsDelegate)

    {
        mNewsDelegate=newsDelegate;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = android.view.LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_news, parent, false);

        return new NewsViewHolder(view,mNewsDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
