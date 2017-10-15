package ca.bcit.ass2.kwon_guo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list_continent = (ListView)findViewById(R.id.list_continent);
        list_continent.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                   Intent intent = new Intent(MainActivity.this,CountryActivity.class);
                   intent.putExtra("continent",i);
                   startActivity(intent);
            }
        });
    }


}
