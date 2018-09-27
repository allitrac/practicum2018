package practicum.com.gemmaryjewelrygallery.Fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import practicum.com.gemmaryjewelrygallery.Activities.SampleDetails_1;
import practicum.com.gemmaryjewelrygallery.Adapter.DashboardAdapter;
import practicum.com.gemmaryjewelrygallery.R;

public class DashboardFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_dashboard_fragment, container, false);

        findViews();


        return rootView;
    }

    public void findViews(){

        final GridView gridview = rootView.findViewById(R.id.gridview);

        final DashboardAdapter gridViewAdapter = new DashboardAdapter(getContext());
        gridview.setAdapter(gridViewAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent one = new Intent(getContext(), SampleDetails_1.class);
                one.putExtra("itemClickedPosition", Integer.toString(position));
                startActivity(one);
            }
        });
    }
}
