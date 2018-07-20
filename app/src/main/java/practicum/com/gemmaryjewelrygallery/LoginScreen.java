package practicum.com.gemmaryjewelrygallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_screen);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    public void Registration(View view) {
        Toast.makeText(this, "PAREHISTRO KO BAI!", Toast.LENGTH_SHORT).show();
        Intent toRegisterScreen = new Intent(LoginScreen.this, RegisterScreen.class);
        startActivity(toRegisterScreen);
    }

    public void Login(View view) {
        Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
        Intent toMainScreen = new Intent(LoginScreen.this, MainActivity.class);
        startActivity(toMainScreen);
    }
}
