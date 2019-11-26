package test.surface_project.example.similarity_java;

import java.util.ArrayList;


public class SimilarityMain {

	float sim(ArrayList va, ArrayList vb)
	{
		// 如果向量维度不相等，则不能计算，函数退出
		if (va.size() != vb.size())
		{
			return 0;
		}

		int size = va.size();
		float simVal = 0;

		//sim(va,vb) = (va * vb) / (|va| * |vb|)
		// 分子 = va.get(0)*vb.get(0) + va.get(1)*vb.get(1) +...+ va.get(size - 1)*vb.get(size - 1)
		// 分母 = va的模 * vb的模 = sqrt((va.get(0))的平方 + (va.get(1))的平方 + ... + va.get(size - 1)的平方) * sqrt((vb.get(0))的平方 + (vb.get(1))的平方 + ... + vb.get(size - 1)的平方)
		float num = 0;// numerator分子
		float den = 1;// denominator分母

		/*作业，第三题*/
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
		String item[] = {"吃苹果", "逛商店", "看电视剧", "打羽毛球", "吃橘子"};
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
		System.out.print("兴趣");
		System.out.println(vitem);
		System.out.print("小红");
		System.out.println(va);
		System.out.print("李苗");
		System.out.println(vb);
		
		SimilarityMain sim = new SimilarityMain();
	
		float simVal = sim.sim(va, vb);
		
		System.out.println("The sim value is:" + simVal);
	}

}
