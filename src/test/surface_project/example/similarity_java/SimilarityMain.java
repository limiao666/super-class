package test.surface_project.example.similarity_java;

import java.util.ArrayList;


public class SimilarityMain {

	float sim(ArrayList va, ArrayList vb)
	{
		// �������ά�Ȳ���ȣ����ܼ��㣬�����˳�
		if (va.size() != vb.size())
		{
			return 0;
		}

		int size = va.size();
		float simVal = 0;

		//sim(va,vb) = (va * vb) / (|va| * |vb|)
		// ���� = va.get(0)*vb.get(0) + va.get(1)*vb.get(1) +...+ va.get(size - 1)*vb.get(size - 1)
		// ��ĸ = va��ģ * vb��ģ = sqrt((va.get(0))��ƽ�� + (va.get(1))��ƽ�� + ... + va.get(size - 1)��ƽ��) * sqrt((vb.get(0))��ƽ�� + (vb.get(1))��ƽ�� + ... + vb.get(size - 1)��ƽ��)
		float num = 0;// numerator����
		float den = 1;// denominator��ĸ

		/*��ҵ��������*/
         for(int i=0;i<va.size();i++){
         	num+=(float)va.get(i)*(float)vb.get(i);
		 }
         float sum1=0;
         float sum2=0;
         for (int j=0;j<va.size();j++){

         	sum1+=(((float)va.get(j))*((float)va.get(j)));
         	sum2+=(((float)vb.get(j))*((float)vb.get(j)));

		 }
         den=(float)Math.sqrt(sum1)*(float)Math.sqrt(sum2);

		simVal = num / den;
		return simVal;
	}

	public static void main(String[] args) {
		String item[] = {"��ƻ��", "���̵�", "�����Ӿ�", "����ë��", "������"};
		float a[] = {(float) 3.5, 5, 5, 5,0};
		float b[] = {5, 5, 5, 0, 5};
		ArrayList vitem = new ArrayList();
		ArrayList va = new ArrayList();
		ArrayList vb = new ArrayList();
		for (int i = 0; i < a.length; i++)
		{
			vitem.add(item[i]);
			va.add(new Float(a[i]));
			vb.add(new Float(b[i]));
		}
		System.out.print("��Ȥ");
		System.out.println(vitem);
		System.out.print("С��");
		System.out.println(va);
		System.out.print("����");
		System.out.println(vb);
		
		SimilarityMain sim = new SimilarityMain();
	
		float simVal = sim.sim(va, vb);
		
		System.out.println("The sim value is:" + simVal);
	}

}
