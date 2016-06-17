package cn.ubanktech.ganhuo.view.act;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 伟平 on 2016/6/17.
 */
public abstract class BaseAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        findviews();
        init();
        initDate();
        initEvent();

    }

    protected abstract int setLayoutId();

    protected abstract void findviews();

    protected abstract void init();

    protected abstract void initDate();

    protected abstract void initEvent();


}
