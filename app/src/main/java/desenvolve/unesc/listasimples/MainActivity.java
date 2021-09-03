package desenvolve.unesc.listasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAndroid = findViewById(R.id.listaAndroid);

        String dados[] = new String[]
        {
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean","KitKat", "Lollipop",
            "Marshmallow", "Nougat"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                                            (
                                                MainActivity.this,
                                                android.R.layout.simple_list_item_1,
                                                dados
                                            );

        listaAndroid.setAdapter(adapter);
    }
}