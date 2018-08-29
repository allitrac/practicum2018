package practicum.com.gemmaryjewelrygallery.Activities;

import android.animation.Animator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import practicum.com.gemmaryjewelrygallery.Adapter.DashboardAdapter;
import practicum.com.gemmaryjewelrygallery.R;

public class SampleDetails_1 extends AppCompatActivity {
    FloatingActionButton fab, fab1, fab2, fab3;
    LinearLayout fabLayout1, fabLayout2, fabLayout3;
    View fabBGLayout;
    ImageView ivThumbnail;
    TextView tvItemTitle, tvItemPrice, tvItemKarats;
    boolean isFABOpen=false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_sample_details_1);

      Intent getDataIntent = getIntent();
      int itemClickedPosition = Integer.parseInt(getDataIntent.getStringExtra("itemClickedPosition"));
//      Toast.makeText(this, "Item Clicked Position: " + itemClickedPosition + "\n This is for displaying the datas of the clicked item (Unfinished).", Toast.LENGTH_SHORT).show();

        DashboardAdapter dashboardAdapter = new DashboardAdapter(this);

        ivThumbnail = findViewById(R.id.thumbnail);
        ivThumbnail.setImageResource(dashboardAdapter.gridViewItems[itemClickedPosition]);

        tvItemTitle = findViewById(R.id.itemTitle);
        tvItemTitle.setText(dashboardAdapter.gridViewItemNames[itemClickedPosition]);

        tvItemPrice = findViewById(R.id.price);
        tvItemPrice.setText(dashboardAdapter.gridViewItemPrices[itemClickedPosition]);

        tvItemKarats = findViewById(R.id.karats);
        tvItemKarats.setText(dashboardAdapter.gridViewItemKarats[itemClickedPosition]);

        fabLayout1=  findViewById(R.id.fabLayout1);
        fabLayout2=  findViewById(R.id.fabLayout2);
        fabLayout3=  findViewById(R.id.fabLayout3);
        fab =  findViewById(R.id.fab);
        fab1 =  findViewById(R.id.fab1);
        fab2=  findViewById(R.id.fab2);
        fab3 =  findViewById(R.id.fab3);
        fabBGLayout=findViewById(R.id.fabBGLayout);

        ivThumbnail = findViewById(R.id.thumbnail);
        tvItemTitle = findViewById(R.id.itemTitle);
        tvItemPrice = findViewById(R.id.price);
        tvItemKarats = findViewById(R.id.karats);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isFABOpen){
                    showFABMenu();
                }else{
                    closeFABMenu();
                }
            }
        });

        fabBGLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeFABMenu();
            }
        });

        fabLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Congratulations it is now reserved under your name.", Toast.LENGTH_SHORT).show();
                Intent selectBranch = new Intent(SampleDetails_1.this, SelectBranch.class);
                startActivity(selectBranch);
            }
        });
    }

    private void showFABMenu(){
        isFABOpen=true;
        fabLayout1.setVisibility(View.VISIBLE);
        fabLayout2.setVisibility(View.VISIBLE);
        fabLayout3.setVisibility(View.VISIBLE);
        fabBGLayout.setVisibility(View.VISIBLE);

        fab.animate().rotationBy(180);
        fabLayout1.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        fabLayout2.animate().translationY(-getResources().getDimension(R.dimen.standard_100));
        fabLayout3.animate().translationY(-getResources().getDimension(R.dimen.standard_145));
    }

    private void closeFABMenu(){
        isFABOpen=false;
        fabBGLayout.setVisibility(View.GONE);
        fab.animate().rotationBy(-180);
        fabLayout1.animate().translationY(0);
        fabLayout2.animate().translationY(0);
        fabLayout3.animate().translationY(0).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if(!isFABOpen){
                    fabLayout1.setVisibility(View.GONE);
                    fabLayout2.setVisibility(View.GONE);
                    fabLayout3.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        if(isFABOpen){
            closeFABMenu();
        }else{
            super.onBackPressed();
        }
    }
}