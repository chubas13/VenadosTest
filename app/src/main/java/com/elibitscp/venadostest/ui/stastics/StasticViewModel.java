package com.elibitscp.venadostest.ui.stastics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StasticViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StasticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Stastics fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
