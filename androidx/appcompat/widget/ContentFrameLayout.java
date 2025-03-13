package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

public class ContentFrameLayout
  extends FrameLayout
{
  public TypedValue o00OoOoo;
  public TypedValue o00Ooo0;
  public TypedValue o00Ooo00;
  public TypedValue o00Ooo0O;
  public TypedValue o00Ooo0o;
  public final Rect o00OooO;
  public TypedValue o00OooO0;
  public ContentFrameLayout.OnAttachListener o00OooOO;
  
  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.o00OooO = paramContext;
  }
  
  public void OooO00o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.o00OooO;
    localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = ViewCompat.OoooOOO(this);
    if (paramInt1 != 0) {
      requestLayout();
    }
  }
  
  public TypedValue getFixedHeightMajor()
  {
    TypedValue localTypedValue = this.o00Ooo0o;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00Ooo0o = localTypedValue;
    }
    return this.o00Ooo0o;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    TypedValue localTypedValue = this.o00OooO0;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00OooO0 = localTypedValue;
    }
    return this.o00OooO0;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    TypedValue localTypedValue = this.o00Ooo0;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00Ooo0 = localTypedValue;
    }
    return this.o00Ooo0;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    TypedValue localTypedValue = this.o00Ooo0O;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00Ooo0O = localTypedValue;
    }
    return this.o00Ooo0O;
  }
  
  public TypedValue getMinWidthMajor()
  {
    TypedValue localTypedValue = this.o00OoOoo;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00OoOoo = localTypedValue;
    }
    return this.o00OoOoo;
  }
  
  public TypedValue getMinWidthMinor()
  {
    TypedValue localTypedValue = this.o00Ooo00;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.o00Ooo00 = localTypedValue;
    }
    return this.o00Ooo00;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ContentFrameLayout.OnAttachListener localOnAttachListener = this.o00OooOO;
    if (localOnAttachListener != null) {
      localOnAttachListener.OooO00o();
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ContentFrameLayout.OnAttachListener localOnAttachListener = this.o00OooOO;
    if (localOnAttachListener != null) {
      localOnAttachListener.onDetachedFromWindow();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    int k = 1;
    float f1 = 1.4E-45F;
    Object localObject;
    if (i < j)
    {
      i = k;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    j = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = 6;
    int i1 = 5;
    int i2 = -1 << -1;
    int i3 = 1073741824;
    int i4;
    float f3;
    float f4;
    label191:
    Rect localRect;
    int i6;
    if (j == i2)
    {
      if (i != 0) {
        localTypedValue1 = this.o00Ooo0O;
      } else {
        localTypedValue1 = this.o00Ooo0;
      }
      if (localTypedValue1 != null)
      {
        i4 = localTypedValue1.type;
        if (i4 != 0)
        {
          if (i4 == i1) {}
          for (f2 = localTypedValue1.getDimension(localDisplayMetrics);; f2 = localTypedValue1.getFraction(f3, f4))
          {
            i5 = (int)f2;
            break label191;
            if (i4 != n) {
              break;
            }
            i4 = localDisplayMetrics.widthPixels;
            f3 = i4;
            f4 = i4;
          }
          i5 = 0;
          localTypedValue1 = null;
          f2 = 0.0F;
          if (i5 > 0)
          {
            localRect = this.o00OooO;
            i6 = localRect.left;
            i4 = localRect.right;
            i6 += i4;
            i5 -= i6;
            paramInt1 = View.MeasureSpec.getSize(paramInt1);
            paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, paramInt1), i3);
            i5 = k;
            f2 = f1;
            break label267;
          }
        }
      }
    }
    int i5 = 0;
    TypedValue localTypedValue1 = null;
    float f2 = 0.0F;
    label267:
    if (m == i2)
    {
      TypedValue localTypedValue2;
      if (i != 0) {
        localTypedValue2 = this.o00Ooo0o;
      } else {
        localTypedValue2 = this.o00OooO0;
      }
      if (localTypedValue2 != null)
      {
        i4 = localTypedValue2.type;
        if (i4 != 0)
        {
          if (i4 == i1) {}
          for (float f5 = localTypedValue2.getDimension(localDisplayMetrics);; f5 = localTypedValue2.getFraction(f3, f4))
          {
            m = (int)f5;
            break label380;
            if (i4 != n) {
              break;
            }
            i4 = localDisplayMetrics.heightPixels;
            f3 = i4;
            f4 = i4;
          }
          m = 0;
          localTypedValue2 = null;
          f5 = 0.0F;
          label380:
          if (m > 0)
          {
            localRect = this.o00OooO;
            i6 = localRect.top;
            i4 = localRect.bottom;
            i6 += i4;
            m -= i6;
            paramInt2 = View.MeasureSpec.getSize(paramInt2);
            paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(m, paramInt2), i3);
          }
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    m = View.MeasureSpec.makeMeasureSpec(paramInt1, i3);
    if ((i5 == 0) && (j == i2))
    {
      if (i != 0) {
        localObject = this.o00Ooo00;
      } else {
        localObject = this.o00OoOoo;
      }
      if (localObject != null)
      {
        j = ((TypedValue)localObject).type;
        if (j != 0)
        {
          if (j == i1) {}
          float f7;
          for (float f6 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f6 = ((TypedValue)localObject).getFraction(f7, f6))
          {
            i7 = (int)f6;
            break label572;
            if (j != n) {
              break;
            }
            i7 = localDisplayMetrics.widthPixels;
            f7 = i7;
            f6 = i7;
          }
          int i7 = 0;
          localDisplayMetrics = null;
          f6 = 0.0F;
          label572:
          if (i7 > 0)
          {
            localObject = this.o00OooO;
            j = ((Rect)localObject).left;
            i = ((Rect)localObject).right;
            j += i;
            i7 -= j;
          }
          if (paramInt1 < i7)
          {
            m = View.MeasureSpec.makeMeasureSpec(i7, i3);
            break label635;
          }
        }
      }
    }
    k = 0;
    f1 = 0.0F;
    label635:
    if (k != 0) {
      super.onMeasure(m, paramInt2);
    }
  }
  
  public void setAttachListener(ContentFrameLayout.OnAttachListener paramOnAttachListener)
  {
    this.o00OooOO = paramOnAttachListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ContentFrameLayout
 * JD-Core Version:    0.7.0.1
 */