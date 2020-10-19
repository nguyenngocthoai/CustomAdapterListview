package snowdrop.nnt.customadapterlistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Fruit> fruits;

    public FruitAdapter(Context context, int layout, List<Fruit> fruits) {
        this.context = context;
        this.layout = layout;
        this.fruits = fruits;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     * @param position
     * @return id of row list view
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView image;
        TextView txtTitle, txtShopName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.txtTitle = convertView.findViewById(R.id.name);
            viewHolder.txtShopName = convertView.findViewById(R.id.des);
            viewHolder.image = convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            ;
        }
        /**
         * System
         */
//        c1
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = inflater.inflate(layout, null);
//        c2
//        convertView = LayoutInflater.from(context).inflate(layout, parent, false);
        /**
         *mapping
         */
//        TextView txtName = convertView.findViewById(R.id.name);
//        TextView txtDes = convertView.findViewById(R.id.des);
//        ImageView img = convertView.findViewById(R.id.imageView);
        /**
         * assign data
         */
        Fruit fruit = fruits.get(position);
        viewHolder.txtTitle.setText(fruit.getName());
        viewHolder.txtShopName.setText(fruit.getDescription());
        viewHolder.image.setImageResource(fruit.getImage());

        return convertView;
    }
}
