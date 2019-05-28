//这个例子是想说明,实例变量是有缺省值的，可以不用初始化
//而方法内的局部变量在使用前必须赋一个值，否则报错。
class Foo {
	int size;

	public void go() {
		int x;
		int y = 0;
		int z;
		x = 1;

		z = y + x;
		System.out.println(z);
	}
}
