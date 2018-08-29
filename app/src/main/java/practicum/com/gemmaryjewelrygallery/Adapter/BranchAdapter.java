package practicum.com.gemmaryjewelrygallery.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import practicum.com.gemmaryjewelrygallery.Holder.BranchHolder;
import practicum.com.gemmaryjewelrygallery.MainActivity;
import practicum.com.gemmaryjewelrygallery.Object.Branch;
import practicum.com.gemmaryjewelrygallery.R;

public class BranchAdapter extends RecyclerView.Adapter<BranchHolder> {

    private ArrayList<Branch> branches;
    Branch branch;
    private Context mContext;


    public BranchAdapter(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public BranchAdapter(Context context, ArrayList<Branch> branches1){
        this.mContext = context;
        this.branches = branches1;
    }

    @NonNull
    @Override
    public BranchHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.branch_holder, viewGroup, false);
        BranchHolder branchHolder = new BranchHolder(view, mContext, branches);

        return branchHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BranchHolder branchHolder, int i) {

        branch = branches.get(i);

        branchHolder.branchName.setText(branch.getBranchName());
        branchHolder.branchProvince.setText(branch.getBranchProvince());
        branchHolder.branchAddress.setText(branch.getBranchAddress());

        branchHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //pass the 'context' here
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
                alertDialog.setTitle("Location");
                alertDialog.setMessage("Final preferred location?");


                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "Congratulations it is now reserved under your name and we'll bring the item to your preferred location. \n Thank you!", Toast.LENGTH_LONG).show();
                        Intent intentToDashboardActivity = new Intent(mContext, MainActivity.class);
                        mContext.startActivity(intentToDashboardActivity);
                    }
                });


                alertDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // DO SOMETHING HERE
                        dialog.cancel();
                        Toast.makeText(mContext, "Please choose your preferred location. \n Thank you!", Toast.LENGTH_LONG).show();

                    }
                });

                AlertDialog dialog = alertDialog.create();
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return branches.size();
    }

    public void filterLocation(ArrayList<Branch> branches) {
            this.branches = branches;
            notifyDataSetChanged();
    }
}
