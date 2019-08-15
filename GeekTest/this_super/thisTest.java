public class thisTest {
	
	public static void main(String args[]) {
		
		//Child child = new Child();
   		Child child = new Child(1);
		child.show();
	}
}
// 分析：1、当new Child()时： 首先new了一个child对象，因此调用child的无参数构造方法
//          因为child为parent的子类，而child的无参数构造方法中没有写关于父类构造方法如何调用
//          所以先调用parent的无参数构造方法, parent的无参数构造方法里写了this(1),
//          所以调用parent的有一个整型参数的构造方法，
//          在这个有整型参数的parent构造方法中，首先对parent的str进行了赋值
//          然后调用了this.show(), 因为child对show()方法进行了重写，所以这里调用的是child中的show
//          child中的show打印的是child里的str，此时为null，然后调用了super.show(),因此打印了parent
//
//          然后是child.show(), 打印了child里的str ,为null，接着调用了弗雷德show(), 调用了父类的str
//          为parent
//
//          因此 打印的结果为： null, parent, null, parent
//
//       2、当为new Child(1);时：首先new了一个child对象，因此调用了child的有参数构造方法
//          因为child是parent的子类，而child中的有参数构造方法没有指出应该如何调用父类
//          的构造方法，因此默认使用父类的无参数构造方法，调用了this(1) 也就是父类的有参数构造方法
//          这个方法首先对父类的str赋值为“parent”,然后调用了this.show()方法，因为child中已经对show
//          方法进行了重写，所以先调用child的show方法，此时child的str还没有被赋值，因此打印为null
//          然后调用了父类的show()方法，打印了父类的str “parent”。然后回到了child（1），对child的
//          str进行了赋值
//
//          然后是 child.show(), 首先打印了child的str child，然后调用了父类的show方法，打印了父类的str
//
//          因此，打印的结果为： null, parent, child, parent
//
//          
// 	    
