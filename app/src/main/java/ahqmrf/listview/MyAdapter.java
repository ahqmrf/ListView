package ahqmrf.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ahqmrf on 1/4/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {

    int [] images = {};
    String [] names = {};
    Context context;
    LayoutInflater inflater;

    public MyAdapter(Context context, String[] names, int [] images) {
        super(context, R.layout.node, names);

        this.context = context;
        this.names = names;
        this.images = images;
    }

    class Node {
        ImageView imageView;
        TextView textView;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.node, null);
        }

        final Node node = new Node();
        node.imageView = (ImageView) convertView.findViewById(R.id.image);
        node.textView = (TextView) convertView.findViewById(R.id.image_name);

        node.imageView.setImageResource(images[position]);
        node.textView.setText(names[position]);

        return convertView;
    }
}
