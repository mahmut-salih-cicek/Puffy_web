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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;

public class XmodhakkindaActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double karelendirme = 0;
	private double hiz1 = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview1;
	private TextView textview2;
	private ImageView imageview16;
	private TextView textview4;
	
	private TimerTask zaman;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.xmodhakkinda);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview4 = (TextView) findViewById(R.id.textview4);
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		karelendirme = 0;
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						karelendirme++;
						_karehiz(karelendirme % 7);
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(zaman, (int)(0), (int)(300));
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						hiz1++;
						_yazi(hiz1 % 7);
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(zaman, (int)(0), (int)(700));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _karehiz (final double _hiz) {
		if (_hiz == 0) {
			imageview16.setImageResource(R.drawable.x333);
		}
		if (_hiz == 1) {
			imageview16.setImageResource(R.drawable.x555);
		}
		if (_hiz == 2) {
			imageview16.setImageResource(R.drawable.x7777);
		}
		if (_hiz == 3) {
			imageview16.setImageResource(R.drawable.x9999);
		}
		if (_hiz == 4) {
			imageview16.setImageResource(R.drawable.x101010);
		}
		if (_hiz == 5) {
			imageview16.setImageResource(R.drawable.x111111onbir);
		}
		if (_hiz == 6) {
			imageview16.setImageResource(R.drawable.x12onki);
		}
	}
	
	
	private void _yazi (final double _mod) {
		
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
