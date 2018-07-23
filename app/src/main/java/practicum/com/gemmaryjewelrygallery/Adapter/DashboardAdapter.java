package practicum.com.gemmaryjewelrygallery.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import practicum.com.gemmaryjewelrygallery.R;

public class DashboardAdapter extends BaseAdapter {

    private Context mContext;

    public DashboardAdapter(Context c) {
        mContext = c;

    }

    public DashboardAdapter(Context mContext, Integer[] mThumbIds) {
        this.mContext = mContext;
        this.mThumbIds = mThumbIds;
    }

    @Override
    public int getCount() {

        return mThumbIds.length;

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
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    private Integer[] mThumbIds = {
            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
            R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1

//            R.drawable.ring

            // R.drawable.eight,
            //            // R.drawable.nine, R.drawable.ten,R.drawable.eleven,R.drawable.twelve,
            // R.drawable.thirteen, R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,
            // R.drawable.seventeen, R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty,
            // R.drawable.twentyone, R.drawable.twentytwo,R.drawable.twentythree,R.drawable.twentyfour,
            // R.drawable.twentyfive, R.drawable.twentysix,R.drawable.twentyseven,R.drawable.twentyeight,
            // R.drawable.twentynine, R.drawable.thirty,R.drawable.thirtyone

    };

}
