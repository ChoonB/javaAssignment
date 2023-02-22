package day4;

/*
조상클래스 Product에서 파라미터를 아무것도 안 받는 생성자가 없기때문에
Product(){}를 만들어 준다.
 */


public class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t.price);
    }
}

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {}

    public String toString() {
        return "Tv";
    }
}


