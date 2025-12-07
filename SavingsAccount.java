abstract Class savingsAccount {

    String Name;
    String lastName;
    String accountNumber;
    double balance;


public double checkBalance(double balance){
return balance;
}

public void deposit(){
   if (amount<=0){
    System.out.println("invalid amount");
   }
   balance +=amount;
}

public void withdraw(){

}

}