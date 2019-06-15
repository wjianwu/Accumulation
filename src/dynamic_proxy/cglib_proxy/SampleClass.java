package dynamic_proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author wjianwu 2019/6/12 9:29
 * 需要额外的jar 此处使用 cglib-3.2.5.jar asm-5.0.4.jar
 */
public class SampleClass {

    public void display() {
        System.out.println("嗯哼");
    }


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, someArgs, proxy) -> {
            System.out.println("啊哈");
            Object result = proxy.invokeSuper(obj, someArgs);
            System.out.println("哦吼");
            return result;
        });
        SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.display();
    }
}
