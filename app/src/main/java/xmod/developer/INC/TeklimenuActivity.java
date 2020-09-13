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
import android.widget.HorizontalScrollView;
import android.widget.EditText;
import android.widget.ImageView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.webkit.WebViewClient;

public class TeklimenuActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double increase = 0;
	private double rote = 0;
	private double tab = 0;
	
	private LinearLayout linear1;
	private LinearLayout mainyer;
	private HorizontalScrollView hscroll2;
	private LinearLayout httplinear;
	private EditText edittext1;
	private ImageView resimbrowseracilirke;
	private ImageView yuklenis;
	private ImageView imageview15uyku;
	private ImageView yenidenyukle;
	private LinearLayout menulinear;
	private ImageView imagegeri2;
	private LinearLayout linear6;
	private WebView webview4;
	private LinearLayout linear11;
	private ImageView imagewebgerii;
	private LinearLayout linear12;
	private ImageView ileriweb;
	private LinearLayout linear13;
	private ImageView imagemain;
	private LinearLayout linear14;
	private ImageView fotorafzoomu;
	private LinearLayout linear5;
	private LinearLayout linear20;
	private ImageView kucultme;
	
	private Intent xmod = new Intent();
	private TimerTask poweredbyxmod;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.teklimenu);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		mainyer = (LinearLayout) findViewById(R.id.mainyer);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		httplinear = (LinearLayout) findViewById(R.id.httplinear);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		resimbrowseracilirke = (ImageView) findViewById(R.id.resimbrowseracilirke);
		yuklenis = (ImageView) findViewById(R.id.yuklenis);
		imageview15uyku = (ImageView) findViewById(R.id.imageview15uyku);
		yenidenyukle = (ImageView) findViewById(R.id.yenidenyukle);
		menulinear = (LinearLayout) findViewById(R.id.menulinear);
		imagegeri2 = (ImageView) findViewById(R.id.imagegeri2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		webview4 = (WebView) findViewById(R.id.webview4);
		webview4.getSettings().setJavaScriptEnabled(true);
		webview4.getSettings().setSupportZoom(true);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		imagewebgerii = (ImageView) findViewById(R.id.imagewebgerii);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		ileriweb = (ImageView) findViewById(R.id.ileriweb);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		imagemain = (ImageView) findViewById(R.id.imagemain);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		fotorafzoomu = (ImageView) findViewById(R.id.fotorafzoomu);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		kucultme = (ImageView) findViewById(R.id.kucultme);
		
		edittext1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.loadUrl(edittext1.getText().toString());
			}
		});
		
		resimbrowseracilirke.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		yuklenis.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview15uyku.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tab == 0) {
					imageview15uyku.setImageResource(R.drawable.day);
					linear1.setBackgroundColor(0xFF000000);
					httplinear.setBackgroundColor(0xFF000000);
					
					mainyer.setBackgroundColor(0xFF000000);
					
					menulinear.setBackgroundColor(0xFF000000);
					webview4.setBackgroundColor(0xFF000000);
					linear12.setBackgroundColor(0xFF000000);
					linear13.setBackgroundColor(0xFF000000);
					linear14.setBackgroundColor(0xFF000000);
					SketchwareUtil.showMessage(getApplicationContext(), "Gözlerin Rahatta ⭐🌙");
					tab++;
				}
				else {
					if (tab == 1) {
						imageview15uyku.setImageResource(R.drawable.night);
						linear1.setBackgroundColor(Color.TRANSPARENT);
						httplinear.setBackgroundColor(Color.TRANSPARENT);
						
						mainyer.setBackgroundColor(Color.TRANSPARENT);
						
						menulinear.setBackgroundColor(Color.TRANSPARENT);
						webview4.setBackgroundColor(Color.TRANSPARENT);
						linear12.setBackgroundColor(Color.TRANSPARENT);
						linear13.setBackgroundColor(Color.TRANSPARENT);
						linear14.setBackgroundColor(Color.TRANSPARENT);
						
						SketchwareUtil.showMessage(getApplicationContext(), "Gün modu ☀");
						tab--;
					}
				}
			}
		});
		
		yenidenyukle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.loadUrl(edittext1.getText().toString());
				SketchwareUtil.showMessage(getApplicationContext(), "yeniden yüklendi");
			}
		});
		
		imagegeri2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				mainyer.setVisibility(View.VISIBLE);
				edittext1.setVisibility(View.VISIBLE);
				resimbrowseracilirke.setVisibility(View.VISIBLE);
				yuklenis.setVisibility(View.VISIBLE);
			}
		});
		
		webview4.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				yenidenyukle.setVisibility(View.GONE);
				resimbrowseracilirke.setImageResource(R.drawable.brow);
				yuklenis.setVisibility(View.GONE);
				poweredbyxmod = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								rote++;
								yuklenis.setRotation((float)(rote));
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(poweredbyxmod, (int)(0), (int)(8));
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				resimbrowseracilirke.setImageResource(R.drawable.brow2);
				yuklenis.setVisibility(View.GONE);
				yenidenyukle.setVisibility(View.VISIBLE);
				super.onPageFinished(_param1, _param2);
			}
		});
		
		imagewebgerii.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.goBack();
			}
		});
		
		ileriweb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.goForward();
			}
		});
		
		imagemain.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "pencere seçildi");
				xmod.setAction(Intent.ACTION_VIEW);
				xmod.setClass(getApplicationContext(), CakmamainActivity.class);
				startActivity(xmod);
			}
		});
		
		fotorafzoomu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.zoomIn();
			}
		});
		
		kucultme.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview4.zoomOut();
				SketchwareUtil.showMessage(getApplicationContext(), "kucultuldu");
			}
		});
	}
	private void initializeLogic() {
		
		webview4.loadUrl("http://google.com");
		yuklenis.setVisibility(View.GONE);
		yenidenyukle.setVisibility(View.GONE);
		edittext1.setText(webview4.getUrl());
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
