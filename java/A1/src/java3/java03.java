package java3;

public class java03 {
	public static void main(String[] args)throws Exception {
		//1-1
		//		try {
		//			File file=new File("abc.txt");
		//			if(!file.exists()){
		//				file.createNewFile();
		//			}
		//			PrintWriter pw=new PrintWriter(file);
		//			pw.println("1．NullPointerException:は、プログラマがオブジェクトを参照するときに発生する例外エラーですが、メモリ上に場所がありません (NULL)。ヌル参照メソッドの呼び出し、または null 参照フィールドへのアクセス試行は、Null ポインター例外エラーの一般的な原因の1つです。");
		//			pw.println("2．FileNotFoundException");
		//			pw.println("3．ArrayIndexOutOfBoundsException");
		//			pw.println("4．StringIndexOutOfBoundsException");
		//			pw.println("5．NumberFormatException");
		//			pw.close();
		//			System.out.println("done");
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}


		//2-1:
		//	try {
		//		Object object = null;
		//		object.hashCode();
		//	} catch (NullPointerException e) {
		//		System.out.println("スタックトレースも出力する");
		//		e.printStackTrace();
		//	}

		//2-2:
		//		try {
		//			File file=new File("abcd.txt");
		//			Scanner scan=new Scanner(file);
		//		} catch (FileNotFoundException e) {
		//			System.out.println("スタックトレースも出力する");
		//			e.printStackTrace();
		//		}

		//2-3:
		//	try {
		//		String[] arrayb={"a","b","c"};
		//		System.out.println(arrayb[3]);
		//	} catch (ArrayIndexOutOfBoundsException e) {
		//		System.out.println("スタックトレースも出力する");
		//		e.printStackTrace();
		//	}

	}
}
