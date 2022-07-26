package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import multiplethread.TestThread;

public class Test {

	 enum Season {
	    SPRING,SUMMER,AUTUMN,WINTER,ds
	} ;
	
	//私有化构造方法使得该类无法在外部通过new 进行实例化
     
 
    <T>  void f(T t){}
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
 
    //private static Test instance = new Test();
     
    //public static 方法，提供给调用者获取12行定义的对象
    /*public static Test getInstance(){
        return instance;
    }*/
    
	/*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Test g1 = Test.getInstance().getInstance();
		Test g2 = Test.getInstance();
		Test g3 = Test.getInstance();
         
        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        String a;
        //int a;
//        if(new Cat().equals(obj)){}
        
	}*/
	/*  String comulate(Cat i){
		i.name = i.name+1;
		return i.name+1;
	}*/
	private static void comulate1(Cat cat){
		cat.age = 100;
	}
	static Animal animalFilter(Animal animal,String...strings) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		/*if(animal!=null){
			Field[] fiellds = animal.getClass().getDeclaredFields();
			boolean f = false;
			for (Field field : fiellds) {
				if(field.get(animal)!=null){
					f = true;
				}
			}
			if(f == false){
				//animal = session
			}
		}*/
		animal = animal.getClass().newInstance();
		System.out.println(animal.getClass());
		return animal;
	}
	
	
	
	public static void animalDo(Animal animal){
 		return;
	}
	
	int a = 0;
	{
		a=1;
		System.out.println("代码块开始了"+a);
		
	}
	Test(){
		String[] arr;
        System.out.println("构造器开始了"+a);
        a++;
        int a;
        
   }
	
	
	/**
	 * 
	 * @Description:
	 * @Author zyx
	 * @date 2022年3月23日
	 * @Documented
	 */
	public static void main(String[] args){
		    Runnable runnable = () -> {
		        for (int i = 0; i <= 100; i++) {
		            System.out.println(Thread.currentThread().getName() + "-----" + i);
		            if (i % 20 == 0) {
		                Thread.yield();
		            }
		        }
		    };
		    new Thread(runnable, "栈长").start();
		    new Thread(runnable, "小蜜").start();
		    
		    //2341
	}
}
