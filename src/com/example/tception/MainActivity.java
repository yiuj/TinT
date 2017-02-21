package com.example.tception;


import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import com.tintpackage.R;
public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//write this code for image buttons
		ImageButton single = (ImageButton)findViewById(R.id.single); 
		ImageButton multiButton = (ImageButton)findViewById(R.id.multiButton);
		
		View.OnClickListener singleListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Intent intentSingle = new Intent(v.getContext(),SinglePlayer.class);
					startActivity(intentSingle);
				}
				catch(Exception e) {
					Log.i("MainActivity","Failed to load Single Player. " + e.getMessage());
				}
			}
		};
		single.setOnClickListener(singleListener);
		
		View.OnClickListener mutliListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Intent intentMulti = new Intent(v.getContext(),Multiplayer.class);
					startActivity(intentMulti);
				}
				catch(Exception e) {
					Log.i("MainActivity", "Failed to load Multiplayer. " + e.getMessage());
				}
			}
		};
		multiButton.setOnClickListener(mutliListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
