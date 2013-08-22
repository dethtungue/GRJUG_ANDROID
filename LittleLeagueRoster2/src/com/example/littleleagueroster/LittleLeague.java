package com.example.littleleagueroster;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class LittleLeague extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_little_league);
	
		//Create List View variable associated with view on activity little league layout
		ListView lv = (ListView) findViewById(R.id.lstPlayers);
		//Create string array to hold list of players names
		String[] strPlayers = new String[]{" Scott \"Smalls\" ",
										"Benny \"The Jet\" Rodriguez",
										"Michael \"Squintz\" Palledorous",
										"Hamilton \"Ham\" Porter",
										"Alan \"Yeah-Yeah\" McClennan",
										"Kenny DeNunez",
										"Bertram Weeks",
										"Tommy \"Repeat\" Timmons",
										"Timmy Timmons"};
		//Create list adapter variable to hold list of textview objectes and associate with array of strings.
		ListAdapter arrPlayers = new ArrayAdapter<String>(this,R.layout.player_text_view,strPlayers);
		//Assign list adapter to list view control
		lv.setAdapter(arrPlayers);
		
	
	
	}

	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.little_league, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.new_player:
			Intent intent = new Intent();
			intent.setClass(this, NewPlayer.class);
			startActivity(intent);
			return true;
//		case R.id.games:
//			Toast.makeText(getBaseContext(), "Little League Message", Toast.LENGTH_SHORT).show();
		
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	
}
