package chapter04.object;

public class ObjectMethodExample01 {
	
	public static void main(String[] args) {
		Goods goods = new Goods();
		
		Class klass = goods.getClass();			// reflection
		System.out.println(klass.getName());
		
		System.out.println(goods.hashCode());	// address 기반의 해싱값
												// address x
												// reference값 x
		System.out.println(goods.toString());   // getClass().getName() + "@" + hashCode() 
		System.out.println(goods);
		
	}

}
