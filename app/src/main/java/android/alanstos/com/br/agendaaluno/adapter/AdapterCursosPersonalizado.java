package android.alanstos.com.br.agendaaluno.adapter;

import android.alanstos.com.br.agendaaluno.R;
import android.alanstos.com.br.agendaaluno.modelo.Curso;
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

public class AdapterCursosPersonalizado extends BaseAdapter {

    private final List<Curso> cursos;
    private final Activity act;

    public AdapterCursosPersonalizado(List<Curso> cursos, Activity act) {
        this.cursos = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return cursos.size();
    }

    @Override
    public Object getItem(int i) {
        return cursos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.lista_personalizada, parent, false);
        Curso curso = cursos.get(position);

        //pegando as referências das Views
        TextView nome = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView)
                view.findViewById(R.id.lista_curso_personalizada_imagem);

        //populando as Views
        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());

        if (curso.getEstado().equals("I")){
            imagem.setImageResource(R.drawable.git);
        }else{
            imagem.setImageResource(R.drawable.java);
        }


        return view;
    }
}
