package homepage_adapter;

import java.util.ArrayList;

import com.example.method.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Groupup_ListView_Adapter extends BaseAdapter{
      LayoutInflater inflater;
      GridView_Adapter one_adapter;
      GridView_Adapter two_adapter;
      GridView_Adapter three_adapter;
      ArrayList<String> groupup_sort;            //育儿成长分组的文字
      ArrayList<String> groupupgame_lable;       //育儿成长娱乐类文字
      ArrayList<Integer> groupupgame_icon;     //育儿成长娱乐类的图片
      ArrayList<String> groupupprimary_lable;    //育儿成长启迪类文字
      ArrayList<Integer> groupupprimary_icon;  //育儿成长启迪类的图片
      ArrayList<String> groupupinteract_lable;   //育儿成长互动类文字
      ArrayList<Integer> groupupinteract_icon; //育儿成长互动类的图片
      
    public Groupup_ListView_Adapter(Context context,ArrayList<String> groupup_sort,ArrayList<Integer> groupupgame_icon,
    		ArrayList<String> groupupgame_lable, ArrayList<Integer> groupupprimary_icon,ArrayList<String> groupupprimary_lable,
    		 ArrayList<Integer> groupupinteract_icon, ArrayList<String> groupupinteract_lable)
    {
    	this.inflater=LayoutInflater.from(context);
    	this.groupup_sort=groupup_sort;
    	this.one_adapter=new GridView_Adapter(inflater,groupupgame_icon,groupupgame_lable);
    }
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return groupup_sort.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	public View getView(int position, View convertview, ViewGroup arg2) {
		// TODO Auto-generated method stub
		convertview=inflater.inflate(R.layout.homepage_groupup_gridview, null);
		TextView title=(TextView) convertview.findViewById(R.id.tv_group_title);
		GridView gridView=(GridView) convertview.findViewById(R.id.gridview);
		title.setText(groupup_sort.get(position));
		if(position==0)
		{
			gridView.setAdapter(one_adapter);
		}
		
	
		return convertview;
	}

}
