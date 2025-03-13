package com.qinggan.multidisplay;

import android.os.Handler;
import android.os.Message;
import m54207b69;

class AnimationController$2
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = paramMessage.what;
    int m = 1;
    int n;
    int i1;
    Object localObject1;
    int i2;
    if (i != 0)
    {
      n = 2;
      float f1 = 2.802597E-045F;
      if (i != m) {
        if (i != n)
        {
          i1 = 3;
          if (i != i1)
          {
            i1 = 4;
            if (i != i1)
            {
              i1 = 5;
              if (i != i1) {
                return;
              }
              localObject1 = this.OooO00o;
              i = ((AnimationController)localObject1).OooO0oO;
              if (i != n) {}
            }
          }
        }
      }
      do
      {
        int j;
        do
        {
          paramMessage = MultiDisplayManager.OooOOOO;
          paramMessage.booleanValue();
          break;
          if (i != m)
          {
            paramMessage = MultiDisplayManager.OooOOOO;
            boolean bool3 = paramMessage.booleanValue();
            if (!bool3) {
              break;
            }
            paramMessage = new java/lang/StringBuilder;
            paramMessage.<init>();
            localObject1 = m54207b69.F54207b69_11("CX353830407C30323E308148354342863A3C4A3E5076");
            paramMessage.append((String)localObject1);
            localObject1 = this.OooO00o;
            i = ((AnimationController)localObject1).OooO0oO;
            paramMessage.append(i);
            break;
          }
          localObject1 = MultiDisplayManager.OooOOOO;
          boolean bool1 = ((Boolean)localObject1).booleanValue();
          if (bool1)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            str = m54207b69.F54207b69_11("6y16183619132130141E124D");
            ((StringBuilder)localObject1).append(str);
            m = paramMessage.arg1;
            ((StringBuilder)localObject1).append(m);
          }
          localObject1 = this.OooO00o;
          m = paramMessage.arg1;
          i2 = paramMessage.arg2;
          ((AnimationController)localObject1).OooO0Oo(m, i2);
          paramMessage = this.OooO00o;
          paramMessage.OooO0oO = n;
          break;
          localObject1 = this.OooO00o;
          j = ((AnimationController)localObject1).OooO0oO;
        } while (j == m);
        Object localObject2;
        if (j != 0)
        {
          localObject1 = MultiDisplayManager.OooOOOO;
          bool2 = ((Boolean)localObject1).booleanValue();
          if (bool2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = m54207b69.F54207b69_11("(&4B4A52460A5A584E5C5B104B60565915656359655731");
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = this.OooO00o;
            n = ((AnimationController)localObject2).OooO0oO;
            ((StringBuilder)localObject1).append(n);
          }
        }
        localObject1 = MultiDisplayManager.OooOOOO;
        boolean bool2 = ((Boolean)localObject1).booleanValue();
        if (bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = m54207b69.F54207b69_11("8m020422051F0D442014282362");
          ((StringBuilder)localObject1).append((String)localObject2);
          n = paramMessage.arg1;
          ((StringBuilder)localObject1).append(n);
        }
        this.OooO00o.OooO0Oo.removeMessages(m);
        localObject1 = this.OooO00o;
        n = paramMessage.arg1;
        i2 = paramMessage.arg2;
        ((AnimationController)localObject1).OooO0OO(n, i2);
        paramMessage = this.OooO00o;
        paramMessage.OooO0oO = m;
        break;
        paramMessage = this.OooO00o;
        paramMessage.OooOOO();
        break;
        paramMessage = (AnimationController.StartAnimArgs)paramMessage.obj;
        localObject1 = this.OooO00o;
        m = paramMessage.OooO00o;
        f1 = paramMessage.OooO0O0;
        float f2 = paramMessage.OooO0OO;
        ((AnimationController)localObject1).OooOO0o(m, f1, f2);
        break;
        localObject1 = this.OooO00o;
        m = ((AnimationController)localObject1).OooO0oO;
      } while (m != n);
      String str = null;
      ((AnimationController)localObject1).OooO0oO = 0;
      ((AnimationController)localObject1).OooO0Oo.removeMessages(0);
      localObject1 = this.OooO00o;
      m = paramMessage.arg1;
      i2 = paramMessage.arg2;
      ((AnimationController)localObject1).OooO0o(m, i2);
    }
    else
    {
      localObject1 = this.OooO00o;
      int k = ((AnimationController)localObject1).OooO0oO;
      if (k != m)
      {
        MultiDisplayManager.OooOOOO.booleanValue();
        localObject1 = this.OooO00o;
        n = paramMessage.arg1;
        i1 = paramMessage.arg2;
        ((AnimationController)localObject1).OooO0OO(n, i1);
        localObject1 = this.OooO00o;
        ((AnimationController)localObject1).OooO0oO = m;
      }
      localObject1 = this.OooO00o;
      m = paramMessage.arg1;
      n = paramMessage.arg2;
      ((AnimationController)localObject1).OooO0o0(m, n);
      localObject1 = this.OooO00o;
      m = paramMessage.arg1;
      i2 = paramMessage.arg2;
      ((AnimationController)localObject1).setPosition(m, i2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.AnimationController.2
 * JD-Core Version:    0.7.0.1
 */