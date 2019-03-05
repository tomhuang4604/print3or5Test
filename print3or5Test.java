package com.southgis.imobile.utils;

import java.util.ArrayList;
import java.util.List;

public class print3or5Test {
	public static void main(String[] args) {
     int i = 1;
     List<Integer> numbers = new ArrayList<>();
     while(i<=100) {
    	 numbers.add(i);
    	 i++;
     }
     numbers.forEach(item->{
    	    if(item%3==0&&item%5!=0){
    	        System.out.println("Fizz");
    	    }else if(item%5==0&&item%3!=0) {
    	    	 System.out.println("Buzz");
    	    }else if(item%3==0&&item%5==0) {
    	    	System.out.println("FizzBuzz");
    	    }else {
    	    	System.out.println(item);
    	    }
    	    
    	});
	}

}
