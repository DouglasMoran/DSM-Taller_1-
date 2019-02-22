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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import douglasmoran.com.tours.LibraryDetailActivity;
import douglasmoran.com.tours.Models.Libraries;
import douglasmoran.com.tours.R;

public class LibrariesAdapter extends RecyclerView.Adapter<LibrariesAdapter.ViewHolder> {

    Context context;
    ArrayList<Libraries> libraries;

    public LibrariesAdapter(Context context, ArrayList<Libraries> libraries) {
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

        Glide.with(context).load(library.getImgRecycler()).into(viewHolder.iconItem);


        viewHolder.relativeLayoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LibraryDetailActivity.class);
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

        TextView countryItem, countPicItem;
        ImageView iconItem;
        CardView cardViewItem;
        RelativeLayout relativeLayoutItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayoutItem = itemView.findViewById(R.id.relativeItems);
            cardViewItem = itemView.findViewById(R.id.cardViewItems);
            countryItem = itemView.findViewById(R.id.countryItems);
            iconItem = itemView.findViewById(R.id.iconItems);
            countPicItem = itemView.findViewById(R.id.countPicItems);

        }
    }
}
