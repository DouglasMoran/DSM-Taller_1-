package douglasmoran.com.tours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import douglasmoran.com.tours.Models.Libraries;

public class LibraryDetailActivity extends AppCompatActivity {

    CardView cardViewDetail;
    TextView countryDetail, titleDetail, descriptionDetail;
    ImageView iconDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_detail);

        unionInterface();
        loadContent();

    }

    private void unionInterface() {

        cardViewDetail = findViewById(R.id.cardViewDetails);
         iconDetail = findViewById(R.id.iconDetails);
        countryDetail = findViewById(R.id.countryDetails);
        titleDetail = findViewById(R.id.titleDetails);
        descriptionDetail = findViewById(R.id.descriptionMainDetails);

    }

    private void loadContent() {
        Intent intent = getIntent();
        //Libraries getLibrary = intent.getParcelableExtra("details");
        Libraries getLibraries = intent.getParcelableExtra("detail");

        Glide.with(this)
                .load(getLibraries.getImgRecycler())
                .into(iconDetail);


        countryDetail.setText(getLibraries.getCountry());
        titleDetail.setText(getLibraries.getTitle());
        descriptionDetail.setText(getLibraries.getMainDescription());

    }
}
