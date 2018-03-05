package cn.edu.gdmec.android.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    private EditText et_user;
    private EditText et_password;
    private Button btn_ok;
    private Button btn_cancel;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_user = (EditText) findViewById(R.id.et_user);
        et_password = (EditText) findViewById(R.id.et_passworld);
        btn_ok = (Button) findViewById(R.id.ok);
        btn_cancel = (Button) findViewById(R.id.cancel);

        result = (TextView) findViewById(R.id.result);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=et_user.getText().toString();
                String password = et_password.getText().toString();

                result.setText("Your userName is"+user+",your password is"+password);


            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_password.setText("");
                et_user.setText("");
                result.setText("");
            }
        });
    }
}
