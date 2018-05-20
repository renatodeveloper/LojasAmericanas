package com.lojas.americanas.application.service.research;

import android.content.Context;
import com.lojas.americanas.application.service.IResearchView;
import com.lojas.americanas.application.ui.activities.Home;
import com.lojas.americanas.domain.model.Produto;
import com.lojas.americanas.infrastructure.backend.ApiClient;
import com.lojas.americanas.infrastructure.backend.ApiInterface;

import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class ResearchService {

    private Context context;
    private IResearchView view;
    ApiInterface apiService;

    public List<Produto> resut;

    public ResearchService(Context context, IResearchView view){
        this.context = context;
        this.view = view;
    }

    public List<Produto> buscar() throws IOException {
        apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Produto>> call = apiService.recieve(this.view.getParameter());
        call.enqueue(new Callback<List<Produto>>() {
            @Override
            public void onResponse(Response<List<Produto>> response, Retrofit retrofit) {
                if(response !=null){
                    resut = response.body();
                }
            }
            @Override
            public void onFailure(Throwable t) {
                if (t != null){

                }
            }
        });
        return resut;
    }
}
