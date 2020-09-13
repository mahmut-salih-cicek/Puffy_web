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
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;

public class MainActivity extends Activity {
	
	
	private LinearLayout linear5;
	private LinearLayout linear55;
	private TextView textview2;
	private Button button3;
	private TextView textview1;
	
	private Intent intet = new Intent();
	private AlertDialog.Builder mesaj;
	private Vibrator tit;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		textview2 = (TextView) findViewById(R.id.textview2);
		button3 = (Button) findViewById(R.id.button3);
		textview1 = (TextView) findViewById(R.id.textview1);
		mesaj = new AlertDialog.Builder(this);
		tit = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intet.setAction(Intent.ACTION_VIEW);
				intet.setClass(getApplicationContext(), CakmamainActivity.class);
				startActivity(intet);
			}
		});
	}
	private void initializeLogic() {
		intet.setClass(getApplicationContext(), SplashActivity.class);
		SketchwareUtil.showMessage(getApplicationContext(), "OPEN BETA");
		tit.vibrate((long)(50));
		startActivity(intet);
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
	public void onBackPressed() {
		mesaj.setMessage("Şansını Kaçırıyorsun Dostum =)");
		mesaj.setPositiveButton("yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		mesaj.setNegativeButton("no", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		mesaj.create().show();
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
