package local;

class Info {
	private int data = 33;

	public void sayHello() {
		// Huge Code

		class Data {
			int x = 11;

			void f1() {
				System.out.println("data Class Inner ");
			}

		}

		Data d1 = new Data();
		d1.f1();

	}

}

public class App {
	public static void main(String[] args) {
		Info info = new Info();
		info.sayHello();
	}

}
