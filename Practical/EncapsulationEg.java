class employee{
    // private data member
 private String name;
 private int id ;
 private String designation;
 private long phoneno;
 // getter setter method 
public String  getname(){
return name;
}
public void setname(String name){
    this.name=name;
}
public int getid(){
    return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String  getdesignation(){
        return designation;
        }
        public void setdesignation(String designation){
            this.designation=designation;
      
        }
        public long  getphoneno(){
            return phoneno;
            }
            public void setphoneno(long phoneno){
                this.phoneno=phoneno;
            }
        }
class EncapsulationEg{
	public static void main(String args[]) {
		employee ei = new employee();
	ei.setname("Anushka");
	ei.setid(123);
	System.out.println(ei.getname()+"\n"+ei.getid());
	}
}