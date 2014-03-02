package com.example.marrysuggestion;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.util.*;

public class MainActivity extends Activity {

	private Button btnDoSug;
    private EditText edtSex, edtAge;
    private TextView txtResult;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // �q�귽���OR�����o��������
        btnDoSug = (Button)findViewById(R.id.btnDoSug);
        edtSex = (EditText)findViewById(R.id.edtSex);
        edtAge = (EditText)findViewById(R.id.edtAge);
        txtResult = (TextView)findViewById(R.id.txtResult);

   	    // �]�wbutton���󪺨ƥ�listener
   	    btnDoSug.setOnClickListener(btnDoSugOnClick);
    }
	
	//listener���]�w�Abutton���U�᪺�_��
	private Button.OnClickListener btnDoSugOnClick = new Button.OnClickListener() {
		// ���U���s��n���檺�{���X
		public void onClick(View v) {
			//��ʧO�s��strSex�o�Ӧr��
    		String strSex = edtSex.getText().toString();
    		//��~�֥��s��r��A�A�নint
    		int iAge = Integer.parseInt(edtAge.getText().toString());
    			
    		String strSug = "Result�G";
    		if (strSex.equals("male"))
    			if (iAge < 28) {
    				strSug += "Not hurry!!";
    				Log.d("MarriSug", "man, Not hurry!!");
    			}
    			else if (iAge > 33) {
    				strSug += "Get married!!";
    				Log.d("MarriSug", "man, Get married!!");
    			}
    			else {
    				strSug += "Start dating!!";
    				Log.d("MarriSug", "man, Start dating!!");
    			}
    		else
    			if (iAge < 25) {
    				strSug += "Not hurry!!";
    				Log.d("MarriSug", "man, Not hurry!!");
    			}
    			else if (iAge > 30) {
    				strSug += "Get married!!";
    				Log.d("MarriSug", "man, Get married!!");
    			}
    			else {
    				strSug += "Start dating!!";
    				Log.d("MarriSug", "man, Start dating!!");
    			}
    		
    		//�⵲�G�s��txtResult�o��TextView
    		txtResult.setText(strSug);
    	}
    };


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
    
}
