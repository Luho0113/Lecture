package setEx_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElecFeeExample {

	public static void main(String[] args) {
		// ȣ���� �����ϸ� ���ü�� �Ǵ��ϰ� ȣ���� �Է��ϸ� ���� ��뷮�� ������
		
		//����
		Set<ElecFee> elecSet = new HashSet<ElecFee>();
		
		//�߰�
		elecSet.add(new ElecFee("502", 1, 423, 25000));
		elecSet.add(new ElecFee("303", 7, 724, 35000));
		elecSet.add(new ElecFee("403", 2, 222, 40000));
		elecSet.add(new ElecFee("503", 2, 438, 25000));
		elecSet.add(new ElecFee("503", 3, 171, 35000));
		
		
		System.out.println("�� ��ü ��: " + elecSet.size());
		
		
		Scanner sc = new Scanner(System.in);
		String search;
		//ȣ���� �Է��ϸ� �����뷮 ���
		Iterator<ElecFee> elecList = elecSet.iterator();
		System.out.print("ȣ�� �Է� > ");
		String searchHouse = sc.nextLine();
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			if (elecAddr.getHouseNum().equals(searchHouse)) {
				System.out.println(searchHouse + "ȣ�� ���� ��뷮: " + elecAddr.getElecUse());
				break;
			} 
		}
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//���� ��뷮�� ���� ���� ������ ã�� ȣ���� �������� ���
		elecList = elecSet.iterator(); 
		int max = 0; //�ִ� ��뷮�� ���� ����
		ElecFee maxAddr = null; //���� ��뷮�� ���� ū ��ü�� �ּ�
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			
			if (max < elecAddr.getElecUse()) {
				max = elecAddr.getElecUse();
				maxAddr = elecAddr; //max�� ��ü �ּҸ� �־���
				
			} 
			
		}
		System.out.println("�ִ� �����뷮 ȣ��: " + maxAddr.getHouseNum());
		System.out.println(maxAddr.getHouseNum()+ "�� ������: " + maxAddr.getFamilyNum());
		
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//��������� ���� ���� ȣ���� ã�� 500�� �߰�
		elecList = elecSet.iterator(); 
		int min = Integer.MAX_VALUE;
		ElecFee[] minAddr = new ElecFee[10]; //�ּҸ� ���� �迭�� ����
		int index = 0; //������ �迭�� �ε��� ����
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			
			if (min > elecAddr.getElecFee()) {
				min = elecAddr.getElecFee();
				minAddr[index] = elecAddr; //minAddr[0]�� min�� ��
			} else if (min == elecAddr.getElecFee()) { //����� ���ٸ�!!
				index++; //minAddr[1]�� �ø���
				minAddr[index] = elecAddr; //1���� �ּҸ� ����
			}
		}
		//500�� �߰�
		for (int i =0; i<minAddr.length; i++) {
			if(minAddr[i]==null) break;
			else {
				minAddr[i].setElecFee(minAddr[i].getElecFee() + 500);
			}
		}
		
		System.out.println("�ּ� �����뷮 ȣ��: " + minAddr[index].getHouseNum());
		System.out.println(minAddr[index].getHouseNum() + "�� ���: " + minAddr[index].getElecFee());
		
		

		
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//���� ��뷮�� ���, ��������� ����� ���ؼ� ��ü ��¿� �߰�
		elecList = elecSet.iterator(); 
		int sumElecUse = 0;
		int sumElecFee = 0;
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			sumElecUse += elecAddr.getElecUse();
			sumElecFee += elecAddr.getElecFee(); 
		}
		System.out.println("��ü �����뷮�� ���: " + (sumElecUse)/elecSet.size());
		System.out.println("��ü ��������� ���: " + (sumElecFee)/elecSet.size());
		

		
		
		

	}

}
