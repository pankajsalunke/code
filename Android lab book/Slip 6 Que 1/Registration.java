import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editTextUsername, editTextEmail, editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        String username = editTextUsername.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            // Perform registration logic here
            // For demonstration purposes, we'll just display the entered details
            String message = "Registration successful!\nUsername: " + username + "\nEmail: " + email + "\nPassword: " + password;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
}
