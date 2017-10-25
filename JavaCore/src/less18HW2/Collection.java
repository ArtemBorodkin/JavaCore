package less18HW2;

import java.util.Arrays;

public class Collection {
	
	Object [] arrayObject;
	
	public Collection(Object[] arrayObject) {
		this.arrayObject = arrayObject;
	}
	
	
	public Object[] getArrayObject() {
		return arrayObject;
	}

	public void setArrayObject(Object[] arrayObject) {
		this.arrayObject = arrayObject;
	}
	
	@Override
	public String toString() {
		return "Collection [arrayObject=" + Arrays.toString(arrayObject) + "]";
	}

	//1
	class InnerClass1 implements Iterator{
		
		private int i = 0;

		@Override
		public boolean hasNext() {
			return i <= arrayObject.length-1;
		}

		@Override
		public Object next(){
//			for (int i = 0; i < arrayObject.length; i++) {
//				if((int)arrayObject[i]%2!=0){
//					arrayObject[i]=0;
//				}
//				System.out.print(arrayObject[i]+" ");
//			}
			return i++;
		}
		
		public void changeOddToZero(){
				if((int)arrayObject[i]%2!=0){
					arrayObject[i]=0;
				}	
				System.out.print(arrayObject[i]+" ");
			}
					
		public void change(){
			do{
				changeOddToZero(); 
				next();
			}while(hasNext());
		}
		}
	
	//2
	class InnerClass2 implements Iterator{
		
		private int i = arrayObject.length-1;
		
		@Override
		public boolean hasNext(){
			return i >=0;
		}
		@Override
		public Object next(){
			while(hasNext()){
				System.out.print(arrayObject[i]+" ");
				i-=2;
			}
			
			return arrayObject;
		}
	}
	//3
	Iterator anonym(Object[] object){
		return new Iterator(){
			
			private int i = arrayObject.length-3;
			
			
			@Override
			public boolean hasNext(){
				return i>0;
			}
			@Override
			public Object next(){
				while(hasNext()){
					if((int)arrayObject[i]%2!=0){
						System.out.print(arrayObject[i]+" ");
					}
					i-=3; 
				}
				
				return arrayObject;
			}
			
		};
	}
	//4
	public void fromFirstToLast(){
		 class Local implements Iterator{
			 
			 private int i = 4;
			@Override
			public boolean hasNext() {
				return i<=arrayObject.length-1;
			}

			@Override
			public Object next() {
				
				while(hasNext()){
					if((int)arrayObject[i]%2==0){
						arrayObject[i]=(int)arrayObject[i]-100;
						System.out.print(arrayObject[i]+" ");
					}
					i+=5;	
				}
				return arrayObject;
			}
			 
		 }
		 Local local = new Local();
		 local.next();
	}
	//5
	public static class StaticClass implements Iterator{
		
		Object [] staticArrayObject;
		
		public StaticClass(Object [] arrayObject){
			this.staticArrayObject = arrayObject;
		}
		
		private int i = 1;
		
		@Override
		public boolean hasNext(){
			return i <= staticArrayObject.length - 1;
		}
		
		@Override
		public Object next(){
			while(hasNext()){
				if((int)staticArrayObject[i]%2==0){
					staticArrayObject[i]=(int)staticArrayObject[i]+1;
					System.out.print(staticArrayObject[i]+" ");
				}
				i+=2;
				
			}
			
			return staticArrayObject;
		}
		
		
	}
	
		
		
	
	
	
}
