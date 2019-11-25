package com.test.jacoco;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
		if(a<=0||b<=0||c<=0){
			// if there is a zero or negative number
			return false;
		}
		int[] tmp = {a, b, c};
        Arrays.sort(tmp);
        if (tmp[0] + tmp[1] > tmp[2]) {
            return true;
        }

        return false;

    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
		
        // 如果日期不合法，则抛异常
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
			String strDate = String.format("%04d-%02d-%02d", year,month,day);
			sdf.setLenient(false);
			Date date = sdf.parse(strDate);
			// 截取当前时间年月日 转成整型
			long  tempDate=new Date(year - 1990, month - 1, 1).getTime(); 
			// 截取开始时间年月日 转成整型
			long  tempDateBegin=new Date(0, 0, 1).getTime();
			// 截取结束时间年月日   转成整型
			long  tempDateEnd=new Date(2019 - 1990, 9, 1).getTime();
			if ((tempDate >= tempDateBegin && tempDate <= tempDateEnd)) {  
				return true;  
			} else {  
				return false;  
			}  
		} catch (Exception ex){
			return false;
		}
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
		double result = 0.0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                break;
        }
    	return result;
	}
    
}
