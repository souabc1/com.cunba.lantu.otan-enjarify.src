package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class AnimationHandler
{
  public static final ThreadLocal OooO0oO;
  public final SimpleArrayMap OooO00o;
  public final ArrayList OooO0O0;
  public final AnimationHandler.AnimationCallbackDispatcher OooO0OO;
  public AnimationHandler.AnimationFrameCallbackProvider OooO0Oo;
  public boolean OooO0o;
  public long OooO0o0;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO0oO = localThreadLocal;
  }
  
  public AnimationHandler()
  {
    Object localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    this.OooO00o = ((SimpleArrayMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0O0 = ((ArrayList)localObject);
    localObject = new androidx/dynamicanimation/animation/AnimationHandler$AnimationCallbackDispatcher;
    ((AnimationHandler.AnimationCallbackDispatcher)localObject).<init>(this);
    this.OooO0OO = ((AnimationHandler.AnimationCallbackDispatcher)localObject);
    this.OooO0o0 = 0L;
    this.OooO0o = false;
  }
  
  public static long getFrameTime()
  {
    ThreadLocal localThreadLocal = OooO0oO;
    Object localObject = localThreadLocal.get();
    if (localObject == null) {
      return 0L;
    }
    return ((AnimationHandler)localThreadLocal.get()).OooO0o0;
  }
  
  public static AnimationHandler getInstance()
  {
    ThreadLocal localThreadLocal = OooO0oO;
    Object localObject = localThreadLocal.get();
    if (localObject == null)
    {
      localObject = new androidx/dynamicanimation/animation/AnimationHandler;
      ((AnimationHandler)localObject).<init>();
      localThreadLocal.set(localObject);
    }
    return (AnimationHandler)localThreadLocal.get();
  }
  
  public void OooO00o(AnimationHandler.AnimationFrameCallback paramAnimationFrameCallback, long paramLong)
  {
    Object localObject = this.OooO0O0;
    int i = ((ArrayList)localObject).size();
    if (i == 0)
    {
      localObject = getProvider();
      ((AnimationHandler.AnimationFrameCallbackProvider)localObject).OooO00o();
    }
    localObject = this.OooO0O0;
    boolean bool = ((ArrayList)localObject).contains(paramAnimationFrameCallback);
    if (!bool)
    {
      localObject = this.OooO0O0;
      ((ArrayList)localObject).add(paramAnimationFrameCallback);
    }
    long l1 = 0L;
    bool = paramLong < l1;
    if (bool)
    {
      localObject = this.OooO00o;
      long l2 = SystemClock.uptimeMillis() + paramLong;
      Long localLong = Long.valueOf(l2);
      ((SimpleArrayMap)localObject).put(paramAnimationFrameCallback, localLong);
    }
  }
  
  public final void OooO0O0()
  {
    boolean bool = this.OooO0o;
    if (bool)
    {
      ArrayList localArrayList = this.OooO0O0;
      int i = localArrayList.size() + -1;
      while (i >= 0)
      {
        Object localObject = this.OooO0O0.get(i);
        if (localObject == null)
        {
          localObject = this.OooO0O0;
          ((ArrayList)localObject).remove(i);
        }
        i += -1;
      }
      i = 0;
      localArrayList = null;
      this.OooO0o = false;
    }
  }
  
  public void OooO0OO(long paramLong)
  {
    long l = SystemClock.uptimeMillis();
    int i = 0;
    for (;;)
    {
      Object localObject = this.OooO0O0;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (AnimationHandler.AnimationFrameCallback)this.OooO0O0.get(i);
      if (localObject != null)
      {
        boolean bool = OooO0Oo((AnimationHandler.AnimationFrameCallback)localObject, l);
        if (bool) {
          ((AnimationHandler.AnimationFrameCallback)localObject).OooO00o(paramLong);
        }
      }
      i += 1;
    }
    OooO0O0();
  }
  
  public final boolean OooO0Oo(AnimationHandler.AnimationFrameCallback paramAnimationFrameCallback, long paramLong)
  {
    Long localLong = (Long)this.OooO00o.get(paramAnimationFrameCallback);
    boolean bool1 = true;
    if (localLong == null) {
      return bool1;
    }
    long l = localLong.longValue();
    boolean bool2 = l < paramLong;
    if (bool2)
    {
      this.OooO00o.remove(paramAnimationFrameCallback);
      return bool1;
    }
    return false;
  }
  
  public void OooO0o0(AnimationHandler.AnimationFrameCallback paramAnimationFrameCallback)
  {
    this.OooO00o.remove(paramAnimationFrameCallback);
    ArrayList localArrayList = this.OooO0O0;
    int i = localArrayList.indexOf(paramAnimationFrameCallback);
    if (i >= 0)
    {
      localArrayList = this.OooO0O0;
      localArrayList.set(i, null);
      i = 1;
      this.OooO0o = i;
    }
  }
  
  public AnimationHandler.AnimationFrameCallbackProvider getProvider()
  {
    Object localObject = this.OooO0Oo;
    if (localObject == null)
    {
      localObject = new androidx/dynamicanimation/animation/AnimationHandler$FrameCallbackProvider16;
      AnimationHandler.AnimationCallbackDispatcher localAnimationCallbackDispatcher = this.OooO0OO;
      ((AnimationHandler.FrameCallbackProvider16)localObject).<init>(localAnimationCallbackDispatcher);
      this.OooO0Oo = ((AnimationHandler.AnimationFrameCallbackProvider)localObject);
    }
    return this.OooO0Oo;
  }
  
  public void setProvider(AnimationHandler.AnimationFrameCallbackProvider paramAnimationFrameCallbackProvider)
  {
    this.OooO0Oo = paramAnimationFrameCallbackProvider;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler
 * JD-Core Version:    0.7.0.1
 */