package ca.bcit.ass2.kwon_guo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CountryDetailActivity extends AppCompatActivity {


    private String TAG = CountryDetailActivity.class.getSimpleName();
    //private ProgressDialog pDialog;
    ProgressBar progressBar;
    // URL to get contacts JSON
    private static String SERVICE_URL;
    private Country country;

    // declare all the text view
    private TextView tvName;
    private TextView tvCapital;
    private TextView tvRegion;
    private TextView tvPopulation;
    private TextView tvArea;
    private TextView tvBorders;
    private ImageView imgflag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        String countryName = (String)getIntent().getExtras().get("countryName");
        SERVICE_URL = "https://restcountries.eu/rest/v2/name/" + countryName + "?fullText=true";

         country = new Country();

        // Lookup view for data population
         tvName = (TextView)findViewById(R.id.name);
         tvCapital = (TextView)findViewById(R.id.capital);
         tvRegion = (TextView)findViewById(R.id.region);
         tvPopulation= (TextView)findViewById(R.id.population);
         tvArea = (TextView)findViewById(R.id.area);
         tvBorders= (TextView)findViewById(R.id.borders);
         imgflag = (ImageView)findViewById(R.id.flag);

         new GetContacts().execute();

    }

    /**
     * Async task class to get json by making HTTP call
     */
    private class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(SERVICE_URL);

            Log.e(TAG, "Response from url: " + jsonStr);

            if (jsonStr != null) {
                try {
                    // JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                     JSONArray countryJsonArray = new JSONArray(jsonStr);

                     // looping through All Contacts
                        JSONObject jsonObj = countryJsonArray.getJSONObject(0);

                        String name = jsonObj.getString("name");
                        String capital = jsonObj.getString("capital");
                        String region = jsonObj.getString("region");
                        long population =jsonObj.getInt("population");
                        long area = jsonObj.getInt("area");
                        String flag = jsonObj.getString("flag");

                        ArrayList<String> borders = new ArrayList<String>();

                        JSONArray jsonArray = jsonObj.getJSONArray("borders");
                        if (jsonArray != null) {
                            int len = jsonArray.length();
                            for (int i=0;i<len;i++){
                                borders.add(jsonArray.get(i).toString());
                            }
                        }

                        // adding each child node to HashMap key => value
                        country.setName(name);
                        country.setCapital(capital);
                        country.setRegion(region);
                        country.setPopulation(population);
                        country.setArea(area);
                        country.setBorders(borders);
                        country.setFlag(flag);

                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);


            // Populate the data into the template view using the data object
            tvName.setText(country.getName());
            tvCapital.setText("Capital: " + country.getCapital());
            tvRegion.setText("Region: " + country.getRegion());
            tvPopulation.setText("Population: " + String.valueOf(country.getPopulation()));
            tvArea.setText("Area: " + String.valueOf(country.getArea()));
            tvBorders.setText("Borders: " + country.getBorders().toString());

            if (country.getFlag() != null) {
                new ImageDownloaderTask(imgflag).execute(country.getFlag());
            }

        }
    }



}
