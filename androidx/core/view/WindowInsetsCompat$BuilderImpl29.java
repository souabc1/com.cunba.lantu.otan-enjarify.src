package androidx.core.view;

import android.view.WindowInsets.Builder;
import androidx.core.graphics.Insets;

class WindowInsetsCompat$BuilderImpl29
  extends WindowInsetsCompat.BuilderImpl
{
  public final WindowInsets.Builder OooO0OO;
  
  public WindowInsetsCompat$BuilderImpl29()
  {
    WindowInsets.Builder localBuilder = o000O00.OooO00o();
    this.OooO0OO = localBuilder;
  }
  
  public WindowInsetsCompat$BuilderImpl29(WindowInsetsCompat paramWindowInsetsCompat)
  {
    super(paramWindowInsetsCompat);
    paramWindowInsetsCompat = paramWindowInsetsCompat.OooO();
    if (paramWindowInsetsCompat != null) {
      paramWindowInsetsCompat = o000O00O.OooO00o(paramWindowInsetsCompat);
    } else {
      paramWindowInsetsCompat = o000O00.OooO00o();
    }
    this.OooO0OO = paramWindowInsetsCompat;
  }
  
  public WindowInsetsCompat OooO0O0()
  {
    OooO00o();
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.OooOO0(o000Oo0.OooO00o(this.OooO0OO));
    Insets[] arrayOfInsets = this.OooO0O0;
    localWindowInsetsCompat.setOverriddenInsets(arrayOfInsets);
    return localWindowInsetsCompat;
  }
  
  public void setDisplayCutout(DisplayCutoutCompat paramDisplayCutoutCompat)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    if (paramDisplayCutoutCompat != null) {
      paramDisplayCutoutCompat = paramDisplayCutoutCompat.OooO00o();
    } else {
      paramDisplayCutoutCompat = null;
    }
    o000O000.OooO00o(localBuilder, paramDisplayCutoutCompat);
  }
  
  public void setMandatorySystemGestureInsets(Insets paramInsets)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    paramInsets = paramInsets.OooO0o0();
    o000.OooO00o(localBuilder, paramInsets);
  }
  
  public void setStableInsets(Insets paramInsets)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    paramInsets = paramInsets.OooO0o0();
    o0000OO0.OooO00o(localBuilder, paramInsets);
  }
  
  public void setSystemGestureInsets(Insets paramInsets)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    paramInsets = paramInsets.OooO0o0();
    o000O0o.OooO00o(localBuilder, paramInsets);
  }
  
  public void setSystemWindowInsets(Insets paramInsets)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    paramInsets = paramInsets.OooO0o0();
    o0000O.OooO00o(localBuilder, paramInsets);
  }
  
  public void setTappableElementInsets(Insets paramInsets)
  {
    WindowInsets.Builder localBuilder = this.OooO0OO;
    paramInsets = paramInsets.OooO0o0();
    o000OO.OooO00o(localBuilder, paramInsets);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl29
 * JD-Core Version:    0.7.0.1
 */