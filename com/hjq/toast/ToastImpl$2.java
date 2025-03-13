package com.hjq.toast;

class ToastImpl$2
  implements Runnable
{
  public ToastImpl$2(ToastImpl paramToastImpl) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 20	com/hjq/toast/ToastImpl:OooO00o	(Lcom/hjq/toast/ToastImpl;)Lcom/hjq/toast/WindowLifecycle;
    //   9: astore_1
    //   10: aload_1
    //   11: invokevirtual 26	com/hjq/toast/WindowLifecycle:getWindowManager	()Landroid/view/WindowManager;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnonnull +22 -> 38
    //   19: aload_0
    //   20: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   23: invokestatic 20	com/hjq/toast/ToastImpl:OooO00o	(Lcom/hjq/toast/ToastImpl;)Lcom/hjq/toast/WindowLifecycle;
    //   26: invokevirtual 29	com/hjq/toast/WindowLifecycle:OooO0O0	()V
    //   29: aload_0
    //   30: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   33: iconst_0
    //   34: invokevirtual 33	com/hjq/toast/ToastImpl:setShow	(Z)V
    //   37: return
    //   38: aload_0
    //   39: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   42: astore_2
    //   43: aload_2
    //   44: invokestatic 37	com/hjq/toast/ToastImpl:OooO0OO	(Lcom/hjq/toast/ToastImpl;)Lcom/hjq/toast/CustomToast;
    //   47: astore_2
    //   48: aload_2
    //   49: invokevirtual 43	com/hjq/toast/CustomToast:getView	()Landroid/view/View;
    //   52: astore_2
    //   53: aload_1
    //   54: aload_2
    //   55: invokeinterface 49 2 0
    //   60: goto +12 -> 72
    //   63: astore_1
    //   64: goto +27 -> 91
    //   67: astore_1
    //   68: aload_1
    //   69: invokevirtual 54	java/lang/Throwable:printStackTrace	()V
    //   72: aload_0
    //   73: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   76: invokestatic 20	com/hjq/toast/ToastImpl:OooO00o	(Lcom/hjq/toast/ToastImpl;)Lcom/hjq/toast/WindowLifecycle;
    //   79: invokevirtual 29	com/hjq/toast/WindowLifecycle:OooO0O0	()V
    //   82: aload_0
    //   83: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   86: iconst_0
    //   87: invokevirtual 33	com/hjq/toast/ToastImpl:setShow	(Z)V
    //   90: return
    //   91: aload_0
    //   92: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   95: invokestatic 20	com/hjq/toast/ToastImpl:OooO00o	(Lcom/hjq/toast/ToastImpl;)Lcom/hjq/toast/WindowLifecycle;
    //   98: invokevirtual 29	com/hjq/toast/WindowLifecycle:OooO0O0	()V
    //   101: aload_0
    //   102: getfield 10	com/hjq/toast/ToastImpl$2:o00OoOoo	Lcom/hjq/toast/ToastImpl;
    //   105: iconst_0
    //   106: invokevirtual 33	com/hjq/toast/ToastImpl:setShow	(Z)V
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	2
    //   4	50	1	localObject1	Object
    //   63	1	1	localObject2	Object
    //   67	43	1	localIllegalArgumentException	java.lang.IllegalArgumentException
    //   42	13	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	63	finally
    //   5	9	63	finally
    //   10	14	63	finally
    //   38	42	63	finally
    //   43	47	63	finally
    //   48	52	63	finally
    //   54	60	63	finally
    //   68	72	63	finally
    //   0	4	67	java/lang/IllegalArgumentException
    //   5	9	67	java/lang/IllegalArgumentException
    //   10	14	67	java/lang/IllegalArgumentException
    //   38	42	67	java/lang/IllegalArgumentException
    //   43	47	67	java/lang/IllegalArgumentException
    //   48	52	67	java/lang/IllegalArgumentException
    //   54	60	67	java/lang/IllegalArgumentException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.ToastImpl.2
 * JD-Core Version:    0.7.0.1
 */