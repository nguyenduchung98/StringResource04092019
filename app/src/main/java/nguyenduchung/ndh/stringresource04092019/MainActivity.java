package nguyenduchung.ndh.stringresource04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tinhtoan();
    }

    private void tinhtoan() {
        Toast.makeText(this, "Show toast", Toast.LENGTH_SHORT).show();
    }
}
