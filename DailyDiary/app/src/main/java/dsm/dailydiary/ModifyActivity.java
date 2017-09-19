package dsm.dailydiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

public class ModifyActivity extends AppCompatActivity {
    ImageButton imageButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);
        imageButton = (ImageButton) findViewById(R.id.search);
        imageButton.setBackground(null);
        imageButton.setImageResource(R.drawable.pencil_edit_button);
        textView = (TextView) findViewById(R.id.title);
        textView.setText("Modify");
    }
}
