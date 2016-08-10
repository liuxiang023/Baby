package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;



public class Zhuye_xf extends Activity{
	TextView shouye;
	TextView biji;
	TextView wode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhuye);
		biji = (TextView) findViewById(R.id.biji_view);
		biji.setOnClickListener(l);
		wode = (TextView) findViewById(R.id.wode_view);
		wode.setOnClickListener(l);
	}
	OnClickListener l = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
            case R.id.biji_view:
				Intent intent=new Intent(Zhuye_xf.this,Xiangcehuiyi_Activity.class);
				startActivity(intent);
				break;
			case R.id.wode_view:
				Intent intent1=new Intent(Zhuye_xf.this,Text_shouye.class);
				startActivity(intent1);
			break;
			
			}
		}
		
	};
}
