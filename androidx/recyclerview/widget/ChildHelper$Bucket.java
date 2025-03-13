package androidx.recyclerview.widget;

class ChildHelper$Bucket
{
  public long OooO00o = 0L;
  public Bucket OooO0O0;
  
  public void OooO00o(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      Bucket localBucket = this.OooO0O0;
      if (localBucket != null)
      {
        paramInt -= i;
        localBucket.OooO00o(paramInt);
      }
    }
    else
    {
      long l1 = this.OooO00o;
      long l2 = 1L << paramInt ^ -1;
      l1 &= l2;
      this.OooO00o = l1;
    }
  }
  
  public int OooO0O0(int paramInt)
  {
    Bucket localBucket = this.OooO0O0;
    int i = 64;
    long l1 = 1L;
    long l2;
    long l3;
    if (localBucket == null)
    {
      if (paramInt >= i) {
        return Long.bitCount(this.OooO00o);
      }
      l2 = this.OooO00o;
      l3 = (l1 << paramInt) - l1;
      return Long.bitCount(l2 & l3);
    }
    if (paramInt < i)
    {
      l2 = this.OooO00o;
      l3 = (l1 << paramInt) - l1;
      return Long.bitCount(l2 & l3);
    }
    paramInt -= i;
    paramInt = localBucket.OooO0O0(paramInt);
    int j = Long.bitCount(this.OooO00o);
    return paramInt + j;
  }
  
  public final void OooO0OO()
  {
    Bucket localBucket = this.OooO0O0;
    if (localBucket == null)
    {
      localBucket = new androidx/recyclerview/widget/ChildHelper$Bucket;
      localBucket.<init>();
      this.OooO0O0 = localBucket;
    }
  }
  
  public void OooO0Oo(int paramInt, boolean paramBoolean)
  {
    int i = 64;
    if (paramInt >= i)
    {
      OooO0OO();
      Bucket localBucket1 = this.OooO0O0;
      paramInt -= i;
      localBucket1.OooO0Oo(paramInt, paramBoolean);
    }
    else
    {
      long l1 = this.OooO00o;
      long l2 = 0x0 & l1;
      long l3 = 0L;
      boolean bool1 = l2 < l3;
      boolean bool2 = true;
      if (bool1) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      long l4 = 1L;
      long l5 = (l4 << paramInt) - l4;
      l4 = l1 & l5;
      l5 ^= -1;
      l1 = (l1 & l5) << bool2 | l4;
      this.OooO00o = l1;
      if (paramBoolean) {
        set(paramInt);
      } else {
        OooO00o(paramInt);
      }
      Bucket localBucket2;
      if (!bool1)
      {
        localBucket2 = this.OooO0O0;
        if (localBucket2 == null) {}
      }
      else
      {
        OooO0OO();
        localBucket2 = this.OooO0O0;
        localBucket2.OooO0Oo(0, bool1);
      }
    }
  }
  
  public void OooO0o()
  {
    long l = 0L;
    this.OooO00o = l;
    Bucket localBucket = this.OooO0O0;
    if (localBucket != null) {
      localBucket.OooO0o();
    }
  }
  
  public boolean OooO0o0(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      OooO0OO();
      Bucket localBucket1 = this.OooO0O0;
      paramInt -= i;
      return localBucket1.OooO0o0(paramInt);
    }
    long l1 = 1L;
    long l2 = l1 << paramInt;
    long l3 = this.OooO00o;
    long l4 = l3 & l2;
    long l5 = 0L;
    paramInt = l4 < l5;
    int k = 1;
    if (paramInt != 0) {
      paramInt = k;
    } else {
      paramInt = 0;
    }
    l5 = l2 ^ -1;
    l3 &= l5;
    this.OooO00o = l3;
    l2 -= l1;
    l1 = l3 & l2;
    l2 = Long.rotateRight((l2 ^ -1) & l3, k);
    l1 |= l2;
    this.OooO00o = l1;
    Bucket localBucket2 = this.OooO0O0;
    if (localBucket2 != null)
    {
      boolean bool = localBucket2.get(0);
      if (bool)
      {
        int j = 63;
        set(j);
      }
      localBucket2 = this.OooO0O0;
      localBucket2.OooO0o0(0);
    }
    return paramInt;
  }
  
  public boolean get(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      OooO0OO();
      Bucket localBucket = this.OooO0O0;
      paramInt -= i;
      return localBucket.get(paramInt);
    }
    long l1 = this.OooO00o;
    long l2 = 1L << paramInt;
    l1 &= l2;
    l2 = 0L;
    paramInt = l1 < l2;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public void set(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      OooO0OO();
      Bucket localBucket = this.OooO0O0;
      paramInt -= i;
      localBucket.set(paramInt);
    }
    else
    {
      long l1 = this.OooO00o;
      long l2 = 1L << paramInt;
      l1 |= l2;
      this.OooO00o = l1;
    }
  }
  
  public String toString()
  {
    Object localObject = this.OooO0O0;
    if (localObject == null)
    {
      long l1 = this.OooO00o;
      localObject = Long.toBinaryString(l1);
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.OooO0O0.toString();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("xx");
      long l2 = this.OooO00o;
      str = Long.toBinaryString(l2);
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ChildHelper.Bucket
 * JD-Core Version:    0.7.0.1
 */