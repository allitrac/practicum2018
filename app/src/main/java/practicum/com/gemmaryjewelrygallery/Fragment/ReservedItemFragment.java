package practicum.com.gemmaryjewelrygallery.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import practicum.com.gemmaryjewelrygallery.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ReservedItemFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class ReservedItemFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private RelativeLayout relLayItemDetails;
    private Button btnItemDetails;
    private ScrollView scrollViewItems;

    private boolean itemDetailsIsOpen = false;

    public ReservedItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_reserved_item, container, false);

        final int icUp = R.drawable.ic_keyboard_arrow_up_red_24dp;
        final int icDown = R.drawable.ic_keyboard_arrow_down_red_24dp;

        btnItemDetails = v.findViewById(R.id.btnItemDetails);
        relLayItemDetails = v.findViewById(R.id.relLayItemDetails);

        scrollViewItems = v.findViewById(R.id.scrollViewDetails);
//        scrollViewItems.scrollTo(0,0);

        final int scrollToRelLayItemDetails = relLayItemDetails.getBottom();


        btnItemDetails.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemDetailsIsOpen == false){

                    relLayItemDetails.setVisibility(View.VISIBLE);

                    scrollViewItems.post(new Runnable() {
                        @Override
                        public void run() {
                            scrollViewItems.smoothScrollTo(scrollToRelLayItemDetails, 0);
                        }
                    });


                    btnItemDetails.setCompoundDrawablesWithIntrinsicBounds(0, 0, icUp, 0);

                    itemDetailsIsOpen = true;

                } else {

                    relLayItemDetails.setVisibility(View.GONE);

                    btnItemDetails.setCompoundDrawablesWithIntrinsicBounds(0, 0, icDown, 0);

                    itemDetailsIsOpen = false;

                }
            }
        });
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
