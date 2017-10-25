package less18HW;


public class Collection {

	Object [] arrayObject;

	public Collection(Object[] array) {
		this.arrayObject = array;
	}
	
	public Object[] getArrayObject() {
		return arrayObject;
	}

	public void setArrayObject(Object[] arrayObject) {
		this.arrayObject = arrayObject;
	}

	class InnerIterator1 implements Iterator{

		int i = 0;

		@Override
		public boolean hasNext() {
			return i <= arrayObject.length-1;
		}

		@Override
		public Object next() {
			while(hasNext()){
				if((int)arrayObject[i] % 2!=0){
					System.out.println(arrayObject[i]=0 + " ");
				}else{
					System.out.println(arrayObject[i] + " ");
				}
				i++;
			}
			return arrayObject;
		}
		
	
	}
	
	class InnerIterator2 implements Iterator{

		int i = arrayObject.length-1;

		@Override
		public boolean hasNext() {
			return i >=0;
		}


		@Override
		public Object next() {
			while (hasNext()) {
				System.out.println(arrayObject[i] + " ");
				i -= 2;
			}
			return arrayObject;
		}
	}
	
	Iterator anonymClass(Object[] object){
		return new Iterator(){
			private int i = arrayObject.length-1;

			@Override
			public boolean hasNext() {
				
				return i>=0;
			}

			@Override
			public Object next() {
				while(hasNext()){
					if(i%2==0){
						System.out.println(arrayObject[i] + " ");
					}
					i-=3;
				}
				return arrayObject;
			}
			
		};
	}
	
	void fromFirstToLast(Object[] objects){
		class Local implements Iterator{
            private int i = 4;
			@Override
			public boolean hasNext() {
				return i <= arrayObject.length-1;
			}

			@Override
			public Object next() {
				while(hasNext()){
				if((int)arrayObject[i] % 2 == 0){
					System.out.println((int)arrayObject[i] - 100 + " ");
				}
				i+=5; 
				}
				
				return  arrayObject;
			}
			
		}
		Local local = new Local();
		local.next();
	}
	
	public static class StaticClass implements Iterator{

		Object[] staticArrayObject;
		
		
		public StaticClass(Object[] arrayObject) {
			this.staticArrayObject = arrayObject;
		}

		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return i <= staticArrayObject.length-1;
		}

		@Override
		public Object next() {
			while(hasNext()){
				if((int)staticArrayObject[i]%2==0){
					System.out.print((int)staticArrayObject[i]-1+" ");
				}
				i+=2;
			}
			
			return staticArrayObject;
		}
		
	}
	
}
	

