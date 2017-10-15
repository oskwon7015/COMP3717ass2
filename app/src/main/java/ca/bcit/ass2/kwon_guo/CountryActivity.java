package ca.bcit.ass2.kwon_guo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CountryActivity extends ListActivity {

    public static final String Asia [] ={"China","Korea (Republic of)","Japan","Thailand","Singapore"};
    public static final String Africa [] = {"South Africa","Kenya","Nigeria","Uganda","Sudan"};
    public static final String America [] = {"US","Canada","Mexico","Brazil","Argentina"};
    public static final String Australia [] = {"Australia","New Zealand","Fiji","New Caledonia","Samoa"};
    public static final String Europe [] = {"Germany","France","Italy","Belgium","Greece"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int continentCode = (Integer)getIntent().getExtras().get("continent");

        ArrayAdapter<String>  arrayAdapter;


        switch (continentCode){
            case 0:
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Africa);
                break;
            case 1:
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,America);
                break;
            case 2:
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Asia);
                break;
            case 3:
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Australia);
                break;
            case 4:
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Europe);
                break;
            default: arrayAdapter = null;

        }

        final ListView listCountry = getListView();
        listCountry.setAdapter(arrayAdapter);

        listCountry.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String countryName =(String)adapterView.getItemAtPosition(i);
                       // Log.d("name",countryName);
                        Intent intent = new Intent(CountryActivity.this,CountryDetailActivity.class);
                        intent.putExtra("countryName",countryName);
                        startActivity(intent);
                    }
                }
        );

    }
}
