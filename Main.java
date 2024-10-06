public class Main
{
  public static void main(String[] args)
  {
    lastFirstN("cream", "butter", 3);
    stringManip("hEllO", "hEllO");
  }
  public static String lastFirstN(String s1, String s2, int n)
  {
    
    String subS1 = s1.substring(s1.length()-n);
    String subS2 = s2.substring(0,n);
    String finalString = subS1 + subS2;
    return finalString;
  }
  public static void stringManip(String s1, String s2)
  {
    String str1 = s1.toUpperCase();
    String str2 = s2.toLowerCase();
    String s3 = str2.substring(1);
    String s4 = str2.substring(0,1);
    s4 = s4.toUpperCase(); //Doesn't modify original data, without s4 =, the code makes a copy of s4 and deletes it.
    String s5 = s4 + s3;
    System.out.println(str1);
    System.out.println(s5);

  }
}
