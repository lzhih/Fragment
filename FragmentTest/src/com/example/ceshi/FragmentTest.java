package com.example.ceshi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.linin.fragmenttest.R;

public class FragmentTest extends Fragment implements OnClickListener{

	public static final String TAG = "FragmentTest"; 
	private Button next ;
	private static TextView text;
	private static int[] colors = {R.color.green,R.color.blue};
	AQuery aq = new AQuery(getView());
	private static String str_1 = "A";
	private static int k = 0;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		Log.i(TAG, "fragement-1--->onActivityCreated");
		next = (Button)getView().findViewById(R.id.next);
		text = (TextView) getView().findViewById(R.id.text);
		FragmentTest.SetText(Print.Turn(5, 1));
		FragmentTest2 ft = new FragmentTest2();
		next.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				TestActivity.frg_1.delete(0, TestActivity.frg_1.length());
				int num = getActivity().getSupportFragmentManager().getBackStackEntryCount();
				Toast.makeText(getActivity(), "Activity:"+num, Toast.LENGTH_SHORT).show();
				FragmentManager fg1 = getFragmentManager();
				FragmentTransaction ft1 = fg1.beginTransaction();
				ft1.replace(R.id.framelayout_4,new FragmentTest4()).addToBackStack(null).commit();
			}
		});
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(TAG, "fragement-1--->onAttach");
		
		TestActivity.frg_1.append(Print.Turn(1, 1));
//		FragmentTest.SetText(Print.Turn(1, 1));
		super.onAttach(activity);
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		if(savedInstanceState == null)
		{
	//		text.setText(liucheng);
//			FragmentTest.SetText(Print.Turn(1, 1));
			TestActivity.frg_1.append(Print.Turn(2, 1));
			Log.i(TAG, "fragement-1--->onCreate");
			setRetainInstance(true);
		}
		else
		{
			Log.i(TAG, "fragement-1--->onCreate-->!=null");
		}
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		text.setText(liucheng);
		Log.i(TAG, "fragement-1--->onCreateView");
		TestActivity.frg_1.append(Print.Turn(1, 1));
//		FragmentTest.SetText(Print.Turn(1, 1));
		return inflater.inflate(R.layout.mytest_textview, container,false);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "fragement-1--->onDestroy");
		FragmentTest.SetText(Print.Turn(9, 1));
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		FragmentTest.SetText(Print.Turn(10, 1));
		Log.i(TAG, "fragement-1--->onDestroyView");

	}

	@Override
	public void onPause() {
		super.onPause();
		Log.i(TAG, "fragement-1--->onPause");
		FragmentTest.SetText(Print.Turn(19, 1));
	}

	@Override
	public void onResume() {
		super.onResume();
		FragmentTest.SetText(Print.Turn(7, 1));
		Log.i(TAG, "fragement-1--->onResume");
	}

	@Override
	public void onStart() {
		super.onStart();
		FragmentTest.SetText(Print.Turn(6, 1));
		Log.i(TAG, "fragement-1--->onStart");
	}

	@Override
	public void onStop() {
		super.onStop();
		FragmentTest.SetText(Print.Turn(8, 1));
		Log.i(TAG, "fragement-1--->onStop");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
//		FragmentTest.SetText(Print.Turn(4, 1));
		TestActivity.frg_1.append(Print.Turn(4, 1));
		Log.i(FragmentTest.TAG, "Fragment-1---->onViewCreated");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	public static void SetText(String str)
	{
		TestActivity.frg_1.append(str);
		text.setText(TestActivity.frg_1);
	}
}
