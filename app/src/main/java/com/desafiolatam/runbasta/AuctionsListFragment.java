package com.desafiolatam.runbasta;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AuctionsListFragment extends Fragment {


    public AuctionsListFragment() {
        // Required empty public constructor
    }

    public static AuctionsListFragment newInstance(){
        return new AuctionsListFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auctions_list, container, false);
    }

}
