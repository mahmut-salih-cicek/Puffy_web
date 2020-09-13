package xmod.developer.INC;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;

public class KitaplikActivity extends Activity {
	
	
	private double adding = 0;
	
	private ArrayList<String> adf = new ArrayList<>();
	
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear8;
	private TextView textview1;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private EditText edittext1;
	private Button button1;
	private LinearLayout linear15;
	private ImageView imageview2;
	private TextView textview2;
	private ImageView dltsilll;
	private LinearLayout linear13;
	private ListView listview1;
	private ImageView imageview3;
	private TextView textview3;
	
	private SharedPreferences kitaplik;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.kitaplik);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		button1 = (Button) findViewById(R.id.button1);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview2 = (TextView) findViewById(R.id.textview2);
		dltsilll = (ImageView) findViewById(R.id.dltsilll);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		listview1 = (ListView) findViewById(R.id.listview1);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview3 = (TextView) findViewById(R.id.textview3);
		kitaplik = getSharedPreferences("kitaplik", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kitaplik.edit().putString("count", String.valueOf((long)(Double.parseDouble(kitaplik.getString("count", "")) + 1))).commit();
				kitaplik.edit().putString(kitaplik.getString("count", ""), edittext1.getText().toString()).commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla oluşturuldu");
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setVisibility(View.VISIBLE);
				button1.setVisibility(View.VISIBLE);
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setVisibility(View.VISIBLE);
				button1.setVisibility(View.VISIBLE);
			}
		});
		
		dltsilll.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Daha Betadayız Dur");
			}
		});
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				kitaplik.edit().putString("scr", "yes").commit();
				kitaplik.edit().putString("ge", adf.get((int)(_position))).commit();
				finish();
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		edittext1.setVisibility(View.INVISIBLE);
		button1.setVisibility(View.INVISIBLE);
		adding = 1;
		for(int _repeat13 = 0; _repeat13 < (int)(Double.parseDouble(kitaplik.getString("count", ""))); _repeat13++) {
			adf.add(kitaplik.getString(String.valueOf((long)(adding)), ""));
			adding++;
		}
		listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, adf));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
