package com.xclink.ch02;

public class P61 {
	
	public static void main(String[] args) {
		
		int days = 0; //������
		
		int month = 5; //�·�
		int day = 6; // ��
		
		//���㵽��ǰ�³�֮ǰ������
		for(int i=1;i<month;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days = days+31;break;
				case 4:
				case 6:
				case 9:
				case 11:
					days = days+30;break;
				case 2:
					days = days+28;
				default:
					System.out.println("������1-12");
			}
		}
		
		//���ӵ�ǰ�µ���ǰ�յ�����
		days = days+day;
		System.out.println(days);
    }
}
