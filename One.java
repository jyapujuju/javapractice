public class One{
  public String name = "rabin";
  private static int age;
  public static final String College_Name = "swastik college";
  public static void main (String[] args){
    One varObj = new One();
    age = 32;
    sp("Name : " + varObj.name);
    sp("\nAge (static private variable):" +age);
    sp("This is static final value:" + College_Name);
    sopMagenta("test");
  }
  private static void sp(String str){
    System.out.println(str);
  }
  private  static void sopBlack(String str){
    System.out.println("\033[0m"+str);
  }
  private  static void sopMagenta(String str){
    System.out.println("\033[35m"+str);
  }
}
