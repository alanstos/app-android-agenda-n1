package android.alanstos.com.br.agendaaluno.service;

import android.alanstos.com.br.agendaaluno.modelo.Item;
import android.alanstos.com.br.agendaaluno.modelo.Repositorio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by A on 15/11/2017.
 */

public interface RepositorioService {

    @GET("repositories?q=language:Java&sort=stars&page=1")
    Call<List<Repositorio>> find();

    @GET("repositories?q=language:Java&sort=stars&page=1")
    Call<Item> findItem();


}
