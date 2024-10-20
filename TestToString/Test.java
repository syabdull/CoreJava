package TestToString;

public class Test {
  public static void main(String[] args) {

     Test t=new Test();
     System.out.println(t);
     t.forTest();
  }
  public void forTest(){
    System.out.println( this.hashCode());
     int hCode=this.hashCode();
     String hString=Integer.toHexString(hCode);
     System.out.println(this.getClass().getName()+"@"+hString);
  }
}
