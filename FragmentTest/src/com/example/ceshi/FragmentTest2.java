package com.example.ceshi;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.linin.fragmenttest.R;

public class FragmentTest2 extends Fragment implements OnBackStackChangedListener{
	private static TextView text ;
	private AQuery aq;
	private String liucheng;

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		text = (TextView) getView().findViewById(R.id.text2);
		FragmentTest.SetText(Print.Turn(5, 2));
		Log.i(FragmentTest.TAG, "FragmentTest2---->onActivityCreated");
//		getFragmentManager().beginTransaction().addToBackStack(null).commit();
		
		FragmentManager fg3 = getFragmentManager();
		FragmentTransaction ft3 = fg3.beginTransaction();
		ft3.replace(R.id.framelayout_4,TestActivity.fragment).addToBackStack(null).commit();
		
	
		aq = new AQuery(getActivity());
		aq.id(R.id.btn).clicked(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TestActivity.frg_1.delete(0, TestActivity.frg_1.length());
				getFragmentManager().beginTransaction().remove(TestActivity.fragment).commit();
				int num = getActivity().getSupportFragmentManager().getBackStackEntryCount();
				Toast.makeText(getActivity(), "Fragment:"+getFragmentManager().getBackStackEntryCount(), Toast.LENGTH_SHORT).show();
			}
		});
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onAttach");
		FragmentTest.SetText(Print.Turn(1, 2));
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		if(savedInstanceState == null)
		{
//		liucheng+="\nonCreate-2";
//		text.FragmentTest.SetText(Print.Turn(5, 2));
		FragmentTest.SetText(Print.Turn(2, 2));
		Log.i(FragmentTest.TAG, "FragmentTest2---->onCreate");
		}
		else
		{
			Log.i(FragmentTest.TAG, "FragmentTest2---->不需要再创建");
		}
//		text.FragmentTest.SetText(FragmentTest.liucheng);
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		liucheng+="\nonCreateView-2";
		Log.i(FragmentTest.TAG, "FragmentTest2---->onCreateView");
//		text.FragmentTest.SetText(FragmentTest.liucheng);
		// TODO Auto-generated method stub
		FragmentTest.SetText(Print.Turn(3, 2));
		return inflater.inflate(R.layout.mytest_textview2, container,false);
	}

	@Override
	public void onDestroy() {
		FragmentTest.SetText(Print.Turn(9, 2));
		Log.i(FragmentTest.TAG, "FragmentTest2---->onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onDestroyView");
		FragmentTest.SetText(Print.Turn(10, 2));
		// TODO Auto-generated method stub
		onSaveInstanceState(new Bundle());
		super.onDestroyView();
	}

	@Override
	public void onPause() {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onPause");
		FragmentTest.SetText(Print.Turn(19, 2));
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onResume");
		FragmentTest.SetText(Print.Turn(7, 2));
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onStart");
		FragmentTest.SetText(Print.Turn(6, 2));
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onStop");
		FragmentTest.SetText(Print.Turn(8, 2));
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.i(FragmentTest.TAG, "FragmentTest2---->onViewCreated");
		FragmentTest.SetText(Print.Turn(4, 2));
		super.onViewCreated(view, savedInstanceState);
	}
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(FragmentTest.TAG, "FragmentTest2---->onSaveInstanceState"+"\n");
		FragmentTest.SetText(Print.Turn(11, 2));
		outState.putString("abc", "123");
	}

	

	@Override
	public void onBackStackChanged() {
		// TODO Auto-generated method stub
		
	}
}
