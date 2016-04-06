package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import info.androidhive.materialtabs.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static android.R.layout.two_line_list_item;
import static info.androidhive.materialtabs.R.layout.*;

public class OneFragment extends Fragment{


    String[] myStringArray = new String[1];
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    public OneFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment_one, container, false);
    }
}
