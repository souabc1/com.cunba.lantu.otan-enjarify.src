package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$Reference
{
  public static final Reference OooO0o;
  public ReadBuf OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o0;
  
  static
  {
    Reference localReference = new androidx/emoji2/text/flatbuffer/FlexBuffers$Reference;
    ReadBuf localReadBuf = FlexBuffers.OooO00o();
    localReference.<init>(localReadBuf, 0, 1, 0);
    OooO0o = localReference;
  }
  
  public FlexBuffers$Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramReadBuf, paramInt1, paramInt2, j, k);
  }
  
  public FlexBuffers$Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO00o = paramReadBuf;
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt2;
    this.OooO0Oo = paramInt3;
    this.OooO0o0 = paramInt4;
  }
  
  public long OooO()
  {
    int i = this.OooO0o0;
    int j = 2;
    if (i == j)
    {
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0Oo(localReadBuf, j, k);
    }
    j = 1;
    if (i != j)
    {
      j = 3;
      if (i != j)
      {
        j = 10;
        if (i != j)
        {
          j = 26;
          if (i != j)
          {
            j = 5;
            if (i != j)
            {
              j = 6;
              if (i != j)
              {
                j = 7;
                if (i != j)
                {
                  j = 8;
                  if (i != j) {
                    return 0L;
                  }
                  localReadBuf = this.OooO00o;
                  j = this.OooO0O0;
                  k = this.OooO0OO;
                  j = FlexBuffers.OooO0OO(localReadBuf, j, k);
                  k = this.OooO0OO;
                  return FlexBuffers.OooO0o0(localReadBuf, j, k);
                }
                localReadBuf = this.OooO00o;
                j = this.OooO0O0;
                k = this.OooO0OO;
                j = FlexBuffers.OooO0OO(localReadBuf, j, k);
                k = this.OooO0Oo;
                return FlexBuffers.OooO0Oo(localReadBuf, j, k);
              }
              localReadBuf = this.OooO00o;
              j = this.OooO0O0;
              k = this.OooO0OO;
              j = FlexBuffers.OooO0OO(localReadBuf, j, k);
              k = this.OooO0Oo;
              return FlexBuffers.OooO0o(localReadBuf, j, k);
            }
            return Long.parseLong(OooO0oo());
          }
          localReadBuf = this.OooO00o;
          j = this.OooO0O0;
          k = this.OooO0OO;
          return FlexBuffers.OooO0O0(localReadBuf, j, k);
        }
        return OooOO0().OooO0O0();
      }
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0o0(localReadBuf, j, k);
    }
    ReadBuf localReadBuf = this.OooO00o;
    j = this.OooO0O0;
    int k = this.OooO0OO;
    return FlexBuffers.OooO0o(localReadBuf, j, k);
  }
  
  public FlexBuffers.Blob OooO0O0()
  {
    boolean bool = isBlob();
    if (!bool)
    {
      bool = isString();
      if (!bool) {
        return FlexBuffers.Blob.OooO0OO();
      }
    }
    FlexBuffers.Blob localBlob = new androidx/emoji2/text/flatbuffer/FlexBuffers$Blob;
    ReadBuf localReadBuf = this.OooO00o;
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    i = FlexBuffers.OooO0OO(localReadBuf, i, j);
    j = this.OooO0Oo;
    localBlob.<init>(localReadBuf, i, j);
    return localBlob;
  }
  
  public boolean OooO0OO()
  {
    boolean bool1 = isBoolean();
    boolean bool3 = true;
    if (bool1)
    {
      ReadBuf localReadBuf = this.OooO00o;
      int j = this.OooO0O0;
      int i = localReadBuf.get(j);
      if (i == 0) {
        bool3 = false;
      }
      return bool3;
    }
    long l1 = OooO();
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (!bool2) {
      bool3 = false;
    }
    return bool3;
  }
  
  public double OooO0Oo()
  {
    int i = this.OooO0o0;
    int j = 3;
    if (i == j)
    {
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0o0(localReadBuf, j, k);
    }
    j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 5;
        if (i != j)
        {
          j = 6;
          if (i != j)
          {
            j = 7;
            if (i != j)
            {
              j = 8;
              if (i != j)
              {
                j = 10;
                if (i != j)
                {
                  j = 26;
                  if (i != j) {
                    return 0.0D;
                  }
                }
                else
                {
                  return OooOO0().OooO0O0();
                }
              }
              else
              {
                localReadBuf = this.OooO00o;
                j = this.OooO0O0;
                k = this.OooO0OO;
                j = FlexBuffers.OooO0OO(localReadBuf, j, k);
                k = this.OooO0Oo;
                return FlexBuffers.OooO0o0(localReadBuf, j, k);
              }
            }
            else
            {
              localReadBuf = this.OooO00o;
              j = this.OooO0O0;
              k = this.OooO0OO;
              j = FlexBuffers.OooO0OO(localReadBuf, j, k);
              k = this.OooO0Oo;
              return FlexBuffers.OooO0Oo(localReadBuf, j, k);
            }
          }
          else
          {
            localReadBuf = this.OooO00o;
            j = this.OooO0O0;
            k = this.OooO0OO;
            j = FlexBuffers.OooO0OO(localReadBuf, j, k);
            k = this.OooO0Oo;
            return FlexBuffers.OooO0O0(localReadBuf, j, k);
          }
        }
        else
        {
          return Double.parseDouble(OooO0oo());
        }
      }
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0Oo(localReadBuf, j, k);
    }
    ReadBuf localReadBuf = this.OooO00o;
    j = this.OooO0O0;
    int k = this.OooO0OO;
    return FlexBuffers.OooO0O0(localReadBuf, j, k);
  }
  
  public long OooO0o()
  {
    int i = this.OooO0o0;
    int j = 1;
    if (i == j)
    {
      localObject = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0o((ReadBuf)localObject, j, k);
    }
    j = 2;
    if (i != j)
    {
      j = 3;
      if (i != j)
      {
        j = 5;
        long l = 0L;
        if (i != j)
        {
          j = 6;
          if (i != j)
          {
            j = 7;
            if (i != j)
            {
              j = 8;
              if (i != j)
              {
                j = 10;
                if (i != j)
                {
                  j = 26;
                  if (i != j) {
                    return l;
                  }
                  localObject = this.OooO00o;
                  j = this.OooO0O0;
                  k = this.OooO0OO;
                  return FlexBuffers.OooO0O0((ReadBuf)localObject, j, k);
                }
                return OooOO0().OooO0O0();
              }
              localObject = this.OooO00o;
              j = this.OooO0O0;
              k = this.OooO0OO;
              j = FlexBuffers.OooO0OO((ReadBuf)localObject, j, k);
              k = this.OooO0Oo;
              return FlexBuffers.OooO0o0((ReadBuf)localObject, j, k);
            }
            localObject = this.OooO00o;
            j = this.OooO0O0;
            k = this.OooO0OO;
            j = FlexBuffers.OooO0OO((ReadBuf)localObject, j, k);
            k = this.OooO0OO;
            return FlexBuffers.OooO0Oo((ReadBuf)localObject, j, k);
          }
          localObject = this.OooO00o;
          j = this.OooO0O0;
          k = this.OooO0OO;
          j = FlexBuffers.OooO0OO((ReadBuf)localObject, j, k);
          k = this.OooO0Oo;
          return FlexBuffers.OooO0o((ReadBuf)localObject, j, k);
        }
        try
        {
          localObject = OooO0oo();
          return Long.parseLong((String)localObject);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          return l;
        }
      }
      localObject = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      return FlexBuffers.OooO0o0((ReadBuf)localObject, j, k);
    }
    Object localObject = this.OooO00o;
    j = this.OooO0O0;
    int k = this.OooO0OO;
    return FlexBuffers.OooO0Oo((ReadBuf)localObject, j, k);
  }
  
  public FlexBuffers.Key OooO0o0()
  {
    boolean bool = isKey();
    if (bool)
    {
      FlexBuffers.Key localKey = new androidx/emoji2/text/flatbuffer/FlexBuffers$Key;
      ReadBuf localReadBuf = this.OooO00o;
      int i = this.OooO0O0;
      int j = this.OooO0OO;
      i = FlexBuffers.OooO0OO(localReadBuf, i, j);
      j = this.OooO0Oo;
      localKey.<init>(localReadBuf, i, j);
      return localKey;
    }
    return FlexBuffers.Key.OooO0OO();
  }
  
  public FlexBuffers.Map OooO0oO()
  {
    boolean bool = isMap();
    if (bool)
    {
      FlexBuffers.Map localMap = new androidx/emoji2/text/flatbuffer/FlexBuffers$Map;
      ReadBuf localReadBuf = this.OooO00o;
      int i = this.OooO0O0;
      int j = this.OooO0OO;
      i = FlexBuffers.OooO0OO(localReadBuf, i, j);
      j = this.OooO0Oo;
      localMap.<init>(localReadBuf, i, j);
      return localMap;
    }
    return FlexBuffers.Map.OooO0Oo();
  }
  
  public String OooO0oo()
  {
    boolean bool1 = isString();
    ReadBuf localReadBuf1;
    int k;
    int m;
    ReadBuf localReadBuf3;
    if (bool1)
    {
      localReadBuf1 = this.OooO00o;
      k = this.OooO0O0;
      m = this.OooO0OO;
      int i = FlexBuffers.OooO0OO(localReadBuf1, k, m);
      ReadBuf localReadBuf2 = this.OooO00o;
      m = this.OooO0Oo;
      int n = i - m;
      long l = FlexBuffers.OooO0Oo(localReadBuf2, n, m);
      k = (int)l;
      localReadBuf3 = this.OooO00o;
      return localReadBuf3.OooO00o(i, k);
    }
    boolean bool2 = isKey();
    if (bool2)
    {
      localReadBuf1 = this.OooO00o;
      k = this.OooO0O0;
      m = this.OooO0Oo;
      int j = FlexBuffers.OooO0OO(localReadBuf1, k, m);
      k = j;
      for (;;)
      {
        localReadBuf3 = this.OooO00o;
        m = localReadBuf3.get(k);
        if (m == 0)
        {
          localReadBuf3 = this.OooO00o;
          k -= j;
          break;
        }
        k += 1;
      }
    }
    return "";
  }
  
  public FlexBuffers.Vector OooOO0()
  {
    boolean bool1 = isVector();
    Object localObject;
    ReadBuf localReadBuf;
    int j;
    int k;
    if (bool1)
    {
      localObject = new androidx/emoji2/text/flatbuffer/FlexBuffers$Vector;
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      j = FlexBuffers.OooO0OO(localReadBuf, j, k);
      k = this.OooO0Oo;
      ((FlexBuffers.Vector)localObject).<init>(localReadBuf, j, k);
      return localObject;
    }
    int i = this.OooO0o0;
    int m = 15;
    if (i == m)
    {
      localObject = new androidx/emoji2/text/flatbuffer/FlexBuffers$TypedVector;
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      j = FlexBuffers.OooO0OO(localReadBuf, j, k);
      k = this.OooO0Oo;
      ((FlexBuffers.TypedVector)localObject).<init>(localReadBuf, j, k, 4);
      return localObject;
    }
    boolean bool2 = FlexBuffers.isTypedVector(i);
    if (bool2)
    {
      localObject = new androidx/emoji2/text/flatbuffer/FlexBuffers$TypedVector;
      localReadBuf = this.OooO00o;
      j = this.OooO0O0;
      k = this.OooO0OO;
      j = FlexBuffers.OooO0OO(localReadBuf, j, k);
      k = this.OooO0Oo;
      int n = FlexBuffers.OooOO0o(this.OooO0o0);
      ((FlexBuffers.TypedVector)localObject).<init>(localReadBuf, j, k, n);
      return localObject;
    }
    return FlexBuffers.Vector.OooO0OO();
  }
  
  public StringBuilder OooOO0O(StringBuilder paramStringBuilder)
  {
    int i = this.OooO0o0;
    int j = 36;
    if (i != j)
    {
      j = 34;
      long l;
      switch (i)
      {
      default: 
        return paramStringBuilder;
      case 26: 
        boolean bool = OooO0OO();
        paramStringBuilder.append(bool);
        return paramStringBuilder;
      case 25: 
        return OooO0O0().OooO00o(paramStringBuilder);
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
        paramStringBuilder = new androidx/emoji2/text/flatbuffer/FlexBuffers$FlexBufferException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("not_implemented:");
        j = this.OooO0o0;
        ((StringBuilder)localObject).append(j);
        localObject = ((StringBuilder)localObject).toString();
        paramStringBuilder.<init>((String)localObject);
        throw paramStringBuilder;
      case 10: 
        return OooOO0().OooO00o(paramStringBuilder);
      case 9: 
        return OooO0oO().OooO00o(paramStringBuilder);
      case 5: 
        paramStringBuilder.append(j);
        localObject = OooO0oo();
        paramStringBuilder.append((String)localObject);
        paramStringBuilder.append(j);
        return paramStringBuilder;
      case 4: 
        localObject = OooO0o0();
        paramStringBuilder.append(j);
        paramStringBuilder = ((FlexBuffers.Key)localObject).OooO00o(paramStringBuilder);
        paramStringBuilder.append(j);
        return paramStringBuilder;
      case 3: 
      case 8: 
        double d = OooO0Oo();
        paramStringBuilder.append(d);
        return paramStringBuilder;
      case 2: 
      case 7: 
        l = OooO();
        paramStringBuilder.append(l);
        return paramStringBuilder;
      case 1: 
      case 6: 
        l = OooO0o();
        paramStringBuilder.append(l);
        return paramStringBuilder;
      case 0: 
        paramStringBuilder.append("null");
        return paramStringBuilder;
      }
    }
    Object localObject = OooOO0();
    paramStringBuilder.append(localObject);
    return paramStringBuilder;
  }
  
  public int getType()
  {
    return this.OooO0o0;
  }
  
  public boolean isBlob()
  {
    int i = this.OooO0o0;
    int j = 25;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isBoolean()
  {
    int i = this.OooO0o0;
    int j = 26;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isFloat()
  {
    int i = this.OooO0o0;
    int j = 3;
    if (i != j)
    {
      int k = 8;
      if (i != k) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public boolean isInt()
  {
    int i = this.OooO0o0;
    int j = 1;
    if (i != j)
    {
      int k = 6;
      if (i != k) {
        j = 0;
      }
    }
    return j;
  }
  
  public boolean isIntOrUInt()
  {
    boolean bool = isInt();
    if (!bool)
    {
      bool = isUInt();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isKey()
  {
    int i = this.OooO0o0;
    int j = 4;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isMap()
  {
    int i = this.OooO0o0;
    int j = 9;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isNull()
  {
    int i = this.OooO0o0;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isNumeric()
  {
    boolean bool = isIntOrUInt();
    if (!bool)
    {
      bool = isFloat();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isString()
  {
    int i = this.OooO0o0;
    int j = 5;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isTypedVector()
  {
    return FlexBuffers.isTypedVector(this.OooO0o0);
  }
  
  public boolean isUInt()
  {
    int i = this.OooO0o0;
    int j = 2;
    if (i != j)
    {
      int k = 7;
      if (i != k) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public boolean isVector()
  {
    int i = this.OooO0o0;
    int j = 10;
    if (i != j)
    {
      int k = 9;
      if (i != k) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    return OooOO0O(localStringBuilder).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Reference
 * JD-Core Version:    0.7.0.1
 */