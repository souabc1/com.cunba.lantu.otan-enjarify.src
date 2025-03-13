package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.ResourcesCompat.FontCallback;

public class TintTypedArray
{
  public final Context OooO00o;
  public final TypedArray OooO0O0;
  public TypedValue OooO0OO;
  
  public TintTypedArray(Context paramContext, TypedArray paramTypedArray)
  {
    this.OooO00o = paramContext;
    this.OooO0O0 = paramTypedArray;
  }
  
  public static TintTypedArray OooOOO(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    TintTypedArray localTintTypedArray = new androidx/appcompat/widget/TintTypedArray;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt);
    localTintTypedArray.<init>(paramContext, paramAttributeSet);
    return localTintTypedArray;
  }
  
  public static TintTypedArray OooOOO0(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    TintTypedArray localTintTypedArray = new androidx/appcompat/widget/TintTypedArray;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt);
    localTintTypedArray.<init>(paramContext, localTypedArray);
    return localTintTypedArray;
  }
  
  public static TintTypedArray OooOOOO(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    TintTypedArray localTintTypedArray = new androidx/appcompat/widget/TintTypedArray;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2);
    localTintTypedArray.<init>(paramContext, paramAttributeSet);
    return localTintTypedArray;
  }
  
  public int OooO(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getInteger(paramInt1, paramInt2);
  }
  
  public boolean OooO00o(int paramInt, boolean paramBoolean)
  {
    return this.OooO0O0.getBoolean(paramInt, paramBoolean);
  }
  
  public int OooO0O0(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getColor(paramInt1, paramInt2);
  }
  
  public float OooO0OO(int paramInt, float paramFloat)
  {
    return this.OooO0O0.getDimension(paramInt, paramFloat);
  }
  
  public int OooO0Oo(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public float OooO0o(int paramInt, float paramFloat)
  {
    return this.OooO0O0.getFloat(paramInt, paramFloat);
  }
  
  public int OooO0o0(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Typeface OooO0oO(int paramInt1, int paramInt2, ResourcesCompat.FontCallback paramFontCallback)
  {
    Object localObject = this.OooO0O0;
    TypedValue localTypedValue = null;
    paramInt1 = ((TypedArray)localObject).getResourceId(paramInt1, 0);
    if (paramInt1 == 0) {
      return null;
    }
    localObject = this.OooO0OO;
    if (localObject == null)
    {
      localObject = new android/util/TypedValue;
      ((TypedValue)localObject).<init>();
      this.OooO0OO = ((TypedValue)localObject);
    }
    localObject = this.OooO00o;
    localTypedValue = this.OooO0OO;
    return ResourcesCompat.OooO0oo((Context)localObject, paramInt1, localTypedValue, paramInt2, paramFontCallback);
  }
  
  public int OooO0oo(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getInt(paramInt1, paramInt2);
  }
  
  public int OooOO0(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public int OooOO0O(int paramInt1, int paramInt2)
  {
    return this.OooO0O0.getResourceId(paramInt1, paramInt2);
  }
  
  public boolean OooOO0o(int paramInt)
  {
    return this.OooO0O0.hasValue(paramInt);
  }
  
  public void OooOOOo()
  {
    this.OooO0O0.recycle();
  }
  
  public int getChangingConfigurations()
  {
    return TintTypedArray.Api21Impl.OooO00o(this.OooO0O0);
  }
  
  public ColorStateList getColorStateList(int paramInt)
  {
    Object localObject = this.OooO0O0;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    if (bool)
    {
      localObject = this.OooO0O0;
      Context localContext = null;
      int i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0)
      {
        localContext = this.OooO00o;
        localObject = AppCompatResources.OooO00o(localContext, i);
        if (localObject != null) {
          return localObject;
        }
      }
    }
    return this.OooO0O0.getColorStateList(paramInt);
  }
  
  public Drawable getDrawable(int paramInt)
  {
    TypedArray localTypedArray = this.OooO0O0;
    boolean bool = localTypedArray.hasValue(paramInt);
    if (bool)
    {
      localTypedArray = this.OooO0O0;
      int i = localTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        return AppCompatResources.OooO0O0(this.OooO00o, i);
      }
    }
    return this.OooO0O0.getDrawable(paramInt);
  }
  
  public Drawable getDrawableIfKnown(int paramInt)
  {
    Object localObject = this.OooO0O0;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    if (bool)
    {
      localObject = this.OooO0O0;
      Context localContext = null;
      paramInt = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (paramInt != 0)
      {
        localObject = AppCompatDrawableManager.get();
        localContext = this.OooO00o;
        return ((AppCompatDrawableManager)localObject).OooO0OO(localContext, paramInt, true);
      }
    }
    return null;
  }
  
  public int getIndex(int paramInt)
  {
    return this.OooO0O0.getIndex(paramInt);
  }
  
  public int getIndexCount()
  {
    return this.OooO0O0.getIndexCount();
  }
  
  public String getNonResourceString(int paramInt)
  {
    return this.OooO0O0.getNonResourceString(paramInt);
  }
  
  public String getPositionDescription()
  {
    return this.OooO0O0.getPositionDescription();
  }
  
  public Resources getResources()
  {
    return this.OooO0O0.getResources();
  }
  
  public String getString(int paramInt)
  {
    return this.OooO0O0.getString(paramInt);
  }
  
  public CharSequence getText(int paramInt)
  {
    return this.OooO0O0.getText(paramInt);
  }
  
  public CharSequence[] getTextArray(int paramInt)
  {
    return this.OooO0O0.getTextArray(paramInt);
  }
  
  public int getType(int paramInt)
  {
    return TintTypedArray.Api21Impl.OooO0O0(this.OooO0O0, paramInt);
  }
  
  public TypedArray getWrappedTypeArray()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.TintTypedArray
 * JD-Core Version:    0.7.0.1
 */