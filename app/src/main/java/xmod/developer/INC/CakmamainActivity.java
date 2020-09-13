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
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ScrollView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.webkit.WebViewClient;

public class CakmamainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double add_cansel = 0;
	private double bar = 0;
	private double increase = 0;
	private double hom = 0;
	private double tab = 0;
	private double loading = 0;
	
	private ArrayList<String> list = new ArrayList<>();
	
	private LinearLayout linear1;
	private HorizontalScrollView hscroll2;
	private ImageView imageview3;
	private EditText edittext3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview20;
	private ImageView imageview7;
	private LinearLayout linear3;
	private LinearLayout actionmenu1;
	private LinearLayout acm2;
	private LinearLayout acm3;
	private LinearLayout acm4;
	private LinearLayout acm5;
	private LinearLayout linear6;
	private LinearLayout acm7;
	private LinearLayout linear12;
	private LinearLayout linear21;
	private LinearLayout linear26;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear27;
	private LinearLayout linear25;
	private ImageView imegeview13;
	private TextView textview5;
	private Button sethome;
	private LinearLayout linear28;
	private Button loadhome;
	private ImageView imageview14;
	private TextView textview4;
	private ImageView imageview15;
	private TextView textview1;
	private ImageView imageview16;
	private TextView textview2;
	private ImageView imageview17;
	private TextView textview3;
	private LinearLayout menulimer;
	private LinearLayout linear19;
	private ScrollView vscroll1;
	private ImageView imageview8;
	private LinearLayout linear15;
	private ImageView imageview9;
	private LinearLayout linear16;
	private ImageView imageview10;
	private LinearLayout linear17;
	private ImageView imageview11;
	private LinearLayout linear18;
	private ImageView imageview12;
	private ImageView imageview18;
	private LinearLayout linear20;
	private ImageView imageview19;
	private WebView webview1;
	
	private TimerTask timer;
	private Intent intt = new Intent();
	private SharedPreferences historycount;
	private SharedPreferences hist;
	private SharedPreferences homepage;
	private SharedPreferences kitaplik;
	private Vibrator tit;
	private Vibrator titrer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cakmamain);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		actionmenu1 = (LinearLayout) findViewById(R.id.actionmenu1);
		acm2 = (LinearLayout) findViewById(R.id.acm2);
		acm3 = (LinearLayout) findViewById(R.id.acm3);
		acm4 = (LinearLayout) findViewById(R.id.acm4);
		acm5 = (LinearLayout) findViewById(R.id.acm5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		acm7 = (LinearLayout) findViewById(R.id.acm7);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		imegeview13 = (ImageView) findViewById(R.id.imegeview13);
		textview5 = (TextView) findViewById(R.id.textview5);
		sethome = (Button) findViewById(R.id.sethome);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		loadhome = (Button) findViewById(R.id.loadhome);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview3 = (TextView) findViewById(R.id.textview3);
		menulimer = (LinearLayout) findViewById(R.id.menulimer);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		historycount = getSharedPreferences("historycount", Activity.MODE_PRIVATE);
		hist = getSharedPreferences("history", Activity.MODE_PRIVATE);
		homepage = getSharedPreferences("homepage", Activity.MODE_PRIVATE);
		kitaplik = getSharedPreferences("kitaplik", Activity.MODE_PRIVATE);
		tit = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		titrer = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (bar == 0) {
					actionmenu1.setVisibility(View.VISIBLE);
					bar++;
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									acm2.setVisibility(View.VISIBLE);
								}
							});
						}
					};
					_timer.schedule(timer, (int)(20));
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									imageview3.setRotation((float)(80));
									acm3.setVisibility(View.VISIBLE);
								}
							});
						}
					};
					_timer.schedule(timer, (int)(40));
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									
								}
							});
						}
					};
					_timer.schedule(timer, (int)(100));
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									imageview3.setImageResource(R.drawable.aarro);
									imageview3.setRotation((float)(240));
									acm5.setVisibility(View.VISIBLE);
								}
							});
						}
					};
					_timer.schedule(timer, (int)(160));
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									imageview3.setRotation((float)(320));
									linear6.setVisibility(View.VISIBLE);
								}
							});
						}
					};
					_timer.schedule(timer, (int)(220));
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									imageview3.setRotation((float)(360));
									acm7.setVisibility(View.VISIBLE);
								}
							});
						}
					};
					_timer.schedule(timer, (int)(280));
				}
				else {
					if (bar == 1) {
						acm7.setVisibility(View.GONE);
						bar--;
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										imageview3.setRotation((float)(440));
										linear6.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(40));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										imageview3.setRotation((float)(520));
										acm5.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(100));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										imageview3.setImageResource(R.drawable.mennu);
										imageview3.setRotation((float)(600));
										acm4.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(180));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										imageview3.setRotation((float)(680));
										acm3.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(220));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										imageview3.setRotation((float)(0));
										acm2.setVisibility(View.GONE);
										bar = bar;
									}
								});
							}
						};
						_timer.schedule(timer, (int)(280));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										actionmenu1.setVisibility(View.GONE);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(340));
					}
				}
			}
		});
		
		edittext3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl(edittext3.getText().toString());
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Kitapliğa eklendi");
				
				
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (bar == 0) {
					menulimer.setVisibility(View.GONE);
					imageview7.setImageResource(R.drawable.fullscreeexit);
					bar++;
				}
				else {
					if (bar == 1) {
						menulimer.setVisibility(View.VISIBLE);
						imageview7.setImageResource(R.drawable.fullscree);
						bar--;
					}
				}
			}
		});
		
		imegeview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (hom == 0) {
					linear26.setVisibility(View.VISIBLE);
					hom++;
				}
				else {
					if (hom == 1) {
						linear26.setVisibility(View.GONE);
						hom--;
					}
				}
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (hom == 0) {
					linear26.setVisibility(View.VISIBLE);
					hom++;
				}
				else {
					if (hom == 1) {
						linear26.setVisibility(View.VISIBLE);
						hom--;
					}
				}
			}
		});
		
		sethome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				homepage.edit().putString("0", webview1.getUrl()).commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Ana sayfa yapıldı");
			}
		});
		
		loadhome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl(homepage.getString("0", ""));
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), KitaplikActivity.class);
				startActivity(intt);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), KitaplikActivity.class);
				startActivity(intt);
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), KitaplikActivity.class);
				startActivity(intt);
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), GecmisActivity.class);
				startActivity(intt);
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Yapilacak şuanki sürümün keyfini çıkar");
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Daha yapmadım =)");
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), XmodhakkindaActivity.class);
				startActivity(intt);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.goBack();
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.goForward();
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intt.setAction(Intent.ACTION_VIEW);
				intt.setClass(getApplicationContext(), TeklimenuActivity.class);
				startActivity(intt);
				SketchwareUtil.showMessage(getApplicationContext(), "pencere kullanimda");
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (bar == 0) {
					linear19.setVisibility(View.VISIBLE);
					imageview11.setRotation((float)(180));
					bar++;
				}
				else {
					if (bar == 1) {
						linear19.setVisibility(View.GONE);
						imageview11.setRotation((float)(360));
						bar--;
					}
				}
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.zoomIn();
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.zoomOut();
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				imageview20.setVisibility(View.GONE);
				imageview4.setVisibility(View.VISIBLE);
				imageview4.setImageResource(R.drawable.brow);
				imageview5.setVisibility(View.VISIBLE);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								tab++;
								imageview5.setRotation((float)(tab));
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(timer, (int)(0), (int)(8));
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				edittext3.setText(webview1.getUrl());
				loading = 0;
				imageview4.setVisibility(View.VISIBLE);
				imageview4.setImageResource(R.drawable.brow2);
				imageview5.setVisibility(View.GONE);
				imageview20.setVisibility(View.VISIBLE);
				if (Double.parseDouble(historycount.getString("count", "")) == 10) {
					
					
					
					
					
					
					
					
					
					
				}
				else {
					hist.edit().putString(String.valueOf((long)(Double.parseDouble(historycount.getString("count", "")) + 1)), webview1.getUrl()).commit();
					historycount.edit().putString("count", String.valueOf((long)(Double.parseDouble(historycount.getString("count", "")) + 1))).commit();
				}
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	private void initializeLogic() {
		webview1.loadUrl("http://google.com");
		SketchwareUtil.showMessage(getApplicationContext(), "OPEN BETA  ");
		tit.vibrate((long)(40));
		historycount.edit().putString("count", "0").commit();
		kitaplik.edit().putString("count", "0").commit();
		linear26.setVisibility(View.GONE);
		linear19.setVisibility(View.GONE);
		edittext3.setText(webview1.getUrl());
		bar = 0;
		actionmenu1.setVisibility(View.GONE);
		acm2.setVisibility(View.GONE);
		acm4.setVisibility(View.GONE);
		acm3.setVisibility(View.GONE);
		acm5.setVisibility(View.GONE);
		linear6.setVisibility(View.GONE);
		acm7.setVisibility(View.GONE);
		imageview3.setImageResource(R.drawable.mennu);
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
	public void onStart() {
		super.onStart();
		if (kitaplik.getString("scr", "").equals("yes")) {
			webview1.loadUrl(kitaplik.getString("ge", ""));
			kitaplik.edit().putString("scr", "no").commit();
		}
		if (hist.getString("go", "").equals("yes")) {
			webview1.loadUrl(hist.getString("hist", ""));
			hist.edit().putString("go", "no").commit();
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
