package practicum.com.gemmaryjewelrygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import practicum.com.gemmaryjewelrygallery.Adapter.DashboardAdapter;
import practicum.com.gemmaryjewelrygallery.Fragment.DashboardFragment;

public class RegisterScreen extends AppCompatActivity {

    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register_screen);

        reg = findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDashboard = new Intent(getApplication(), MainActivity.class);
                startActivity(toDashboard);
            }
        });
    }
}
