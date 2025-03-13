package androidx.constraintlayout.core.parser;

public class CLString
  extends CLElement
{
  public CLString(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement OooO0OO(char[] paramArrayOfChar)
  {
    CLString localCLString = new androidx/constraintlayout/core/parser/CLString;
    localCLString.<init>(paramArrayOfChar);
    return localCLString;
  }
  
  public String OooO0O0()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = "'";
    localStringBuilder.append(str1);
    String str2 = OooO00o();
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLString
 * JD-Core Version:    0.7.0.1
 */