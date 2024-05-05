import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity {

    private ImageSwitcher imageSwitcher;
    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3}; // Add your image resource IDs here
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });

        imageSwitcher.setImageResource(images[currentIndex]);

        imageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % images.length;
                imageSwitcher.setImageResource(images[currentIndex]);
            }
        });
    }
}
