package com.desafiolatam.runbasta;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dckurty on 21-12-17.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return AuctionsListFragment.newInstance();
            case 1:
                return BiddingFragment.newInstance();
            case 2:
                return MyAuctionsFragment.newInstance();
            case 3:
                return WinFragment.newInstance();
            default:
                return AuctionsListFragment.newInstance();

        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Auctions";
            case 1:
                return "Bidding";
            case 2:
                return "My Auctions";
            case 3:
                return "Win";
        }
        return null;
    }
}
