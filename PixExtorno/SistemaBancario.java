package PixExtorno;

public class SistemaBancario {
    double balance;
    double limit;

    SistemaBancario(int balance, int limit){

        this.balance = balance;
        this.limit = limit;

    }

    void pix(SistemaBancario destiny, double value){

        if (this.balance >= value && (destiny.limit+value)<destiny.limit){
            this.balance -= value;
            destiny.balance += value;
        }
        else{
            System.out.println("You can't pay " +destiny +" because you don't have money or will pass the limit");
        }
        
    }
}
