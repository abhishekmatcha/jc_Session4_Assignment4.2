class Child extends Parent {
		 public void method1() {
		 System.out.println ("Child's method1()");
		} 
		 public static void main(String args[]) {
			 Parent p = new Child();
			 p.method2();
			 }}



               // option C is correct 


// Reason:  Since the parent method is private, and thus can't be overridden,But it doesn't call the child method if it overrode the parent method.  