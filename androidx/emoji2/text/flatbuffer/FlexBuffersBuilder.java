package androidx.emoji2.text.flatbuffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class FlexBuffersBuilder
{
  public final ReadWriteBuf OooO00o;
  public final ArrayList OooO0O0;
  public final HashMap OooO0OO;
  public final HashMap OooO0Oo;
  public boolean OooO0o;
  public final int OooO0o0;
  public Comparator OooO0oO;
  
  public FlexBuffersBuilder()
  {
    this(256);
  }
  
  public FlexBuffersBuilder(int paramInt)
  {
    this(localArrayReadWriteBuf, 1);
  }
  
  public FlexBuffersBuilder(ReadWriteBuf paramReadWriteBuf, int paramInt)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0O0 = ((ArrayList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0OO = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0Oo = ((HashMap)localObject);
    this.OooO0o = false;
    localObject = new androidx/emoji2/text/flatbuffer/FlexBuffersBuilder$1;
    ((FlexBuffersBuilder.1)localObject).<init>(this);
    this.OooO0oO = ((Comparator)localObject);
    this.OooO00o = paramReadWriteBuf;
    this.OooO0o0 = paramInt;
  }
  
  public ReadWriteBuf getBuffer()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffersBuilder
 * JD-Core Version:    0.7.0.1
 */