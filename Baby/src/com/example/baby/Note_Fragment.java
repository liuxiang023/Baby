package com.example.baby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Note_Fragment extends Fragment {
	private ImageButton btn,btn3,btn4;
	private Button btn2;
	private ListView list;
	private List<Map<String,Object>> Data;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view=inflater.inflate(R.layout.activity_wenzijiyi, null);
	
	btn=(ImageButton)view.findViewById(R.id.btn_wenzihuiyi);
	btn3=(ImageButton)view.findViewById(R.id.btn_diyhuiyi);
	btn4=(ImageButton)view.findViewById(R.id.btn_xiangce);
		btn.setOnClickListener(onClickListener);
		btn3.setOnClickListener(onClickListener);
		btn4.setOnClickListener(onClickListener);
		return view;
		
	};
	private List< Map<String, Object>> getData() {
		List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("textview", "鑲插効绗旇");
		map.put("textview2", "鏂囧瓧鍥炲繂");
		map.put("textview3", "涓�IY鍥炲繂");
		map.put("textview4", "鐩稿唽鍥炲繂");
		map.put("textview5", "杩樻病鏈夋坊鍔犱换浣曟枃瀛楀洖蹇�");
		map.put("textview6", "鐐瑰嚮涓嬫柟娣诲姞鍚э紒");
		map.put("textview7", "棣栭〉");
		map.put("textview8", "鑲插効绗旇");
		map.put("textview9", "鎴戠殑");
		
		lists.add(map);
		return lists;
	}
	public class MyBaseAdapter extends BaseAdapter {
		List<Map<String, Object>> Data;
		Context context;
		LayoutInflater layoutInflater;
		public MyBaseAdapter(Context context, List<Map<String, Object>> Data2) {
			this.context=context;
			this.Data=Data2;
			layoutInflater=LayoutInflater.from(context);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return Data.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			if(convertView==null||	convertView.getTag()==null){
				convertView=layoutInflater.inflate(R.layout.activity_wenzijiyi, null);
				holder=new ViewHolder();
				holder.textview=(TextView)convertView.findViewById(R.id.textview_title);
				holder.textview2=(TextView)convertView.findViewById(R.id.textview_contain);
				holder.textview3=(TextView)convertView.findViewById(R.id.textview_contain2);
				holder.textview4=(TextView)convertView.findViewById(R.id.textview_contain3);
				holder.textview5=(TextView)convertView.findViewById(R.id.text);

				holder.button=(Button)convertView.findViewById(R.id.btn_edit);
				holder.button=(Button)convertView.findViewById(R.id.btn_addtext);
				holder.btn=(ImageButton)convertView.findViewById(R.id.btn_back);
				holder.btn2=(ImageButton)convertView.findViewById(R.id.btn_wenzihuiyi);
				holder.btn3=(ImageButton)convertView.findViewById(R.id.btn_diyhuiyi);
				holder.btn4=(ImageButton)convertView.findViewById(R.id.btn_xiangce);
		
				convertView.setTag(holder);
			}
			holder =(ViewHolder)convertView.getTag();
			holder.textview.setText(Data.get(position).get("textview").toString());
			holder.textview2.setText(Data.get(position).get("textview2").toString());
			holder.textview3.setText(Data.get(position).get("textview3").toString());
			holder.textview4.setText(Data.get(position).get("textview4").toString());
			holder.textview5.setText(Data.get(position).get("textview5").toString());
			holder.textview6.setText(Data.get(position).get("textview6").toString());
			holder.textview7.setText(Data.get(position).get("textview7").toString());
			holder.textview8.setText(Data.get(position).get("textview8").toString());
			holder.textview9.setText(Data.get(position).get("textview9").toString());
			holder.button.setTag(position);
			holder.button2.setTag(position);
			holder.btn.setTag(position);
			holder.btn2.setTag(position);
			holder.btn3.setTag(position);
			holder.btn4.setTag(position);
			holder.btn5.setTag(position);
			holder.btn6.setTag(position);
			holder.btn7.setTag(position);
			return convertView;
		}
		

	}
	class ViewHolder{
		
		TextView textview,textview2,textview3,textview4,textview5,textview6,textview7,textview8,textview9;
		Button button,button2;
		ImageButton btn,btn2,btn3,btn4,btn5,btn6,btn7;
		
	}



	OnClickListener onClickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.btn_wenzihuiyi:
				Intent intent =new Intent( getActivity(),Activity_fabiaojiyi.class);
				startActivity(intent);
				break;
			case R.id.btn_diyhuiyi:
				Intent intent2 =new Intent( getActivity(),Activity_xiangcehuiyi.class);	
				startActivity(intent2);
				break;
			case R.id.btn_xiangce:
				Intent intent3 =new Intent(getActivity(),Activity_gexingdiy.class);	
				startActivity(intent3);
			}
		}
	};
}
