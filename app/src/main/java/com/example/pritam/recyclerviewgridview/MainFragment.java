package com.example.pritam.recyclerviewgridview;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pritam on 2/12/2018.
 */

public class MainFragment extends Fragment {

    private List<Items> itemsList;
    private MainAdapter mainAdapter;

    @BindView(R.id.recycler_view_main_fragment)
    RecyclerView mRecyclerViewFragment;

    public MainFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        mRecyclerViewFragment.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mRecyclerViewFragment.setHasFixedSize(true);

        itemsList = getItems();

        mainAdapter= new MainAdapter(getContext(), itemsList);
        mRecyclerViewFragment.setAdapter(mainAdapter);

        return view;
    }

    private List<Items> getItems(){
        List<Items> items = new ArrayList<>();

        items.add(new Items("Shahid Kapoor",
                ContextCompat.getDrawable(getContext(), R.drawable.shahid_kapoor)));
        items.add(new Items("Alia Bhatt",
                ContextCompat.getDrawable(getContext(), R.drawable.alia_bhatt)));
        items.add(new Items("Shahrukh Khan",
                ContextCompat.getDrawable(getContext(), R.drawable.shah_rukh)));
        items.add(new Items("Salman Khan",
                ContextCompat.getDrawable(getContext(), R.drawable.salman_khan)));
        items.add(new Items("Amir Khan",
                ContextCompat.getDrawable(getContext(), R.drawable.amir_khan)));
        items.add(new Items("Deepika Padukone",
                ContextCompat.getDrawable(getContext(), R.drawable.deepika_padukone)));
        items.add(new Items("Ranveer Singh",
                ContextCompat.getDrawable(getContext(), R.drawable.ranveer_singh)));
        items.add(new Items("Kangana Ranaut",
                ContextCompat.getDrawable(getContext(), R.drawable.kangana_ranaut)));
        items.add(new Items("Katrina Kaif",
                ContextCompat.getDrawable(getContext(), R.drawable.katrina_kaif)));
        items.add(new Items("Priyanka chopra",
                ContextCompat.getDrawable(getContext(), R.drawable.priyanka_chopra)));
        items.add(new Items("Sanjay Dutt",
                ContextCompat.getDrawable(getContext(), R.drawable.sanjay_baba)));
        items.add(new Items("Hrithik Roshan",
                ContextCompat.getDrawable(getContext(), R.drawable.hrithik_roshan)));

        return items;
    }
}
