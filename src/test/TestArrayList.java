package test;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> intList = new ArrayList<>();
		Collections.addAll(intList, "1","2","3","4","5" );
		ArrayList<String> intList2 = new ArrayList<>(intList);
		/*System.out.println(intList);
		intList.remove("2");
		System.out.println(intList);
		System.out.println(intLis2);*/
	}

}
