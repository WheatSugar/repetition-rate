package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {  
    	Scanner input1 = new Scanner(System.in);
    	Scanner input2 = new Scanner(System.in);	
    	Scanner input3 = new Scanner(System.in);
    	//��ȡԭ���ĵĵ�ַ��Ϣ
    	System.out.print("������ԭ�ĵ�ַ��");   
    	String s1 = input1.nextLine();
    	//��ȡ��Ϯ���ĵĵ�ַ��Ϣ
    	System.out.print("�����볭Ϯ���ĵ�ַ��");
    	String s2 =input2.nextLine();
    	if(s1.length()==0 && s2.length()==0) {
    		System.out.println("�ĵ�Ϊ��");
    	}
    	//�����������ֵΪС�������λ
        DecimalFormat df = new DecimalFormat("0.00");
        Similarity similarity1 = new Similarity(s1, s2);  
        System.out.println("�ظ���Ϊ��"+df.format(similarity1.sim()));  
    } 
}