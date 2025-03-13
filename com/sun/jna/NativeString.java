package com.sun.jna;

import m54207b69;

class NativeString
  implements CharSequence, Comparable
{
  public Pointer o00OoOoo;
  public String o00Ooo00;
  
  public NativeString(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      this.o00Ooo00 = paramString2;
      Object localObject = m54207b69.F54207b69_11("''0A0B72716767107B7B7E78746C1718");
      boolean bool = ((String)localObject).equals(paramString2);
      int j;
      if (bool)
      {
        j = paramString1.length() + 1;
        int i = Native.OooOOO;
        j *= i;
        localObject = new com/sun/jna/NativeString$StringMemory;
        long l1 = j;
        ((NativeString.StringMemory)localObject).<init>(this, l1);
        this.o00OoOoo = ((Pointer)localObject);
        l1 = 0L;
        ((Pointer)localObject).OoooO00(l1, paramString1);
      }
      else
      {
        paramString1 = Native.OooO0oO(paramString1, paramString2);
        NativeString.StringMemory localStringMemory = new com/sun/jna/NativeString$StringMemory;
        j = paramString1.length + 1;
        long l2 = j;
        localStringMemory.<init>(this, l2);
        this.o00OoOoo = localStringMemory;
        long l3 = 0L;
        int k = paramString1.length;
        localStringMemory.OoooO(l3, paramString1, 0, k);
        paramString2 = this.o00OoOoo;
        l2 = paramString1.length;
        paramString1 = null;
        paramString2.Oooo000(l2, (byte)0);
      }
      return;
    }
    paramString1 = new java/lang/NullPointerException;
    paramString2 = m54207b69.F54207b69_11("wN1D3B3E2A242E742A434644792C2E487D3C3C80334F3738");
    paramString1.<init>(paramString2);
    throw paramString1;
  }
  
  public NativeString(String paramString, boolean paramBoolean)
  {
    this(paramString, str);
  }
  
  public char charAt(int paramInt)
  {
    return toString().charAt(paramInt);
  }
  
  public int compareTo(Object paramObject)
  {
    if (paramObject == null) {
      return 1;
    }
    String str = toString();
    paramObject = paramObject.toString();
    return str.compareTo(paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof CharSequence;
    boolean bool2 = false;
    if (bool1)
    {
      int i = compareTo(paramObject);
      if (i == 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public Pointer getPointer()
  {
    return this.o00OoOoo;
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
    Object localObject = m54207b69.F54207b69_11("''0A0B72716767107B7B7E78746C1718");
    String str1 = this.o00Ooo00;
    boolean bool = ((String)localObject).equals(str1);
    long l = 0L;
    if (bool)
    {
      localObject = this.o00OoOoo.OooOOoo(l);
    }
    else
    {
      localObject = this.o00OoOoo;
      String str2 = this.o00Ooo00;
      localObject = ((Pointer)localObject).OooOOOO(l, str2);
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.NativeString
 * JD-Core Version:    0.7.0.1
 */