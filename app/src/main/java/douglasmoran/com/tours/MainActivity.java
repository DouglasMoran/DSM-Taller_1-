package douglasmoran.com.tours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import douglasmoran.com.tours.Adapters.LibrariesAdapter;
import douglasmoran.com.tours.Models.Libraries;

public class MainActivity extends AppCompatActivity {

    private String jsonUnoUrl = "https://raw.githubusercontent.com/DouglasMoran/DSM-Taller_1-/master/data.json";
    private ArrayList<Libraries> libraries = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadContent();


    }

    private void loadContent() {
        RequestQueue resRequestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(jsonUnoUrl, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    parseContent(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Ocurrio un error al cargar los recursos. Conectarse a la red.",Toast.LENGTH_SHORT).show();
            }
        });

        resRequestQueue.add(jsonArrayRequest);
    }

    private void parseContent(JSONArray jsonArray) throws JSONException {

        for (int i = 0; i < jsonUnoUrl.length(); i++){
            JSONObject tmp = jsonArray.getJSONObject(i);
            Gson gson = new Gson();
            Libraries library = gson.fromJson(tmp.toString(),Libraries.class);
            libraries.add(library);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerViewItem);
        recyclerView.setAdapter(new LibrariesAdapter(this,libraries));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
}
