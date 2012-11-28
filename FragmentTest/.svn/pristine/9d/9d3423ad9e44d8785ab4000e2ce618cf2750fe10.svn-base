package com.example.ceshi;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.linin.fragmenttest.R;

public class TestActivity extends FragmentActivity implements OnClickListener{
	public static int num;
	public static StringBuilder frg_1;
	public TextView text;
	public String liu;
	public static FragmentTest3 fragment = new FragmentTest3();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		frg_1 = new StringBuilder();
		
		text = (TextView) findViewById(R.id.text6);
		
		Log.i(FragmentTest.TAG, "Activity---->onCreate");
		setContentView(R.layout.activity_test);
//		FragmentTest.SetText(Print.Turn(12, 0));
		frg_1.append(Print.Turn(12, 0));
//		FragmentTest frag = new FragmentTest();
		FragmentManager fg = getSupportFragmentManager();
		FragmentTransaction ft = fg.beginTransaction();
		ft.add(R.id.framelayout_3,new FragmentTest()).addToBackStack("--------").commit();
		
		FragmentManager fg2 = getSupportFragmentManager();
		FragmentTransaction ft2 = fg2.beginTransaction();
		ft2.replace(R.id.framelayout_2,new FragmentTest2()).addToBackStack(null).commit();
		
	}

	@Override
	public void onClick(View v) {
		
			}

	@Override
	protected void onDestroy() {
		Log.i(FragmentTest.TAG, "Activity---->onDestroy");
		frg_1.append(Print.Turn(20, 0));
		if(isFinishing())
		{
			Toast.makeText(getApplication(), "Activity->onDestroy", Toast.LENGTH_LONG).show();
		}
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(FragmentTest.TAG, "Activity---->onPause");
//		FragmentTest.SetText(Print.Turn(13, 0));
		frg_1.append(Print.Turn(13, 0));
		if(isFinishing())
		{
			Toast.makeText(getApplication(), "Activity->onPause", Toast.LENGTH_LONG).show();
		}
		
	}

	@Override
	protected void onResume() {
		super.onResume();
//		FragmentTest.SetText(Print.Turn(14, 0));
		frg_1.append(Print.Turn(14, 0));
		Log.i(FragmentTest.TAG, "Activity---->onResume");

	}

	@Override
	protected void onStart() {
		super.onStart();
//		FragmentTest.SetText(Print.Turn(15, 0));
		frg_1.append(Print.Turn(15, 0));
		Log.i(FragmentTest.TAG, "Activity---->onStart");

	}

	@Override
	protected void onStop() {
		super.onStop();
//		FragmentTest.SetText(Print.Turn(16, 0));
		frg_1.append(Print.Turn(16, 0));
		Log.i(FragmentTest.TAG, "Activity---->onStop");
		if(isFinishing())
		{
			Toast.makeText(getApplication(), "Activity->onStop", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	protected void onRestart() {
		super.onRestart();
//		FragmentTest.SetText(Print.Turn(17, 0));
		frg_1.append(Print.Turn(17, 0));
		Log.i(FragmentTest.TAG, "Activity---->onRestart");
	
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
//		FragmentTest.SetText(Print.Turn(19, 0));
		frg_1.append(Print.Turn(19, 0));
		outState.putInt("a", 12);

	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		frg_1.delete(0, frg_1.length());
//		FragmentTest.SetText(frg_1.toString());
	}
}
