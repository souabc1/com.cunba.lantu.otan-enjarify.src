package androidx.recyclerview.widget;

final class AdapterHelper$UpdateOp
{
  public int OooO00o;
  public int OooO0O0;
  public Object OooO0OO;
  public int OooO0Oo;
  
  public AdapterHelper$UpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0Oo = paramInt3;
    this.OooO0OO = paramObject;
  }
  
  public String OooO00o()
  {
    int i = this.OooO00o;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 4;
        if (i != j)
        {
          j = 8;
          if (i != j) {
            return "??";
          }
          return "mv";
        }
        return "up";
      }
      return "rm";
    }
    return "add";
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject) {
      return i;
    }
    boolean bool1 = paramObject instanceof UpdateOp;
    if (!bool1) {
      return false;
    }
    paramObject = (UpdateOp)paramObject;
    int j = this.OooO00o;
    int m = paramObject.OooO00o;
    if (j != m) {
      return false;
    }
    int n = 8;
    if (j == n)
    {
      j = this.OooO0Oo;
      int i1 = this.OooO0O0;
      j = Math.abs(j - i1);
      if (j == i)
      {
        k = this.OooO0Oo;
        i2 = paramObject.OooO0O0;
        if (k == i2)
        {
          k = this.OooO0O0;
          i2 = paramObject.OooO0Oo;
          if (k == i2) {
            return i;
          }
        }
      }
    }
    int k = this.OooO0Oo;
    int i2 = paramObject.OooO0Oo;
    if (k != i2) {
      return false;
    }
    k = this.OooO0O0;
    i2 = paramObject.OooO0O0;
    if (k != i2) {
      return false;
    }
    Object localObject = this.OooO0OO;
    paramObject = paramObject.OooO0OO;
    if (localObject != null)
    {
      boolean bool2 = localObject.equals(paramObject);
      if (!bool2) {
        return false;
      }
    }
    else if (paramObject != null)
    {
      return false;
    }
    return i;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o * 31;
    int j = this.OooO0O0;
    i = (i + j) * 31;
    j = this.OooO0Oo;
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("[");
    localObject = OooO00o();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(",s:");
    int i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append("c:");
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    localStringBuilder.append(",p:");
    localObject = this.OooO0OO;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AdapterHelper.UpdateOp
 * JD-Core Version:    0.7.0.1
 */