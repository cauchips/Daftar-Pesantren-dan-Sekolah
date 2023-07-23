package com.azhar.daftarpesantren.network;

import com.azhar.daftarpesantren.sekolah.ModelSekolah;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SekolahServices {
    @GET("https://api-sekolah-indonesia.adaptable.app/?keyword=") // Ganti "endpoint-api-sekolah" dengan endpoint yang sesuai
    Call<List<ModelSekolah>> cariSekolah(@Query("keyword") String keyword);
}