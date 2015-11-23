package com.qf.yilonghotel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;
import fragment.HomeFragment;
import fragment.OrderFragment;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rg = (RadioGroup) findViewById(R.id.rg_home);
        rg.setOnCheckedChangeListener(this);
        rg.getChildAt(0).performClick();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_tab_home:
                HomeFragment homeFragment = new HomeFragment();
                fragmentManager(homeFragment);
                break;
            case R.id.rb_tab_order:
                OrderFragment order = new OrderFragment();
                fragmentManager(order);
                break;
        }
    }
    private void fragmentManager(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_fragment, fragment)
                .commit();
    }
}
