package com.example.baby;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_youjiyidemoshi extends Activity{
	private Button btn;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_youjiyidemoshi);
	btn=(Button)findViewById(R.id.btn_back2);
	btn.setOnClickListener(onClickListener);
}
OnClickListener onClickListener=new OnClickListener() {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(Activity_youjiyidemoshi.this,Note_Fragment.class);
		startActivity(intent);
	}

	
	
	
};
}
