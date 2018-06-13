package com.xclink.an.ex1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class Test1 {
	@Test
	public void TestUseCaseAnnotation() {
		PasswordUtils pu = new PasswordUtils();
		System.out.println(pu.encryptPassword("sssss"));
	}

	@Test
	public void Test2() {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		System.out.println(useCases);
		trackUseCases(useCases, PasswordUtils.class);
	}

	/*********** ×¢½â´¦ÀíÆ÷ ***************/

	public static void trackUseCases(List<Integer> useCases, Class<?> c1) {
		for (Method m : c1.getDeclaredMethods()) {
			// getDeclaredMethods including public, protected, default (package)
			// access, and private methods, but excluding inherited methods.
			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println("Found Use Case:" + uc.id() + " "
						+ uc.description());

				useCases.remove(new Integer(uc.id()));
			}
		}
		for (int i : useCases) {
			System.out.println("Warning :Missing use case-" + i);
		}
	}
}