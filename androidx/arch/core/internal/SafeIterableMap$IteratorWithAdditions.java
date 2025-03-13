package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map.Entry;

public class SafeIterableMap$IteratorWithAdditions
  extends SafeIterableMap.SupportRemove
  implements Iterator
{
  public SafeIterableMap.Entry o00OoOoo;
  public boolean o00Ooo00 = true;
  
  public SafeIterableMap$IteratorWithAdditions(SafeIterableMap paramSafeIterableMap) {}
  
  public void OooO00o(SafeIterableMap.Entry paramEntry)
  {
    SafeIterableMap.Entry localEntry = this.o00OoOoo;
    if (paramEntry == localEntry)
    {
      paramEntry = localEntry.o00Ooo0O;
      this.o00OoOoo = paramEntry;
      boolean bool;
      if (paramEntry == null)
      {
        bool = true;
      }
      else
      {
        bool = false;
        paramEntry = null;
      }
      this.o00Ooo00 = bool;
    }
  }
  
  public Map.Entry OooO0O0()
  {
    boolean bool = this.o00Ooo00;
    SafeIterableMap.Entry localEntry;
    if (bool)
    {
      bool = false;
      this.o00Ooo00 = false;
      localEntry = this.o00Ooo0.o00OoOoo;
    }
    for (;;)
    {
      this.o00OoOoo = localEntry;
      break;
      localEntry = this.o00OoOoo;
      if (localEntry != null)
      {
        localEntry = localEntry.o00Ooo0;
      }
      else
      {
        bool = false;
        localEntry = null;
      }
    }
    return this.o00OoOoo;
  }
  
  public boolean hasNext()
  {
    boolean bool1 = this.o00Ooo00;
    boolean bool2 = true;
    if (bool1)
    {
      localEntry = this.o00Ooo0.o00OoOoo;
      if (localEntry == null) {
        bool2 = false;
      }
      return bool2;
    }
    SafeIterableMap.Entry localEntry = this.o00OoOoo;
    if (localEntry != null)
    {
      localEntry = localEntry.o00Ooo0;
      if (localEntry != null) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions
 * JD-Core Version:    0.7.0.1
 */