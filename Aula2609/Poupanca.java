//Conta corrente poupança


public class Poupanca{

    double balance;
    double limit;

    Poupanca(double balance){
        this.balance = balance;
    }

    Poupanca(double balance, double limit){
        this.balance = balance;
        this.limit = limit;
    }

    //Métodos

    double income(){
        return this.balance*1.1;
    }

    double income(double rate, int time){
        return this.balance * Math.pow((1+(rate/100)), (double) time);
    }

    void pix (Poupanca destiny, double value){
        if (this.balance >= value){
            destiny.balance += value;
            this.balance -= value;
        }
        else{
            System.out.println("Saldo insuficiente, pobre...");
        }

    }

}