public class exec {
    public static void main (String args[]){

        Poupanca myaccount = new Poupanca(5.01);
        Poupanca anotheraccount = new Poupanca(0, 10);


        System.out.println("My account: " +myaccount.balance);
        System.out.println("Another account: " +anotheraccount.balance);
        myaccount.pix(anotheraccount, 5);
        System.out.println("Pix realizado!");
        System.out.println("My account: " +myaccount.balance);
        System.out.println("Another account: " +anotheraccount.balance);

        anotheraccount.pix(myaccount, 4);
        System.out.println("Pix realizado!");
        System.out.println("My account: " +myaccount.balance);
        System.out.println("Another account: " +anotheraccount.balance);

    }
}
