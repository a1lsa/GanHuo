package cn.ubanktech.ganhuo.view.act;

import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import cn.ubanktech.ganhuo.R;
import cn.ubanktech.ganhuo.utils.DensityUtils;

public class MainActivity extends BaseAct {

    private Toolbar mToolbar;
    private NavigationView mNaview;
    private DrawerLayout mDl;
    private String TAG = "print";

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findviews() {
        mToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        mNaview = (NavigationView) findViewById(R.id.main_navigationview);
        mDl = (DrawerLayout) findViewById(R.id.main_drawlayout);
    }

    @Override
    protected void init() {
        mToolbar.setTitle("福利");
        mToolbar.setTitleTextColor(Color.WHITE);
        mToolbar.setNavigationIcon(R.mipmap.icon_menu2);
        mToolbar.setElevation(DensityUtils.px2dp(this, 8));
        setSupportActionBar(mToolbar);
//        ActionBarDrawerToggle dt = new ActionBarDrawerToggle(this, mDl, mToolbar, R.string.draw_open, R.string.draw_close);
//        dt.syncState();
//        mDl.addDrawerListener(dt);

    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initEvent() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDl.openDrawer(Gravity.LEFT);
            }
        });

        mNaview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_main_fl:
                        Log.i(TAG, "选中福利: ");
                        break;
                    case R.id.menu_main_time:
                        Log.i(TAG, "选中事件: ");
                        break;
                }
                item.setChecked(true);
                mToolbar.setTitle(item.getTitle());
                mDl.closeDrawers();
                return true;
            }
        });
    }
}
