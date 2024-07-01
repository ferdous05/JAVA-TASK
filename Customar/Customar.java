
package Customar;


public class Customar {
    private String name ;
    private boolean member;
    private String memberType;
    
    public Customar(String name){
    
    this.name=name;
    }
    
    
    public String getName(){
    return this.name;
    
    }
    
    
    public boolean isMember(){
    
        return true;
    }

public void SetMember(boolean member){
this.member= member;
}

public String getMemberType(){

return this.memberType;
}

public String SetmemberType(String type){

this.memberType= type;

}
@Override
public String toString(){

return "Name: "+this.name+"Member type: "+this.memberType+"Member: "+this.member;

}




}
