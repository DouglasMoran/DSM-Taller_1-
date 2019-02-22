package douglasmoran.com.tours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import douglasmoran.com.tours.Models.Libraries;

public class LibraryDetails extends AppCompatActivity {

    CardView cardView;
    TextView country_city, tittle, description;
    ImageView iconDetails;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_details);

        unionInterface();
        loadContent();

    }

    private void loadContent() {
        Intent intent = getIntent();
        Libraries getLibrary = intent.getParcelableExtra("details");

        Glide.with(this)
                .load(getLibrary.getImgRecyclerView()).into(iconDetails);


        country_city.setText(getLibrary.getCountry());
        tittle.setText(getLibrary.getTittle());
        description.setText(getLibrary.getMainDescription());

    }

    private void unionInterface() {

        cardView = findViewById(R.id.cardViewDetails);
         iconDetails = findViewById(R.id.iconDetails);
        country_city = findViewById(R.id.country_city_Details);
        tittle = findViewById(R.id.tittle_details);
        description = findViewById(R.id.descriptionMain_Details);


    }
}
