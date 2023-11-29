package org.techtown.calculator;

public class MyCalculator implements Calculator{

    public int add(int a, int b){
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws UnImplementedException{
        throw new UnImplementedException("빼기 구현 안 함");
    }

    @Override
    public int multiply(int a, int b) throws UnImplementedException{
        throw new UnImplementedException("곱하기 구현 안 함");
    }

    @Override
    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기 구현 안 함");
    }
}
