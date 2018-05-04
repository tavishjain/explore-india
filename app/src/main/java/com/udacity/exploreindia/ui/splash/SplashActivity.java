package com.udacity.exploreindia.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.udacity.exploreindia.base.BaseActivity;
import com.udacity.exploreindia.R;
import com.udacity.exploreindia.databinding.ActivitySplashBinding;
import com.udacity.exploreindia.ui.home.HomeActivity;

public class SplashActivity extends BaseActivity< SplashContract.Presenter,ActivitySplashBinding> implements SplashContract.View {



    @Override
    protected int getContentResource() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init(@Nullable Bundle savedInstanceState) {
            getPresenter().inintCountDown();
    }

    @Override
    protected void beforeView(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void moveToNextSScreen() {
        Intent intent = new Intent(this, HomeActivity.class);
        finish();
        startActivity(intent);
    }
}
