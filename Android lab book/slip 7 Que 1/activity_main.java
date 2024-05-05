import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button buttonShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowToast = findViewById(R.id.buttonShowToast);

        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }

    private void showToast() {
        // Display a toast message
        Toast.makeText(MainActivity.this, "Hello, this is a Toast message", Toast.LENGTH_SHORT).show();
    }
}
