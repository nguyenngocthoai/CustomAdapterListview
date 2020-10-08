package snowdrop.nnt.customadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFruit;
    ArrayList<Fruit> fruits;
    FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        fruitAdapter =new FruitAdapter(this,R.layout.listview_fruit,fruits);
        lvFruit.setAdapter(fruitAdapter);
    }

    private void mapping() {
        lvFruit=findViewById(R.id.listviewfruit);
        fruits=new ArrayList<>();
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
        fruits.add(new Fruit("Dâu Tây","Dâu tây Đà lạt",R.drawable.dautay));
        fruits.add(new Fruit("Xoài","Xoài nhà tui trồng",R.drawable.xoai));
    }
}