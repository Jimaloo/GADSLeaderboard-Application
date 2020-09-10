package com.jim.gadsleaderboard.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jim.gadsleaderboard.models.SkillLeaders;
import com.jim.gadsleaderboard.remote.Repository;

import java.util.List;

public class SkillLeadersViewModel extends ViewModel {

    public MutableLiveData<List<SkillLeaders>> getSkillLeadersLiveData(){
        return Repository.getInstance().getSkillLeaders();
    }
}
