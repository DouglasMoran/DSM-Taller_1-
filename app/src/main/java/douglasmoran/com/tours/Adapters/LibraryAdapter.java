package douglasmoran.com.tours.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import douglasmoran.com.tours.LibraryDetails;
import douglasmoran.com.tours.Models.Libraries;
import douglasmoran.com.tours.R;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.ViewHolder> {

    Context context;
    ArrayList<Libraries> libraries;

    public LibraryAdapter(Context context, ArrayList<Libraries> libraries) {
        this.context = context;
        this.libraries = libraries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_libraries,viewGroup,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final Libraries library = libraries.get(i);


        viewHolder.countryItem.setText(library.getCountry());

        Glide.with(context).load(library.getImgRecyclerView()).into(viewHolder.iconItem);


        viewHolder.linearLayoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LibraryDetails.class);
                intent.putExtra("detail", library);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return libraries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView countryItem, countPic;
        ImageView iconItem;
        CardView cardViewItem;
        LinearLayout linearLayoutItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayoutItem = itemView.findViewById(R.id.linearItem);
            cardViewItem = itemView.findViewById(R.id.cardViewItem);
            countryItem = itemView.findViewById(R.id.country_city);
            iconItem = itemView.findViewById(R.id.iconsItem);
            countPic = itemView.findViewById(R.id.countPic);

        }
    }
}
