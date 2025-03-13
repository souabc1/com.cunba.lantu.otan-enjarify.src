package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

public class AppCompatImageButton
  extends ImageButton
  implements TintableBackgroundView, TintableImageSourceView
{
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private boolean mHasLevel = false;
  private final AppCompatImageHelper mImageHelper;
  
  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.mBackgroundTintHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatImageHelper;
    paramContext.<init>(this);
    this.mImageHelper = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).OooO0O0();
    }
    localObject = this.mImageHelper;
    if (localObject != null) {
      ((AppCompatImageHelper)localObject).OooO0OO();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = this.mImageHelper;
    if (localObject != null) {
      localObject = ((AppCompatImageHelper)localObject).getSupportImageTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = this.mImageHelper;
    if (localObject != null) {
      localObject = ((AppCompatImageHelper)localObject).getSupportImageTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public boolean hasOverlappingRendering()
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    boolean bool = localAppCompatImageHelper.OooO0Oo();
    if (bool)
    {
      bool = super.hasOverlappingRendering();
      if (bool) {
        return true;
      }
    }
    bool = false;
    localAppCompatImageHelper = null;
    return bool;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0Oo(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0o0(paramInt);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    paramBitmap = this.mImageHelper;
    if (paramBitmap != null) {
      paramBitmap.OooO0OO();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if ((localAppCompatImageHelper != null) && (paramDrawable != null))
    {
      boolean bool1 = this.mHasLevel;
      if (!bool1) {
        localAppCompatImageHelper.OooO0o(paramDrawable);
      }
    }
    super.setImageDrawable(paramDrawable);
    paramDrawable = this.mImageHelper;
    if (paramDrawable != null)
    {
      paramDrawable.OooO0OO();
      boolean bool2 = this.mHasLevel;
      if (!bool2)
      {
        paramDrawable = this.mImageHelper;
        paramDrawable.OooO0O0();
      }
    }
  }
  
  public void setImageLevel(int paramInt)
  {
    super.setImageLevel(paramInt);
    this.mHasLevel = true;
  }
  
  public void setImageResource(int paramInt)
  {
    this.mImageHelper.setImageResource(paramInt);
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    paramUri = this.mImageHelper;
    if (paramUri != null) {
      paramUri.OooO0OO();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null) {
      localAppCompatImageHelper.setSupportImageTintList(paramColorStateList);
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null) {
      localAppCompatImageHelper.setSupportImageTintMode(paramMode);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatImageButton
 * JD-Core Version:    0.7.0.1
 */