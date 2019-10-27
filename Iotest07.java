package cn.io.study02;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * 1，创建源  ：字节数组不要太大
 * 2，选择流
 * 3，操作  ：读出内容
 * 4，释放资源：可以不用出路
 * @author dell
 *
 */


public class Iotest07 {
	public static void main(String[] args) {
		InputStream is=null;
		String str="sun warm";
		byte[] src=str.getBytes();
		is=new ByteArrayInputStream(src,0,src.length);
		byte[] flush=new byte[1024];
		int len=-1;
		try {
			while((len=is.read(flush))!=-1) {
				String res=new String(flush,0,len);
				System.out.println(res);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("操作成功");
		}
		
	}

}
