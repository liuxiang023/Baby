package homepage_adapter;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baby.R;

public class GridView_Adapter extends BaseAdapter{
	 ArrayList<String> label;
     ArrayList<Integer> icon;
     LayoutInflater inflater;
public GridView_Adapter(LayoutInflater inflater,ArrayList<Integer> icon, ArrayList<String> label)
{
	this.icon=icon;
	this.label=label;
	this.inflater=inflater;
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
		convertview=inflater.inflate(R.layout.gridview_layout, null);
		ImageView iv=(ImageView) convertview.findViewById(R.id.iv);
	    TextView tv=(TextView)convertview.findViewById(R.id.tv);
	   iv.setImageResource(icon.get(position));
	   tv.setText(label.get(position));
		return convertview;
	}

}
