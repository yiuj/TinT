package com.example.tception;


import java.util.ArrayList;
import com.tintpackage.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
public class LevelOneSingle extends Activity{
	
	private Handler mHandler = new Handler();
	ImageButton[][] buttons = new ImageButton[3][3];
	boolean xPlayer = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level_one_single);
		
		ImageButton backButtonClassic = (ImageButton)findViewById(R.id.backButtonClassic);
		
		final ImageButton xwins = (ImageButton)findViewById(R.id.xwins);
		final ImageButton owins = (ImageButton)findViewById(R.id.owins);
		final ImageButton tie = (ImageButton)findViewById(R.id.tie);
		
		View.OnClickListener backListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		};

		backButtonClassic.setOnClickListener(backListener);
		
		buttons[0][0] = (ImageButton)findViewById(R.id.cell_1_1);
		buttons[0][1] = (ImageButton)findViewById(R.id.cell_1_2);
		buttons[0][2] = (ImageButton)findViewById(R.id.cell_1_3);
		buttons[1][0] = (ImageButton)findViewById(R.id.cell_2_1);
		buttons[1][1] = (ImageButton)findViewById(R.id.cell_2_2);
		buttons[1][2] = (ImageButton)findViewById(R.id.cell_2_3);
		buttons[2][0] = (ImageButton)findViewById(R.id.cell_3_1);
		buttons[2][1] = (ImageButton)findViewById(R.id.cell_3_2);
		buttons[2][2] = (ImageButton)findViewById(R.id.cell_3_3);
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3;  c++)
			{
				buttons[r][c].setTag(R.drawable.one);
			}
		}
		
		View.OnClickListener listener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ImageButton button = ((ImageButton)v);
				button.setImageResource(R.drawable.one_d_x);
				button.setTag(R.drawable.xcell);
				if(xPlayer)
				{
					button.setImageResource(R.drawable.one_x);
					button.setTag(R.drawable.one_x);
					button.setEnabled(false);
					if(hasWon(R.drawable.one_x))
					{
						turnOffAllCells();
						xwins.setVisibility(View.VISIBLE);
					}
					else
					{
						xPlayer = !xPlayer;
						clickRandom();
					}
				}
				else
				{
					button.setImageResource(R.drawable.one_o);
					button.setTag(R.drawable.one_o);
					if(hasWon(R.drawable.one_o))
					{
						turnOffAllCells();
						owins.setVisibility(View.VISIBLE);
					}
					xPlayer = !xPlayer;
				}
				if(isTie() && !hasWon(R.drawable.one_x) && !hasWon(R.drawable.one_o))
				{
					turnOffAllCells();
					tie.setVisibility(View.VISIBLE);
				}
			}
		};
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				buttons[r][c].setOnClickListener(listener);
			}
		}
	}
	
	public ArrayList<ImageButton> getEmptyCells(){
		ArrayList<ImageButton> emptyCells = new ArrayList<ImageButton>();
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				if(Integer.parseInt(buttons[r][c].getTag().toString()) == R.drawable.one)
				{
					emptyCells.add(buttons[r][c]);
				}
			}
		}
		return emptyCells;
	}
	
	public void clickRandom(){
		ArrayList<ImageButton> emptyCells = getEmptyCells();
		if(emptyCells.size() == 0){
		}
		else
		{
			int random = (int)(Math.random()*emptyCells.size());
			try 
			{
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} 
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			emptyCells.get(random).performClick();
		}
	}
	
	/**
	 * Precondition: game is over
	 */
	public void turnOffAllCells(){
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				buttons[r][c].setEnabled(false);
			}
		}
	}
	
	public boolean hasWon(int drawable)
	{
		boolean win = false;
	    for(int col = 0; col<3; col++)
	    {
	        if(Integer.parseInt(buttons[0][col].getTag().toString()) == drawable  && 
	           Integer.parseInt(buttons[1][col].getTag().toString()) == drawable &&
	           Integer.parseInt(buttons[2][col].getTag().toString()) == drawable)
	        {
	            win = true;
	        }
	    }
	    for(int row = 0; row<3; row++)
	    {
	        if(Integer.parseInt(buttons[row][0].getTag().toString()) == drawable &&
	        	Integer.parseInt(buttons[row][1].getTag().toString()) == drawable &&
	        	Integer.parseInt(buttons[row][2].getTag().toString()) == drawable)
	        {
	            win = true;
	        }
	    }
	    if((Integer.parseInt(buttons[0][0].getTag().toString()) == drawable && 
	    	Integer.parseInt(buttons[1][1].getTag().toString()) == drawable &&
	    	Integer.parseInt(buttons[2][2].getTag().toString()) == drawable) ||
	        (Integer.parseInt(buttons[0][2].getTag().toString()) == drawable &&
	        Integer.parseInt(buttons[1][1].getTag().toString()) == drawable &&
	        Integer.parseInt(buttons[2][0].getTag().toString()) == drawable))
	    {
	        win = true;
	    }
	    return win;
	}
	
	public boolean isTie()
	{
		boolean tie = true;
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				if(Integer.parseInt(buttons[r][c].getTag().toString()) == R.drawable.one)
				{
					tie = false;
				}
			}
		}
		return tie;
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
