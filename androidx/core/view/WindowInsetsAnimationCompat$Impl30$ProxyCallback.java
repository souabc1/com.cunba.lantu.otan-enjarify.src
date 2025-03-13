package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class WindowInsetsAnimationCompat$Impl30$ProxyCallback
  extends WindowInsetsAnimation.Callback
{
  public final WindowInsetsAnimationCompat.Callback OooO00o;
  public List OooO0O0;
  public ArrayList OooO0OO;
  public final HashMap OooO0Oo;
  
  public WindowInsetsAnimationCompat$Impl30$ProxyCallback(WindowInsetsAnimationCompat.Callback paramCallback)
  {
    super(i);
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0Oo = localHashMap;
    this.OooO00o = paramCallback;
  }
  
  public final WindowInsetsAnimationCompat OooO00o(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = (WindowInsetsAnimationCompat)this.OooO0Oo.get(paramWindowInsetsAnimation);
    if (localWindowInsetsAnimationCompat == null)
    {
      localWindowInsetsAnimationCompat = WindowInsetsAnimationCompat.OooO0O0(paramWindowInsetsAnimation);
      HashMap localHashMap = this.OooO0Oo;
      localHashMap.put(paramWindowInsetsAnimation, localWindowInsetsAnimationCompat);
    }
    return localWindowInsetsAnimationCompat;
  }
  
  public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    WindowInsetsAnimationCompat.Callback localCallback = this.OooO00o;
    WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = OooO00o(paramWindowInsetsAnimation);
    localCallback.onEnd(localWindowInsetsAnimationCompat);
    this.OooO0Oo.remove(paramWindowInsetsAnimation);
  }
  
  public void onPrepare(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    WindowInsetsAnimationCompat.Callback localCallback = this.OooO00o;
    paramWindowInsetsAnimation = OooO00o(paramWindowInsetsAnimation);
    localCallback.onPrepare(paramWindowInsetsAnimation);
  }
  
  public WindowInsets onProgress(WindowInsets paramWindowInsets, List paramList)
  {
    Object localObject1 = this.OooO0OO;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      int i = paramList.size();
      ((ArrayList)localObject1).<init>(i);
      this.OooO0OO = ((ArrayList)localObject1);
      localObject1 = Collections.unmodifiableList((List)localObject1);
      this.OooO0O0 = ((List)localObject1);
    }
    else
    {
      ((ArrayList)localObject1).clear();
    }
    int j = paramList.size() + -1;
    while (j >= 0)
    {
      Object localObject2 = o00000O0.OooO00o(paramList.get(j));
      WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = OooO00o((WindowInsetsAnimation)localObject2);
      float f = o0OO00O.OooO00o((WindowInsetsAnimation)localObject2);
      localWindowInsetsAnimationCompat.setFraction(f);
      localObject2 = this.OooO0OO;
      ((ArrayList)localObject2).add(localWindowInsetsAnimationCompat);
      j += -1;
    }
    paramList = this.OooO00o;
    paramWindowInsets = WindowInsetsCompat.OooOO0(paramWindowInsets);
    localObject1 = this.OooO0O0;
    return paramList.onProgress(paramWindowInsets, (List)localObject1).OooO();
  }
  
  public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation paramWindowInsetsAnimation, WindowInsetsAnimation.Bounds paramBounds)
  {
    WindowInsetsAnimationCompat.Callback localCallback = this.OooO00o;
    paramWindowInsetsAnimation = OooO00o(paramWindowInsetsAnimation);
    paramBounds = WindowInsetsAnimationCompat.BoundsCompat.OooO0O0(paramBounds);
    return localCallback.onStart(paramWindowInsetsAnimation, paramBounds).OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl30.ProxyCallback
 * JD-Core Version:    0.7.0.1
 */