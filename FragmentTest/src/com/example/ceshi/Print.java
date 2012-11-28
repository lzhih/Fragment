package com.example.ceshi;

import android.app.Activity;


public class Print{	
	public static String Turn(int po,int fragment)
	{
		
		switch (po) {
		case 1:
			 return(fragment+"->onAttach"+"\n");
		case 2:
			return(fragment+"->onCreate"+"\n");
		case 3:
			return(fragment+"->CreateView"+"\n");
		case 4:
			return(fragment+"->ViewCreated"+"\n");
		case 5:
			return(fragment+"->ActiviCreated"+"\n");
		case 6:
			return(fragment+"->onStart"+"\n");
		case 7:
			return(fragment+"->Resume"+"\n");
		case 8:
			return(fragment+"->Stop"+"\n");
		case 9:
			return(fragment+"->Destroy"+"\n");
		case 10:
			return(fragment+"->DestroyView"+"\n");
		case 11:
			return(fragment+"->SaveInstanceState");
		case 12:
			return("A->onCreate"+"\n");
		case 13:
			return("A->onPause"+"\n");
		case 14:
			return("A->onResume"+"\n");
		case 15:
			return("A->onStart"+"\n");
		case 16:
			return("A->onStop"+"\n");
		case 17:
			return("A->onRestart"+"\n");
		case 18:
			return("A->onSaveInstanceState"+"\n\n");
		case 19:
			return(fragment+"->onPause"+"\n");
		case 20:
			return("A->onDestroy"+"\n");
		default:
			return null;
		}
		
	}
}
