package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map.Entry;

abstract class SafeIterableMap$ListIterator
  extends SafeIterableMap.SupportRemove
  implements Iterator
{
  public SafeIterableMap.Entry o00OoOoo;
  public SafeIterableMap.Entry o00Ooo00;
  
  public SafeIterableMap$ListIterator(SafeIterableMap.Entry paramEntry1, SafeIterableMap.Entry paramEntry2)
  {
    this.o00OoOoo = paramEntry2;
    this.o00Ooo00 = paramEntry1;
  }
  
  public void OooO00o(SafeIterableMap.Entry paramEntry)
  {
    SafeIterableMap.Entry localEntry = this.o00OoOoo;
    if (localEntry == paramEntry)
    {
      localEntry = this.o00Ooo00;
      if (paramEntry == localEntry)
      {
        localEntry = null;
        this.o00Ooo00 = null;
        this.o00OoOoo = null;
      }
    }
    localEntry = this.o00OoOoo;
    if (localEntry == paramEntry)
    {
      localEntry = OooO0O0(localEntry);
      this.o00OoOoo = localEntry;
    }
    localEntry = this.o00Ooo00;
    if (localEntry == paramEntry)
    {
      paramEntry = OooO0o0();
      this.o00Ooo00 = paramEntry;
    }
  }
  
  public abstract SafeIterableMap.Entry OooO0O0(SafeIterableMap.Entry paramEntry);
  
  public abstract SafeIterableMap.Entry OooO0OO(SafeIterableMap.Entry paramEntry);
  
  public Map.Entry OooO0Oo()
  {
    SafeIterableMap.Entry localEntry1 = this.o00Ooo00;
    SafeIterableMap.Entry localEntry2 = OooO0o0();
    this.o00Ooo00 = localEntry2;
    return localEntry1;
  }
  
  public final SafeIterableMap.Entry OooO0o0()
  {
    SafeIterableMap.Entry localEntry1 = this.o00Ooo00;
    SafeIterableMap.Entry localEntry2 = this.o00OoOoo;
    if ((localEntry1 != localEntry2) && (localEntry2 != null)) {
      return OooO0OO(localEntry1);
    }
    return null;
  }
  
  public boolean hasNext()
  {
    SafeIterableMap.Entry localEntry = this.o00Ooo00;
    boolean bool;
    if (localEntry != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localEntry = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.ListIterator
 * JD-Core Version:    0.7.0.1
 */