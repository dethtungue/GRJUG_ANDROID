package com.example.littleleagueroster;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class NewPlayer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_player);
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_player, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		//Save player menu item selected.  Display Toast message and finish this activity to return to Little League activity
		case R.id.save_player:
			Toast.makeText(getBaseContext(), "Save Player Message\nFinish New Player Activity", Toast.LENGTH_SHORT).show();
			NewPlayer.this.finish();
			return true;
		//Default condition
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	
}
