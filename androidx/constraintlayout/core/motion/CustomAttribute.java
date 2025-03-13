package androidx.constraintlayout.core.motion;

public class CustomAttribute
{
  public CustomAttribute.AttributeType OooO00o;
  public int OooO0O0;
  public float OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public boolean OooO0o0;
  
  public static int OooO00o(int paramInt)
  {
    int i = paramInt >> 31 ^ 0xFFFFFFFF;
    paramInt = (paramInt & i) + -255;
    i = paramInt >> 31;
    return (paramInt & i) + 255;
  }
  
  public static int OooO0OO(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 6.0F;
    paramFloat1 *= f1;
    int i = (int)paramFloat1;
    float f2 = i;
    paramFloat1 -= f2;
    paramFloat3 *= 255.0F;
    int j = 1065353216;
    f2 = 1.0F;
    float f3 = (f2 - paramFloat2) * paramFloat3;
    float f4 = 0.5F;
    f3 += f4;
    int k = (int)f3;
    float f5 = paramFloat1 * paramFloat2;
    f5 = (f2 - f5) * paramFloat3 + f4;
    int m = (int)f5;
    paramFloat1 = (f2 - paramFloat1) * paramFloat2;
    f2 = (f2 - paramFloat1) * paramFloat3 + f4;
    int n = (int)f2;
    int i1 = (int)(paramFloat3 + f4);
    int i2 = -16777216;
    paramFloat3 = -1.701412E+038F;
    if (i != 0)
    {
      j = 1;
      f2 = 1.4E-45F;
      if (i != j)
      {
        j = 2;
        f2 = 2.802597E-045F;
        if (i != j)
        {
          j = 3;
          f2 = 4.203895E-045F;
          if (i != j)
          {
            j = 4;
            f2 = 5.605194E-045F;
            if (i != j)
            {
              n = 5;
              paramFloat1 = 7.006492E-045F;
              if (i != n) {
                return 0;
              }
              n = i1 << 16;
              i1 = k << 8;
              return n + i1 + m | i2;
            }
            n <<= 16;
            i = k << 8;
            return n + i + i1 | i2;
          }
          n = k << 16;
          i = m << 8;
          return n + i + i1 | i2;
        }
        i = k << 16;
        i1 <<= 8;
        return i + i1 + n | i2;
      }
      n = m << 16;
      i1 <<= 8;
      return n + i1 + k | i2;
    }
    i1 <<= 16;
    n <<= 8;
    return i1 + n + k | i2;
  }
  
  public void OooO0O0(float[] paramArrayOfFloat)
  {
    int[] arrayOfInt = CustomAttribute.1.OooO00o;
    int i = this.OooO00o.ordinal();
    int j = arrayOfInt[i];
    i = 0;
    float f1;
    switch (j)
    {
    default: 
      break;
    case 8: 
      f1 = this.OooO0OO;
      paramArrayOfFloat[0] = f1;
      break;
    case 7: 
      f1 = this.OooO0OO;
      paramArrayOfFloat[0] = f1;
      break;
    case 6: 
      j = this.OooO0O0;
      f1 = j;
      paramArrayOfFloat[0] = f1;
      break;
    case 4: 
    case 5: 
      j = this.OooO0o;
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
      i = 3;
      paramArrayOfFloat[i] = f1;
      break;
    case 3: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Color does not have a single color to interpolate");
      throw paramArrayOfFloat;
    case 2: 
      boolean bool = this.OooO0o0;
      int k;
      if (bool)
      {
        k = 1065353216;
        f1 = 1.0F;
      }
      else
      {
        k = 0;
        f1 = 0.0F;
        arrayOfInt = null;
      }
      paramArrayOfFloat[0] = f1;
    }
  }
  
  public int OooO0Oo()
  {
    int[] arrayOfInt = CustomAttribute.1.OooO00o;
    CustomAttribute.AttributeType localAttributeType = this.OooO00o;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    i = 4;
    if (j != i)
    {
      int k = 5;
      if (j != k) {
        return 1;
      }
    }
    return i;
  }
  
  public CustomAttribute.AttributeType getType()
  {
    return this.OooO00o;
  }
  
  public float getValueToInterpolate()
  {
    Object localObject = CustomAttribute.1.OooO00o;
    CustomAttribute.AttributeType localAttributeType = this.OooO00o;
    int i = localAttributeType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      return 0.0F / 0.0F;
    case 8: 
      return this.OooO0OO;
    case 7: 
      return this.OooO0OO;
    case 6: 
      return this.OooO0O0;
    case 4: 
    case 5: 
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Color does not have a single color to interpolate");
      throw ((Throwable)localObject);
    case 3: 
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Cannot interpolate String");
      throw ((Throwable)localObject);
    }
    boolean bool = this.OooO0o0;
    int k;
    float f;
    if (bool)
    {
      k = 1065353216;
      f = 1.0F;
    }
    else
    {
      k = 0;
      f = 0.0F;
      localObject = null;
    }
    return f;
  }
  
  public boolean isContinuous()
  {
    int[] arrayOfInt = CustomAttribute.1.OooO00o;
    CustomAttribute.AttributeType localAttributeType = this.OooO00o;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    i = 1;
    if (j != i)
    {
      int k = 2;
      if (j != k)
      {
        int m = 3;
        if (j != m) {
          return i;
        }
      }
    }
    return false;
  }
  
  public void setColorValue(int paramInt)
  {
    this.OooO0o = paramInt;
  }
  
  public void setFloatValue(float paramFloat)
  {
    this.OooO0OO = paramFloat;
  }
  
  public void setIntValue(int paramInt)
  {
    this.OooO0O0 = paramInt;
  }
  
  public void setStringValue(String paramString)
  {
    this.OooO0Oo = paramString;
  }
  
  public void setValue(Object paramObject)
  {
    int[] arrayOfInt = CustomAttribute.1.OooO00o;
    CustomAttribute.AttributeType localAttributeType = this.OooO00o;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      break;
    case 7: 
    case 8: 
      paramObject = (Float)paramObject;
      float f = paramObject.floatValue();
      this.OooO0OO = f;
      break;
    case 4: 
    case 5: 
      paramObject = (Integer)paramObject;
      int k = paramObject.intValue();
      this.OooO0o = k;
      break;
    case 3: 
      paramObject = (String)paramObject;
      this.OooO0Oo = paramObject;
      break;
    case 2: 
      paramObject = (Boolean)paramObject;
      boolean bool = paramObject.booleanValue();
      this.OooO0o0 = bool;
      break;
    case 1: 
    case 6: 
      paramObject = (Integer)paramObject;
      int m = paramObject.intValue();
      this.OooO0O0 = m;
    }
  }
  
  public void setValue(float[] paramArrayOfFloat)
  {
    int[] arrayOfInt = CustomAttribute.1.OooO00o;
    CustomAttribute.AttributeType localAttributeType = this.OooO00o;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    i = 1;
    float f1 = 1.4E-45F;
    int k = 0;
    float f2 = 0.0F;
    switch (j)
    {
    default: 
      break;
    case 8: 
      f3 = paramArrayOfFloat[0];
      break;
    case 7: 
      f3 = paramArrayOfFloat[0];
      this.OooO0OO = f3;
      break;
    case 4: 
    case 5: 
      float f4 = paramArrayOfFloat[0];
      f1 = paramArrayOfFloat[i];
      k = 2;
      f2 = paramArrayOfFloat[k];
      j = OooO0OO(f4, f1, f2);
      this.OooO0o = j;
      j &= 0xFFFFFF;
      f3 = paramArrayOfFloat[3];
      i = 1132396544;
      f1 = 255.0F;
      f3 *= f1;
      int m = OooO00o((int)f3) << 24 | j;
      this.OooO0o = m;
      break;
    case 3: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Color does not have a single color to interpolate");
      throw paramArrayOfFloat;
    case 2: 
      f3 = paramArrayOfFloat[0];
      double d1 = f3;
      double d2 = 0.5D;
      boolean bool = d1 < d2;
      if (!bool)
      {
        i = 0;
        localAttributeType = null;
        f1 = 0.0F;
      }
      this.OooO0o0 = i;
      break;
    }
    float f3 = paramArrayOfFloat[0];
    int n = (int)f3;
    this.OooO0O0 = n;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.CustomAttribute
 * JD-Core Version:    0.7.0.1
 */