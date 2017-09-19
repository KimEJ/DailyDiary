package dsm.dailydiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

public class WriteActivity extends AppCompatActivity {
    TextView textView;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        textView = (TextView) findViewById(R.id.title);
        textView.setText("write");
        imageButton = (ImageButton) findViewById(R.id.search);
        imageButton.setBackground(null);
        imageButton.setImageResource(R.drawable.check);

    }
}
