package com.qinggan.multidisplay;

import m54207b69;

class MultiDisplayManager$MoveActivityRunnable
  implements Runnable
{
  public String o00OoOoo;
  public boolean o00Ooo00;
  
  public MultiDisplayManager$MoveActivityRunnable(MultiDisplayManager paramMultiDisplayManager, String paramString, boolean paramBoolean)
  {
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramBoolean;
  }
  
  public void run()
  {
    Object localObject1 = this.o00Ooo0;
    Object localObject2 = this.o00OoOoo;
    localObject1 = MultiDisplayManager.OooO00o((MultiDisplayManager)localObject1, (String)localObject2);
    String str;
    boolean bool3;
    if (localObject1 != null)
    {
      localObject2 = MultiDisplayManager.OooOOOO;
      boolean bool1 = ((Boolean)localObject2).booleanValue();
      if (bool1)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = m54207b69.F54207b69_11("aq020612060935251F24190F232A2C5960");
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append(localObject1);
      }
      bool1 = false;
      localObject2 = null;
      boolean bool2 = this.o00Ooo00;
      int i = 1;
      float f = 5000.0F;
      bool3 = ((AnimationController)localObject1).OooOOO0(i, f, 0.0F, bool2);
    }
    else
    {
      bool3 = false;
      localObject1 = null;
    }
    if (!bool3)
    {
      localObject1 = this.o00Ooo0;
      localObject2 = MultiDisplayManager.OooO0O0((MultiDisplayManager)localObject1);
      str = this.o00OoOoo;
      ((MultiDisplayManager)localObject1).OooOOo0((String)localObject2, str);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.MultiDisplayManager.MoveActivityRunnable
 * JD-Core Version:    0.7.0.1
 */