package androidx.constraintlayout.core.parser;

public class CLNumber
  extends CLElement
{
  public float o00OooO0 = 0.0F / 0.0F;
  
  public CLNumber(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement OooO0OO(char[] paramArrayOfChar)
  {
    CLNumber localCLNumber = new androidx/constraintlayout/core/parser/CLNumber;
    localCLNumber.<init>(paramArrayOfChar);
    return localCLNumber;
  }
  
  public String OooO0O0()
  {
    float f1 = getFloat();
    int i = (int)f1;
    float f2 = i;
    boolean bool = f2 < f1;
    String str = "";
    if (!bool)
    {
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1.append(str);
      localStringBuilder1.append(i);
      return localStringBuilder1.toString();
    }
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    localStringBuilder2.append(str);
    localStringBuilder2.append(f1);
    return localStringBuilder2.toString();
  }
  
  public float getFloat()
  {
    float f = this.o00OooO0;
    boolean bool = Float.isNaN(f);
    if (bool)
    {
      String str = OooO00o();
      f = Float.parseFloat(str);
      this.o00OooO0 = f;
    }
    return this.o00OooO0;
  }
  
  public int getInt()
  {
    float f = this.o00OooO0;
    boolean bool = Float.isNaN(f);
    if (bool)
    {
      String str = OooO00o();
      int i = Integer.parseInt(str);
      f = i;
      this.o00OooO0 = f;
    }
    return (int)this.o00OooO0;
  }
  
  public boolean isInt()
  {
    float f1 = getFloat();
    int i = (int)f1;
    float f2 = i;
    boolean bool = f2 < f1;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLNumber
 * JD-Core Version:    0.7.0.1
 */