package practicum.com.gemmaryjewelrygallery.Fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.AdapterListUpdateCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import practicum.com.gemmaryjewelrygallery.Activities.SampleDetails_1;
import practicum.com.gemmaryjewelrygallery.Adapter.DashboardAdapter;
import practicum.com.gemmaryjewelrygallery.R;

public class DashboardFragment extends Fragment {

    private View rootView;

//        int[] gridViewItems = {
//                R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
//                R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
//                R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
//                R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1,
//                R.drawable.diamond_1, R.drawable.diamond_2,R.drawable.necklace_2,R.drawable.pearl_1
//        };
//
//        String[] gridViewItemNames = {
//                "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
//                "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
//                "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
//                "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1",
//                "Diamond 1", "Diamond 2", "Necklace 2", "Pearl 1"
//        };
//
//        String[] gridViewItemKarats = {
//                "1", "2", "24", "18",
//                "1", "2", "24", "18",
//                "1", "2", "24", "18",
//                "1", "2", "24", "18",
//                "1", "2", "24", "18",
//        };
//
//        String[] gridViewItemPrices = {
//                "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
//                "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
//                "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
//                "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77",
//                "164, 257.94", "269, 852.33", "65, 307.68", "108, 007.77"
//        };

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_dashboard_fragment, container, false);

        findViews();


        return rootView;
    }

    public void findViews(){

        GridView gridview = rootView.findViewById(R.id.gridview);

        gridview.setAdapter(new DashboardAdapter(getContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0) {
                    Toast.makeText(getActivity(), "Picture 1", Toast.LENGTH_SHORT).show();

                    Intent one = new Intent(getContext(), SampleDetails_1.class);
                    startActivity(one);
                }
                else if(position == 1){
                    Toast.makeText(getActivity(), "Picture 2", Toast.LENGTH_SHORT).show();
                }
                else if(position == 2){
                    Toast.makeText(getActivity(), "Picture 3", Toast.LENGTH_SHORT).show();
                }
                else if(position == 3){
                    Toast.makeText(getActivity(), "Picure 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
