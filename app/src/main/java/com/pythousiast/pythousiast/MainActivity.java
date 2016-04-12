package com.pythousiast.pythousiast;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private boolean switchBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ItemAFragment itemAFragment = ItemAFragment.newInstance();
        ft.replace(R.id.fragment_container, itemAFragment);
        ft.commitAllowingStateLoss();
    }

    @OnClick(R.id.btn_swap)
    public void swapFragment() {
        if (switchBack) {
            onBackPressed();
            switchBack = false;
        } else {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ItemBFragment fragment = ItemBFragment.newInstance();
            ft.addToBackStack("items");
            ft.setCustomAnimations(R.anim.frag_in, R.anim.frag_out, R.anim.frag_in_pop, R.anim.frag_out_pop);
            ft.replace(R.id.fragment_container, fragment);
            ft.commit();
            switchBack = true;
        }
    }


}
