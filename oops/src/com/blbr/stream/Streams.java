package com.blbr.stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
	// Function convert a List into Stream
	static <T> void getStream(List<T> list) {

		// Create stream object with the List
		Stream<T> stream = list.stream();

		// Iterate list first to last element
		Iterator<T> it = stream.iterator();
	}
}