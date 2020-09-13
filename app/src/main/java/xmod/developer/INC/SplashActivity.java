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
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;

public class SplashActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double set = 0;
	private double frame = 0;
	private double t = 0;
	private double m = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear6;
	private ImageView imageview2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout donucekgozukmicek;
	private TextView textview3;
	private TextView textview1;
	
	private TimerTask zaman;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splash);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		donucekgozukmicek = (LinearLayout) findViewById(R.id.donucekgozukmicek);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview1 = (TextView) findViewById(R.id.textview1);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		frame = 0;
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						frame++;
						_framework(frame % 7);
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(zaman, (int)(0), (int)(80));
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						donucekgozukmicek.setRotation((float)(frame));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(zaman, (int)(0), (int)(8));
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						m++;
						_xmod(m % 7);
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
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		zaman = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						zaman.cancel();
						finish();
					}
				});
			}
		};
		_timer.schedule(zaman, (int)(4400));
	}
	private void _framework (final double _t) {
		if (_t == 0) {
			imageview2.setImageResource(R.drawable.ichare1);
		}
		if (_t == 1) {
			imageview2.setImageResource(R.drawable.ichare2);
		}
		if (_t == 2) {
			imageview2.setImageResource(R.drawable.ichare3);
		}
		if (_t == 3) {
			imageview2.setImageResource(R.drawable.ichare6);
		}
		if (_t == 4) {
			imageview2.setImageResource(R.drawable.ichare7);
		}
		if (_t == 5) {
			imageview2.setImageResource(R.drawable.ichare9);
		}
		if (_t == 6) {
			imageview2.setImageResource(R.drawable.ichare9);
		}
	}
	
	
	private void _xmod (final double _m) {
		if (_m == 1) {
			textview3.setText("Tavşan Hazır");
		}
		if (_m == 2) {
			textview3.setText("Tavşan Hazır");
		}
		if (_m == 3) {
			textview3.setText("Koşuyor.");
		}
		if (_m == 4) {
			textview3.setText("Koşuyor..");
		}
		if (_m == 5) {
			textview3.setText("Koşuyor...");
		}
		if (_m == 6) {
			textview3.setText("Hoşgeldiniz");
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
