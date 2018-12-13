package com.example.pc.practica4pmdm;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ViewPagerDesplazandoImagenes extends FragmentPagerAdapter
{
    private Fragment[] childFragments;

    public ViewPagerDesplazandoImagenes(FragmentManager fm) {
        super(fm);
        childFragments = new Fragment[]
                {
                        new Fragment3(), //0
                        new Fragment4() //1
                };
    }
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new Fragment3(); //ChildFragment1 at position 0
            case 1:
                return new Fragment4(); //ChildFragment2 at position 1

        }
        return null; //does not happen
    }
    @Override
    public int getCount() {
        return 2; //two fragments
    }
}