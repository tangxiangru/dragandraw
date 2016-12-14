package com.example.draganddraw;

import android.support.v4.app.Fragment;

/**
 * Created by tangxiangru on 16/12/10.
 */

public class DragAndDrawActivity extends SingleFragmentActivity {


    @Override
    public Fragment creatFragment() {
        return DragAndDrawFragment.newInstance();
    }

    @Override
    protected Fragment createFragment() {
        return null;
    }
}
