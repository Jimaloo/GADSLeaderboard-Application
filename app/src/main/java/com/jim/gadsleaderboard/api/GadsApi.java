package com.jim.gadsleaderboard.api;

import com.jim.gadsleaderboard.models.LearningLeaders;
import com.jim.gadsleaderboard.models.SkillLeaders;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GadsApi {

    @GET("/api/hours")
    Call<List<LearningLeaders>> getLearningLeaders();

    @GET("/api/skilliq")
    Call<List<SkillLeaders>> getSkillLeaders();
}
