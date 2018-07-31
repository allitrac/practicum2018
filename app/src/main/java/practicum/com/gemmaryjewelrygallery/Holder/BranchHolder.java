package practicum.com.gemmaryjewelrygallery.Holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import practicum.com.gemmaryjewelrygallery.Object.Branch;
import practicum.com.gemmaryjewelrygallery.R;

public class BranchHolder extends RecyclerView.ViewHolder {

    public TextView branchName, branchProvince, branchAddress;
    ArrayList<Branch> branch;
    Context context;


    public BranchHolder(@NonNull View itemView, Context context, ArrayList<Branch> branch) {
        super(itemView);

        this.context = context;
        this.branch = branch;

        branchName = itemView.findViewById(R.id.tvBranchName);
        branchProvince = itemView.findViewById(R.id.tvBranchProvince);
        branchAddress = itemView.findViewById(R.id.tvBranchAddress);

    }
}
