package androidx.constraintlayout.core.motion;

public class CustomVariable
{
  public String OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public float OooO0Oo;
  public boolean OooO0o;
  public String OooO0o0;
  
  public static String OooO00o(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("00000000");
    String str = Integer.toHexString(paramInt);
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("#");
    int i = str.length() + -8;
    str = str.substring(i);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void OooO0O0(float[] paramArrayOfFloat)
  {
    int i = this.OooO0O0;
    int k = 0;
    float f1;
    int j;
    switch (i)
    {
    default: 
      break;
    case 905: 
      f1 = this.OooO0Oo;
      paramArrayOfFloat[0] = f1;
      break;
    case 904: 
      boolean bool = this.OooO0o;
      if (bool)
      {
        j = 1065353216;
        f1 = 1.0F;
      }
      else
      {
        j = 0;
        f1 = 0.0F;
      }
      paramArrayOfFloat[0] = f1;
      break;
    case 903: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Cannot interpolate String");
      throw paramArrayOfFloat;
    case 902: 
      j = this.OooO0OO;
      int m = j >> 24 & 0xFF;
      int n = j >> 16 & 0xFF;
      int i1 = j >> 8 & 0xFF;
      j &= 0xFF;
      float f2 = n;
      float f3 = 255.0F;
      double d1 = f2 / f3;
      double d2 = 2.2D;
      f2 = (float)Math.pow(d1, d2);
      float f4 = (float)Math.pow(i1 / f3, d2);
      d1 = Math.pow(j / f3, d2);
      f1 = (float)d1;
      paramArrayOfFloat[0] = f2;
      paramArrayOfFloat[1] = f4;
      paramArrayOfFloat[2] = f1;
      f1 = m / f3;
      k = 3;
      paramArrayOfFloat[k] = f1;
      break;
    case 901: 
      f1 = this.OooO0Oo;
      paramArrayOfFloat[0] = f1;
      break;
    case 900: 
      j = this.OooO0OO;
      f1 = j;
      paramArrayOfFloat[0] = f1;
    }
  }
  
  public int OooO0OO()
  {
    int i = this.OooO0O0;
    int j = 902;
    if (i != j) {
      return 1;
    }
    return 4;
  }
  
  public boolean getBooleanValue()
  {
    return this.OooO0o;
  }
  
  public int getColorValue()
  {
    return this.OooO0OO;
  }
  
  public float getFloatValue()
  {
    return this.OooO0Oo;
  }
  
  public int getIntegerValue()
  {
    return this.OooO0OO;
  }
  
  public String getName()
  {
    return this.OooO00o;
  }
  
  public String getStringValue()
  {
    return this.OooO0o0;
  }
  
  public int getType()
  {
    return this.OooO0O0;
  }
  
  public float getValueToInterpolate()
  {
    int i = this.OooO0O0;
    RuntimeException localRuntimeException;
    switch (i)
    {
    default: 
      return 0.0F / 0.0F;
    case 905: 
      return this.OooO0Oo;
    case 904: 
      boolean bool = this.OooO0o;
      int j;
      float f;
      if (bool)
      {
        j = 1065353216;
        f = 1.0F;
      }
      else
      {
        j = 0;
        f = 0.0F;
        localRuntimeException = null;
      }
      return f;
    case 903: 
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Cannot interpolate String");
      throw localRuntimeException;
    case 902: 
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Color does not have a single color to interpolate");
      throw localRuntimeException;
    case 901: 
      return this.OooO0Oo;
    }
    return this.OooO0OO;
  }
  
  public boolean isContinuous()
  {
    int i = this.OooO0O0;
    int j = 903;
    if (i != j)
    {
      j = 904;
      if (i != j)
      {
        j = 906;
        if (i != j) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void setBooleanValue(boolean paramBoolean)
  {
    this.OooO0o = paramBoolean;
  }
  
  public void setFloatValue(float paramFloat)
  {
    this.OooO0Oo = paramFloat;
  }
  
  public void setIntValue(int paramInt)
  {
    this.OooO0OO = paramInt;
  }
  
  public void setStringValue(String paramString)
  {
    this.OooO0o0 = paramString;
  }
  
  public void setValue(Object paramObject)
  {
    int i = this.OooO0O0;
    switch (i)
    {
    default: 
      break;
    case 904: 
      paramObject = (Boolean)paramObject;
      boolean bool = paramObject.booleanValue();
      this.OooO0o = bool;
      break;
    case 903: 
      paramObject = (String)paramObject;
      this.OooO0o0 = paramObject;
      break;
    case 901: 
    case 905: 
      paramObject = (Float)paramObject;
      float f = paramObject.floatValue();
      this.OooO0Oo = f;
      break;
    case 900: 
    case 902: 
    case 906: 
      paramObject = (Integer)paramObject;
      int j = paramObject.intValue();
      this.OooO0OO = j;
    }
  }
  
  public void setValue(float[] paramArrayOfFloat)
  {
    int i = this.OooO0O0;
    int j = 1;
    float f1 = 1.4E-45F;
    double d1 = 0.5D;
    int k = 0;
    float f2 = 0.0F;
    float f3;
    double d2;
    int m;
    switch (i)
    {
    default: 
      break;
    case 904: 
      f3 = paramArrayOfFloat[0];
      d2 = f3;
      boolean bool = d2 < d1;
      if (!bool)
      {
        j = 0;
        f1 = 0.0F;
      }
      this.OooO0o = j;
      break;
    case 903: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Cannot interpolate String");
      throw paramArrayOfFloat;
    case 902: 
      float f4 = paramArrayOfFloat[0];
      f1 = paramArrayOfFloat[j];
      k = 2;
      f2 = paramArrayOfFloat[k];
      d2 = Math.pow(f4, d1);
      f4 = (float)d2;
      float f5 = 255.0F;
      f4 *= f5;
      i = Math.round(f4) & 0xFF;
      f1 = (float)Math.pow(f1, d1) * f5;
      j = Math.round(f1) & 0xFF;
      double d3 = f2;
      d1 = Math.pow(d3, d1);
      float f6 = (float)d1 * f5;
      int n = Math.round(f6) & 0xFF;
      int i1 = 3;
      f3 = paramArrayOfFloat[i1] * f5;
      m = (Math.round(f3) & 0xFF) << 24;
      i <<= 16;
      m |= i;
      i = j << 8;
      m = m | i | n;
      break;
    case 901: 
    case 905: 
      f3 = paramArrayOfFloat[0];
      this.OooO0Oo = f3;
      break;
    case 900: 
    case 906: 
      f3 = paramArrayOfFloat[0];
      m = (int)f3;
    }
    this.OooO0OO = m;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.OooO00o;
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(':');
    localObject1 = ((StringBuilder)localObject1).toString();
    int i = this.OooO0O0;
    switch (i)
    {
    default: 
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = "????";
      ((StringBuilder)localObject2).append((String)localObject1);
    }
    for (;;)
    {
      label99:
      return ((StringBuilder)localObject2).toString();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      for (;;)
      {
        ((StringBuilder)localObject2).append((String)localObject1);
        float f = this.OooO0Oo;
        ((StringBuilder)localObject2).append(f);
        break label99;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)localObject1);
        boolean bool = this.OooO0o;
        localObject1 = Boolean.valueOf(bool);
        ((StringBuilder)localObject2).append(localObject1);
        break label99;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = this.OooO0o0;
        break;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)localObject1);
        j = this.OooO0OO;
        localObject1 = OooO00o(j);
        break;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      int j = this.OooO0OO;
      ((StringBuilder)localObject2).append(j);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.CustomVariable
 * JD-Core Version:    0.7.0.1
 */