package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Text_shouye extends Activity{
	TextView shouye;
	TextView biji;
	TextView wode;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhuye_1);
		shouye = (TextView) findViewById(R.id.shuoye_view);
		shouye.setOnClickListener(l);
		biji = (TextView) findViewById(R.id.biji_view);
		biji.setOnClickListener(l);
		
	}
	OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.shuoye_view:
				Intent  intent1=new Intent(Text_shouye.this,Zhuye_xf.class);
				  startActivity(intent1);
			break;
			case R.id.biji_view:
				Intent intent=new Intent(Text_shouye.this,Xiangcehuiyi_Activity.class);
				startActivity(intent);
				break;
			}
		}
		
		
	};
}

