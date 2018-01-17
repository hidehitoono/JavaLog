package jp.techacademy.hidehito.ono.javalog;

import android.util.Log;

class BigDog extends Dog {
    //クラス変数
    static String to_jp ="大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    //クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}

/**
 * Created by onohidehito on 2018/01/02.
 */

