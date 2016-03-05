package com.abhi.palindrome;



import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PalindomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_palindome);
	}
	public void  fnclick(View v) {
		EditText txt=(EditText) findViewById(R.id.editText1);
		String txt1=txt.getText().toString();
		String txt2="";
		if(txt1.equals("")){
			return;
		}
		for (int i = txt1.length()-1; i>=0; i--) {
			txt2=txt2+txt1.charAt(i);
			
		}
		if(txt1.equals(txt2)){
			Toast.makeText(PalindomeActivity.this, "ITS A PALINDROME", 1000).show(); 
		}
		else{
			Toast.makeText(PalindomeActivity.this, "IT IS NOT A PALINDROME", 1000).show(); 
		}
		txt.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.palindome, menu);
		return true;
	}

}
