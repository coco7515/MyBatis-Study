package com._520it._exercise;

import java.util.Scanner;

/*4.ģ���½���̣� 
��1��ָ��һ���˺ţ�admin ���룺66666 
��2��ʹ��Scanner�����û���������,�����3�λ���
��3���ж��ַ������ʹ��equals���������������˺������붼��ȷ���ӡ����"��½�ɹ����������˵�..." 
��4������������ʾ��"��������˺Ż����벻��ȷ�����������룬������?�λ���"
��5�����3�ζ�������ӡ��"�������ε�½ʧ�ܣ��˳�ϵͳ��"*/

public class Number4 {
	public static void main(String[] args) {
		landing();
	}
	public static void landing(){
		for (int  i= 0;  i< 3; i++) {
			System.out.println("�����������˺�:");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			if(!a.equals(DateBase.user)){
				if(2-i != 0){
				System.out.println("��������˺Ż����벻��ȷ�����������룬������"+(2-i)+"�λ���");
				}
			}else{
				System.out.println("��������������:");
				Scanner sc1 = new Scanner(System.in);
				String a1 = sc.next();
				if(!a1.equals(DateBase.password)){
					if(2-i != 0){
					System.out.println("��������˺Ż����벻��ȷ�����������룬������"+(2-i)+"�λ���");
					}
				}else{
					System.out.println("��½�ɹ����������˵�...");
					DateBase.isture=true ;
					break;
				}
			}
		}
		if(!DateBase.isture){
			System.out.println("�������ε�½ʧ�ܣ��˳�ϵͳ��");
		}
	}
}
class DateBase{
	public static String user = "admin";
	public static String password = "66666";
	public static boolean isture = false ;
}