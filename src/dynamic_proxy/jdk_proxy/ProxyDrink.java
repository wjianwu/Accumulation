package dynamic_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wjianwu 2019/5/24 17:45
 */
public class ProxyDrink implements InvocationHandler {

    private Object proxyObject;

    Object bind(Object o) {
        this.proxyObject = o;
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        if (method.getName().startsWith("drink")) {
            System.out.println("反射增强，前往Coffee馆");
            result = method.invoke(this.proxyObject, args);
            System.out.println("反射增强，离开Coffee馆");
        }
        return result;
    }

}
