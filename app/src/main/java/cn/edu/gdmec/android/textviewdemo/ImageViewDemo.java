package cn.edu.gdmec.android.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewDemo extends AppCompatActivity implements View.OnClickListener{

    private Button btn_next;
    private ImageView image1;
    //声明数组，存储资源
    private int ImageIds[] = {R.drawable.o,R.drawable.a,R.drawable.b};
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_demo);
        btn_next = (Button) findViewById(R.id.next);
        image1 = (ImageView) findViewById(R.id.image1);

        btn_next.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        index++;
        if (index>ImageIds.length-1){
            index=0;
        }
        image1.setImageResource(ImageIds[index]);


    }
}
