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

        fruitAdapter = new FruitAdapter(this, R.layout.listview_fruit, fruits);
        lvFruit.setAdapter(fruitAdapter);
    }

    private void mapping() {
        lvFruit = findViewById(R.id.listviewfruit);
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Ca nấu lẩu, nấu mì mini", "ShopDevang", R.drawable.ca_nau_lau));
        fruits.add(new Fruit("1 KG GÀ KHÔ BƠ TỎI", "Shop LTD Food", R.drawable.ga_bo_toi));
        fruits.add(new Fruit("Xe cần cẩu đa năng", "Shop Thế giới đồ chơi", R.drawable.xa_can_cau));
        fruits.add(new Fruit("Đồ chơi dạng mô hình", "Shop Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        fruits.add(new Fruit("Lãnh đạo đơn giản", "Shop Minh Long Book", R.drawable.lanh_dao_gian_don));
        fruits.add(new Fruit("Hiểu lòng trẻ con", "Shop Minh Long Book", R.drawable.hieu_long_con_tre));
        fruits.add(new Fruit("Donal Trump Thiên tài lãnh đạo", "Donal Trump", R.drawable.trump));
        fruits.add(new Fruit("Ca nấu lẩu, nấu mì mini", "ShopDevang", R.drawable.ca_nau_lau));
        fruits.add(new Fruit("1 KG GÀ KHÔ BƠ TỎI", "Shop LTD Food", R.drawable.ga_bo_toi));
        fruits.add(new Fruit("Xe cần cẩu đa năng", "Shop Thế giới đồ chơi", R.drawable.xa_can_cau));
        fruits.add(new Fruit("Đồ chơi dạng mô hình", "Shop Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        fruits.add(new Fruit("Lãnh đạo đơn giản", "Shop Minh Long Book", R.drawable.lanh_dao_gian_don));
        fruits.add(new Fruit("Hiểu lòng trẻ con", "Shop Minh Long Book", R.drawable.hieu_long_con_tre));
        fruits.add(new Fruit("Donal Trump Thiên tài lãnh đạo", "Donal Trump", R.drawable.trump));
    }
}