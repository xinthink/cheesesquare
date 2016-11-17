package com.support.android.designlibdemo;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ywu on 2016/11/16.
 */

public class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    public AppBarLayoutBehavior() {
    }

    public AppBarLayoutBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, AppBarLayout child, View dependency) {
        System.out.printf("onDependentViewChanged %s %s\n", child, dependency);
        return super.onDependentViewChanged(parent, child, dependency);
    }
}
