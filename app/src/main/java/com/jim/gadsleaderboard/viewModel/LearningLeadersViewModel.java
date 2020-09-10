package com.jim.gadsleaderboard.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.jim.gadsleaderboard.models.LearningLeaders;
import com.jim.gadsleaderboard.remote.Repository;

import java.util.List;

public class LearningLeadersViewModel extends ViewModel {

    public MutableLiveData<List<LearningLeaders>> getLearningLeadersLiveData() {
        return Repository.getInstance().getLearningLeaders();
    }

}
