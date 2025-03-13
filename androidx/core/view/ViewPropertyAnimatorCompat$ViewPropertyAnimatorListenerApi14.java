package androidx.core.view;

import android.view.View;

class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14
  implements ViewPropertyAnimatorListener
{
  public ViewPropertyAnimatorCompat OooO00o;
  public boolean OooO0O0;
  
  public void OooO00o(View paramView)
  {
    int i = 2113929216;
    Object localObject = paramView.getTag(i);
    boolean bool = localObject instanceof ViewPropertyAnimatorListener;
    if (bool)
    {
      localObject = (ViewPropertyAnimatorListener)localObject;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    if (localObject != null) {
      ((ViewPropertyAnimatorListener)localObject).OooO00o(paramView);
    }
  }
  
  public void OooO0O0(View paramView)
  {
    Object localObject1 = this.OooO00o;
    int i = ((ViewPropertyAnimatorCompat)localObject1).OooO0Oo;
    Object localObject2 = null;
    int j = -1;
    if (i > j)
    {
      paramView.setLayerType(i, null);
      localObject1 = this.OooO00o;
      ((ViewPropertyAnimatorCompat)localObject1).OooO0Oo = j;
    }
    localObject1 = this.OooO00o;
    Runnable localRunnable = ((ViewPropertyAnimatorCompat)localObject1).OooO0OO;
    if (localRunnable != null)
    {
      ((ViewPropertyAnimatorCompat)localObject1).OooO0OO = null;
      localRunnable.run();
    }
    i = 2113929216;
    localObject1 = paramView.getTag(i);
    boolean bool = localObject1 instanceof ViewPropertyAnimatorListener;
    if (bool)
    {
      localObject2 = localObject1;
      localObject2 = (ViewPropertyAnimatorListener)localObject1;
    }
    if (localObject2 != null) {
      ((ViewPropertyAnimatorListener)localObject2).OooO0O0(paramView);
    }
    this.OooO0O0 = true;
  }
  
  public void OooO0OO(View paramView)
  {
    this.OooO0O0 = false;
    Object localObject1 = this.OooO00o;
    int i = ((ViewPropertyAnimatorCompat)localObject1).OooO0Oo;
    int j = -1;
    Object localObject2 = null;
    if (i > j)
    {
      i = 2;
      paramView.setLayerType(i, null);
    }
    localObject1 = this.OooO00o;
    Runnable localRunnable = ((ViewPropertyAnimatorCompat)localObject1).OooO0O0;
    if (localRunnable != null)
    {
      ((ViewPropertyAnimatorCompat)localObject1).OooO0O0 = null;
      localRunnable.run();
    }
    i = 2113929216;
    localObject1 = paramView.getTag(i);
    boolean bool = localObject1 instanceof ViewPropertyAnimatorListener;
    if (bool)
    {
      localObject2 = localObject1;
      localObject2 = (ViewPropertyAnimatorListener)localObject1;
    }
    if (localObject2 != null) {
      ((ViewPropertyAnimatorListener)localObject2).OooO0OO(paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14
 * JD-Core Version:    0.7.0.1
 */