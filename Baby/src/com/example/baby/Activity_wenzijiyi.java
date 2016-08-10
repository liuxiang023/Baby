package com.example.yueryoudao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Activity_wenzijiyi extends Activity {
	private ImageButton btn,btn3,btn4;
	private Button btn2;
	private ListView list;
	private List<Map<String,Object>> Data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wenzijiyi);
		btn=(ImageButton)findViewById(R.id.btn_wenzihuiyi);
		btn2=(Button)findViewById(R.id.btn_addtext);
		btn3=(ImageButton)findViewById(R.id.btn_diyhuiyi);
		btn4=(ImageButton)findViewById(R.id.btn_xiangce);
		list=(ListView)findViewById(R.layout.listview_mian);
		MyBaseAdapter adapter=new MyBaseAdapter(this,Data);
		/*list.setAdapter(adapter);
		String[] text =new String[]{"textview","textview2","textview3","textview4","textview5","textview6","textview7","textview8","textview9"};
		int[] itemid=new int[]{R.id.textview_title,R.id.btn_wenzihuiyi,R.id.btn_diyhuiyi,R.id.btn_wenzihuiyi,R.id.textview_contain,R.id.textview_contain2,R.id.textview_contain3,
				R.id.text,R.id.text2,R.id.textview_bottom1,R.id.textview_bottom2,R.id.textview_bottom3};
		Data=getData();*/
		btn2.setOnClickListener(onClickListener);
		btn3.setOnClickListener(onClickListener);
		btn4.setOnClickListener(onClickListener);
		
	}
	private List< Map<String, Object>> getData() {
		List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("textview", "育儿笔记");
		map.put("textview2", "文字回忆");
		map.put("textview3", "个性DIY回忆");
		map.put("textview4", "相册回忆");
		map.put("textview5", "还没有添加任何文字回忆");
		map.put("textview6", "点击下方添加吧！");
		map.put("textview7", "首页");
		map.put("textview8", "育儿笔记");
		map.put("textview9", "我的");
		
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
				holder.textview6=(TextView)convertView.findViewById(R.id.text2);
				holder.textview7=(TextView)convertView.findViewById(R.id.textview_bottom1);
				holder.textview8=(TextView)convertView.findViewById(R.id.textview_bottom2);
				holder.textview9=(TextView)convertView.findViewById(R.id.textview_bottom3);
				holder.button=(Button)convertView.findViewById(R.id.btn_edit);
				holder.button=(Button)convertView.findViewById(R.id.btn_addtext);
				holder.btn=(ImageButton)convertView.findViewById(R.id.btn_back);
				holder.btn2=(ImageButton)convertView.findViewById(R.id.btn_wenzihuiyi);
				holder.btn3=(ImageButton)convertView.findViewById(R.id.btn_diyhuiyi);
				holder.btn4=(ImageButton)convertView.findViewById(R.id.btn_xiangce);
				holder.btn5=(ImageButton)convertView.findViewById(R.id.btn_shouye);
				holder.btn6=(ImageButton)convertView.findViewById(R.id.btn_yuerbiji);
				holder.btn7=(ImageButton)convertView.findViewById(R.id.btn_mine);
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
			switch(v.getId()){
			case R.id.btn_addtext:
				Intent intent =new Intent( Activity_wenzijiyi.this,Activity_fabiaojiyi.class);
				startActivity(intent);
				break;
			case R.id.btn_diyhuiyi:
				Intent intent2 =new Intent( Activity_wenzijiyi.this,Activity_xiangcehuiyi.class);	
				startActivity(intent2);
				break;
			case R.id.btn_xiangce:
				Intent intent3 =new Intent( Activity_wenzijiyi.this,Activity_gexingdiy.class);	
				startActivity(intent3);
			}
		}
	};
}
