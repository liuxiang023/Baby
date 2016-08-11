package homepage_adapter;


import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.baby.R;
public class MyExpandableListAdapter implements ExpandableListAdapter{
    LayoutInflater inflater;
    Data data;
    Context context;
   public MyExpandableListAdapter (Context context,Data data)
   {
	  
	   this.context=context;
	   this.data=data;
	   inflater=LayoutInflater.from(context);
   }
	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getChild(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return arg1;
	}

	@Override
	public View getChildView(int groupId, int childId, boolean bool, View v,ViewGroup viewGroup) {
		if(groupId==0)
		{
		
	 View view=inflater.inflate(R.layout.homepage_groupup_listview, null);
	 ListView listView=(ListView) view.findViewById(R.id.listview_groupup);
	 Groupup_ListView_Adapter adapter=new Groupup_ListView_Adapter(context,data.getGroupup_sort(),data.getGroupup_game_icon(),data.getGroupup_game_lable(),
	 data.getGroupup_primary_icon(),data.getGroupup_primary_lable(),data.getGroupup_interact_icon(),data.getGroupup_interact_lable());
	 listView.setAdapter(adapter);
		return view;
		}
		if(groupId==2)
		{
			
			View view=inflater.inflate(R.layout.homepage_groupup_listview, null);
			ListView listView=(ListView) view.findViewById(R.id.listview_groupup);
			Chat_ListView_Adapter adapter=new Chat_ListView_Adapter(context,data.getChat_icon(),data.getChat_title(),data.getChat_question(),data.getChat_answer());
			listView.setAdapter(adapter);
			return view;
		}
		if(groupId==3)
		{
			
			View view=inflater.inflate(R.layout.homepage_groupup_listview, null);
			ListView listView=(ListView) view.findViewById(R.id.listview_groupup);
			Assistant_Adapter adapter=new Assistant_Adapter(inflater, data.getAssistant_icon(), data.getAssistant_bg());
			listView.setAdapter(adapter);
			return view;
		}
		return v;
	}

	@Override
	public int getChildrenCount(int group) {
         if(group==0)
         {
        	return data.getGroupup_sort().size();
         }
         if(group==2)
         {
        	 return data.getChat_icon().size();
         }
         if(group==3)
         {
        	return data.getAssistant_bg().size(); 
         }
         if(group==5)
         {
        	 return data.getHealth_icon().size();  
         }
		
		return 0;
	}

	@Override
	public long getCombinedChildId(long arg0, long arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCombinedGroupId(long arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getGroup(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return data.getGroupicon().length;
				
	}

	@Override
	public long getGroupId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getGroupView(int position, boolean bool, View view, ViewGroup viewgroup) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.homepage_expandablelistview_item, null);
		TextView title=(TextView)v.findViewById(R.id.tv_group_titles);
		ImageView icon=(ImageView)v.findViewById(R.id.iv_group_icon);
	    title.setText(data.getGrouptitle()[position]);
	    icon.setImageResource(data.getGroupicon()[position]);
		ImageView selector=(ImageView) v.findViewById(R.id.iv_down_up);
		if(bool)
		{
			selector.setEnabled(true);
		}
		else {
			selector.setEnabled(false);
		}
		return v;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onGroupCollapsed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onGroupExpanded(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}
}
