

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {
		
		SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println("SingletonLazy:");
        System.out.println(lazy1);
        System.out.println(lazy2);

        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println("SingletonEager:");
        System.out.println(eager1);
        System.out.println(eager2);

        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
        System.out.println("SingletonLazyHolder:");
        System.out.println(holder1);
        System.out.println(holder2);
    }
}