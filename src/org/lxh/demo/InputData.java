package org.lxh.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
	private BufferedReader buf = null;

	public InputData() {
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}

	public String getString(String info) {
		String str = null;
		System.out.print(info);// ��ӡ��ʾ��Ϣ
		try {
			str = this.buf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	public int getInt(String info, String err) {
		int temp = 0;
		boolean flag = true;// ����һ����־λ
		while (flag) {
			String str = this.getString(info);
			if (str.matches("\\d+")) {
				temp = Integer.parseInt(str);
				flag = false;// �˳�ѭ��
			} else {
				System.out.print(err);
			}
		}
		return temp;
	}

	public float getFloat(String info, String err) {
		float temp = 0.0f;
		boolean flag = true;// ����һ����־λ
		while (flag) {
			String str = this.getString(info);
			if (str.matches("\\d+.?\\d+")) {
				temp = Float.parseFloat(str);
				flag = false;// �˳�ѭ��
			} else {
				System.out.print(err);
			}
		}
		return temp;
	}

	public char getChar(String info, String err) {
		char temp = ' ';
		boolean flag = true;// ����һ����־λ
		while (flag) {
			String str = this.getString(info);
			if (str.matches("\\w")) {
				temp = str.charAt(0);
				flag = false;// �˳�ѭ��
			} else {
				System.out.print(err);
			}
		}
		return temp;
	}

	public Date getDate(String info, String err) {
		Date temp = null ;
		boolean flag = true;// ����һ����־λ
		while (flag) {
			String str = this.getString(info);
			if (str.matches("\\d{4}-\\d{2}-\\d{2}")) {
				try {
					temp = new SimpleDateFormat("yyyy-MM-dd").parse(str) ;
				} catch (ParseException e) {
					System.out.print(err) ;
				}
				flag = false;// �˳�ѭ��
			} else {
				System.out.print(err);
			}
		}
		return temp;
	}
}
