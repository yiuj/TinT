package com.example.tception;


import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.tintpackage.R;
public class LevelSixMulti extends Activity{

	ImageButton[][][] buttons = new ImageButton[9][3][3];
	boolean xPlayer = true;
	boolean gameOver = false;
	int oCount = 0;
	int xCount = 0;
	private boolean cellZeroWon = false;
	private boolean cellOneWon = false;
	private boolean cellTwoWon = false;
	private boolean cellThreeWon = false;
	private boolean cellFourWon = false;
	private boolean cellFiveWon = false;
	private boolean cellSixWon = false;
	private boolean cellSevenWon = false;
	private boolean cellEightWon = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xtreme_multi);
		
		ImageButton backButton = (ImageButton)findViewById(R.id.backButton);
		ImageButton helpButton = (ImageButton)findViewById(R.id.helpButton);	
		
		View.OnClickListener backListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		};

		View.OnClickListener instructionsListener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(),XtremeInstructions.class);
				startActivity(intent);
			}
		};

		backButton.setOnClickListener(backListener);
		helpButton.setOnClickListener(instructionsListener);
		
		buttons[0][0][0] = (ImageButton)findViewById(R.id.cell_0_0_0);
		buttons[0][0][1] = (ImageButton)findViewById(R.id.cell_0_0_1);
		buttons[0][0][2] = (ImageButton)findViewById(R.id.cell_0_0_2);
		buttons[0][1][0] = (ImageButton)findViewById(R.id.cell_0_1_0);
		buttons[0][1][1] = (ImageButton)findViewById(R.id.cell_0_1_1);
		buttons[0][1][2] = (ImageButton)findViewById(R.id.cell_0_1_2);
		buttons[0][2][0] = (ImageButton)findViewById(R.id.cell_0_2_0);
		buttons[0][2][1] = (ImageButton)findViewById(R.id.cell_0_2_1);
		buttons[0][2][2] = (ImageButton)findViewById(R.id.cell_0_2_2);
		
		buttons[1][0][0] = (ImageButton)findViewById(R.id.cell_1_0_0);
		buttons[1][0][1] = (ImageButton)findViewById(R.id.cell_1_0_1);
		buttons[1][0][2] = (ImageButton)findViewById(R.id.cell_1_0_2);
		buttons[1][1][0] = (ImageButton)findViewById(R.id.cell_1_1_0);
		buttons[1][1][1] = (ImageButton)findViewById(R.id.cell_1_1_1);
		buttons[1][1][2] = (ImageButton)findViewById(R.id.cell_1_1_2);
		buttons[1][2][0] = (ImageButton)findViewById(R.id.cell_1_2_0);
		buttons[1][2][1] = (ImageButton)findViewById(R.id.cell_1_2_1);
		buttons[1][2][2] = (ImageButton)findViewById(R.id.cell_1_2_2);
		
		buttons[2][0][0] = (ImageButton)findViewById(R.id.cell_2_0_0);
		buttons[2][0][1] = (ImageButton)findViewById(R.id.cell_2_0_1);
		buttons[2][0][2] = (ImageButton)findViewById(R.id.cell_2_0_2);
		buttons[2][1][0] = (ImageButton)findViewById(R.id.cell_2_1_0);
		buttons[2][1][1] = (ImageButton)findViewById(R.id.cell_2_1_1);
		buttons[2][1][2] = (ImageButton)findViewById(R.id.cell_2_1_2);
		buttons[2][2][0] = (ImageButton)findViewById(R.id.cell_2_2_0);
		buttons[2][2][1] = (ImageButton)findViewById(R.id.cell_2_2_1);
		buttons[2][2][2] = (ImageButton)findViewById(R.id.cell_2_2_2);
		
		buttons[3][0][0] = (ImageButton)findViewById(R.id.cell_3_0_0);
		buttons[3][0][1] = (ImageButton)findViewById(R.id.cell_3_0_1);
		buttons[3][0][2] = (ImageButton)findViewById(R.id.cell_3_0_2);
		buttons[3][1][0] = (ImageButton)findViewById(R.id.cell_3_1_0);
		buttons[3][1][1] = (ImageButton)findViewById(R.id.cell_3_1_1);
		buttons[3][1][2] = (ImageButton)findViewById(R.id.cell_3_1_2);
		buttons[3][2][0] = (ImageButton)findViewById(R.id.cell_3_2_0);
		buttons[3][2][1] = (ImageButton)findViewById(R.id.cell_3_2_1);
		buttons[3][2][2] = (ImageButton)findViewById(R.id.cell_3_2_2);
		
		buttons[4][0][0] = (ImageButton)findViewById(R.id.cell_4_0_0);
		buttons[4][0][1] = (ImageButton)findViewById(R.id.cell_4_0_1);
		buttons[4][0][2] = (ImageButton)findViewById(R.id.cell_4_0_2);
		buttons[4][1][0] = (ImageButton)findViewById(R.id.cell_4_1_0);
		buttons[4][1][1] = (ImageButton)findViewById(R.id.cell_4_1_1);
		buttons[4][1][2] = (ImageButton)findViewById(R.id.cell_4_1_2);
		buttons[4][2][0] = (ImageButton)findViewById(R.id.cell_4_2_0);
		buttons[4][2][1] = (ImageButton)findViewById(R.id.cell_4_2_1);
		buttons[4][2][2] = (ImageButton)findViewById(R.id.cell_4_2_2);
		
		buttons[5][0][0] = (ImageButton)findViewById(R.id.cell_5_0_0);
		buttons[5][0][1] = (ImageButton)findViewById(R.id.cell_5_0_1);
		buttons[5][0][2] = (ImageButton)findViewById(R.id.cell_5_0_2);
		buttons[5][1][0] = (ImageButton)findViewById(R.id.cell_5_1_0);
		buttons[5][1][1] = (ImageButton)findViewById(R.id.cell_5_1_1);
		buttons[5][1][2] = (ImageButton)findViewById(R.id.cell_5_1_2);
		buttons[5][2][0] = (ImageButton)findViewById(R.id.cell_5_2_0);
		buttons[5][2][1] = (ImageButton)findViewById(R.id.cell_5_2_1);
		buttons[5][2][2] = (ImageButton)findViewById(R.id.cell_5_2_2);
		
		buttons[6][0][0] = (ImageButton)findViewById(R.id.cell_6_0_0);
		buttons[6][0][1] = (ImageButton)findViewById(R.id.cell_6_0_1);
		buttons[6][0][2] = (ImageButton)findViewById(R.id.cell_6_0_2);
		buttons[6][1][0] = (ImageButton)findViewById(R.id.cell_6_1_0);
		buttons[6][1][1] = (ImageButton)findViewById(R.id.cell_6_1_1);
		buttons[6][1][2] = (ImageButton)findViewById(R.id.cell_6_1_2);
		buttons[6][2][0] = (ImageButton)findViewById(R.id.cell_6_2_0);
		buttons[6][2][1] = (ImageButton)findViewById(R.id.cell_6_2_1);
		buttons[6][2][2] = (ImageButton)findViewById(R.id.cell_6_2_2);
	 
		buttons[7][0][0] = (ImageButton)findViewById(R.id.cell_7_0_0);
		buttons[7][0][1] = (ImageButton)findViewById(R.id.cell_7_0_1);
		buttons[7][0][2] = (ImageButton)findViewById(R.id.cell_7_0_2);
		buttons[7][1][0] = (ImageButton)findViewById(R.id.cell_7_1_0);
		buttons[7][1][1] = (ImageButton)findViewById(R.id.cell_7_1_1);
		buttons[7][1][2] = (ImageButton)findViewById(R.id.cell_7_1_2);
		buttons[7][2][0] = (ImageButton)findViewById(R.id.cell_7_2_0);
		buttons[7][2][1] = (ImageButton)findViewById(R.id.cell_7_2_1);
		buttons[7][2][2] = (ImageButton)findViewById(R.id.cell_7_2_2);
		
		buttons[8][0][0] = (ImageButton)findViewById(R.id.cell_8_0_0);
		buttons[8][0][1] = (ImageButton)findViewById(R.id.cell_8_0_1);
		buttons[8][0][2] = (ImageButton)findViewById(R.id.cell_8_0_2);
		buttons[8][1][0] = (ImageButton)findViewById(R.id.cell_8_1_0);
		buttons[8][1][1] = (ImageButton)findViewById(R.id.cell_8_1_1);
		buttons[8][1][2] = (ImageButton)findViewById(R.id.cell_8_1_2);
		buttons[8][2][0] = (ImageButton)findViewById(R.id.cell_8_2_0);
		buttons[8][2][1] = (ImageButton)findViewById(R.id.cell_8_2_1);
		buttons[8][2][2] = (ImageButton)findViewById(R.id.cell_8_2_2);
		
		View.OnClickListener listener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				turnOffAllCells();
				ImageButton button = ((ImageButton)v);
				if(xPlayer)
				{
					button.setImageResource(R.drawable.xcell);
					button.setTag(R.drawable.xcell);
					button.setEnabled(false);
						if(hasWonCell(R.drawable.xcell, getLargeCell(button)))
						{
							if(getLargeCell(button) == 0)
							{
								cellZeroWon = true;
							}
							else if(getLargeCell(button) == 1)
							{
								cellOneWon = true;
							}
							else if(getLargeCell(button) == 2)
							{
								cellTwoWon = true;
							}
							else if(getLargeCell(button) == 3)
							{
								cellThreeWon = true;
							}
							else if(getLargeCell(button) == 4)
							{
								cellFourWon = true;
							}
							else if(getLargeCell(button) == 5)
							{
								cellFiveWon = true;
							}
							else if(getLargeCell(button) == 6)
							{
								cellSixWon = true;
							}
							else if(getLargeCell(button) == 7)
							{
								cellSevenWon = true;
							}
							else if(getLargeCell(button) == 8)
							{
								cellEightWon = true;
							}
							xCount++;
					}
					int cellSwitch = getLargeCellForSwitch(getRow(button),getCol(button));
					switchToCell(cellSwitch);
				}
				else
				{
					button.setImageResource(R.drawable.ocell);
					button.setTag(R.drawable.ocell);
					button.setEnabled(false);
					if(hasWonCell(R.drawable.ocell, getLargeCell(button)))
					{
							if(getLargeCell(button) == 0)
							{
								cellZeroWon = true;
							}
							else if(getLargeCell(button) == 1)
							{
								cellOneWon = true;
							}
							else if(getLargeCell(button) == 2)
							{
								cellTwoWon = true;
							}
							else if(getLargeCell(button) == 3)
							{
								cellThreeWon = true;
							}
							else if(getLargeCell(button) == 4)
							{
								cellFourWon = true;
							}
							else if(getLargeCell(button) == 5)
							{
								cellFiveWon = true;
							}
							else if(getLargeCell(button) == 6)
							{
								cellSixWon = true;
							}
							else if(getLargeCell(button) == 7)
							{
								cellSevenWon = true;
							}
							else if(getLargeCell(button) == 8)
							{
								cellEightWon = true;
							}
							oCount++;
					}
					int cellSwitch = getLargeCellForSwitch(getRow(button),getCol(button));
					switchToCell(cellSwitch);
				}
				xPlayer=!xPlayer;
				if(xCount == 5)
				{
					turnOffAllCells();
					ImageButton xwins = (ImageButton)findViewById(R.id.xwinsXtreme);
					xwins.setVisibility(View.VISIBLE);
				}
				if(oCount == 5)
				{
					turnOffAllCells();
					ImageButton owins = (ImageButton)findViewById(R.id.owinsXtreme);
					owins.setVisibility(View.VISIBLE);
				}
			}
		};
		
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					buttons[b][r][c].setOnClickListener(listener);
					buttons[b][r][c].setTag(R.drawable.emptycell);
				}
			}
		}
	}
	
	public boolean getLargeCellWon(int largeCell)
	{
		if(largeCell == 0)
		{
			return cellZeroWon;
		}
		else if(largeCell == 1)
		{
			return cellOneWon;
		}
		else if(largeCell == 2)
		{
			return cellTwoWon;
		}
		else if(largeCell == 3)
		{
			return cellThreeWon;
		}
		else if(largeCell == 4)
		{
			return cellFourWon;
		}
		else if(largeCell == 5)
		{
			return cellFiveWon;
		}
		else if(largeCell == 6)
		{
			return cellSixWon;
		}
		else if(largeCell == 7)
		{
			return cellSevenWon;
		}
		return cellEightWon;
	}
	
	public boolean hasWonCell(int drawable, int largeCell)
	{
		boolean win = false;
		if(!getLargeCellWon(largeCell))
		{
			for(int col = 0; col<3; col++)
			{
				if(Integer.parseInt(buttons[largeCell][0][col].getTag().toString()) == drawable  && 
						Integer.parseInt(buttons[largeCell][1][col].getTag().toString()) == drawable &&
						Integer.parseInt(buttons[largeCell][2][col].getTag().toString()) == drawable)
				{
					win = true;
				}
			}
			for(int row = 0; row<3; row++)
			{
				if(Integer.parseInt(buttons[largeCell][row][0].getTag().toString()) == drawable &&
						Integer.parseInt(buttons[largeCell][row][1].getTag().toString()) == drawable &&
						Integer.parseInt(buttons[largeCell][row][2].getTag().toString()) == drawable)
				{
					win = true;
				}
			}
			if((Integer.parseInt(buttons[largeCell][0][0].getTag().toString()) == drawable && 
					Integer.parseInt(buttons[largeCell][1][1].getTag().toString()) == drawable &&
					Integer.parseInt(buttons[largeCell][2][2].getTag().toString()) == drawable) ||
					(Integer.parseInt(buttons[largeCell][0][2].getTag().toString()) == drawable &&
					Integer.parseInt(buttons[largeCell][1][1].getTag().toString()) == drawable &&
					Integer.parseInt(buttons[largeCell][2][0].getTag().toString()) == drawable))
			{
				win = true;
			}
		}
	    return win;
	}

	public void turnOffOtherButtons(int largeCell)
	{
		for(int i=0; i<9; i++)
		{
			if(i != largeCell)
			{
				for(int r=0; r<3; r++)
				{
					for(int c=0; c<3; c++)
					{
						buttons[i][r][c].setEnabled(false);
					}
				}
			}
		}
	}
	
	public int getLargeCell(ImageButton button)
	{
		int largeCell = -1;
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					if(buttons[b][r][c] == button)
					{
						largeCell = b;
					}
				}
			}
		}
		return largeCell;
	}
	
	public int getRow(ImageButton button)
	{
		int row = -1;
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					if(buttons[b][r][c] == button)
					{
						row = r;
					}
				}
			}
		}
		return row;
	}
	
	public int getCol(ImageButton button)
	{
		int col = -1;
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					if(buttons[b][r][c] == button)
					{
						col = c;
					}
				}
			}
		}
		return col;
	}
	
	public int getLargeCellForSwitch(int row, int col)
	{
		return 3*row + col;
	}
	
	public void switchToCell(int largeCell)
	{
		turnOffAllCells();
		if(!turnOnEmptyCells(largeCell))
		{
			grayOutAllCells();
			ungrayCell(largeCell);
		}
		else
		{
			ungrayAllCells();
		}
	}
	
	public void turnOffAllCells()
	{
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					buttons[b][r][c].setEnabled(false);
				}
			}
		}
	}
	
	public boolean  turnOnEmptyCells(int largeCell)
	{
		boolean cellIsFull = true;
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.emptycell || Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
				{
					buttons[largeCell][r][c].setEnabled(true);
					cellIsFull = false;
				}
			}
		}
		if(cellIsFull)
		{
			for(int b=0; b<9; b++)
			{
				for(int r=0; r<3; r++)
				{
					for(int c=0; c<3; c++)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell || Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
						{
							buttons[largeCell][r][c].setEnabled(true);
						}
					}
				}
			}
		}
		return cellIsFull;
	}
	
	public void grayOutAllCells()
	{
		for(int b=0; b<9; b++)
		{
			for(int r=0; r<3; r++)
			{
				for(int c=0; c<3; c++)
				{
					if(b==0)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.zero_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.zero_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.zero_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==1)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.one_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.one_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.one_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==2)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.two_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.two_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.two_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==3)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.three_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.three_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.three_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==4)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.four_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.four_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.four_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==5)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.five_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.five_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.five_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==6)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.six_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.six_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.six_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==7)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.seven_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.seven_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.seven_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
					if(b==8)
					{
						if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.xcell)
						{
							buttons[b][r][c].setImageResource(R.drawable.eight_d_x);
							buttons[b][r][c].setTag(R.drawable.grayxcell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.ocell)
						{
							buttons[b][r][c].setImageResource(R.drawable.eight_d_o);
							buttons[b][r][c].setTag(R.drawable.grayocell);
						}
						else if(Integer.parseInt(buttons[b][r][c].getTag().toString()) == R.drawable.emptycell)
						{
							buttons[b][r][c].setImageResource(R.drawable.eight_d);
							buttons[b][r][c].setTag(R.drawable.graycell);
						}
					}
				}
			}
		}
	}
	
	public void ungrayAllCells()
	{
		for(int i=0; i<9; i++)
		{
			ungrayCell(i);
		}
	}
	
	public void ungrayCell(int largeCell)
	{
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				if(largeCell==0)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.zero_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.zero_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.zero);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==1)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.one_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.one_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.one);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==2)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.two_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.two_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.two);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==3)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.three_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.three_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.three);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==4)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.four_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.four_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.four);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==5)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.five_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.five_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.five);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==6)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.six_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.six_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.six);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==7)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.seven_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.seven_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.seven);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
				if(largeCell==8)
				{
					if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayxcell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.eight_x);
						buttons[largeCell][r][c].setTag(R.drawable.xcell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.grayocell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.eight_o);
						buttons[largeCell][r][c].setTag(R.drawable.ocell);
					}
					else if(Integer.parseInt(buttons[largeCell][r][c].getTag().toString()) == R.drawable.graycell)
					{
						buttons[largeCell][r][c].setImageResource(R.drawable.eight);
						buttons[largeCell][r][c].setTag(R.drawable.emptycell);
					}
				}
			}
		}
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
