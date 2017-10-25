package less16;

import java.io.IOException;

public class Main {

	public static void main (String [] args){
		
		System.out.println("Hello");
		try{
			System.out.println(2/0);
			System.out.println("after exception");
		}catch (ArithmeticException | NullPointerException e){
			e.printStackTrace(System.out);
		}catch (RuntimeException e){
			e.printStackTrace(System.out);
		}catch(Exception e){
			e.printStackTrace(System.out);
		}catch(Throwable e){
			e.printStackTrace(System.out);
		}
		System.out.println("by-by");
		try {
			System.out.println(asas());
		} catch (IOException e) {
			e.printStackTrace();
		}
		wrapper();
	}
	
	static int asas() throws IOException {
		throw new IOException("I see");
	}
	
	static int wrapper(){
		try{
			return asas();
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		
	}
}
