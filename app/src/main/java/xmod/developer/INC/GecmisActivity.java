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
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public class GecmisActivity extends Activity {
	
	
	private ArrayList<String> ekle = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ListView listview1;
	private TextView textview1;
	private ImageView imageview1;
	
	private SharedPreferences historycount;
	private SharedPreferences hist;
	private AlertDialog.Builder history;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.gecmis);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		listview1 = (ListView) findViewById(R.id.listview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		historycount = getSharedPreferences("historycount", Activity.MODE_PRIVATE);
		hist = getSharedPreferences("history", Activity.MODE_PRIVATE);
		history = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				
				finish();
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				history.setTitle("Geçmişi sil");
				history.setMessage("Geçmişi silcekmisin ?");
				history.setPositiveButton("yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						hist.edit().putString("1", "").commit();
						hist.edit().putString("2", "").commit();
						hist.edit().putString("3", "").commit();
						hist.edit().putString("4", "").commit();
						hist.edit().putString("5", "").commit();
						hist.edit().putString("6", "").commit();
						hist.edit().putString("7", "").commit();
						hist.edit().putString("8", "").commit();
						hist.edit().putString("9", "").commit();
						hist.edit().putString("10", "").commit();
						historycount.edit().putString("count", "0").commit();
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
						ekle.clear();
						imageview1.setEnabled(false);
						SketchwareUtil.showMessage(getApplicationContext(), "Geçmiş Silindi Rahatina Bak");
					}
				});
				history.setNegativeButton("no", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				history.create().show();
			}
		});
	}
	private void initializeLogic() {
		ekle.add(hist.getString("1", ""));
		ekle.add(hist.getString("2", ""));
		ekle.add(hist.getString("3", ""));
		ekle.add(hist.getString("4", ""));
		ekle.add(hist.getString("5", ""));
		ekle.add(hist.getString("6", ""));
		ekle.add(hist.getString("7", ""));
		ekle.add(hist.getString("8", ""));
		ekle.add(hist.getString("9", ""));
		ekle.add(hist.getString("10", ""));
		listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, ekle));
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
