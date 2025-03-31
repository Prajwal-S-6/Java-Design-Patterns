package org.example.singleton;

public class Client {

	public static void main(String[] args) {
//		EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
//		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
//		System.out.println(eagerRegistry1 == eagerRegistry2);

//		LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
//		LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
//		System.out.println(lazyRegistryWithDCL2 == lazyRegistryWithDCL1);

//		LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
//		LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();
//		System.out.println(lazyRegistryIODH2 == lazyRegistryIODH1);

		RegistryEnum instance1 = RegistryEnum.INSTANCE;
		RegistryEnum instance2 = RegistryEnum.INSTANCE;
		System.out.println(instance2 == instance1);

	}

}
