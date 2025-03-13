package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.WrappedDrawable;

class AppCompatProgressBarHelper
{
  public static final int[] OooO0OO = { 16843067, 16843068 };
  public final ProgressBar OooO00o;
  public Bitmap OooO0O0;
  
  public AppCompatProgressBarHelper(ProgressBar paramProgressBar)
  {
    this.OooO00o = paramProgressBar;
  }
  
  private Shape getDrawableShape()
  {
    float[] arrayOfFloat = new float[8];
    float[] tmp6_5 = arrayOfFloat;
    float[] tmp7_6 = tmp6_5;
    float[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 5.0F;
    tmp7_6[1] = 5.0F;
    float[] tmp16_7 = tmp7_6;
    float[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 5.0F;
    tmp16_7[3] = 5.0F;
    float[] tmp25_16 = tmp16_7;
    float[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 5.0F;
    tmp25_16[5] = 5.0F;
    tmp25_16[6] = 5.0F;
    tmp25_16[7] = 5.0F;
    RoundRectShape localRoundRectShape = new android/graphics/drawable/shapes/RoundRectShape;
    localRoundRectShape.<init>(arrayOfFloat, null, null);
    return localRoundRectShape;
  }
  
  public void OooO00o(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject = this.OooO00o.getContext();
    int[] arrayOfInt = OooO0OO;
    paramAttributeSet = TintTypedArray.OooOOOO((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.getDrawableIfKnown(0);
    if (localDrawable != null)
    {
      localObject = this.OooO00o;
      localDrawable = OooO0OO(localDrawable);
      ((ProgressBar)localObject).setIndeterminateDrawable(localDrawable);
    }
    paramInt = 1;
    localDrawable = paramAttributeSet.getDrawableIfKnown(paramInt);
    if (localDrawable != null)
    {
      localObject = this.OooO00o;
      localDrawable = OooO0O0(localDrawable, false);
      ((ProgressBar)localObject).setProgressDrawable(localDrawable);
    }
    paramAttributeSet.OooOOOo();
  }
  
  public Drawable OooO0O0(Drawable paramDrawable, boolean paramBoolean)
  {
    boolean bool1 = paramDrawable instanceof WrappedDrawable;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = paramDrawable;
      localObject1 = (WrappedDrawable)paramDrawable;
      localObject2 = ((WrappedDrawable)localObject1).getWrappedDrawable();
      if (localObject2 != null)
      {
        Drawable localDrawable = OooO0O0((Drawable)localObject2, paramBoolean);
        ((WrappedDrawable)localObject1).setWrappedDrawable(localDrawable);
      }
    }
    else
    {
      bool1 = paramDrawable instanceof LayerDrawable;
      int j = 1;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      if (bool1)
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        paramBoolean = paramDrawable.getNumberOfLayers();
        localObject1 = new Drawable[paramBoolean];
        boolean bool3 = false;
        localObject3 = null;
        boolean bool4 = false;
        localObject4 = null;
        while (bool4 < paramBoolean)
        {
          int n = paramDrawable.getId(bool4);
          localObject5 = paramDrawable.getDrawable(bool4);
          int i1 = 16908301;
          if (n != i1)
          {
            int i2 = 16908303;
            if (n != i2)
            {
              n = 0;
              localObject6 = null;
              break label153;
            }
          }
          n = j;
          label153:
          localObject6 = OooO0O0((Drawable)localObject5, n);
          localObject1[bool4] = localObject6;
          int m;
          bool4 += true;
        }
        localObject2 = new android/graphics/drawable/LayerDrawable;
        ((LayerDrawable)localObject2).<init>((Drawable[])localObject1);
        while (bool3 < paramBoolean)
        {
          int i = paramDrawable.getId(bool3);
          ((LayerDrawable)localObject2).setId(bool3, i);
          AppCompatProgressBarHelper.Api23Impl.OooO00o(paramDrawable, (LayerDrawable)localObject2, bool3);
          int k;
          bool3 += true;
        }
        return localObject2;
      }
      boolean bool2 = paramDrawable instanceof BitmapDrawable;
      if (bool2)
      {
        paramDrawable = (BitmapDrawable)paramDrawable;
        localObject1 = paramDrawable.getBitmap();
        localObject3 = this.OooO0O0;
        if (localObject3 == null) {
          this.OooO0O0 = ((Bitmap)localObject1);
        }
        localObject3 = new android/graphics/drawable/ShapeDrawable;
        localObject4 = getDrawableShape();
        ((ShapeDrawable)localObject3).<init>((Shape)localObject4);
        localObject4 = new android/graphics/BitmapShader;
        localObject6 = Shader.TileMode.REPEAT;
        localObject5 = Shader.TileMode.CLAMP;
        ((BitmapShader)localObject4).<init>((Bitmap)localObject1, (Shader.TileMode)localObject6, (Shader.TileMode)localObject5);
        ((ShapeDrawable)localObject3).getPaint().setShader((Shader)localObject4);
        localObject1 = ((ShapeDrawable)localObject3).getPaint();
        paramDrawable = paramDrawable.getPaint().getColorFilter();
        ((Paint)localObject1).setColorFilter(paramDrawable);
        if (paramBoolean)
        {
          paramDrawable = new android/graphics/drawable/ClipDrawable;
          paramBoolean = true;
          paramDrawable.<init>((Drawable)localObject3, paramBoolean, j);
          localObject3 = paramDrawable;
        }
        return localObject3;
      }
    }
    return (Drawable)paramDrawable;
  }
  
  public final Drawable OooO0OO(Drawable paramDrawable)
  {
    boolean bool1 = paramDrawable instanceof AnimationDrawable;
    if (bool1)
    {
      paramDrawable = (AnimationDrawable)paramDrawable;
      int i = paramDrawable.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable = new android/graphics/drawable/AnimationDrawable;
      localAnimationDrawable.<init>();
      int j = paramDrawable.isOneShot();
      localAnimationDrawable.setOneShot(j);
      j = 0;
      int m;
      for (;;)
      {
        m = 10000;
        if (j >= i) {
          break;
        }
        Drawable localDrawable = paramDrawable.getFrame(j);
        boolean bool2 = true;
        localDrawable = OooO0O0(localDrawable, bool2);
        localDrawable.setLevel(m);
        m = paramDrawable.getDuration(j);
        localAnimationDrawable.addFrame(localDrawable, m);
        int k;
        j += 1;
      }
      localAnimationDrawable.setLevel(m);
      paramDrawable = localAnimationDrawable;
    }
    return paramDrawable;
  }
  
  public Bitmap getSampleTile()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatProgressBarHelper
 * JD-Core Version:    0.7.0.1
 */