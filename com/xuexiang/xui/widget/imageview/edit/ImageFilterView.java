package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import m54207b69;

class ImageFilterView
  extends GLSurfaceView
  implements GLSurfaceView.Renderer
{
  public int[] o00OoOoo;
  public Effect o00Ooo0;
  public EffectContext o00Ooo00;
  public TextureRenderer o00Ooo0O;
  public int o00Ooo0o;
  public boolean o00OooO;
  public int o00OooO0;
  public PhotoFilter o00OooOO;
  public Bitmap o00OooOo;
  public OnBitmapSaveListener o00OoooO;
  public boolean o00Ooooo;
  public CustomEffect o0O00o0;
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3909, arrayOfObject);
  }
  
  public final void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3910, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3911, arrayOfObject);
  }
  
  public final void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3912, arrayOfObject);
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGL10;
    m54207b69.F54207b69_00(3913, arrayOfObject);
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGL10;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(3914, arrayOfObject);
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGL10;
    arrayOfObject[2] = paramEGLConfig;
    m54207b69.F54207b69_00(3915, arrayOfObject);
  }
  
  public void setFilterEffect(CustomEffect paramCustomEffect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCustomEffect;
    m54207b69.F54207b69_00(3916, arrayOfObject);
  }
  
  public void setFilterEffect(PhotoFilter paramPhotoFilter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPhotoFilter;
    m54207b69.F54207b69_00(3917, arrayOfObject);
  }
  
  public void setSourceBitmap(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    m54207b69.F54207b69_00(3918, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.ImageFilterView
 * JD-Core Version:    0.7.0.1
 */