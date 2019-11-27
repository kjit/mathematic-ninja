package com.github.kjit.mathematic.ninja;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println(BrownBelt.name);

		new CalcRandomizer().randomizeBelt(BrownBelt.CALCULATIONS);
	}
}
