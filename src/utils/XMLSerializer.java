package utils;

/*
 * * @author alexandre Baizoukou WIT Bsc Applied Computing
 * @version 1.0
 * @author Eamon Delastar WIT Lecturer
 * @author Franck Walsh WIT Lecturer
 * @author Martin Harrigan Assistant Lecturer WIT 
 * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
 * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
 * @author Tim Roughgarden Coursera 
 *  
 */

import java.io.File;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.Stack;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLSerializer implements Serializer {
	@SuppressWarnings("rawtypes")
	private Stack stack = new Stack();
	private File file;

	public XMLSerializer(File file) {
		this.file = file;
	}

	@SuppressWarnings("unchecked")
	public void push(Object o) {
		stack.push(o);
	}

	public Object pop() {
		return stack.pop();
	}

	@SuppressWarnings("rawtypes")
	public void read() throws Exception {
		ObjectInputStream is = null;
		try {
			XStream xstream = new XStream(new DomDriver());
			is = xstream.createObjectInputStream(new FileReader(file));
			stack = (Stack) is.readObject();
		} finally {
			if (is != null) {
				is.close();
			}
		}

	}

	@Override
	public void write() throws Exception {
		// TODO Auto-generated method stub
		
	}

}