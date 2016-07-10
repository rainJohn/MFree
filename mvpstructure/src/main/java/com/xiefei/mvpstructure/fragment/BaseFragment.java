package com.xiefei.mvpstructure.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xiefei on 2016/5/23.
 */
public class BaseFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("BaseFragment","onCreate->"+getClass().getName());
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
