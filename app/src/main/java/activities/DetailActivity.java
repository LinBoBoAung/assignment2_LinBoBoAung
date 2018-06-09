package activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.ted_assignment2.R;

import adapters.NewsDetailAdapter;

public class DetailActivity extends BaseActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        RecyclerView rvNewsDetail=findViewById(R.id.rv_newsdetail);
        NewsDetailAdapter newsDetailAdapter=new NewsDetailAdapter();
        rvNewsDetail.setAdapter(newsDetailAdapter);
        rvNewsDetail.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
    }
}
