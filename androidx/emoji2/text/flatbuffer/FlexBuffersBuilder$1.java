package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

class FlexBuffersBuilder$1
  implements Comparator
{
  public FlexBuffersBuilder$1(FlexBuffersBuilder paramFlexBuffersBuilder) {}
  
  public int OooO00o(FlexBuffersBuilder.Value paramValue1, FlexBuffersBuilder.Value paramValue2)
  {
    int i = paramValue1.OooO00o;
    int j = paramValue2.OooO00o;
    int k;
    int m;
    do
    {
      ReadWriteBuf localReadWriteBuf1 = FlexBuffersBuilder.OooO00o(this.o00OoOoo);
      k = localReadWriteBuf1.get(i);
      ReadWriteBuf localReadWriteBuf2 = FlexBuffersBuilder.OooO00o(this.o00OoOoo);
      m = localReadWriteBuf2.get(j);
      if (k == 0) {
        return k - m;
      }
      i += 1;
      j += 1;
    } while (k == m);
    return k - m;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
 * JD-Core Version:    0.7.0.1
 */