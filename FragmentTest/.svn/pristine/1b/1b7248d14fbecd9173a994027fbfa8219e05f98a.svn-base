package com.example.ceshi;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
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

public class FragmentTest4 extends Fragment implements OnBackStackChangedListener{
	private TextView text ;
	private AQuery aq;
	private StringBuilder liucheng = new StringBuilder();
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if(savedInstanceState == null)
		{
			text = (TextView) getView().findViewById(R.id.text4);
			FragmentTest.SetText(Print.Turn(5, 4));
			Log.i(FragmentTest.TAG, "FragmentTest4---->onActivityCreated");
	//		getFragmentManager().beginTransaction().addToBackStack(null).commit();
			aq = new AQuery(getActivity());
			aq.id(R.id.btn4).clicked(new OnClickListener() {
				@Override
				public void onClick(View v) {
					
				}
			});
		}
		else
		{
			Toast.makeText(getActivity(), "FragmentTest3----!=null", Toast.LENGTH_LONG).show();
		}
		
	}
	@Override
	public void onAttach(Activity activity) {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onAttach");
		FragmentTest.SetText(Print.Turn(1, 4));
		super.onAttach(activity);
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(savedInstanceState == null)
		{
			setRetainInstance(true);
			FragmentTest.SetText(Print.Turn(2, 4));
			Log.i(FragmentTest.TAG, "FragmentTest4---->onCreate");
		}
		else
		{
			Log.i(FragmentTest.TAG, "FragmentTest4---->不需要再创建");
		}
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if(savedInstanceState == null)
		{
			FragmentTest.SetText(Print.Turn(3, 4));
			Log.i(FragmentTest.TAG, "FragmentTest4---->onCreateView");
		}
		else
		{
			Log.i(FragmentTest.TAG, "不需要重新创建！！");
		}
		return inflater.inflate(R.layout.mytest_textview4, container,false);
	}

	@Override
	public void onDestroy() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onDestroy");
		FragmentTest.SetText(Print.Turn(9, 4));
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onDestroyView");
		FragmentTest.SetText(Print.Turn(10, 4));
		super.onDestroyView();
	}

	@Override
	public void onPause() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onPause");
		FragmentTest.SetText(Print.Turn(19, 4));
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onResume");
		FragmentTest.SetText(Print.Turn(7, 4));
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onStart");
		FragmentTest.SetText(Print.Turn(6, 4));
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.i(FragmentTest.TAG, "FragmentTest4---->onStop");
		FragmentTest.SetText(Print.Turn(8, 4));
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i(FragmentTest.TAG, "FragmentTest4---->onViewCreated");
		FragmentTest.SetText(Print.Turn(4, 4));
		super.onViewCreated(view, savedInstanceState);
	}
	
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Toast.makeText(getActivity(), "onSaveInstanceState被调用", Toast.LENGTH_LONG).show();
		FragmentTest.SetText(Print.Turn(11, 4));
		Log.i(FragmentTest.TAG, "onSaveInstanceState被调用！");
		outState.putString("abc", "143");
		
	}
	@Override
	public void onBackStackChanged() {
		Toast.makeText(getActivity(), "onBackStackChanged被调用", Toast.LENGTH_LONG).show();
	}
}
