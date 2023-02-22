package day4.Ex7_2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 연습문제 7-1 의 답이므로 내용생략
        for (int i = 0; i < cards.length; i++) {
            SutdaCard aCard = new SutdaCard(i+1,false);
            if(aCard.num>10){
                aCard.num -= 10;
            }
            cards[i] = aCard;
        }
        cards[0].isKwang = true;
        cards[2].isKwang = true;
        cards[7].isKwang = true;
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            SutdaCard tmp = new SutdaCard();
            int r = (int)(Math.random()* cards.length);
            tmp = cards[0];
            cards[0] = cards[r];
            cards[r] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int r = (int)(Math.random()* cards.length);
        return cards[r];
    }
} // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2