package loop;

public class Constructer {
    String name;
    double creditLimit;
    String email;

    public Constructer() {
        this("Ahmet" , 5000,"tes@test.com");}

    public Constructer(String name, double creditLimit, String email) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}


