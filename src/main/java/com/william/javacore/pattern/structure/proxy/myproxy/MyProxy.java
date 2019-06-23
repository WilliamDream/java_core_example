package com.william.javacore.pattern.structure.proxy.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: WilliamDream
 * @Description: 用于生成代码
 * @Date: 2017/6/22 22:09
 */
public class MyProxy {


    private static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {
        try {
            // 1、生成代理类$Proxy0.java
            String codeStr = generateCode(interfaces);
            System.out.println(codeStr);

            //2、Java文件输出到磁盘
            String filepath = MyProxy.class.getResource("").getPath();
            File file = new File(filepath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(codeStr);
            fileWriter.close();

            //3、动态的编译生成的类$Proxy0
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null,null,null,null,null,null);
            task.call();
            manager.close();

            Class proxyClass = loader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);

            return constructor.newInstance(h);


        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    /**
       * @Description
       * @param interfaces
       * @return java.lang.String
       * @Date 2017/6/23 10:55
       */
    private static String generateCode(Class<?>[] interfaces){

        //生成动态代理产生的类$proxy0的代码
        StringBuffer sb = new StringBuffer();
        sb.append("package com.william.javacore.pattern.structure.proxy.myproxy;" + ln);
        sb.append("import com.william.javacore.pattern.structure.proxy.jdk.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);

        sb.append("public class $Proxy0 implements " + interfaces[0].getSimpleName() + "{" + ln);

        sb.append("private MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h) {" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);

        for (Method method : interfaces[0].getMethods()){
            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(){" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getSimpleName() +".class.getMethod(\"" + method.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);
            sb.append("}" + ln);
        }
        sb.append("}" + ln);

        return sb.toString();
    }

}
