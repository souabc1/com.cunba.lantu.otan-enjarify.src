package androidx.core.os;

public final class CancellationSignal
{
  public boolean OooO00o;
  public CancellationSignal.OnCancelListener OooO0O0;
  public Object OooO0OO;
  public boolean OooO0Oo;
  
  /* Error */
  public void OooO00o()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	androidx/core/os/CancellationSignal:OooO00o	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 17	androidx/core/os/CancellationSignal:OooO00o	Z
    //   21: aload_0
    //   22: iload_1
    //   23: putfield 20	androidx/core/os/CancellationSignal:OooO0Oo	Z
    //   26: aload_0
    //   27: getfield 22	androidx/core/os/CancellationSignal:OooO0O0	Landroidx/core/os/CancellationSignal$OnCancelListener;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield 24	androidx/core/os/CancellationSignal:OooO0OO	Ljava/lang/Object;
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: ifnull +16 -> 55
    //   42: aload_2
    //   43: invokeinterface 29 1 0
    //   48: goto +7 -> 55
    //   51: astore_2
    //   52: goto +14 -> 66
    //   55: aload_3
    //   56: ifnull +30 -> 86
    //   59: aload_3
    //   60: invokestatic 34	androidx/core/os/CancellationSignal$Api16Impl:OooO00o	(Ljava/lang/Object;)V
    //   63: goto +23 -> 86
    //   66: aload_0
    //   67: monitorenter
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 20	androidx/core/os/CancellationSignal:OooO0Oo	Z
    //   73: aload_0
    //   74: invokevirtual 37	java/lang/Object:notifyAll	()V
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    //   81: astore_2
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_2
    //   85: athrow
    //   86: aload_0
    //   87: monitorenter
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield 20	androidx/core/os/CancellationSignal:OooO0Oo	Z
    //   93: aload_0
    //   94: invokevirtual 37	java/lang/Object:notifyAll	()V
    //   97: aload_0
    //   98: monitorexit
    //   99: return
    //   100: astore_2
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_2
    //   104: athrow
    //   105: astore_2
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	CancellationSignal
    //   6	17	1	bool	boolean
    //   30	13	2	localOnCancelListener	CancellationSignal.OnCancelListener
    //   51	29	2	localObject1	Object
    //   81	4	2	localObject2	Object
    //   100	4	2	localObject3	Object
    //   105	4	2	localObject4	Object
    //   35	25	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   42	48	51	finally
    //   59	63	51	finally
    //   69	73	81	finally
    //   73	77	81	finally
    //   77	79	81	finally
    //   82	84	81	finally
    //   89	93	100	finally
    //   93	97	100	finally
    //   97	99	100	finally
    //   101	103	100	finally
    //   2	6	105	finally
    //   11	13	105	finally
    //   17	21	105	finally
    //   22	26	105	finally
    //   26	30	105	finally
    //   31	35	105	finally
    //   36	38	105	finally
    //   106	108	105	finally
  }
  
  public final void OooO0O0()
  {
    for (;;)
    {
      boolean bool = this.OooO0Oo;
      if (bool) {}
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException) {}
      return;
    }
  }
  
  public Object getCancellationSignalObject()
  {
    try
    {
      Object localObject1 = this.OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = CancellationSignal.Api16Impl.OooO0O0();
        this.OooO0OO = localObject1;
        boolean bool = this.OooO00o;
        if (bool) {
          CancellationSignal.Api16Impl.OooO00o(localObject1);
        }
      }
      localObject1 = this.OooO0OO;
      return localObject1;
    }
    finally {}
  }
  
  public boolean isCanceled()
  {
    try
    {
      boolean bool = this.OooO00o;
      return bool;
    }
    finally {}
  }
  
  public void setOnCancelListener(CancellationSignal.OnCancelListener paramOnCancelListener)
  {
    try
    {
      OooO0O0();
      CancellationSignal.OnCancelListener localOnCancelListener = this.OooO0O0;
      if (localOnCancelListener == paramOnCancelListener) {
        return;
      }
      this.OooO0O0 = paramOnCancelListener;
      boolean bool = this.OooO00o;
      if ((bool) && (paramOnCancelListener != null))
      {
        paramOnCancelListener.onCancel();
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.CancellationSignal
 * JD-Core Version:    0.7.0.1
 */