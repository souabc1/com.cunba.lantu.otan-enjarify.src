package androidx.fragment.app;

import android.view.View;

class Fragment$5
  extends FragmentContainer
{
  public Fragment$5(Fragment paramFragment) {}
  
  public View OooO0OO(int paramInt)
  {
    Object localObject = this.o00OoOoo.mView;
    if (localObject != null) {
      return ((View)localObject).findViewById(paramInt);
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Fragment ");
    Fragment localFragment = this.o00OoOoo;
    ((StringBuilder)localObject).append(localFragment);
    ((StringBuilder)localObject).append(" does not have a view");
    localObject = ((StringBuilder)localObject).toString();
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  public boolean OooO0o0()
  {
    View localView = this.o00OoOoo.mView;
    boolean bool;
    if (localView != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localView = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.5
 * JD-Core Version:    0.7.0.1
 */