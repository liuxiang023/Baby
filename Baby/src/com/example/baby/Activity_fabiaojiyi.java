package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_fabiaojiyi extends Activity {
	private Button btn,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fabiaojiyi);
	/*	btn=(Button)findViewById(R.id.btn_save);
		btn2=(Button)findViewById(R.id.btn_back);
		btn.setOnClickListener(onClickListener);
		btn2.setOnClickListener(onClickListener);*/
		
	}
	OnClickListener onClickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			case R.id.btn_save:
			Intent intent =new Intent( Activity_fabiaojiyi.this,Activity_youjiyidemoshi.class);
			startActivity(intent);
			break;
			case R.id.btn_back:
				Intent intent2 =new Intent( Activity_fabiaojiyi.this,Note_Fragment.class);
				startActivity(intent2);
				break;
				default:
					break;
			}
			
			
		}
	};

}
