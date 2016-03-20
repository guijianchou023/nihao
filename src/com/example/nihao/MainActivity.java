package com.example.nihao;

import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {

   private Button loginButton;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loginButton=(Button)findViewById(R.id.imageButton1);
        int [][] a=new int [3][];
        a[0]=new int[2];
        a[1]=new int[3];
        a[2]=new int[4];
        for(int i=0;i<3;i++)
        	for(int j=0;j<a[i].length;j++)
        	{
        		a[i][j]=i+j;
        		System.out.println(a[i][j]);
        	}
	}


    /*1.初始化当前控件
     * */
}
