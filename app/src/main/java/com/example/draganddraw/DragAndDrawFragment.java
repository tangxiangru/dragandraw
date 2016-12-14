package com.example.draganddraw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tangxiangru on 16/12/10.
 */

public class DragAndDrawFragment extends Fragment {

    public static DragAndDrawFragment newInstance(){

        return new DragAndDrawFragment();
    }


    public View onCreatView(LayoutInflater inflater , ViewGroup container,
                            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drag_and_draw, container,false);
        return v;
    }

}
