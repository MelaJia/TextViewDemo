package cn.edu.gdmec.android.textviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private CheckBox s_java,s_php,s_ios;
    private TextView tv_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        s_java= (CheckBox) findViewById(R.id.s_java);
        s_php= (CheckBox) findViewById(R.id.s_php);
        s_ios= (CheckBox) findViewById(R.id.s_ios);

        tv_choice= (TextView) findViewById(R.id.choice);

        s_java.setChecked(true);
        s_java.setOnCheckedChangeListener(this);
        s_php.setOnCheckedChangeListener(this);
        s_ios.setOnCheckedChangeListener(this);

    }
    /**
     * 内部类
     * compoundButton发出事件的源
     * */

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//        if (compoundButton==s_java){
//            Log.i("TEST", "onCheckedChanged: ");
//        }
        switch (compoundButton.getId()){
            case R.id.s_java:
                Log.i("TEST","JAVA:"+isChecked);
                break;
            case R.id.s_php:
                break;
            case R.id.s_ios:
                break;

        }


    }
}
