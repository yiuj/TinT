package com.example.tception;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import com.tintpackage.R;
public class SinglePlayer extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleplayer);
		
		ImageButton backButtonSingle = (ImageButton)findViewById(R.id.backButtonSingle);
		
		ImageButton levelSixButton = (ImageButton)findViewById(R.id.levelSixButton);
		
		View.OnClickListener backListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		};
		backButtonSingle.setOnClickListener(backListener);
		
		View.OnClickListener levelSixListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent levelSixIntent = new Intent(v.getContext(),LevelOneSingle.class);
				startActivity(levelSixIntent);
			}
		};
		levelSixButton.setOnClickListener(levelSixListener);
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
