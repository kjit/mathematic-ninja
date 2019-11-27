package com.github.kjit.mathematic.ninja;

import java.util.Collections;
import java.util.List;

public class CalcRandomizer {

	void randomizeBelt(List<String> belt) {

		for (int i = 0; i < 8; i++) {
			Collections.shuffle(belt);
			for (int id = 0; id < belt.size(); id++) {
				System.out.println(belt.get(id) + " =");
			}
			System.out.println();
			System.out.println("--- ---");
		}
	}
}
