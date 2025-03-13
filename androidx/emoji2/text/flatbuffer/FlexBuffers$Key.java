package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$Key
  extends FlexBuffers.Object
{
  public static final Key OooO0Oo;
  
  static
  {
    Key localKey = new androidx/emoji2/text/flatbuffer/FlexBuffers$Key;
    ReadBuf localReadBuf = FlexBuffers.OooO00o();
    localKey.<init>(localReadBuf, 0, 0);
    OooO0Oo = localKey;
  }
  
  public FlexBuffers$Key(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
  }
  
  public static Key OooO0OO()
  {
    return OooO0Oo;
  }
  
  public StringBuilder OooO00o(StringBuilder paramStringBuilder)
  {
    String str = toString();
    paramStringBuilder.append(str);
    return paramStringBuilder;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Key;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Key)paramObject;
    int i = paramObject.OooO0O0;
    int j = this.OooO0O0;
    if (i == j)
    {
      int k = paramObject.OooO0OO;
      i = this.OooO0OO;
      if (k == i) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    int i = this.OooO0O0;
    int j = this.OooO0OO;
    return i ^ j;
  }
  
  public String toString()
  {
    int i = this.OooO0O0;
    for (;;)
    {
      ReadBuf localReadBuf = this.OooO00o;
      int j = localReadBuf.get(i);
      if (j == 0)
      {
        j = this.OooO0O0;
        i -= j;
        return this.OooO00o.OooO00o(j, i);
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Key
 * JD-Core Version:    0.7.0.1
 */