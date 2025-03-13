package androidx.constraintlayout.core.parser;

public class CLParsingException
  extends Exception
{
  public final String o00OoOoo;
  public final String o00Ooo0;
  public final int o00Ooo00;
  
  public CLParsingException(String paramString, CLElement paramCLElement)
  {
    this.o00OoOoo = paramString;
    int i;
    if (paramCLElement != null)
    {
      paramString = paramCLElement.getStrClass();
      this.o00Ooo0 = paramString;
      i = paramCLElement.getLine();
    }
    else
    {
      this.o00Ooo0 = "unknown";
      i = 0;
      paramString = null;
    }
    this.o00Ooo00 = i;
  }
  
  public String OooO00o()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(" (");
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append(" at line ");
    int i = this.o00Ooo00;
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("CLParsingException (");
    int i = hashCode();
    localStringBuilder.append(i);
    localStringBuilder.append(") : ");
    String str = OooO00o();
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLParsingException
 * JD-Core Version:    0.7.0.1
 */