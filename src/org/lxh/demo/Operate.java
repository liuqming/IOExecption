package org.lxh.demo;

public class Operate {
	private Student stu[] = null;
	private InputData input = null;

	public Operate(Student stu[]) {
		this.stu = stu;// ����������������ⲿ����
		this.input = new InputData();
	}

	public void list() {
		for (int i = 0; i < this.stu.length; i++) {
			System.out.println(this.stu[i].getStuno() + "��"
					+ this.stu[i].getName() + "��" + this.stu[i].getCount()
					+ "Ʊ��");
		}
	}

	public boolean vote() {// ��ɾ����ͶƱ����
		boolean flag = true;
		int stuno = this.input.getInt("������೤��ѡ�˴��ţ�����0��������",
				"��ѡƱ��Ч����������ȷ�ĺ�ѡ�˴��ţ�");
		switch (stuno) {
		case 1: {
			this.stu[0].setCount(this.stu[0].getCount() + 1);// �޸�ѡƱ
			break;
		}
		case 2: {
			this.stu[1].setCount(this.stu[1].getCount() + 1);// �޸�ѡƱ
			break;
		}
		case 3: {
			this.stu[2].setCount(this.stu[2].getCount() + 1);// �޸�ѡƱ
			break;
		}
		case 4: {
			this.stu[3].setCount(this.stu[3].getCount() + 1);// �޸�ѡƱ
			break;
		}
		case 0: {
			flag = false;
			break;
		}
		default: {
			System.out.println("��ѡƱ��Ч����������ȷ�ĺ�ѡ�˴��ţ�");
		}
		}
		return flag;
	}

	public void result() {
		java.util.Arrays.sort(this.stu);// ����
		System.out.println("ͶƱ���ս����" + this.stu[0].getName() + "ͬѧ�������"
				+ this.stu[0].getCount() + "Ʊ��ѡ�೤��");
	}
}
