package test;

import java.util.Map;
import java.util.Set;

public class test1 {

	// ��ƽ����  
    private double squares(Map<Character, int[]> paramMap) {  
        double result1 = 0.00;  //����1��ģ
        double result2 = 0.00;  //����2��ģ
        double resultproduct = 0.00;//������
        Set<Character> keySet = paramMap.keySet();  
        for (Character character : keySet) {  
            int temp[] = paramMap.get(character);  
            result1 += (temp[0] * temp[0]);  
            result2 += (temp[1] * temp[1]);  
        } 
        resultproduct = result1 * result2;
        return resultproduct;  
    }  

}
