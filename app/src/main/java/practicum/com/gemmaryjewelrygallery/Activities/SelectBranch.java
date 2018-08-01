package practicum.com.gemmaryjewelrygallery.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import practicum.com.gemmaryjewelrygallery.Adapter.BranchAdapter;
import practicum.com.gemmaryjewelrygallery.Object.Branch;
import practicum.com.gemmaryjewelrygallery.R;
import practicum.com.gemmaryjewelrygallery.SampleDatas.ListOfBranches;

public class SelectBranch extends AppCompatActivity {


    private RecyclerView branchRecyclerView;
    private BranchAdapter branchAdapter;
    private LinearLayoutManager branchLinLayManager;

    public EditText etSearchLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_branch);


        branchRecyclerView = findViewById(R.id.rvBranches);

        branchLinLayManager = new LinearLayoutManager(this);
        branchRecyclerView.setLayoutManager(branchLinLayManager);
        branchRecyclerView.setItemAnimator(new DefaultItemAnimator());

        branchAdapter = new BranchAdapter(this, ListOfBranches.getBranches());
        branchRecyclerView.setAdapter(branchAdapter);

        etSearchLocation = findViewById(R.id.etSearchLocation);
        etSearchLocation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filterLocation(editable.toString());
            }
        });

    }

    private void filterLocation(String s) {
        ArrayList<Branch> branches = new ArrayList<>();

        for (Branch branch : ListOfBranches.getBranches()){
            if (branch.getBranchAddress().toLowerCase().contains(s.toLowerCase())) {
                branches.add(branch);
            }
        }

        branchAdapter.filterLocation(branches);
    }
}
