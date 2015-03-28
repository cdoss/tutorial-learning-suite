package com.cdoss.tutoriallearningsuite.lessons;

import com.cdoss.tutoriallearningsuite.R;
import com.cdoss.tutoriallearningsuite.R.id;
import com.cdoss.tutoriallearningsuite.R.layout;
import com.cdoss.tutoriallearningsuite.R.menu;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class LessonOneActivity extends ActionBarActivity {

	private EditText inputText1;
	private TextView outputText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson_one);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lesson_one, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_lesson_one,
					container, false);
			return rootView;
		}
	}
	
	public void clearText(View view){
		inputText1 = (EditText)findViewById(R.id.lessonOneUserInput);
		outputText = (TextView)findViewById(R.id.lessonOneDisplayText);
		
		inputText1.setText(R.string.empty);
		outputText.setText(R.string.empty);
	}
	
	public void submitText(View view){
		inputText1 = (EditText)findViewById(R.id.lessonOneUserInput);
		outputText = (TextView)findViewById(R.id.lessonOneDisplayText);
		
		String input = inputText1.getText().toString();
		outputText.setText(input);
		inputText1.setText(R.string.empty);
	}

}
