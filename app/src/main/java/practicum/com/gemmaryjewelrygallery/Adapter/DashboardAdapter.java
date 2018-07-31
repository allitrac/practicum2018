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