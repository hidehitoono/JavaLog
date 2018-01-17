package jp.techacademy.hidehito.ono.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("秀太郎",3, "スキー");   //名前をポチ、年齢３歳で、Dogのインスタンスを作る

        human.say();
        human.think();
    }

}



