package PackageTwo;

public class Caller {
	public static void main(String[] args) {
		System.out.println("Package : PackageTwo and Class : Caller");
		new Derived().show(); // calling instance method which in turn a protected method through inheritance 
	}
}
