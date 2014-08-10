package com.example.testaddrulemethod;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
//////////////////
public class MainActivity extends Activity {
   
    private RelativeLayout relalayout;
   
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    
    
    
    
   
    private static final int ID_BTN1 = 1;
    private static final int ID_BTN2 = 2;
    private static final int ID_BTN3 = 3;
    private static final int ID_BTN4 = 4;
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       
      
        
        relalayout = new RelativeLayout(this);
        relalayout.setBackgroundColor(Color.parseColor("#3d4f65"));
       
        
        View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.single_framelayout_left_item, null);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
       
        view.setId(1);
        relalayout.addView(view, lp);
        
        
        View view2 = LayoutInflater.from(getBaseContext()).inflate(R.layout.single_framelayout_item, null);
        TextView textView2 = (TextView) view2.findViewById(R.id.single_text);
        textView2.setText("德玛西亚");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = 250;
        params.addRule(RelativeLayout.RIGHT_OF,view.getId());
//        params.addRule(RelativeLayout.CENTER_VERTICAL,RelativeLayout.TRUE);
        view2.setId(2);
        relalayout.addView(view2, params);
        
        View view3 = LayoutInflater.from(getBaseContext()).inflate(R.layout.single_framelayout_item, null);
        TextView textView3 = (TextView) view3.findViewById(R.id.single_text);
        textView3.setText("德玛西亚654654654");
        RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params3.addRule(RelativeLayout.BELOW,view2.getId());
        params3.addRule(RelativeLayout.RIGHT_OF,view.getId());
        params3.addRule(RelativeLayout.CENTER_VERTICAL,RelativeLayout.TRUE);
        relalayout.addView(view3, params3);
        
        
        View view4 = LayoutInflater.from(getBaseContext()).inflate(R.layout.single_framelayout_item, null);
        TextView textView4 = (TextView) view4.findViewById(R.id.single_text);
        textView4.setText("lalallalala");
        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params4.addRule(RelativeLayout.BELOW,view4.getId());
        params4.addRule(RelativeLayout.RIGHT_OF,view.getId());
//        params4.addRule(RelativeLayout.CENTER_VERTICAL,RelativeLayout.TRUE);
//        params4.leftMargin = 700;
        params4.topMargin = 50;
        relalayout.addView(view4, params4);
        
        View view5 = LayoutInflater.from(getBaseContext()).inflate(R.layout.single_framelayout_item, null);
        RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params4.addRule(RelativeLayout.BELOW,view4.getId());
        params5.addRule(RelativeLayout.RIGHT_OF,view.getId());
//        params4.addRule(RelativeLayout.CENTER_VERTICAL,RelativeLayout.TRUE);
//        params4.leftMargin = 700;
//        params4.addRule(RelativeLayout.CENTER_VERTICAL,RelativeLayout.TRUE);
        params5.topMargin = 80;
        relalayout.addView(view5, params5);
        
        
       /*
        btn1 = new Button(this);
        btn1.setText("button1");
        btn1.setId(ID_BTN1);
        
        RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//        lp1.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        // btn1 位于父 View 的顶部，在父 View 中水平居中
        relalayout.addView(btn1, lp1 );
       
        btn2 = new Button(this);
        btn2.setText("button2");
        btn2.setId(ID_BTN2);
       
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.LEFT_OF, ID_BTN1);
//        lp2.addRule(RelativeLayout.ALIGN_LEFT, ID_BTN1);
        // btn2 位于 btn1 的下方、其左边和 btn1 的左边对齐
        relalayout.addView(btn2, lp2);
       
        btn3 = new Button(this);
        btn3.setText("button3");
        btn3.setId(ID_BTN3);
       
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//       lp3.addRule(RelativeLayout.BELOW, ID_BTN1);
        lp3.addRule(RelativeLayout.BELOW, ID_BTN2);
        lp3.addRule(RelativeLayout.ALIGN_RIGHT, ID_BTN2);
        // btn3 位于 btn1 的下方、btn2 的右方且其右边和 btn1 的右边对齐（要扩充）
        relalayout.addView(btn3,lp3);
       
        btn4 = new Button(this);
        btn4.setText("button4");
        btn4.setId(ID_BTN4);
       
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.BELOW, ID_BTN3);
//        lp4.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        lp4.addRule(RelativeLayout.ALIGN_RIGHT, ID_BTN3);
        // btn4 位于 btn2 的下方，在父 Veiw 中水平居中
        relalayout.addView(btn4,lp4);*/
       
       
        setContentView(relalayout);
    }
}