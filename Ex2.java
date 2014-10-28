import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
                int z;

		x = 63;
		y = 18;
                z = 50;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
        }
}
                
      class Ex2_00 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値：");		// xの値の入力を促す
		int x = stdIn.nextInt();
		
		System.out.print("yの値：");		// yの値の入力を促す
		int y = stdIn.nextInt();

		System.out.println("x + x = " + (x + y)); // x + yの値を表示
		System.out.println("x - x = " + (x - y)); // x - yの値を表示
		System.out.println("x * x = " + (x * y)); // x * yの値を表示
		System.out.println("x / x = " + (x / y)); // x / yの値を表示 (商)
		System.out.println("x % x = " + (x % y)); // x % yの値を表示 (剰余)
	}
}
      class Ex2_3 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("数値を入力してください");

		System.out.print("：");	      
		int x = stdIn.nextInt();
                
                System.out.println(x); 
        }
      }

      class Ex2_4 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xの値に10を加減します");

		System.out.print("xの値：");		
		int x = stdIn.nextInt();
			System.out.println("x + 10 = " + (x + 10));
                        System.out.println("x - 10 = " + (x - 10)); 
        }
      }

      class Ex2_5 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyの和と平均を表示します。");

		System.out.print("xの値：");		
		double x = stdIn.nextDouble();
		System.out.print("yの値：");		
		double y = stdIn.nextDouble();
	
                System.out.println("和: " + (x + y));
                System.out.println("平均: " + ((x + y) / 2)); 
        }
      }

      class Ex2_6 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積をもとめます。");

		System.out.print("底辺：");		
		double x = stdIn.nextDouble();
		System.out.print("高さ：");		
		double y = stdIn.nextDouble();
	
                System.out.println("面積: " + (x * y) / 2);
        }
      }


class Ex2_000 extends Ex{
	void execute(){
		Random rand = new Random();

		int luchy = rand.nextInt(10);		// 0～9の乱数

		System.out.println("今日のラッキーナンバーは" + luchy + "です。");
	}
}

class Ex2_7 extends Ex{
	void execute(){
		Random rand = new Random();

		int x = rand.nextInt(9);
                x = x + 1;

                int y = rand.nextInt(9);
                y = y - 9;

                int z = rand.nextInt(90);
                z = z + 10;

		System.out.println("1桁の正の整数地：" + x);
                System.out.println("1桁の負の整数値：" + y);
                System.out.println("2桁の正の整数値：" + z);
	}
}
class Ex2_8 extends Ex{
	void execute(){
          Random rand = new Random();
            int ransuu = rand.nextInt(11); 
            ransuu = ransuu - 5;
        
          Scanner stdIn = new Scanner(System.in);
            System.out.print("整数値：");
                int kekka = stdIn.nextInt();
                    
                    kekka = kekka + ransuu;
                    
                        System.out.println("その値の±５の乱数を生成しました。それは" + kekka  + "です。");
  }
}
class Ex2_9 extends Ex{
	void execute(){
		Random rand = new Random();

	        double x = rand.nextDouble();

                double y = rand.nextDouble();
                  y = y * 10.0;

                double z = rand.nextDouble();
                  z = z * 2.0 - 1.0;

		System.out.println("0.0以上1.0未満の実数値：" + x);
                System.out.println("0.0以上10.0未満の実数値：" + y);
                System.out.println("-1.0以上1.0未満の実数値：" + z);
	}
}

class Ex2_10 extends Ex{
	void execute(){
	Scanner stdIn = new Scanner(System.in);
        
              System.out.print("姓：");  String x = stdIn.next();
              System.out.print("名：");  String y = stdIn.next();

              System.out.println("こんにちは" + x + y +"さん");
        }
}


          public class Ex2 {
	public static void main(String[] args){
		Ex a;
               /*
                a = new Ex2_00();
                a.execute(); 
                a = new Ex2_3();
                a.execute(); 
                a = new Ex2_4();
                a.execute();
                a = new Ex2_5();
                a.execute();
                a = new Ex2_6();
                a.execute(); 
              */
                a = new Ex2_000();
                a.execute(); 
                a = new Ex2_7();
                a.execute();
                a = new Ex2_8();
                a.execute();
                a = new Ex2_9();
                a.execute();
                a = new Ex2_10();
                a.execute();
        }
          }

