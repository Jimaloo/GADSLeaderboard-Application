package com.jim.gadsleaderboard.remote;

import androidx.lifecycle.MutableLiveData;

import com.jim.gadsleaderboard.models.LearningLeaders;
import com.jim.gadsleaderboard.models.SkillLeaders;
import com.jim.gadsleaderboard.models.SubmissionRequest;
import com.jim.gadsleaderboard.services.GadsApiService;
import com.jim.gadsleaderboard.services.GoogleFormApiService;

import java.util.List;

public class Repository {

    private static Repository repository;

    public static Repository getInstance() {
        if (repository == null)
            repository = new Repository();
        return repository;
    }

    public MutableLiveData<List<LearningLeaders>> getLearningLeaders() {
        return GadsApiService.getInstance().getLearningLeaders();
    }

    public MutableLiveData<List<SkillLeaders>> getSkillLeaders() {
        return GadsApiService.getInstance().getSkillLeaders();
    }

    public MutableLiveData<Integer> submitRequest(SubmissionRequest request){
        return GoogleFormApiService.getInstance().submitRequest(request);
    }
}
