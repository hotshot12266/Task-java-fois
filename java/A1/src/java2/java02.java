package java2;

import java.util.Scanner;

public class java02 {
	//1-1：文字を数える
	public static void kadai1(){
		String s;
		Scanner cb = new Scanner(System.in);
		System.out.print("文字を入力してください。");
		s=cb.nextLine();
		if(s.length()>0){
			System.out.print("文字列長は "+s.length()+"文字です ");
		}
	}

	//1-2:(1)と（2）を比べる
	public static void kadai2(){
		String s,k;
		Scanner cb = new Scanner(System.in);
		System.out.print("1文字を入力してください。");
		s=cb.nextLine();
		System.out.print("2文字を入力してください。");
		k=cb.nextLine();
		System.out.println("結果:"+ s.equals(k));
	}

	//	1-3:比べる結果は番号が出る。
	public static void kadai3(){
		Integer s1,s2;
		String s3,s4;
		int s5;
		s1=123;
		System.out.print("s1="+s1);
		s2=456;
		System.out.print("\ns2="+s2);
		s3="DEF";
		System.out.print("\ns3="+s3);
		s4="ABC";
		System.out.print("\ns4="+s4);
		s5=123;
		System.out.print("\ns5="+s5);
		System.out.println("\n①と②の大小比較結果 :"+s1.compareTo(s2));
		System.out.println("\n③と④の大小比較結果 :"+s3.compareTo(s4));
		System.out.println("\n①と⑤の大小比較結果 :"+s1.compareTo(s5));
	}

	//1-4:位置の番号に入力すると、文字が出る。
	public static void kadai4(){
		String c1,kq2;
		int vt1,kq1,vt2,vt3;
		Scanner cb = new Scanner(System.in);
		c1="東京都杉並区";
		System.out.print("①"+c1);
		System.out.print("\n位置の文字取りたい：");
		vt1=cb.nextInt();
		kq1 = c1.charAt(vt1-1);
		System.out.println("①の文字列の"+vt1+"文字目を取りたいのは("+(char) kq1+")です。");
		System.out.print("\n位置の文字から取りたい：");
		vt2=cb.nextInt();
		System.out.print("\n位置の文字まで取りたい：");
		vt3=cb.nextInt();
		kq2 = c1.substring(vt2-1, vt3);
		System.out.println("①の文字列の"+vt2+"文字目から"+vt3+"文字目を取りたいのは("+kq2+")です。");
	}

	//1-5:文字に入力すると、位置の番号が出る。
	public static void kadai5(){
		Scanner cb = new Scanner(System.in);
		int star=0,kq1;
		String vt1,c1;
		c1="東京都杉並区";
		System.out.print("①"+c1);
		System.out.print("\n文字取りたい：");
		vt1=cb.nextLine();
		kq1 = c1.indexOf(vt1,star);
		star=kq1+1;
		System.out.println("("+vt1+")が最初に出現するのは " + star+"文字目です。");
	}

	//1-6:文字に入力すると、文字の後ろが出る。
	public static void kadai6(){
		Scanner cb = new Scanner(System.in);
		int star=0,star2=0,dem=0,kq1,s2;
		String vt1,kq2,c1;
		c1="東京都杉並区";
		System.out.print("①"+c1);
		System.out.print("\n文字取りたい：");
		vt1=cb.nextLine();
		kq1 = c1.indexOf(vt1,star);
		star=kq1+1;
		if(vt1.length()==2){
			star++;
		}else{
			if(vt1.length()==3){
				star+=2;
			}else{
				if(vt1.length()==4){
					star+=3;
				}else{
					if(vt1.length()==5){
						star+=4;
					}
				}
			}
		}
		for(int i=c1.length();i>star;i--){
			if(i==6){
				s2=i;
				kq2=c1.substring(star,s2);
				System.out.print("("+vt1+")より、後の文字列は("+kq2+")です。");
			}
		}
	}

	//1-7:INTからSTRINGまで変えて、STRINGからINTまで変えます。
	public static void kadai7(){
		String a,b,c3,c4;
		int c,d,s1,s2,s3;
		a="256";
		b="128";
		c=256;
		d=128;
		s1=Integer.parseInt(a);
		s2=Integer.parseInt(b);
		c3=String.format("%d", c);
		c4=String.format("%d", d);
		System.out.print("\n①："+s1);
		System.out.print("\n②："+s2);
		System.out.print("\n③："+c3);
		System.out.print("\n④："+c4);
		s3=s1+s2;
		System.out.print("\n\n①と②の和は"+s3+"です。");
		System.out.print("\n③の変換結果は"+c3+"です。");
		System.out.print("\n④の変換結果は"+c4+"です。");
	}

	//1-8:STRINGで①の最後尾に②を追加、③の都と早の間に④を挿入、⑤から’千代田区’を削除。
	public static void kadai8(){
		String c1,c2,c3,c4,c5,ch2,ch;
		c1 = "東京都杉並区";
		c2 = "荻窪";
		c3 = "東京都早宮";
		c4 = "練馬区";
		c5 = "東京都千代田区東神田";
		StringBuffer sb=new StringBuffer(c3);
		System.out.print("\n①："+c1);
		System.out.print("\n②："+c2);
		System.out.print("\n③："+c3);
		System.out.print("\n④："+c4);
		System.out.print("\n⑤："+c5);
		ch=c5.replace("千代田区","");
		ch2=c1.replace("都","都練馬区");
		System.out.printf("\n\n①と②を追加した結果は("+c1+c2+")です.");
		System.out.printf("\n③に④を挿入した結果は("+ch2+")です。");
		System.out.println("\n⑤から'千代田区'を削除した結果は("+ch+")です。");
	}

	//1-9:StringBuilderやStringBufferで①の最後尾に②を追加、③の都と早の間に④を挿入、⑤から’千代田区’を削除。
	public static void kadai9(){
		String c1,c2,c3,c4,c5;
		c1 = "東京都杉並区";
		c2 = "荻窪";
		c3 = "東京都早宮";
		c4 = "練馬区";
		c5 = "東京都千代田区東神田";
		StringBuffer sb=new StringBuffer(c3);
		System.out.print("\n①："+c1);
		System.out.print("\n②："+c2);
		System.out.print("\n③："+c3);
		System.out.print("\n④："+c4);
		System.out.print("\n⑤："+c5);
		StringBuffer ch=sb.insert(3,c4);
		StringBuilder sb2 = new StringBuilder(c1);
		StringBuilder ch3=sb2.append(c2);
		System.out.println(sb2);//in Hello Java
		System.out.printf("\n\n①と②を追加した結果は("+ch3+")です.");
		System.out.printf("\n③に④を挿入した結果は("+ch+")です。");
		StringBuilder sb1 = new StringBuilder(c5);
		StringBuilder ch1=sb1.delete(3, 7);
		System.out.println("\n⑤から'千代田区'を削除した結果は("+ch1+")です。");
	}
	public static void main(String[] args) {
		//		kadai1();
		//		kadai2();
		//		kadai3();
		//		kadai4();
		//		kadai5();
		//		kadai6();
		//		kadai7();
		//		kadai8();
		//		kadai9();
	}
}
