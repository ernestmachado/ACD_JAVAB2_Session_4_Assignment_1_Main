package PackageTwo;


public class Derived extends PackageOne.Base {
	public void show() {
		System.out.println("Package : PackageTwo and Class : Derived");
		Display(); // calling protected method through inheritance
	}
}
