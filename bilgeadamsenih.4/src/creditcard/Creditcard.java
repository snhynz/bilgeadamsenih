package creditcard;

import java.util.Scanner;

public class Creditcard {
    private String name;
    private long cardNumber;
    private int cardPan;
    private int expireDate;
    Scanner scan = new Scanner(System.in);

    public Creditcard(String name, long cardNumber, int cardPan, int expireDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardPan = cardPan;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        char[] chars = name.toCharArray();
        boolean isNotLetter = false;
        char wronginput = 0;
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                isNotLetter = true;
               wronginput= c;
                break;
            }
        }
        if (isNotLetter){
            this.name = name;
        }else{
            System.out.println("The Card Name Cannot  includes execpt letters wrong input : "+ wronginput);
        }
    }

    public long getCardNumber() {

        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardPan() {
        return cardPan;
    }

    public void setCardPan(int cardPan) {
        this.cardPan = cardPan;
    }

    public int getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }
}
