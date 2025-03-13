package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback
{
  public Matrix OooO00o;
  
  public static Bitmap OooO00o(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if ((i > 0) && (j > 0))
    {
      float f1 = i * j;
      float f2 = 8 / f1;
      int k = 1065353216;
      f1 = 1.0F;
      f2 = Math.min(f1, f2);
      boolean bool2 = paramDrawable instanceof BitmapDrawable;
      if (bool2)
      {
        boolean bool1 = f2 < f1;
        if (!bool1) {
          return ((BitmapDrawable)paramDrawable).getBitmap();
        }
      }
      i = (int)(i * f2);
      j = (int)(j * f2);
      Object localObject = Bitmap.Config.ARGB_8888;
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>((Bitmap)localObject);
      Rect localRect = ((Drawable)paramDrawable).getBounds();
      int n = localRect.left;
      int i1 = localRect.top;
      int i2 = localRect.right;
      int m = localRect.bottom;
      ((Drawable)paramDrawable).setBounds(0, 0, i, j);
      ((Drawable)paramDrawable).draw(localCanvas);
      ((Drawable)paramDrawable).setBounds(n, i1, i2, m);
      return localObject;
    }
    return null;
  }
  
  public Parcelable OooO0O0(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    boolean bool = paramView instanceof ImageView;
    Object localObject1;
    float f1;
    if (bool)
    {
      localObject1 = paramView;
      localObject1 = (ImageView)paramView;
      Object localObject2 = ((ImageView)localObject1).getDrawable();
      Drawable localDrawable = ((View)localObject1).getBackground();
      if ((localObject2 != null) && (localDrawable == null))
      {
        localObject2 = OooO00o((Drawable)localObject2);
        if (localObject2 != null)
        {
          paramView = new android/os/Bundle;
          paramView.<init>();
          paramView.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject2);
          paramMatrix = ((ImageView)localObject1).getScaleType().toString();
          paramView.putString("sharedElement:snapshot:imageScaleType", paramMatrix);
          paramMatrix = ((ImageView)localObject1).getScaleType();
          paramRectF = ImageView.ScaleType.MATRIX;
          if (paramMatrix == paramRectF)
          {
            paramMatrix = ((ImageView)localObject1).getImageMatrix();
            int j = 9;
            f1 = 1.261169E-044F;
            paramRectF = new float[j];
            paramMatrix.getValues(paramRectF);
            paramMatrix = "sharedElement:snapshot:imageMatrix";
            paramView.putFloatArray(paramMatrix, paramRectF);
          }
          return paramView;
        }
      }
    }
    float f2 = paramRectF.width();
    int i = Math.round(f2);
    float f3 = paramRectF.height();
    int k = Math.round(f3);
    if ((i > 0) && (k > 0))
    {
      float f4 = i * k;
      float f5 = 8 / f4;
      f4 = Math.min(1.0F, f5);
      f2 = i * f4;
      i = (int)f2;
      f3 = k * f4;
      k = (int)f3;
      Matrix localMatrix = this.OooO00o;
      if (localMatrix == null)
      {
        localMatrix = new android/graphics/Matrix;
        localMatrix.<init>();
        this.OooO00o = localMatrix;
      }
      localMatrix = this.OooO00o;
      localMatrix.set(paramMatrix);
      paramMatrix = this.OooO00o;
      f5 = -paramRectF.left;
      f1 = -paramRectF.top;
      paramMatrix.postTranslate(f5, f1);
      this.OooO00o.postScale(f4, f4);
      paramMatrix = Bitmap.Config.ARGB_8888;
      paramMatrix = Bitmap.createBitmap(i, k, paramMatrix);
      paramRectF = new android/graphics/Canvas;
      paramRectF.<init>(paramMatrix);
      localObject1 = this.OooO00o;
      paramRectF.concat((Matrix)localObject1);
      ((View)paramView).draw(paramRectF);
    }
    else
    {
      paramMatrix = null;
    }
    return paramMatrix;
  }
  
  public View OooO0OO(Context paramContext, Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof Bundle;
    ImageView localImageView = null;
    if (bool)
    {
      paramParcelable = (Bundle)paramParcelable;
      Object localObject = (Bitmap)paramParcelable.getParcelable("sharedElement:snapshot:bitmap");
      if (localObject == null) {
        return null;
      }
      localImageView = new android/widget/ImageView;
      localImageView.<init>(paramContext);
      localImageView.setImageBitmap((Bitmap)localObject);
      paramContext = ImageView.ScaleType.valueOf(paramParcelable.getString("sharedElement:snapshot:imageScaleType"));
      localImageView.setScaleType(paramContext);
      paramContext = localImageView.getScaleType();
      localObject = ImageView.ScaleType.MATRIX;
      if (paramContext == localObject)
      {
        paramContext = paramParcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
        paramParcelable = new android/graphics/Matrix;
        paramParcelable.<init>();
        paramParcelable.setValues(paramContext);
        localImageView.setImageMatrix(paramParcelable);
      }
    }
    else
    {
      bool = paramParcelable instanceof Bitmap;
      if (bool)
      {
        paramParcelable = (Bitmap)paramParcelable;
        localImageView = new android/widget/ImageView;
        localImageView.<init>(paramContext);
        localImageView.setImageBitmap(paramParcelable);
      }
    }
    return localImageView;
  }
  
  public void OooO0Oo(List paramList, Map paramMap) {}
  
  public void OooO0o(List paramList1, List paramList2, List paramList3) {}
  
  public void OooO0o0(List paramList) {}
  
  public void OooO0oO(List paramList1, List paramList2, List paramList3) {}
  
  public void OooO0oo(List paramList1, List paramList2, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
  {
    paramOnSharedElementsReadyListener.OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.SharedElementCallback
 * JD-Core Version:    0.7.0.1
 */