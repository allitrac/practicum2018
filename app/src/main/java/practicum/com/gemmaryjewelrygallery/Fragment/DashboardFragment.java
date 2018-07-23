    package practicum.com.gemmaryjewelrygallery.Fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

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
            GridView gridview = (GridView) rootView.findViewById(R.id.gridview);
            gridview.setAdapter(new DashboardAdapter(getContext()));
        }
}
