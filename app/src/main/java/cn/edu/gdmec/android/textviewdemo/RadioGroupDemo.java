package cn.edu.gdmec.android.textviewdemo;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioGroupDemo extends AppCompatActivity{


    private RadioGroup rg;
    private TextView tv_content;
    private RadioButton btn_java,btn_php,btn_ios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_demo);
        rg = (RadioGroup) findViewById(R.id.rg);
        tv_content = (TextView) findViewById(R.id.content);
        btn_java = (RadioButton) findViewById(R.id.java);
        btn_php = (RadioButton) findViewById(R.id.php);
        btn_ios = (RadioButton) findViewById(R.id.ios);
        btn_java.setChecked(true);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg, @IdRes int checkedId) {
                /**
                 * rg发出事件源
                 * checkedId选中的单选按钮id
                 * */
                switch(checkedId){
                    case R.id.java:
                        tv_content.setText("你选择的是java高级编程");
                        break;
                    case R.id.php:
                        tv_content.setText("你选择的是php");
                        break;
                    case R.id.ios:
                        tv_content.setText("你选择的是ios");
                        break;
                }
//            if (btn_java.isChecked()){
//
//            }else if (btn_php.isChecked()){
//
//            }else {
//
//            }
            }
        });






    }

}
