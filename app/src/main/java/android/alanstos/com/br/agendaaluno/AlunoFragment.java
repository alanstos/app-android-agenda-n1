package android.alanstos.com.br.agendaaluno;

import android.alanstos.com.br.agendaaluno.adapter.AdapterCursosPersonalizado;
import android.alanstos.com.br.agendaaluno.modelo.Curso;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AlunoFragment extends Fragment {

    private ListView listViewProvas;

    public AlunoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layoutProvas = inflater.inflate(R.layout.fragment_aluno, container, false);

        this.listViewProvas =
                (ListView) layoutProvas.findViewById(R.id.list_view_aluno);

        List<String> provas = Arrays.asList("abacaxi" , "mamao", "jaboticaba" , "laranja" );

        List<Curso> cursos = findCursos();

      //  this.listViewProvas.setAdapter(new ArrayAdapter<String>(getActivity(),
        //        android.R.layout.simple_list_item_1, provas));

        AdapterCursosPersonalizado adapter =
                new AdapterCursosPersonalizado(cursos, getActivity());

        listViewProvas.setAdapter(adapter);

        listViewProvas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object itemAtPosition = adapterView.getItemAtPosition(position);

                Intent intent = new Intent(getActivity(), DetalheActivity.class);
                String message = "abc";
                //intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        return layoutProvas;
    }

    public List<Curso> findCursos(){
        List<Curso> c = new ArrayList<Curso>();

        c.add(new Curso("alan", "laala"));
        c.add(new Curso("lu", "lele"));
        c.add(new Curso("papel", "branco"));
        c.add(new Curso("copo", "azul"));
        c.add(new Curso("arroz", "vermelho","E"));
        c.add(new Curso("tigre", "laranhja", "E"));
        c.add(new Curso("cachorro pequeno", "branco", "E"));
        c.add(new Curso("alan 2", "araujo"));
        c.add(new Curso("lu 2", "borge"));
        return c;
    }

}
