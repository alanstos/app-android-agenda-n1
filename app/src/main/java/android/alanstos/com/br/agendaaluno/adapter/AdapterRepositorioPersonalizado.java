package android.alanstos.com.br.agendaaluno.adapter;

import android.alanstos.com.br.agendaaluno.R;
import android.alanstos.com.br.agendaaluno.modelo.Curso;
import android.alanstos.com.br.agendaaluno.modelo.Repositorio;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A on 11/11/2017.
 */

public class AdapterRepositorioPersonalizado extends BaseAdapter {

    private final List<Repositorio> repositorios;
    private final Activity act;

    public AdapterRepositorioPersonalizado(List<Repositorio> repositorios, Activity act) {
        this.repositorios = repositorios;
        this.act = act;
    }

    @Override
    public int getCount() {
        return repositorios.size();
    }

    @Override
    public Object getItem(int i) {
        return repositorios.get(i);
    }

    @Override
    public long getItemId(int i) {
        return repositorios.get(i).getId().longValue();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //View view = act. (R.layout.lista_personalizada_repositorio);

        View view = act.getLayoutInflater()
                .inflate(R.layout.lista_personalizada_repositorio, parent, false);

        Repositorio repositorio = repositorios.get(position);

        //pegando as referências das Views
        TextView nome = (TextView)
                view.findViewById(R.id.lista_repos_personalizada_nome);
        TextView descricao = (TextView)
                view.findViewById(R.id.lista_repos_personalizada_descricao);


        //populando as Views
        nome.setText(repositorio.getName());
        descricao.setText(repositorio.getDescription());

        return view;
    }
}
