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
        
        // 從資源類別R中取得介面元件
        btnDoSug = (Button)findViewById(R.id.btnDoSug);
        edtSex = (EditText)findViewById(R.id.edtSex);
        edtAge = (EditText)findViewById(R.id.edtAge);
        txtResult = (TextView)findViewById(R.id.txtResult);

   	    // 設定button元件的事件listener
   	    btnDoSug.setOnClickListener(btnDoSugOnClick);
    }
	
	//listener的設定，button按下後的否應
	private Button.OnClickListener btnDoSugOnClick = new Button.OnClickListener() {
		// 按下按鈕後要執行的程式碼
		public void onClick(View v) {
			//把性別存到strSex這個字串
    		String strSex = edtSex.getText().toString();
    		//把年齡先存到字串，再轉成int
    		int iAge = Integer.parseInt(edtAge.getText().toString());
    			
    		String strSug = "Result：";
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
    		
    		//把結果存到txtResult這個TextView
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
