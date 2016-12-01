package utils;

import java.io.File;
import java.util.Stack;

public class XMLSerializer implements Serializer
	{
	 private Stack stack = new Stack();
	 private File file;

	 public XMLSerializer(File file)
	 {
	 this.file = file;
	 }

	 public void push(Object o)
	 {
	 stack.push(o);
	 }

	 public Object pop()
	 {
	 return stack.pop();
	 }

	 @SuppressWarnings("unchecked")
	 public void read() throws Exception
	 {
	 ObjectInputStream is = null;
	 try
	 {
	 XStream xstream = new XStream(new DomDriver());
	 is = xstream.createObjectInputStream(new FileReader(file));
	 stack = (Stack) is.readObject();
	 }
	 finally
	 {
	 if (is != null)
	 {
	 is.close();
	 }
	 }
	 }