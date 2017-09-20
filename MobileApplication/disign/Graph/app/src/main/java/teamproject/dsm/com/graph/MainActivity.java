package teamproject.dsm.com.graph;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private  void initSegmentbuttons(){
        buttonList = new ArrayList<>();

        Button btnWeek = (Button) findViewById(R.id.buttonWeek);
        Button btn1Month = (Button) findViewById(R.id.button1Month);
        Button btn3Month = (Button) findViewById(R.id.button3Month);
        Button btn6Month = (Button) findViewById(R.id.button6Month);

        btnWeek.setOnClickListener(this);
        btn1Month.setOnClickListener(this);
        btn3Month.setOnClickListener(this);
        btn6Month.setOnClickListener(this);

        buttonList.add(btnWeek);
        buttonList.add(btn1Month);
        buttonList.add(btn3Month);
        buttonList.add(btn6Month);
    }


    //SegmentedGroup 각각 클릭했을 때
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonWeek:
                (iOneWeek);
                //LineChartSet(iOneWeek);
                break;

            case R.id.button1Month:
                BarChartSet(iOneMonth);
                //LineChartSet(iOneMonth);
                break;

            case R.id.button3Month:
                BarChartSet(i3Month);
                //LineChartSet(i3Month);
                break;

            case R.id.button6Month:
                BarChartSet(i6Month);
                //LineChartSet(i6Month);
                break;


        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
        switch (i){
            case R.id.buttonWeek:
                break;

            case R.id.button1Month:
                break;

            case R.id.button3Month:
                break;

            case R.id.button6Month:
                break;


        }
    }
}
