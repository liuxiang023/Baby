package com.example.baby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Mine_Fragment extends Fragment{
	ImageView imageView;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View view=inflater.inflate(R.layout.my_page_yuli, null);
	imageView=(ImageView)view. findViewById(R.id.user_image_btn);
	imageView.setOnClickListener(clickListener);
	return view;


}


OnClickListener clickListener=new OnClickListener() {

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent intent=new Intent(getActivity(), PersonalMessage.class);
	startActivity(intent);
	
}
};
}
