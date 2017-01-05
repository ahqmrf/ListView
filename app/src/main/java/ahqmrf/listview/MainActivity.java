package ahqmrf.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView listView;
    String[] names = {"Apple", "Eclipse", "Flowers", "Moon"};
    int[] images = {R.drawable.apple, R.drawable.eclipse, R.drawable.flowers, R.drawable.moon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(this, names, images);
        listView.setAdapter(adapter);
    }
}
