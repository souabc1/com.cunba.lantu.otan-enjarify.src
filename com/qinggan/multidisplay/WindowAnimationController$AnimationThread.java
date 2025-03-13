package com.qinggan.multidisplay;

import m54207b69;

class WindowAnimationController$AnimationThread
  extends Thread
{
  public final int o00OoOoo = 120;
  public int o00Ooo0;
  public final int o00Ooo00 = 20;
  public int o00Ooo0O;
  
  public WindowAnimationController$AnimationThread(WindowAnimationController paramWindowAnimationController, int paramInt1, int paramInt2)
  {
    this.o00Ooo0 = paramInt1;
    this.o00Ooo0O = paramInt2;
    paramWindowAnimationController = MultiDisplayManager.OooOOOO;
    boolean bool = paramWindowAnimationController.booleanValue();
    if (bool)
    {
      paramWindowAnimationController = new java/lang/StringBuilder;
      paramWindowAnimationController.<init>();
      String str = m54207b69.F54207b69_11("TS3E1D233D383F433947253F402C43351A79");
      paramWindowAnimationController.append(str);
      paramInt1 = this.o00Ooo0;
      paramWindowAnimationController.append(paramInt1);
      str = m54207b69.F54207b69_11("1v5A1C3B072316251F1F23431B1C1221113F5D");
      paramWindowAnimationController.append(str);
      paramInt1 = this.o00Ooo0O;
      paramWindowAnimationController.append(paramInt1);
    }
  }
  
  public boolean isLastValidPos(int paramInt)
  {
    Object localObject1 = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject1).booleanValue();
    Object localObject2;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("o{1209391D0C1433211F1B29362015691A241935546F");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramInt);
    }
    localObject1 = this.o00Ooo0o;
    int j = ((AnimationController)localObject1).OooO00o;
    int k = 1;
    int i;
    if (j == 0)
    {
      j = ((AnimationController)localObject1).OooOOO0;
      i = WindowAnimationController.OooOOOO((WindowAnimationController)localObject1);
      j = j + i - paramInt;
      i = 120;
      if (j < i) {
        return k;
      }
    }
    localObject1 = this.o00Ooo0o;
    j = ((AnimationController)localObject1).OooO00o;
    if (j == k)
    {
      i = WindowAnimationController.OooOOOO((WindowAnimationController)localObject1);
      localObject2 = this.o00Ooo0o;
      j = ((AnimationController)localObject2).OooOOO0;
      i = i - j - paramInt;
      paramInt = -120;
      if (i > paramInt) {
        return k;
      }
    }
    return false;
  }
  
  public void run()
  {
    super.run();
    Object localObject1 = WindowAnimationController.OooOOOo(this.o00Ooo0o);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    int m = 0;
    int n;
    WindowAnimationController localWindowAnimationController1;
    int i1;
    if (bool1)
    {
      localObject1 = this.o00Ooo0o;
      n = WindowAnimationController.OooOOOO((WindowAnimationController)localObject1);
      localWindowAnimationController1 = this.o00Ooo0o;
      i1 = WindowAnimationController.OooOOo(localWindowAnimationController1);
      ((AnimationController)localObject1).OooOO0(n, i1);
      localObject1 = this.o00Ooo0o;
      n = WindowAnimationController.OooOOOO((WindowAnimationController)localObject1);
      ((AnimationController)localObject1).OooO0oO(n, 0);
      localObject1 = this.o00Ooo0o;
      localObject4 = Boolean.FALSE;
      WindowAnimationController.OooOOo0((WindowAnimationController)localObject1, (Boolean)localObject4);
    }
    localObject1 = this.o00Ooo0o;
    int i = ((AnimationController)localObject1).OooO00o;
    Object localObject4 = m54207b69.F54207b69_11("mA28330F23363A1D2735312F1C3A3F6F444345368075473A4C794A484D977E");
    long l = 20;
    int i2 = 1;
    Object localObject2;
    int i4;
    int j;
    int i7;
    int i8;
    WindowAnimationController localWindowAnimationController2;
    if (i == 0)
    {
      for (;;)
      {
        localObject1 = this.o00Ooo0o;
        i = ((AnimationController)localObject1).OooOOO0 / 120;
        if (i2 > i) {
          break;
        }
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException1)
        {
          localInterruptedException1.printStackTrace();
        }
        localObject2 = this.o00Ooo0o;
        i = WindowAnimationController.OooOOOO((WindowAnimationController)localObject2);
        i4 = this.o00Ooo0;
        i += i4;
        i4 = i2 * 120;
        i += i4;
        j = isLastValidPos(i);
        if (j != 0)
        {
          localObject2 = MultiDisplayManager.OooOOOO;
          j = ((Boolean)localObject2).booleanValue();
          if (j != 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append((String)localObject4);
            localObject4 = this.o00Ooo0o;
            i1 = ((AnimationController)localObject4).OooOOO0;
            n = WindowAnimationController.OooOOOO((WindowAnimationController)localObject4);
            i1 += n;
            ((StringBuilder)localObject2).append(i1);
          }
          localObject2 = this.o00Ooo0o;
          n = ((AnimationController)localObject2).OooOOO0;
          i1 = WindowAnimationController.OooOOOO((WindowAnimationController)localObject2);
          n += i1;
          localWindowAnimationController1 = this.o00Ooo0o;
          i1 = WindowAnimationController.OooOOo(localWindowAnimationController1);
          ((AnimationController)localObject2).OooOO0(n, i1);
          localObject2 = this.o00Ooo0o;
          n = ((AnimationController)localObject2).OooOOO0;
          ((AnimationController)localObject2).OooO0oo(n, 0);
          break;
        }
        localObject2 = this.o00Ooo0o;
        i7 = WindowAnimationController.OooOOOO((WindowAnimationController)localObject2);
        i8 = this.o00Ooo0;
        i7 = i7 + i8 + i4;
        localWindowAnimationController2 = this.o00Ooo0o;
        i4 = WindowAnimationController.OooOOo(localWindowAnimationController2);
        ((AnimationController)localObject2).OooOO0(i7, i4);
        i2 += 1;
      }
      label379:
      localObject2 = this.o00Ooo0o;
      m = WindowAnimationController.OooOOOO((WindowAnimationController)localObject2);
      localObject4 = this.o00Ooo0o;
      n = WindowAnimationController.OooOOo((WindowAnimationController)localObject4);
      ((AnimationController)localObject2).OooO(m, n);
    }
    else if (j == i2)
    {
      for (;;)
      {
        localObject2 = this.o00Ooo0o;
        int k = ((AnimationController)localObject2).OooOOO0 / 120;
        if (i2 > k) {
          break label379;
        }
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException2)
        {
          localInterruptedException2.printStackTrace();
        }
        Object localObject3 = this.o00Ooo0o;
        k = WindowAnimationController.OooOOOO((WindowAnimationController)localObject3);
        i4 = this.o00Ooo0;
        k += i4;
        int i5 = i2 * 120;
        k -= i5;
        boolean bool2 = isLastValidPos(k);
        if (bool2)
        {
          localObject3 = MultiDisplayManager.OooOOOO;
          bool2 = ((Boolean)localObject3).booleanValue();
          if (bool2)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = this.o00Ooo0o;
            n = WindowAnimationController.OooOOOO((WindowAnimationController)localObject4);
            localWindowAnimationController1 = this.o00Ooo0o;
            i1 = localWindowAnimationController1.OooOOO0;
            n -= i1;
            ((StringBuilder)localObject3).append(n);
          }
          localObject3 = this.o00Ooo0o;
          n = WindowAnimationController.OooOOOO((WindowAnimationController)localObject3);
          localWindowAnimationController1 = this.o00Ooo0o;
          int i9 = localWindowAnimationController1.OooOOO0;
          n -= i9;
          i1 = WindowAnimationController.OooOOo(localWindowAnimationController1);
          ((AnimationController)localObject3).OooOO0(n, i1);
          localObject3 = this.o00Ooo0o;
          n = -((AnimationController)localObject3).OooOOO0;
          break;
        }
        localObject3 = this.o00Ooo0o;
        i7 = WindowAnimationController.OooOOOO((WindowAnimationController)localObject3);
        i8 = this.o00Ooo0;
        i7 = i7 + i8 - i5;
        localWindowAnimationController2 = this.o00Ooo0o;
        int i6 = WindowAnimationController.OooOOo(localWindowAnimationController2);
        ((AnimationController)localObject3).OooOO0(i7, i6);
        int i3;
        i2 += 1;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.WindowAnimationController.AnimationThread
 * JD-Core Version:    0.7.0.1
 */