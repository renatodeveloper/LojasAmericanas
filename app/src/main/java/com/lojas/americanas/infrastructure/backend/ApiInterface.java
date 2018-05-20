package com.lojas.americanas.infrastructure.backend;

import com.lojas.americanas.domain.model.Produto;
import java.util.List;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

public interface ApiInterface {
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @GET("product_cells_by_category_filtered")
    Call<List<Produto>> recieve(@Query("categoryId") String categoryId);
}
