package com.example.baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class LiaoTianActivity extends Activity{
	ImageButton imagebutton;
	protected void onCreate(Bundle bundle){
	super.onCreate(bundle);
	setContentView(R.layout.consult_layout);
	imagebutton=(ImageButton)findViewById(R.id.back_button);
	imagebutton.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(LiaoTianActivity.this,TalkingAboutActivity.class);
			startActivity(intent);
		}};
}
