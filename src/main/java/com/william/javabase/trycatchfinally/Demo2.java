package com.william.javabase.trycatchfinally;

public class Demo2 {

	/**
	 * 字节码指令如下：
public class com.william.javabase.trycatchfinally.Demo2 {
  public com.william.javabase.trycatchfinally.Demo2();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: invokestatic  #22                 // Method getString:()Ljava/lang/String;
       6: invokevirtual #26                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       9: return

  public static java.lang.String getString();
    Code:
       0: ldc           #34                 // String hello
       2: astore_0
       3: goto          7
       6: pop
       7: ldc           #36                 // String hi
       9: dup
      10: astore_0
      11: areturn
    Exception table:
       from    to  target type
           3     6     6   any
}

	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(getString());
		
	}
	
	
	public static String getString() {
		String str = "hello";
		try {
			return str;
		} finally {
			return str = "hi";
		}
	}
}
