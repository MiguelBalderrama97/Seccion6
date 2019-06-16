package com.example.miguel.mymail.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.miguel.mymail.Adapters.EmailAdapter;
import com.example.miguel.mymail.Models.Email;
import com.example.miguel.mymail.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements ListView.OnItemClickListener {

    private View view;

    private ListView listEmail;

    private List<Email> emails = new ArrayList<>();
    private EmailAdapter emailAdapter;

    private DataListener callBack;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            callBack = (DataListener) context;
        } catch (Exception e) {
            throw new ClassCastException(context.toString() + " should implements DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list, container, false);

        listEmail = view.findViewById(R.id.listEmails);
        getAllEmails();

        emailAdapter = new EmailAdapter(getActivity(), emails, R.layout.list_item);
        listEmail.setAdapter(emailAdapter);

        listEmail.setOnItemClickListener(this);

        return view;
    }

    private void getAllEmails() {
        emails.add(new Email("Miguel Balderrama", "Que onda papu, arre por unas papas o que la neta traigo muchas hambre", "Salida por papas"));
        emails.add(new Email("Bryan Herrera", "Ese papu, vato me quede tirado en la calle Huancune estoy cerca del extra de la esquina, si puedes caerle y traerte un  desarmador man porfa", "Ayuda con moto"));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        callBack.sendData(position);
    }

    public interface DataListener {
        void sendData(int position);
    }
}
