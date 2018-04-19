package a20180417_ja_nycschools.com.a20180417_ja_nycschools;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 4/19/2018.
 */

public interface Api {

    @GET("/resource/97mf-9njv.json")
    Call<List<School>> getSchool();
}
