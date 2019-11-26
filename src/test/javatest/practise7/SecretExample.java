package test.javatest.practise7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecretExample {

    public static void main(String args[ ])
    {
        File fileOne=new File("/Users/crystal/IdeaProjects/crystal/src/test/javatest/practise7/hello.txt"),fileTwo=new File("/Users/crystal/IdeaProjects/crystal/src/test/javatest/practise7/hello.secret");
        char b[]=new char[100];
        try
        {
            FileReader in= new FileReader(fileOne);    // ����ָ��fileOne���ַ�������
            FileWriter out=new FileWriter(fileTwo);     // ����ָ��fileTwo�ַ������
            int n=-1;
            while((n=in.read(b))!=-1)
            {
                for(int i=0;i<n;i++)
                {
                    b[i]=(char)(b[i]^'a');
                }
                out.write(b,0, n);        //  out������b��ǰn��Ԫд���ļ�
            }
            out.close();             // out�ر�
            in=new FileReader(fileTwo);           // ����ָ��fileTwo���ַ�������
            System.out.println("���ܺ���ļ�����:");
            while((n=in.read(b))!=-1)
            {
                String str=new String(b,0,n);
                System.out.println(str);
            }
            in=new FileReader(fileTwo);         // ����ָ��fileTwo���ַ�������
            System.out.println("���ܺ���ļ�����:");
            while((n=in.read(b))!=-1)
            {
                for(int i=0;i<n;i++)
                {
                    b[i]=(char)(b[i]^'a');
                }
                System.out.printf(new String(b,0,n));
            }
            in.close();           // in�ر�
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
