package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import m54207b69;

public class CropImageView
  extends FrameLayout
{
  public static final Rect o0O00o0;
  public ImageView o00OoOoo;
  public Bitmap o00Ooo0;
  public CropOverlayView o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  
  static
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    o0O00o0 = localRect;
  }
  
  public static int OooO00o(int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[3];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_05(3768, arrayOfObject);
  }
  
  public void OooO0O0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3769, arrayOfObject);
  }
  
  public RectF getActualCropRect()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RectF)m54207b69.F54207b69_09(3770, arrayOfObject);
  }
  
  public CropOverlayView getCropOverlayView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CropOverlayView)m54207b69.F54207b69_09(3771, arrayOfObject);
  }
  
  public Bitmap getCroppedImage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Bitmap)m54207b69.F54207b69_09(3772, arrayOfObject);
  }
  
  public int getImageResource()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3773, arrayOfObject);
  }
  
  public ImageView getImageView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ImageView)m54207b69.F54207b69_09(3774, arrayOfObject);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(3775, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3776, arrayOfObject);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcelable;
    m54207b69.F54207b69_00(3777, arrayOfObject);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Parcelable)m54207b69.F54207b69_09(3778, arrayOfObject);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(3779, arrayOfObject);
  }
  
  public void setAspectRatio(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3780, arrayOfObject);
  }
  
  public void setCropOverlayCornerBitmap(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    m54207b69.F54207b69_00(3781, arrayOfObject);
  }
  
  public void setFixedAspectRatio(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(3782, arrayOfObject);
  }
  
  public void setGuidelines(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3783, arrayOfObject);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    m54207b69.F54207b69_00(3784, arrayOfObject);
  }
  
  public void setImagePath(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(3785, arrayOfObject);
  }
  
  public void setImageResource(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3786, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.crop.CropImageView
 * JD-Core Version:    0.7.0.1
 */