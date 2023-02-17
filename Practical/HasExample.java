class bank{
     String bankname;
      int encounterno;
      String bankername;
      String Branch ;
bank(String bankname ,int encounterno,String bankername,String Branch){
    this.bankname=bankname;
    this.encounterno=encounterno;
    this.bankername=bankername;
    this.Branch=Branch;

}
}
class customer{
    String customername;
    String accounttype;
    bank bnk;
 customer(String customername,String accounttype,bank bnk){
        this.customername=customername;
        this.accounttype=accounttype;
        this.bnk=bnk;
    } 

    public void display()
    {
    System.out.println(customername+""+accounttype);
    System.out.println(bnk.bankname+""+bnk.encounterno+""+bnk.bankername+""+bnk.Branch);
    }
}
class HasExample{
    public static void main(String args[])
    {
        bank bk = new bank("icici ", 4, "miss gupta ", "Asangaon ");
        customer cs = new customer("Sanjay ", "Saving ", bk);
        cs.display();

    }
}
