package androidx.collection;

public final class CircularIntArray
{
  public int[] OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  
  public CircularIntArray()
  {
    this(8);
  }
  
  public CircularIntArray(int paramInt)
  {
    int i = 1;
    if (paramInt >= i)
    {
      int j = 1073741824;
      if (paramInt <= j)
      {
        j = Integer.bitCount(paramInt);
        if (j != i) {
          paramInt = Integer.highestOneBit(paramInt + -1) << i;
        }
        i = paramInt + -1;
        this.OooO0Oo = i;
        localObject = new int[paramInt];
        this.OooO00o = ((int[])localObject);
        return;
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("capacity must be <= 2^30");
      throw ((Throwable)localObject);
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("capacity must be >= 1");
    throw ((Throwable)localObject);
  }
  
  public int OooO00o()
  {
    int i = this.OooO0OO;
    int j = this.OooO0O0;
    i -= j;
    j = this.OooO0Oo;
    return i & j;
  }
  
  public int get(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = OooO00o();
      if (paramInt < i)
      {
        int[] arrayOfInt = this.OooO00o;
        int j = this.OooO0O0 + paramInt;
        paramInt = this.OooO0Oo & j;
        return arrayOfInt[paramInt];
      }
    }
    ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException = new java/lang/ArrayIndexOutOfBoundsException;
    localArrayIndexOutOfBoundsException.<init>();
    throw localArrayIndexOutOfBoundsException;
  }
  
  public int getFirst()
  {
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    if (i != j) {
      return this.OooO00o[i];
    }
    ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException = new java/lang/ArrayIndexOutOfBoundsException;
    localArrayIndexOutOfBoundsException.<init>();
    throw localArrayIndexOutOfBoundsException;
  }
  
  public int getLast()
  {
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    if (i != j)
    {
      localObject = this.OooO00o;
      j += -1;
      int k = this.OooO0Oo;
      j &= k;
      return localObject[j];
    }
    Object localObject = new java/lang/ArrayIndexOutOfBoundsException;
    ((ArrayIndexOutOfBoundsException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public boolean isEmpty()
  {
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.CircularIntArray
 * JD-Core Version:    0.7.0.1
 */