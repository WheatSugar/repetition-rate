package test;

import java.util.Map;
import java.util.Set;

public class test1 {

	// 求平方和  
    private double squares(Map<Character, int[]> paramMap) {  
        double result1 = 0.00;  //向量1的模
        double result2 = 0.00;  //向量2的模
        double resultproduct = 0.00;//向量积
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
