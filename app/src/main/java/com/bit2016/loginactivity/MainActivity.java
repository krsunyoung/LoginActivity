package com.bit2016.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //html String UI에 적용하기
        TextView textView = (TextView)findViewById( R.id.tv_signup );
        textView.setMovementMethod( LinkMovementMethod.getInstance() );
        textView.setText( Html.fromHtml( getString(R.string.login_url) )); //R.string.login_url 이렇게 못쓴다. r은 integer를 말하기 때문에
    }
}
