package android.alanstos.com.br.agendaaluno;

import android.alanstos.com.br.agendaaluno.adapter.AdapterCursosPersonalizado;
import android.alanstos.com.br.agendaaluno.adapter.AdapterRepositorioPersonalizado;
import android.alanstos.com.br.agendaaluno.modelo.Item;
import android.alanstos.com.br.agendaaluno.modelo.Repositorio;
import android.alanstos.com.br.agendaaluno.retrofit.RetrofitInicializador;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetalheActivity extends ListActivity {

    private ListView listViewRepositorio;

    List<Repositorio> rep1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalhe_simples);


        List<String> values = Arrays.asList("repositorios abc1" , "la mamao", "jaboticaba" , "laranja" );

        List<Repositorio> rep = findRepositorios();

        AdapterRepositorioPersonalizado adapter =
                new AdapterRepositorioPersonalizado(rep, this);

        ArrayAdapter<String> adapter_simples = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);

        setListAdapter( adapter );

    }

    protected void __onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalhe);

        //this.listViewRepositorio = (ListView) findViewById(R.id.list_repositorios);

        List<Repositorio> rep = findRepositorios();

        AdapterRepositorioPersonalizado _adapter =
                new AdapterRepositorioPersonalizado(rep, this);

        List<String> values = Arrays.asList("repositorios abc1" , "la mamao", "jaboticaba" , "laranja" );

        this.listViewRepositorio.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values));

        ///listViewRepositorio.setAdapter(adapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);

        setListAdapter( adapter );

    }

    private List<Repositorio> findRepositorios() {

        Call<Item> call = new RetrofitInicializador().getRepositorioService().findItem();

        call.enqueue(new Callback<Item>() {



            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                Log.i("ok","deu certo");

                rep1 = new ArrayList<>();

                Item itens = response.body();
                Log.i("ok", itens.toString());

                for (Repositorio e : itens.getItems()) {

                    rep1.add(new Repositorio(e.getId(),e.getName(),e.getDescription()));
                }

                teste();

            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {
                Log.e("erro","errou!! tipo faustao", t);

            }
        });

        List<Repositorio> repositorios = new ArrayList<>();

        repositorios.add(new Repositorio("rep1", "desc 01"));

        repositorios.add(new Repositorio("rep2", "desc 02"));

        repositorios.add(new Repositorio("rep3", "desc 03"));

        repositorios.add(new Repositorio("rep4", "desc 04"));

        return repositorios;
    }

    public void teste(){
        AdapterRepositorioPersonalizado adapter =
                new AdapterRepositorioPersonalizado(rep1, this);
        setListAdapter( adapter );
    }

}
