package homepage_adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baby.R;

public class Chat_ListView_Adapter extends BaseAdapter{
LayoutInflater inflater;
ArrayList<Integer> chat_icon; //闄勮繎鐑亰鐨勫浘鐗�
ArrayList<String> chat_title;    //闄勮繎鐑亰鐨勬爣棰�
ArrayList<String> chat_question; //闄勮繎鐑亰鐨勯棶棰�
ArrayList<String> chat_answer;  //闄勮繎鐑亰鐨勫洖绛�
public Chat_ListView_Adapter(Context context,ArrayList<Integer> chat_icon,ArrayList<String> chat_title,
		ArrayList<String> chat_question,ArrayList<String> chat_answer)
{
	this.inflater=LayoutInflater.from(context);
	this.chat_icon=chat_icon;
	this.chat_title=chat_title;
	this.chat_question=chat_question;
	this.chat_answer=chat_answer;
}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return chat_icon.size();
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

	@Override
	public View getView(int position, View convertview, ViewGroup arg2) {
		// TODO Auto-generated method stub
		convertview=inflater.inflate(R.layout.homepage_chat_listview_item, null);
		ImageView icon=(ImageView) convertview.findViewById(R.id.icon);
		TextView nickname=(TextView) convertview.findViewById(R.id.tv_nickname);
		nickname.setText(chat_title.get(position));
		return convertview;
	}

}
