package java4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class java04 {
	//1-1:テキストファイルを作成する
	public static void kadai1(){
		try {
			File file=new File("input01.txt");
			file.createNewFile();
			System.out.println("done");
		} catch (IOException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}

	//1-2:テキストファイルを作成したのはフォルダの中に置く。
	public static void kadai2(){
		File a = new File("input");
		a.mkdir();
		try {
			File file=new File(a,"input01.txt");
			file.createNewFile();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}

	}

	//1-3:テキストファイルを作成した結果を知らせる。
	public static void kadai3(){
		File a = new File("input");
		a.mkdir();
		try {
			File file=new File(a,"input01.txt");
			if(file.exists()){
				System.out.println("ファイルが存在します。");
			}else {
				System.out.println("ファイルが存在しません。");
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//1-4:テキストファイルを削除する。
	public static void kadai4(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1番号はテキストファイルを削除したいです。0番号はテキストファイルを削除しません。");
		int s=sc.nextInt();
		File file=new File("input01.txt");
		if(file.exists()){
			if(s==1){
				file.delete();
				System.out.println("テキストファイルを削除した。");
			}else{
				if(s==0){
					System.out.println("テキストファイルを削除しない。");
				}
			}
		}
	}

	//1-5:フォルダのテキストファイルを削除する。
	public static void kadai5(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1番号はテキストファイルを削除したいです。0番号はテキストファイルを削除しません。");
		int s=sc.nextInt();
		File a = new File("input");
		File file=new File(a,"input01.txt");
		if(file.exists()){
			if(s==1){
				file.delete();
				System.out.println("テキストファイルを削除した。");
			}else{
				if(s==0){
					System.out.println("テキストファイルを削除しない。");
				}
			}
		}
	}

	//1-6の方法1:フォルダを削除する。
	public static void kadai6(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1番号はフォルダを削除したいです。0番号はフォルダを削除しません。");
		int s=sc.nextInt();
		File a = new File("input");
		File file=new File(a,"input01.txt");
		if(file.exists()){
			if(s==1){
				file.delete();
				a.delete();
				System.out.println("フォルダを削除した。");
			}else{
				if(s==0){
					System.out.println("フォルダを削除しない。");
				}
			}
		}
	}

//	//1-6の方法2:フォルダを削除する。
//	public static void kadai7(){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("1番号はフォルダを削除したいです。0番号はフォルダを削除しません。");
//		int s=sc.nextInt();
//		File a = new File("input");
//		File file=new File(a,"input01.txt");
//		if(a.exists()){
//			if(file.exists()){
//				file.delete();
//				if(s==1){
//					a.delete();
//					System.out.println("フォルダを削除した。");
//				}else{
//					if(s==0){
//						System.out.println("フォルダを削除しない。");
//					}
//				}
//			}
//		}
//	}


	public static void main(String[] args) {
		//kadai1();
		//kadai2();
		//kadai3();
		//kadai4();
		//kadai5();
		//kadai6();
		//kadai7();
	}
}
