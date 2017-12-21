package com.desafiolatam.runbasta;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyAuctionsFragment extends Fragment {


    public MyAuctionsFragment() {
        // Required empty public constructor
    }

    public static MyAuctionsFragment newInstance(){
        return new MyAuctionsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_auctions, container, false);
    }

}
