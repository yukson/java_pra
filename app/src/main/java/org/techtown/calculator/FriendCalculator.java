package org.techtown.calculator;

import android.content.Context;
import android.widget.Toast;

public class FriendCalculator implements Calculator{
    Context context;

    public FriendCalculator(Context context){
        this.context = context;
    }

    public int add(int a, int b){
        Toast.makeText(context, "더하기를 했습니다.",
                Toast.LENGTH_LONG).show();

        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("빼기 구현 안 함");
    }

    @Override
    public int multiply(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("곱하기 구현 안 함");
    }

    @Override
    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기 구현 안 함");
    }


}
