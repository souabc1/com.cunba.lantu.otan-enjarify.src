package com.google.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber
  extends Number
{
  private final String value;
  
  public LazilyParsedNumber(String paramString)
  {
    this.value = paramString;
  }
  
  private Object writeReplace()
  {
    BigDecimal localBigDecimal = new java/math/BigDecimal;
    String str = this.value;
    localBigDecimal.<init>(str);
    return localBigDecimal;
  }
  
  public double doubleValue()
  {
    return Double.parseDouble(this.value);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof LazilyParsedNumber;
    if (bool2)
    {
      paramObject = (LazilyParsedNumber)paramObject;
      String str = this.value;
      paramObject = paramObject.value;
      if (str != paramObject)
      {
        boolean bool3 = str.equals(paramObject);
        if (!bool3) {
          bool1 = false;
        }
      }
      return bool1;
    }
    return false;
  }
  
  public float floatValue()
  {
    return Float.parseFloat(this.value);
  }
  
  public int hashCode()
  {
    return this.value.hashCode();
  }
  
  public int intValue()
  {
    Object localObject;
    try
    {
      localObject = this.value;
      return Integer.parseInt((String)localObject);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        localObject = this.value;
        return (int)Long.parseLong((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        localObject = new java/math/BigDecimal;
        String str = this.value;
        ((BigDecimal)localObject).<init>(str);
      }
    }
    return ((BigDecimal)localObject).intValue();
  }
  
  public long longValue()
  {
    Object localObject;
    try
    {
      localObject = this.value;
      return Long.parseLong((String)localObject);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localObject = new java/math/BigDecimal;
      String str = this.value;
      ((BigDecimal)localObject).<init>(str);
    }
    return ((BigDecimal)localObject).longValue();
  }
  
  public String toString()
  {
    return this.value;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LazilyParsedNumber
 * JD-Core Version:    0.7.0.1
 */