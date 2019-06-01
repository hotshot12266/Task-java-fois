package java3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java03 {
	//1-1
	public static void kadai1(){
		try {
			File file=new File("abc.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);
			pw.println("1．NullPointerExceptionはプログラムがnull値を持つオブジェクト参照を使用しようとしたときにスローされます。\n");
			pw.println("2．FileNotFoundExceptionは指定されたパス名で示されたファイルを開く試みが失敗したことを示すシグナルです。\n");
			pw.println("3．ArrayIndexOutOfBoundsExceptionは存在しない配列インデックスにアクセスしようとしています。\n");
			pw.println("4．StringIndexOutOfBoundsExceptionはStringクラスのメソッドによってスローされます。これは、配列、文​​字列、またはベクトルへのインデックスが範囲外であることを示すために使用されます。\n");
			pw.println("5．NumberFormatExceptionはparseXXX（）メソッド（parseInt、parseFloatなど）が文字列を数値にフォーマット（変換）できない場合に、チェックされない例外がスローされます。");
			pw.close();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//2-1:
	public static void kadai2(){
		try {
			Object object = null;
			object.hashCode();
		} catch (NullPointerException e) {
			System.out.println("スタックトレースも出力する");
			e.printStackTrace();
		}
	}

	//2-2:
	public static void kadai3(){
		try {
			File file=new File("abcd.txt");
			Scanner scan=new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("スタックトレースも出力する");
			e.printStackTrace();
		}
	}

	//2-3:
	public static void kadai4(){
		try {
			String[] arrayb={"a","b","c"};
			System.out.println(arrayb[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("スタックトレースも出力する");
			e.printStackTrace();
		}
	}

	//2-4:
	public static void kadai5(){
		try {
			String s="abc";
			for(int i=s.length();i>0;i--){
				System.out.println(s.charAt(4));
			}
		} catch (StringIndexOutOfBoundsException  e) {
			System.out.println("スタックトレースも出力する");
			e.printStackTrace();
		}
	}

	//2-5:
	public static void kadai6(){
		try {
			String s="";
			int i=Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("スタックトレースも出力する");
			e.printStackTrace();
		}

	}

	//3:
	public static void kadai7(){
		System.out.println(charCompare("a", "a"));
		System.out.println(charCompare("a", "b"));
	}

	/**
	 * 二つの文字列の最初の文字が一緒かどうかを判定するメソッド
	 *
	 * @param str1
	 *            文字列1
	 * @param str2
	 *            文字列2
	 * @return 判定結果(true:一致、false:不一致)
	 */
	public static boolean charCompare(String str1, String str2) {
		// str1の1文字目を取得
		String str1_1,str2_1;
		str1_1 = str1.substring(0, 1);

		// str2の1文字目を取得
		str2_1 = str2.substring(0, 1);

		if (str1_1.equals(str2_1)) {
			return true;
		}

		return false;
	}

	//4:
	public static void kadai8(){
		String n;
		int i,f,s1;
		Scanner inp = new Scanner(System.in);
		System.out.print("整数を入力してください。 ");
		n = inp.nextLine();
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(n);
		if (matcher.matches()) {
			s1=Integer.parseInt(n);
			for(i=s1;i<s1+10;i++){
				System.out.print(i);
			}
		}else{
			for(f=0;f<10;f++){
				System.out.print(f);
			}
		}
	}
	public static void main(String[] args)throws Exception {
		//		kadai1();
		//		kadai2();
		//		kadai3();
		//		kadai4();
		//		kadai5();
		//		kadai6();
		//		kadai7();
		//		kadai8();
	}
}
