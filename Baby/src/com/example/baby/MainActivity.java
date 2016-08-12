package com.example.baby;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.method.Homepage_Fragment;

public class MainActivity extends FragmentActivity{
	RadioGroup radiogroup;
	FrameLayout framelayout;
	FragmentManager manager;
	Homepage_Fragment homepage;
	Note_Fragment note;
	Mine_Fragment mine;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub

	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.main);
	radiogroup=(RadioGroup)findViewById(R.id.radiogroup);
	framelayout=(FrameLayout)findViewById(R.id.framelayout);
	homepage=new Homepage_Fragment();
	note=new Note_Fragment();
	mine=new Mine_Fragment();
	manager=getSupportFragmentManager();
	FragmentTransaction transaction=manager.beginTransaction();
	transaction.add(R.id.framelayout, homepage);
transaction.show(homepage);
transaction.commit();
RadioButton radiobutton=(RadioButton) radiogroup.getChildAt(0);
radiobutton.setChecked(true);
radiogroup .setOnCheckedChangeListener(checkchange);
}
OnCheckedChangeListener checkchange=new OnCheckedChangeListener() {
	
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		FragmentTransaction ft=	manager.beginTransaction();
		switch (checkedId) {
		case R.id.shuoye_view:
			ft.replace(R.id.framelayout, homepage);
			ft.commit();
			break;

		case R.id.biji_view:
			ft.replace(R.id.framelayout, note);
			ft.commit();
			break;
		case R.id.wode_view:
			ft.replace(R.id.framelayout, mine);
			ft.commit();
			break;
		}
		
	}
};
}
