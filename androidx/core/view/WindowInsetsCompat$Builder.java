package androidx.core.view;

import android.os.Build.VERSION;
import androidx.core.graphics.Insets;

public final class WindowInsetsCompat$Builder
{
  public final WindowInsetsCompat.BuilderImpl OooO00o;
  
  public WindowInsetsCompat$Builder()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    Object localObject;
    if (i >= j)
    {
      localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl30;
      ((WindowInsetsCompat.BuilderImpl30)localObject).<init>();
    }
    for (;;)
    {
      this.OooO00o = ((WindowInsetsCompat.BuilderImpl)localObject);
      break;
      j = 29;
      if (i >= j)
      {
        localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl29;
        ((WindowInsetsCompat.BuilderImpl29)localObject).<init>();
      }
      else
      {
        localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl20;
        ((WindowInsetsCompat.BuilderImpl20)localObject).<init>();
      }
    }
  }
  
  public WindowInsetsCompat$Builder(WindowInsetsCompat paramWindowInsetsCompat)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    Object localObject;
    if (i >= j)
    {
      localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl30;
      ((WindowInsetsCompat.BuilderImpl30)localObject).<init>(paramWindowInsetsCompat);
    }
    for (;;)
    {
      this.OooO00o = ((WindowInsetsCompat.BuilderImpl)localObject);
      break;
      j = 29;
      if (i >= j)
      {
        localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl29;
        ((WindowInsetsCompat.BuilderImpl29)localObject).<init>(paramWindowInsetsCompat);
      }
      else
      {
        localObject = new androidx/core/view/WindowInsetsCompat$BuilderImpl20;
        ((WindowInsetsCompat.BuilderImpl20)localObject).<init>(paramWindowInsetsCompat);
      }
    }
  }
  
  public WindowInsetsCompat OooO00o()
  {
    return this.OooO00o.OooO0O0();
  }
  
  public Builder OooO0O0(int paramInt, Insets paramInsets)
  {
    this.OooO00o.setInsets(paramInt, paramInsets);
    return this;
  }
  
  public Builder OooO0OO(Insets paramInsets)
  {
    this.OooO00o.setStableInsets(paramInsets);
    return this;
  }
  
  public Builder OooO0Oo(Insets paramInsets)
  {
    this.OooO00o.setSystemWindowInsets(paramInsets);
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Builder
 * JD-Core Version:    0.7.0.1
 */