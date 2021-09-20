package test;

import java.text.DecimalFormat;

public class double2ftest {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		double d1 = 0.83647589638463846894;
		System.out.println(df.format(d1));
	}

}
