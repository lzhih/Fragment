package com.example.ceshi;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.linin.fragmenttest.R;

public class FragmentTest3 extends Fragment {
	private TextView text ;
	private AQuery aq;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		if(savedInstanceState == null)
		{
			FragmentTest.SetText(Print.Turn(5, 3));
			Log.i(FragmentTest.TAG, "FragmentTest3---->onActivityCreated");
			aq = new AQuery(getActivity());
			aq.id(R.id.btn2).clicked(new OnClickListener() {
				@Override
				public void onClick(View v) {
				}
			});
		}
		else
		{
			Toast.makeText(getActivity(), "FragmentTest3----!=null", Toast.LENGTH_LONG).show();
		}
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public void onAttach(Activity activity) {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onAttach");
		FragmentTest.SetText(Print.Turn(1, 3));
		super.onAttach(activity);
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		if(savedInstanceState == null)
		{
			setRetainInstance(true);
			FragmentTest.SetText(Print.Turn(3, 3));
		Log.i(FragmentTest.TAG, "FragmentTest3---->onCreate");
		}
		else
		{
			Log.i(FragmentTest.TAG, "FragmentTest3---->不需要再创建");
		}
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if(savedInstanceState == null)
		{
			FragmentTest.SetText(Print.Turn(3, 3));
			Log.i(FragmentTest.TAG, "FragmentTest3---->onCreateView");
		}
		else
		{
			Log.i(FragmentTest.TAG, "不需要重新创建！！");
		}
		return inflater.inflate(R.layout.mytest_textview3, container,false);
	}

	@Override
	public void onDestroy() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onDestroy");
		FragmentTest.SetText(Print.Turn(9, 3));
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onDestroyView");
		FragmentTest.SetText(Print.Turn(10, 3));
		super.onDestroyView();
	}

	@Override
	public void onPause() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onPause");
		FragmentTest.SetText(Print.Turn(19, 3));
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onResume");
		FragmentTest.SetText(Print.Turn(7, 3));
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onStart");
		FragmentTest.SetText(Print.Turn(6, 3));
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onStop");
		FragmentTest.SetText(Print.Turn(8, 3));
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.i(FragmentTest.TAG, "FragmentTest3---->onViewCreated");
		FragmentTest.SetText(Print.Turn(4, 3));
		super.onViewCreated(view, savedInstanceState);
	}
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Toast.makeText(getActivity(), "onSaveInstanceState被调用", Toast.LENGTH_LONG).show();
		Log.i(FragmentTest.TAG, "onSaveInstanceState被调用！");
		FragmentTest.SetText(Print.Turn(11, 3));
		outState.putString("abc", "133");
		
	}
}
