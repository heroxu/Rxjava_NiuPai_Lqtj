package com.rxjava_niupai_lqtj.myui.fragment;

import android.os.Bundle;

import com.rxjava_niupai_lqtj.R;
import com.rxjava_niupai_lqtj.base.BaseFragment;

/**
 * Created by xuxiarong on 2016/5/4.
 */
public class FragmentMyCart extends BaseFragment{
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_cart;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {
        init();

    }

    private void init() {
    }

    public static FragmentMyCart newInstance() {
        return new FragmentMyCart();
    }
}
