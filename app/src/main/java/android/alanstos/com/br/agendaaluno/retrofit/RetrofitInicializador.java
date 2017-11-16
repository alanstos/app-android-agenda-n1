package android.alanstos.com.br.agendaaluno.retrofit;

import android.alanstos.com.br.agendaaluno.service.RepositorioService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by A on 15/11/2017.
 */

public class RetrofitInicializador {


    private final Retrofit retrofit;

    public RetrofitInicializador() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/search/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public RepositorioService getRepositorioService() {
        return retrofit.create(RepositorioService.class);
    }
}
