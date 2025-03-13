package com.sun.jna;

import m54207b69;

public final class WString
  implements CharSequence, Comparable
{
  public String o00OoOoo;
  
  public WString(String paramString)
  {
    if (paramString != null)
    {
      this.o00OoOoo = paramString;
      return;
    }
    paramString = new java/lang/NullPointerException;
    String str = m54207b69.F54207b69_11("OL1F3940282630722C2A2E4230392D3345394F7E344D544E834642863D3F3F7F41594142");
    paramString.<init>(str);
    throw paramString;
  }
  
  public char charAt(int paramInt)
  {
    return toString().charAt(paramInt);
  }
  
  public int compareTo(Object paramObject)
  {
    String str = toString();
    paramObject = paramObject.toString();
    return str.compareTo(paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof WString;
    if (bool1)
    {
      String str = toString();
      paramObject = paramObject.toString();
      bool2 = str.equals(paramObject);
      if (bool2)
      {
        bool2 = true;
        break label42;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    label42:
    return bool2;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public int length()
  {
    return toString().length();
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return toString().subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.WString
 * JD-Core Version:    0.7.0.1
 */