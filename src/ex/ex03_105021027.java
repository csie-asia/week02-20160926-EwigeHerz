package ex;
import java.util.*;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021027 陳宴湘
 */

public class ex03_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
  
    int n1 = 4*30;
    int n2 = 4*40;
    int n3 = 1*60;
    int n = 0;
    n = n1+n2+n3;
    System.out.print("早上10點23分停到下午3點20分是:"+n);
	}

}
