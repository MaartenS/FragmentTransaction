package com.pythousiast.pythousiast;

/**
 * Created by Maarten on 12/04/16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class ItemBFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_item_b, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    public ItemBFragment() {
        // Required empty public constructor
    }

    public static ItemBFragment newInstance() {
        ItemBFragment fragment = new ItemBFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

}