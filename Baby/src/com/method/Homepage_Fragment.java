package com.method;

import homepage_adapter.Data;
import homepage_adapter.MyExpandableListAdapter;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baby.GuanFangActivity;
import com.example.baby.LiaoTianActivity;
import com.example.baby.R;
import com.example.baby.SearchActivity;
import com.example.baby.TalkingAboutActivity;
public class Homepage_Fragment extends Fragment {
	ImageView homeSearchBtn;
	TextView  recommended,topic,experts;
ExpandableListView expandableView;
String[] titles={"育儿成长","育儿课堂","附近热聊","育儿小助手","亲子旅游","幼儿健康小助手"};
int[] icons={R.drawable.icon_parenting_growth,R.drawable.icon_parent_class,R.drawable.icon_near_hot_chat,
		R.drawable.icon_parent_little_helper,R.drawable.icon_parent_child_travel,R.drawable.icon_children_little_helper};
String grouptitle;     //缁勭殑鏍囬   
int group_icon;       //缁勭殑鍥剧墖
ArrayList<String> groupup_sort;   //鑲插効鎴愰暱鍒嗙粍鐨勬枃瀛�
ArrayList<String> groupup_game_lable;       //鑲插効鎴愰暱濞变箰绫绘枃瀛�
ArrayList<Integer> groupup_game_icon;     //鑲插効鎴愰暱濞变箰绫荤殑鍥剧墖
ArrayList<String> groupup_primary_lable;    //鑲插効鎴愰暱鍚开绫绘枃瀛�
ArrayList<Integer> groupup_primary_icon;  //鑲插効鎴愰暱鍚开绫荤殑鍥剧墖
ArrayList<String> groupup_interact_lable;   //鑲插効鎴愰暱浜掑姩绫绘枃瀛�
ArrayList<Integer> groupup_interact_icon; //鑲插効鎴愰暱浜掑姩绫荤殑鍥剧墖
ArrayList<Integer> chat_icon; //闄勮繎鐑亰鐨勫浘鐗�
ArrayList<String> chat_title;    //闄勮繎鐑亰鐨勬爣棰�
ArrayList<String> chat_question; //闄勮繎鐑亰鐨勯棶棰�
ArrayList<String> chat_answer;  //闄勮繎鐑亰鐨勫洖绛�
ArrayList<Integer> assistant_icon; //鑲插効灏忓姪鎵嬬殑鍥剧墖
ArrayList<Integer> assistant_bg;   //鑲插効灏忓姪鎵嬬殑鑳屾櫙棰滆壊
ArrayList<String> health_lable;   //鍋ュ悍灏忓姪鎵嬬殑鏂囧瓧
ArrayList<Integer> health_icon; //鍋ュ悍灏忓姪鎵嬬殑鍥剧墖
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View  view=inflater.inflate(R.layout.homepage, null);
			expandableView=(ExpandableListView)view.findViewById(R.id.expandlable_listview);
			recommended=(TextView)view.findViewById(R.id.tv_recommended);
			topic=(TextView)view.findViewById(R.id.tv_topic);
			experts=(TextView)view.findViewById(R.id.tv_experts);
			homeSearchBtn=(ImageView) view.findViewById(R.id.home_search_btn);
			homeSearchBtn.setOnClickListener(listener);
			groupup_sort=new ArrayList<String>();
			groupup_game_icon=new ArrayList<Integer>();
			groupup_game_lable=new ArrayList<String>();
			groupup_primary_icon=new ArrayList<Integer>();
			groupup_primary_lable=new ArrayList<String>();
			groupup_interact_lable=new ArrayList<String>();
			groupup_interact_icon=new ArrayList<Integer>();
			chat_icon=new ArrayList<Integer>();
			chat_title=new ArrayList<String>();
			assistant_icon=new ArrayList<Integer>();
			assistant_bg=new ArrayList<Integer>();
			health_icon=new ArrayList<Integer>();
			health_lable=new ArrayList<String>();
			/*
			 * 娣诲姞鑲插効鎴愰暱鐨勬暟鎹�
			 */
			//鑲插効鎴愰暱濞变箰绫诲垎缁勬枃瀛�
			groupup_sort.add("鑲插効濞变箰绫�");
			groupup_sort.add("鑲插効鍚开绫�");
			groupup_sort.add("浜插瓙浜掑姩绫�");
			//鑲插効鎴愰暱濞变箰绫诲浘鐗�
			for(int i=0;i<10;i++)
			{
				
			groupup_game_icon.add(R.drawable.ic_launcher);
			}
			groupup_game_lable.add("澶╁ぉ鐖卞効姝�");
			groupup_game_lable.add("瀹濆疂鍚晠浜�");
			groupup_game_lable.add("瀹濆疂鐖辨父鎴�");
		   
		    /*
		     * 娣诲姞鍚开绫荤殑鏁版嵁
		     */
		   for(int i=0;i<3;i++)
			{
			   groupup_primary_icon.add(R.drawable.ic_launcher);
			}
		    groupup_primary_lable.add("瀵撹█绡�");
		    groupup_primary_lable.add("鎴愰暱绡�");
		    groupup_primary_lable.add("骞煎効鑻辫绡�");
		    /*
		     * 娣诲姞浜插瓙浜掑姩绫荤殑鏁版嵁
		     */
		    groupup_interact_lable.add("澶╁ぉ鐢绘澘");
		    groupup_interact_lable.add("鍎跨鍙宠剳璁板繂");
		    groupup_interact_lable.add("瀹濊礉缇庨瀹�");
		    groupup_interact_lable.add("瓒呯骇鎷煎浘");
		    groupup_interact_lable.add("灏忓皬姝屽敱瀹�");
		    groupup_interact_lable.add("璺熸垜瀛�");
		    for(int i=0;i<6;i++)
		    {
		    	groupup_interact_icon.add(R.drawable.ic_launcher);
		    }
		    
		    //娣诲姞鑱婂ぉ鐨勫浘鐗� , 娣诲姞鑱婂ぉ鐨勬枃瀛�
		    for(int i=0;i<5;i++)
		    {
		    	chat_icon.add(R.drawable.ic_launcher);
		 	    
		    }
		    chat_title.add("kity");
		    chat_title.add("kangkang");
		    chat_title.add("jing");
		   for(int i=0;i<3;i++)
		    {
		    	assistant_icon.add(R.drawable.ic_launcher);
		    }
		   assistant_bg.add(R.color.red);
		   assistant_bg.add(R.color.blue);
		   assistant_bg.add(R.color.min);
		   for(int i=0;i<3;i++)
		    {
		    	health_icon.add(R.drawable.ic_launcher);
		    }
		    health_lable.add("椋熻氨鍋ュ悍");
		    health_lable.add("姘存灉鍋ュ悍");
		    health_lable.add("瀹濆疂杈呴");
		    //expandable  鎬荤殑鏁版嵁
		   
				Data data=new Data();
				for(int i=0;i<titles.length;i++)
				{
					data.setGrouptitle(titles);
					data.setGroupicon(icons);
				}
				
				data.setGroupup_sort(groupup_sort);
				data.setGroupup_game_icon(groupup_game_icon);
				data.setGroupup_game_lable(groupup_game_lable);
				data.setGroupup_primary_icon(groupup_primary_icon);
				data.setGroupup_primary_lable(groupup_primary_lable);
				data.setGroupup_interact_lable(groupup_interact_lable);
				data.setGroupup_interact_icon(groupup_interact_icon);
				data.setAssistant_icon(assistant_icon);
				data.setAssistant_bg(assistant_bg);
				data.setChat_icon(chat_icon);
				data.setChat_title(chat_title);
				//data.setChat_question(chat_question);
				//data.setChat_answer(chat_answer);
		     	data.setHealth_icon(health_icon);
		       	data.setHealth_lable(health_lable);
		    MyExpandableListAdapter adapter=new MyExpandableListAdapter(getActivity(),data);
		    expandableView.setAdapter(adapter);
		    recommended.setOnClickListener(listener);
		    topic.setOnClickListener(listener);
		    experts.setOnClickListener(listener);
	return view;
}

OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_recommended:
			Intent intent1=new Intent(getActivity(),GuanFangActivity.class);
			startActivity(intent1);
			break;

		case R.id.tv_topic:
			Intent intent2=new Intent(getActivity(),TalkingAboutActivity.class);
			startActivity(intent2);
			break;
		case R.id.tv_experts:
			Intent intent3=new Intent(getActivity(),LiaoTianActivity.class);
			startActivity(intent3);
			break;
		case R.id.home_search_btn:
			Intent intent4=new Intent(getActivity(),SearchActivity.class);
			startActivity(intent4);
		}
		
	}
};

}
