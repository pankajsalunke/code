import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView imageView;
    private Button buttonChangeImage;
    private int currentImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        buttonChangeImage = findViewById(R.id.buttonChangeImage);

        buttonChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });
    }

    private void changeImage() {
        if (currentImage == 1) {
            imageView.setImageResource(R.drawable.image2);
            currentImage = 2;
        } else {
            imageView.setImageResource(R.drawable.image1);
            currentImage = 1;
        }
    }
}
