
package homepage_adapter;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.baby.R;

public class Assistant_Adapter extends BaseAdapter{
	 ArrayList<Integer> icon;
     ArrayList<Integer> bg;
     LayoutInflater inflater;
     public Assistant_Adapter(LayoutInflater inflater,ArrayList<Integer> icon,ArrayList<Integer> bg) {
	this.inflater=inflater;
    this.icon=icon;
    this.bg=bg;
	}
     
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return icon.size();
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
		convertview=inflater.inflate(R.layout.homepage_baby_asistant, null);
		ImageView iv=(ImageView)convertview.findViewById(R.id.iv);
		iv.setImageResource(icon.get(position));
		convertview.setBackgroundColor(bg.get(position));
		return convertview;
	}

}
