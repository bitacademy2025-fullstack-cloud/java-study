package chapter03.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
//		camera.name = "nikon";
//		camera.price = 400000;
//		camera.countSold = 10;
//		camera.countStock = 20;
		camera.setName("nikon");

		camera.showInfo();
		
		System.out.println(
			"상품이름:" + camera.getName() +
			", 가격: " + camera.getPrice() +
			", 재고량: " + camera.getCountStock() +
			", 판매량: " + camera.getCountSold());
	}

}
