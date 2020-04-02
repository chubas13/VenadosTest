package com.elibitscp.venadostest.ui.stastics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.elibitscp.venadostest.R;
import com.elibitscp.venadostest.ui.stastics.StasticViewModel;


public class StasticFragment extends Fragment {

    private StasticViewModel stasticViewModel;
    //@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        stasticViewModel =
                ViewModelProviders.of(this).get(StasticViewModel.class);
        View root = inflater.inflate(R.layout.fragment_stastics, container, false);
        final TextView textView = root.findViewById(R.id.text_statics);
        stasticViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
