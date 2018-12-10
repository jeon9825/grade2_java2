package e2018.exam2;

public class Exam12 {
	static class World {
		String message = "æ»≥Á«œººø‰";

		class Hello {
//			World world;

//			public Hello(World world) {
//				this.world = world;
//			}

			public void say() {
				System.out.println(message);
			}
		}

		public void doSomething() {
			Hello hello = new Hello();
			hello.say();
		}
	}

	public static void main(String[] args) {
		World world = new World();
		world.doSomething();
	}
}