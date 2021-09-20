package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {  
    	Scanner input1 = new Scanner(System.in);
    	Scanner input2 = new Scanner(System.in);	
    	Scanner input3 = new Scanner(System.in);
    	//获取原论文的地址信息
    	System.out.print("请输入原文地址：");   
    	String s1 = input1.nextLine();
    	//获取抄袭论文的地址信息
    	System.out.print("请输入抄袭论文地址：");
    	String s2 =input2.nextLine();
    	if(s1.length()==0 && s2.length()==0) {
    		System.out.println("文档为空");
    	}
    	//控制输出的数值为小数点后两位
        DecimalFormat df = new DecimalFormat("0.00");
        Similarity similarity1 = new Similarity(s1, s2);  
        System.out.println("重复率为："+df.format(similarity1.sim()));  
    } 
}