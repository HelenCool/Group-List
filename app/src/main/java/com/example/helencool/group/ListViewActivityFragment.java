package com.example.helencool.group;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;




/**
 * A placeholder fragment containing a simple view.
 */
public class ListViewActivityFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public ListViewActivityFragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String [] StudentsList = {
                "Евгеній Жданов",
                "Едгар Хіміч",
                "Олександр Сторчак",
                "Євгеній Ситник",
                "Альона Бочкарьова",
                "Богда Рибак",
                "Ірина Смалько",
                "Владислав Вінник",
                "Ігор Пахаренко",
                "Андрій Рябко",
                "Іван Левченко",
                "Микола Піхманець",
                "Руслан Мигаль",
                "Руслан Воловик",
                "Валерій Губський",
                "Іван Сергієнко",
                "Вова Лимарь",
                "Даша Кириченко",
                "Михаййло Теплий",
                "Павло Сакуров",

        };

        List<String> Students = new ArrayList<String>(Arrays.asList(StudentsList));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item,
                        R.id.list_item_view,
                        Students);

        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(mForecastAdapter);

        return rootView;

    }



}
