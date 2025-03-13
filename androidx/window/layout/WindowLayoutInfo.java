package androidx.window.layout;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class WindowLayoutInfo
{
  public final List OooO00o;
  
  public WindowLayoutInfo(List paramList)
  {
    this.OooO00o = paramList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      Object localObject = WindowLayoutInfo.class;
      Class localClass = paramObject.getClass();
      boolean bool = Intrinsics.OooO00o(localObject, localClass);
      if (bool)
      {
        paramObject = (WindowLayoutInfo)paramObject;
        localObject = this.OooO00o;
        paramObject = paramObject.OooO00o;
        return Intrinsics.OooO00o(localObject, paramObject);
      }
    }
    return false;
  }
  
  public final List getDisplayFeatures()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
  
  public String toString()
  {
    return CollectionsKt.OoooOO0(this.OooO00o, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.WindowLayoutInfo
 * JD-Core Version:    0.7.0.1
 */