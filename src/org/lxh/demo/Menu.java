package org.lxh.demo;

// ѭ��ѡ��\�޸�ѡƱ\��ʾȫ������Ϣ
public class Menu {
	private Student stu[] = { new Student(1, "����", 0), new Student(2, "����", 1),
			new Student(3, "����", 0), new Student(4, "����", 0) };

	public Menu() {
		Operate oper = new Operate(stu);
		// 1����ʾ��ȫ��������
		oper.list();
		// 2������ͶƱ
		while (oper.vote()) {
			;
		}
		// 3���г�ȫ����Ʊ��
		oper.list();
		// 4��������
		oper.result() ;
	}
}
