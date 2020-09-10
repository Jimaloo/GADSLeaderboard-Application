package com.jim.gadsleaderboard.network;

import com.jim.gadsleaderboard.api.GadsApi;
import com.jim.gadsleaderboard.api.GoogleFormApi;

public class
NetworkService {

    public GadsApi getGadsApi() {
        return new RetrofitClient(RetrofitClient.GADS_BASE_URL).createService(GadsApi.class);
    }

    public GoogleFormApi getGoogleFormApi() {
        return new RetrofitClient(RetrofitClient.GOOGLE_FORMS_BASE_URL).createService(GoogleFormApi.class);
    }
}
