package com.example.method;

import homepage_adapter.Data;
import homepage_adapter.MyExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.R.anim;
import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.database.DataSetObserver;
import android.text.AndroidCharacter;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
public class MainActivity extends Activity {
ExpandableListView expandableView;
String[] titles={"育儿成长","育儿课堂","附近热聊","育儿小助手","亲子旅游","育儿健康小助手"};
int[] icons={R.drawable.icon_parenting_growth,R.drawable.icon_parent_class,R.drawable.icon_near_hot_chat,
		R.drawable.icon_parent_little_helper,R.drawable.icon_parent_child_travel,R.drawable.icon_children_little_helper};
String grouptitle;     //组的标题   
int group_icon;       //组的图片
ArrayList<String> groupup_sort;   //育儿成长分组的文字
ArrayList<String> groupup_game_lable;       //育儿成长娱乐类文字
ArrayList<Integer> groupup_game_icon;     //育儿成长娱乐类的图片
ArrayList<String> groupup_primary_lable;    //育儿成长启迪类文字
ArrayList<Integer> groupup_primary_icon;  //育儿成长启迪类的图片
ArrayList<String> groupup_interact_lable;   //育儿成长互动类文字
ArrayList<Integer> groupup_interact_icon; //育儿成长互动类的图片
ArrayList<Integer> chat_icon; //附近热聊的图片
ArrayList<String> chat_title;    //附近热聊的标题
ArrayList<String> chat_question; //附近热聊的问题
ArrayList<String> chat_answer;  //附近热聊的回答
ArrayList<Integer> assistant_icon; //育儿小助手的图片
ArrayList<Integer> assistant_bg;   //育儿小助手的背景颜色
ArrayList<String> health_lable;   //健康小助手的文字
ArrayList<Integer> health_icon; //健康小助手的图片
protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.homepage);
		expandableView=(ExpandableListView)findViewById(R.id.expandlable_listview);
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
		 * 添加育儿成长的数据
		 */
		//育儿成长娱乐类分组文字
		groupup_sort.add("育儿娱乐类");
		groupup_sort.add("育儿启迪类");
		groupup_sort.add("亲子互动类");
		//育儿成长娱乐类图片
		for(int i=0;i<10;i++)
		{
			
		groupup_game_icon.add(R.drawable.ic_launcher);
		}
		groupup_game_lable.add("天天爱儿歌");
		groupup_game_lable.add("宝宝听故事");
		groupup_game_lable.add("宝宝爱游戏");
	   
	    /*
	     * 添加启迪类的数据
	     */
	   for(int i=0;i<3;i++)
		{
		   groupup_primary_icon.add(R.drawable.ic_launcher);
		}
	    groupup_primary_lable.add("寓言篇");
	    groupup_primary_lable.add("成长篇");
	    groupup_primary_lable.add("幼儿英语篇");
	    /*
	     * 添加亲子互动类的数据
	     */
	    groupup_interact_lable.add("天天画板");
	    groupup_interact_lable.add("儿童右脑记忆");
	    groupup_interact_lable.add("宝贝美食家");
	    groupup_interact_lable.add("超级拼图");
	    groupup_interact_lable.add("小小歌唱家");
	    groupup_interact_lable.add("跟我学");
	    for(int i=0;i<6;i++)
	    {
	    	groupup_interact_icon.add(R.drawable.ic_launcher);
	    }
	    
	    //添加聊天的图片 , 添加聊天的文字
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
	    health_lable.add("食谱健康");
	    health_lable.add("水果健康");
	    health_lable.add("宝宝辅食");
	    //expandable  总的数据
	   
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
	    MyExpandableListAdapter adapter=new MyExpandableListAdapter(MainActivity.this,data);
	    expandableView.setAdapter(adapter);
	}


}
