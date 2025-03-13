package androidx.core.view;

import androidx.core.graphics.Insets;

class WindowInsetsCompat$BuilderImpl
{
  public final WindowInsetsCompat OooO00o;
  public Insets[] OooO0O0;
  
  public WindowInsetsCompat$BuilderImpl()
  {
    this(localWindowInsetsCompat);
  }
  
  public WindowInsetsCompat$BuilderImpl(WindowInsetsCompat paramWindowInsetsCompat)
  {
    this.OooO00o = paramWindowInsetsCompat;
  }
  
  public final void OooO00o()
  {
    Object localObject1 = this.OooO0O0;
    if (localObject1 != null)
    {
      int i = 1;
      int j = WindowInsetsCompat.Type.OooO0O0(i);
      localObject1 = localObject1[j];
      Object localObject2 = this.OooO0O0;
      int k = 2;
      int m = WindowInsetsCompat.Type.OooO0O0(k);
      localObject2 = localObject2[m];
      if (localObject2 == null) {
        localObject2 = this.OooO00o.getInsets(k);
      }
      if (localObject1 == null) {
        localObject1 = this.OooO00o.getInsets(i);
      }
      localObject1 = Insets.OooO00o((Insets)localObject1, (Insets)localObject2);
      setSystemWindowInsets((Insets)localObject1);
      localObject1 = this.OooO0O0;
      i = WindowInsetsCompat.Type.OooO0O0(16);
      localObject1 = localObject1[i];
      if (localObject1 != null) {
        setSystemGestureInsets((Insets)localObject1);
      }
      localObject1 = this.OooO0O0;
      i = WindowInsetsCompat.Type.OooO0O0(32);
      localObject1 = localObject1[i];
      if (localObject1 != null) {
        setMandatorySystemGestureInsets((Insets)localObject1);
      }
      localObject1 = this.OooO0O0;
      i = WindowInsetsCompat.Type.OooO0O0(64);
      localObject1 = localObject1[i];
      if (localObject1 != null) {
        setTappableElementInsets((Insets)localObject1);
      }
    }
  }
  
  public WindowInsetsCompat OooO0O0()
  {
    OooO00o();
    return this.OooO00o;
  }
  
  public void setDisplayCutout(DisplayCutoutCompat paramDisplayCutoutCompat) {}
  
  public void setInsets(int paramInt, Insets paramInsets)
  {
    Insets[] arrayOfInsets1 = this.OooO0O0;
    if (arrayOfInsets1 == null)
    {
      i = 9;
      arrayOfInsets1 = new Insets[i];
      this.OooO0O0 = arrayOfInsets1;
    }
    int i = 1;
    for (;;)
    {
      int j = 256;
      if (i > j) {
        break;
      }
      j = paramInt & i;
      if (j != 0)
      {
        Insets[] arrayOfInsets2 = this.OooO0O0;
        int k = WindowInsetsCompat.Type.OooO0O0(i);
        arrayOfInsets2[k] = paramInsets;
      }
      i <<= 1;
    }
  }
  
  public void setInsetsIgnoringVisibility(int paramInt, Insets paramInsets)
  {
    int i = 8;
    if (paramInt != i) {
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Ignoring visibility inset not available for IME");
    throw localIllegalArgumentException;
  }
  
  public void setMandatorySystemGestureInsets(Insets paramInsets) {}
  
  public void setStableInsets(Insets paramInsets) {}
  
  public void setSystemGestureInsets(Insets paramInsets) {}
  
  public void setSystemWindowInsets(Insets paramInsets) {}
  
  public void setTappableElementInsets(Insets paramInsets) {}
  
  public void setVisible(int paramInt, boolean paramBoolean) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl
 * JD-Core Version:    0.7.0.1
 */