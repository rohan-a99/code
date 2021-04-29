package com.android;
import com.simlpifyqa.action.*;

public class AndroidCustom{

public void custom1(){
System.out.println("Custom1 method is working fine");
}

public static void main(String[] args) 
    {
AndroidCustom obj = new AndroidCustom();
obj.custom1();
AndroidAction as = new AndroidAction();

}
}

