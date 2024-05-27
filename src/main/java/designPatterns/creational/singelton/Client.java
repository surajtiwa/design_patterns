package designPatterns.creational.singelton;

public class Client {

    public static void main(String[] args) {
        //	EagerRegistry eagerRegistry=new EagerRegistry(); beacuse the constructor is private
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry3 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry3 == eagerRegistry2);

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistryWithDCL == lazyRegistryWithDCL2);


        LazyRegistryIODH singelton ;
        System.out.println("expecting");
         singelton = LazyRegistryIODH.getInstance();
        singelton = LazyRegistryIODH.getInstance();

    }

}
