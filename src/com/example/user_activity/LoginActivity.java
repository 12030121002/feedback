package com.example.user_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private Button btnClick;
	private EditText username;
    private EditText password;
    private Button logon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
		logon = (Button) findViewById(R.id.logon);
	
		
	OnClickListener list = new OnClickListener() {
		@Override
		public void onClick(View arg0){
			String txt1 = username.getText().toString();
			String txt2 = password.getText().toString();
			if(txt1.equals(txt2)){
				/* ********Explicit intent****** */
				Intent intent = new Intent(getApplicationContext(),
			Details_Activity.class);
				/*to input name*/
				intent.putExtra("username",txt1);
				/* intent is just the message passed */
				
			
				startActivity(intent);
			}
			else{
				Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_LONG).show();
			}
	

			
		}
	
	};
	btnClick.setOnClickListener(list);
	logon.setOnClickListener(list);
	}
}
