package com.william.javacore.pattern.jiegouxing.proxy.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 22:08
 */
public class MyClassLoader extends ClassLoader{

    private File classPathFile;

    public MyClassLoader(){
        String classPath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        if(classPathFile != null){
            File classFile = new File(classPathFile,name.replace("\\.","/")+".class");
            if (classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len ;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return  defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

        }
        return super.findClass(name);
    }
}
