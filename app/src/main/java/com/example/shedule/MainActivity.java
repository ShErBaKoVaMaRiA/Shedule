package com.example.shedule;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ArrayList<Model> list_schedule = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,list_schedule);
        recyclerView.setAdapter(adapter); }
    private void setData() {
        list_schedule.add(new Model("Понедельник","Нахимовский","","","","","Физкультура","","А.В. Андрюков","","Системное программирование","","А.Д. Нилов","","Иностранный язык в профессиональной деятельности","","Завьялова А.Д./Дымская А.Ю.","","Поддержка и тестирование программных модулей","","М.А. Дюжева",""));
        list_schedule.add(new Model("Вторник","Неженская","Теория вероятностей и мат. статистика","","Т.А. Санаева","","Основы проектирования баз данных","","И.М. Щанников","","Разработка программных моделей","","Н.А. Михайлин","","Опереционные системы и среды","","Д.В. Мысев","","","","",""));
        list_schedule.add(new Model("Среда","Нахимовский","Основы алгоритмизации и программирования","","М.А. Алешин","","Системное программирование","Поддержка и тестирование программных модулей","А.Д. Нилов","М.А. Дюжева","Разработка мобильных приложений","","Р.Ю. Волков","","","","","","","","",""));
        list_schedule.add(new Model("Четверг","Нахимовский","","","","","Отсутствует","Основы алгоритмизации и программирования","","М.А. Алешин","Основы алгоритмизации и программирования","","И.Д. Буканов","","Разработка программных модулей","","Н.А. Михайлин","","Элементы высшей математики","","М.В. Черемных",""));
        list_schedule.add(new Model("Пятница","Нахимовский","Основы проектирования баз данных","","И.М. Щаников","","Компьютерные сети","","А.Д. Нилов","","Основы алгоритмизации и программирования","Операционные системы и среды","И.Д. Буканов","Д.В. Мысев","РАзработка мобильных приложений","Отсутсвует","Р.Ю. Волков","","","","",""));

   }
}
