package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$KeyVector
{
  public final FlexBuffers.TypedVector OooO00o;
  
  public FlexBuffers$KeyVector(FlexBuffers.TypedVector paramTypedVector)
  {
    this.OooO00o = paramTypedVector;
  }
  
  public int OooO00o()
  {
    return this.OooO00o.OooO0O0();
  }
  
  public FlexBuffers.Key get(int paramInt)
  {
    int i = OooO00o();
    if (paramInt >= i) {
      return FlexBuffers.Key.OooO0O0();
    }
    FlexBuffers.TypedVector localTypedVector = this.OooO00o;
    int j = localTypedVector.OooO0O0;
    i = localTypedVector.OooO0OO;
    paramInt *= i;
    j += paramInt;
    FlexBuffers.Key localKey = new androidx/emoji2/text/flatbuffer/FlexBuffers$Key;
    localTypedVector = this.OooO00o;
    ReadBuf localReadBuf = localTypedVector.OooO00o;
    i = localTypedVector.OooO0OO;
    i = FlexBuffers.OooO0OO(localReadBuf, j, i);
    localKey.<init>(localReadBuf, i, 1);
    return localKey;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('[');
    int i = 0;
    for (;;)
    {
      Object localObject = this.OooO00o;
      int j = ((FlexBuffers.Vector)localObject).OooO0O0();
      if (i >= j) {
        break;
      }
      this.OooO00o.get(i).OooOO0O(localStringBuilder);
      localObject = this.OooO00o;
      j = ((FlexBuffers.Vector)localObject).OooO0O0() + -1;
      if (i != j)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector
 * JD-Core Version:    0.7.0.1
 */