package practicum.com.gemmaryjewelrygallery.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import practicum.com.gemmaryjewelrygallery.R;

public class DashboardAdapter extends BaseAdapter {

    private Context mContext;



    public DashboardAdapter(Context c) {
        mContext = c;
    }

    public DashboardAdapter(Context mContext, int[] gridViewItems, String[] gridViewItemNames,
                            String[] gridViewItemPrices, String[] gridViewItemKarats) {

                                this.mContext = mContext;
                                this.gridViewItemNames = gridViewItemNames;
                                this.gridViewItemPrices = gridViewItemPrices;
                                this.gridViewItemKarats = gridViewItemKarats;
                                this.gridViewItems = gridViewItems;
    }

    @Override
    public int getCount() {

        return gridViewItems.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ItemHolder itemHolder;

        if (convertView == null ){

//            Toast.makeText(mContext, "CONVERTVIEW IMTI", Toast.LENGTH_SHORT).show();

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.gridview_layout, null);

            itemHolder = new ItemHolder();


            itemHolder.ivItemPhoto = convertView.findViewById(R.id.ivItemPhoto);
            itemHolder.tvItemName = convertView.findViewById(R.id.tvItemName);
            itemHolder.tvItemPrice = convertView.findViewById(R.id.tvItemPrice);
            itemHolder.tvItemKarats = convertView.findViewById(R.id.tvItemKarats);

            convertView.setTag(itemHolder);

        } else {
//            Toast.makeText(mContext, "ELSES!", Toast.LENGTH_SHORT).show();
            itemHolder = (ItemHolder) convertView.getTag();
        }


        itemHolder.ivItemPhoto.setLayoutParams(new LinearLayout.LayoutParams(250, 200));
        itemHolder.ivItemPhoto.setScaleType(ImageView.ScaleType.CENTER_CROP);
        itemHolder.ivItemPhoto.setPadding(8, 8, 8, 8);

        itemHolder.ivItemPhoto.setImageResource(gridViewItems[position]);
        itemHolder.tvItemName.setText(gridViewItemNames[position]);
        itemHolder.tvItemKarats.setText(gridViewItemKarats[position]);
        itemHolder.tvItemPrice.setText(gridViewItemPrices[position]);

        Glide.with(mContext)
                .load(gridViewItems[position])
                .placeholder(R.drawable.ic_menu_camera)
                .into(itemHolder.ivItemPhoto);

        return convertView;
    }

    public static class ItemHolder{

        public ImageView ivItemPhoto;
        public TextView tvItemName, tvItemPrice, tvItemKarats;
    }
    private int[] gridViewItems = {
            R.drawable.diamond_1, R.drawable.diamond_2,
            R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,
            R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,
            R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,
            R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,
            R.drawable.necklace_2,R.drawable.pearl_1
    };

    private String[] gridViewItemNames = {
            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1"
    };

    private String[] gridViewItemKarats = {
            "1", "2", "24", "18",
            "1", "2", "24", "18",
            "1", "2", "24", "18",
            "1", "2", "24", "18",
            "1", "2", "24", "18",
    };

    private String[] gridViewItemPrices = {
            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77"
    };
}


//package practicum.com.gemmaryjewelrygallery.Adapter;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.bumptech.glide.Glide;
//
//import java.util.ArrayList;
//
//import practicum.com.gemmaryjewelrygallery.Activities.SampleDetails_1;
//import practicum.com.gemmaryjewelrygallery.Model.ItemModel;
//import practicum.com.gemmaryjewelrygallery.R;
//
//public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ItemHolder> {
//
//    private Context mContext;
//    private View gridViewItemsView;
//
//    private ArrayList<ItemModel> items;
//
//    ItemModel itemModel;
//
//
////    private int[] gridViewItems = {
////            R.drawable.diamond_1, R.drawable.diamond_2,
////            R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,
////            R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,
////            R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,
////            R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,
////            R.drawable.necklace_2,R.drawable.pearl_1
////    };
////
////    private String[] gridViewItemNames = {
////            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
////            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
////            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
////            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
////            "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1"
////    };
////
////    private String[] gridViewItemKarats = {
////            "1", "2", "24", "18",
////            "1", "2", "24", "18",
////            "1", "2", "24", "18",
////            "1", "2", "24", "18",
////            "1", "2", "24", "18",
////    };
////
////    private String[] gridViewItemPrices = {
////            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
////            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
////            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
////            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
////            "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77"
////    };
////
//
//
//    public DashboardAdapter(Context c) {
//        this.mContext = c;
//    }
//
////    public DashboardAdapter(Context mContext, int[] gridViewItems, String[] gridViewItemNames, String[] gridViewItemPrices, String[] gridViewItemKarats) {
////        this.mContext = mContext;
//////        this.mThumbIds = mThumbIds;
////        this.gridViewItemNames = gridViewItemNames;
////        this.gridViewItemPrices = gridViewItemPrices;
////        this.gridViewItemKarats = gridViewItemKarats;
////        this.gridViewItems = gridViewItems;
////    }
//
////    @Override
////    public int getCount() {
////
////        return gridViewItemNames.length;
////
////    }
////
////    @Override
////    public Object getItem(int i) {
////        return null;
////    }
//
//    @NonNull
//    @Override
//    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//
//        gridViewItemsView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gridview_layout, viewGroup, false);
//
//        return new ItemHolder(gridViewItemsView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
//
//        itemModel = items.get(i);
//
//                Glide.with(mContext)
//                .load(itemModel)
//                .into(itemHolder.ivItemPhoto);
//
//        itemHolder.ivItemPhoto.setImageResource(itemModel.getItemPhoto());
//        itemHolder.tvItemName.setText(itemModel.getItemName());
//        itemHolder.tvItemKarats.setText(itemModel.getItemKarats());
//        itemHolder.tvItemPrice.setText(itemModel.getItemPrice());
//
//        itemHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent one = new Intent(mContext, SampleDetails_1.class);
//                mContext.startActivity(one);
//            }
//        });
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return 0;
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
////    @Override
////    public View getView(int position, View convertView, ViewGroup parent) {
////
////        gridViewItemsView = View.inflate(mContext, R.layout.gridview_layout, null);
////
////
////
//////        if (convertView == null ){
//////
//////            Toast.makeText(mContext, "CONVERTVIEW IMTI", Toast.LENGTH_SHORT).show();
//////
////////            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//////
//////            gridViewItemsView = View.inflate(mContext, R.layout.gridview_layout, null);
//////
//////        } else {
//////            Toast.makeText(mContext, "ELSES!", Toast.LENGTH_SHORT).show();
//////            gridViewItemsView = convertView;
//////        }
////
////
////        Glide.with(mContext)
////                .load(gridViewItems[position])
////                .into(ivItemPhoto);
////
////        ivItemPhoto.setImageResource(gridViewItems[position]);
////        tvItemName.setText(gridViewItemNames[position]);
////        tvItemKarats.setText(gridViewItemKarats[position]);
////        tvItemPrice.setText(gridViewItemPrices[position]);
////
////
////        ivItemPhoto.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
////        ivItemPhoto.setScaleType(ImageView.ScaleType.CENTER_CROP);
////        ivItemPhoto.setPadding(8, 8, 8, 8);
////
////
//////
//////        ImageView imageView;
//////
//////        if (convertView == null) {
//////            // if it's not recycled, initialize some attributes
//////            imageView = new ImageView(mContext);
//////            imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
//////            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//////
//////            imageView.setPadding(8, 8, 8, 8);
//////        } else {
//////            imageView = (ImageView) convertView;
//////        }
////
//////        Glide.with(mContext)
//////                .load(mThumbIds[position])
//////                .into(imageView);
//////        imageView.setImageResource(mThumbIds[position]);
////
////        return gridViewItemsView;
////    }
//
//
//
//    class ItemHolder extends RecyclerView.ViewHolder{
//
//        TextView tvItemName, tvItemPrice, tvItemKarats;
//        ImageView ivItemPhoto;
//
//        public ItemHolder(@NonNull View itemView) {
//            super(itemView);
//
//            ivItemPhoto = gridViewItemsView.findViewById(R.id.ivItemPhoto);
//            tvItemName = gridViewItemsView.findViewById(R.id.tvItemName);
//            tvItemPrice = gridViewItemsView.findViewById(R.id.tvItemPrice);
//            tvItemKarats = gridViewItemsView.findViewById(R.id.tvItemKarats);
//        }
//    }
//
//    //ADD GLIDE HERE!!
//
//
//
//
////    private Integer[] mThumbIds = {
////            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
////            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1
////
////            R.drawable.ring
////
//////             R.drawable.eight,
//////                        // R.drawable.nine, R.drawable.ten,R.drawable.eleven,R.drawable.twelve,
//////             R.drawable.thirteen, R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,
//////             R.drawable.seventeen, R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty,
//////             R.drawable.twentyone, R.drawable.twentytwo,R.drawable.twentythree,R.drawable.twentyfour,
//////             R.drawable.twentyfive, R.drawable.twentysix,R.drawable.twentyseven,R.drawable.twentyeight,
//////             R.drawable.twentynine, R.drawable.thirty,R.drawable.thirtyone
////    };
//
//}
