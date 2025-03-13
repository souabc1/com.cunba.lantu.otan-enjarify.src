package com.sun.jna;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class Memory$LinkedReference
  extends WeakReference
{
  public LinkedReference OooO00o;
  public LinkedReference OooO0O0;
  
  public Memory$LinkedReference(Memory paramMemory)
  {
    super(paramMemory, localReferenceQueue);
  }
  
  public static LinkedReference OooO0O0(Memory arg0)
  {
    synchronized ()
    {
      Object localObject3;
      for (;;)
      {
        localObject3 = Memory.Ooooo0o();
        localObject3 = ((ReferenceQueue)localObject3).poll();
        localObject3 = (LinkedReference)localObject3;
        if (localObject3 == null) {
          break;
        }
        ((LinkedReference)localObject3).OooO0OO();
      }
      ??? = new com/sun/jna/Memory$LinkedReference;
      ((LinkedReference)???).<init>(???);
      synchronized (LinkedReference.class)
      {
        localObject3 = Memory.OooooO0();
        if (localObject3 != null)
        {
          localObject3 = Memory.OooooO0();
          ((LinkedReference)???).OooO00o = ((LinkedReference)localObject3);
          localObject3 = Memory.OooooO0();
          ((LinkedReference)localObject3).OooO0O0 = ((LinkedReference)???);
        }
        Memory.OooooOO((LinkedReference)???);
        return ???;
      }
    }
  }
  
  public final void OooO0OO()
  {
    synchronized (LinkedReference.class)
    {
      LinkedReference localLinkedReference2 = Memory.OooooO0();
      LinkedReference localLinkedReference3;
      if (localLinkedReference2 != this)
      {
        localLinkedReference2 = this.OooO0O0;
        if (localLinkedReference2 == null) {
          return;
        }
        localLinkedReference3 = this.OooO00o;
        localLinkedReference2.OooO00o = localLinkedReference3;
      }
      else
      {
        localLinkedReference2 = Memory.OooooO0();
        localLinkedReference2 = localLinkedReference2.OooO00o;
        localLinkedReference3 = Memory.OooooOO(localLinkedReference2);
      }
      if (localLinkedReference3 != null)
      {
        localLinkedReference2 = this.OooO0O0;
        localLinkedReference3.OooO0O0 = localLinkedReference2;
      }
      localLinkedReference2 = null;
      this.OooO0O0 = null;
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Memory.LinkedReference
 * JD-Core Version:    0.7.0.1
 */