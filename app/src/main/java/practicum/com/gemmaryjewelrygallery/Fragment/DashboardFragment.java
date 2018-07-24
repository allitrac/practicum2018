    package practicum.com.gemmaryjewelrygallery.Fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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

            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3)
                {

                    if (position == 0) {
              Toast.makeText(getActivity(), "Picture 1", Toast.LENGTH_SHORT).show();
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
