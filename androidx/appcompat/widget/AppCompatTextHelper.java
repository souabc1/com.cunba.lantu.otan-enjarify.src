package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R.styleable;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class AppCompatTextHelper
{
  public final AppCompatTextViewAutoSizeHelper OooO;
  public final TextView OooO00o;
  public TintInfo OooO0O0;
  public TintInfo OooO0OO;
  public TintInfo OooO0Oo;
  public TintInfo OooO0o;
  public TintInfo OooO0o0;
  public TintInfo OooO0oO;
  public TintInfo OooO0oo;
  public int OooOO0 = 0;
  public int OooOO0O = -1;
  public Typeface OooOO0o;
  public boolean OooOOO0;
  
  public AppCompatTextHelper(TextView paramTextView)
  {
    this.OooO00o = paramTextView;
    AppCompatTextViewAutoSizeHelper localAppCompatTextViewAutoSizeHelper = new androidx/appcompat/widget/AppCompatTextViewAutoSizeHelper;
    localAppCompatTextViewAutoSizeHelper.<init>(paramTextView);
    this.OooO = localAppCompatTextViewAutoSizeHelper;
  }
  
  public static TintInfo OooO0Oo(Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    paramContext = paramAppCompatDrawableManager.OooO0o0(paramContext, paramInt);
    if (paramContext != null)
    {
      paramAppCompatDrawableManager = new androidx/appcompat/widget/TintInfo;
      paramAppCompatDrawableManager.<init>();
      paramAppCompatDrawableManager.OooO0Oo = true;
      paramAppCompatDrawableManager.OooO00o = paramContext;
      return paramAppCompatDrawableManager;
    }
    return null;
  }
  
  private void setTextSizeInternal(int paramInt, float paramFloat)
  {
    this.OooO.setTextSizeInternal(paramInt, paramFloat);
  }
  
  public void OooO(Context paramContext, int paramInt)
  {
    Object localObject1 = R.styleable.TextAppearance;
    Object localObject2 = TintTypedArray.OooOOO0(paramContext, paramInt, (int[])localObject1);
    int i = R.styleable.TextAppearance_textAllCaps;
    boolean bool1 = ((TintTypedArray)localObject2).OooOO0o(i);
    if (bool1)
    {
      int j = R.styleable.TextAppearance_textAllCaps;
      boolean bool2 = ((TintTypedArray)localObject2).OooO00o(j, false);
      setAllCaps(bool2);
    }
    int k = R.styleable.TextAppearance_android_textSize;
    boolean bool3 = ((TintTypedArray)localObject2).OooOO0o(k);
    int m;
    if (bool3)
    {
      m = R.styleable.TextAppearance_android_textSize;
      int n = -1;
      m = ((TintTypedArray)localObject2).OooO0o0(m, n);
      if (m == 0)
      {
        localObject1 = this.OooO00o;
        n = 0;
        ((TextView)localObject1).setTextSize(0, 0.0F);
      }
    }
    OooOOOO(paramContext, (TintTypedArray)localObject2);
    int i1 = R.styleable.TextAppearance_fontVariationSettings;
    boolean bool4 = ((TintTypedArray)localObject2).OooOO0o(i1);
    if (bool4)
    {
      int i2 = R.styleable.TextAppearance_fontVariationSettings;
      paramContext = ((TintTypedArray)localObject2).getString(i2);
      if (paramContext != null)
      {
        localObject1 = this.OooO00o;
        AppCompatTextHelper.Api26Impl.OooO0Oo((TextView)localObject1, paramContext);
      }
    }
    ((TintTypedArray)localObject2).OooOOOo();
    paramContext = this.OooOO0o;
    if (paramContext != null)
    {
      localObject2 = this.OooO00o;
      m = this.OooOO0;
      ((TextView)localObject2).setTypeface(paramContext, m);
    }
  }
  
  public final void OooO00o(Drawable paramDrawable, TintInfo paramTintInfo)
  {
    if ((paramDrawable != null) && (paramTintInfo != null))
    {
      int[] arrayOfInt = this.OooO00o.getDrawableState();
      AppCompatDrawableManager.OooO0oo(paramDrawable, paramTintInfo, arrayOfInt);
    }
  }
  
  public void OooO0O0()
  {
    Object localObject1 = this.OooO0O0;
    int i = 2;
    Drawable localDrawable = null;
    if (localObject1 == null)
    {
      localObject1 = this.OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = this.OooO0Oo;
        if (localObject1 == null)
        {
          localObject1 = this.OooO0o0;
          if (localObject1 == null) {
            break label126;
          }
        }
      }
    }
    localObject1 = this.OooO00o.getCompoundDrawables();
    Object localObject2 = localObject1[0];
    TintInfo localTintInfo1 = this.OooO0O0;
    OooO00o((Drawable)localObject2, localTintInfo1);
    localObject2 = localObject1[1];
    localTintInfo1 = this.OooO0OO;
    OooO00o((Drawable)localObject2, localTintInfo1);
    localObject2 = localObject1[i];
    localTintInfo1 = this.OooO0Oo;
    OooO00o((Drawable)localObject2, localTintInfo1);
    int j = 3;
    localObject1 = localObject1[j];
    localObject2 = this.OooO0o0;
    OooO00o((Drawable)localObject1, (TintInfo)localObject2);
    label126:
    localObject1 = this.OooO0o;
    if (localObject1 == null)
    {
      localObject1 = this.OooO0oO;
      if (localObject1 == null) {}
    }
    else
    {
      localObject1 = AppCompatTextHelper.Api17Impl.OooO00o(this.OooO00o);
      localDrawable = localObject1[0];
      localObject2 = this.OooO0o;
      OooO00o(localDrawable, (TintInfo)localObject2);
      localObject1 = localObject1[i];
      TintInfo localTintInfo2 = this.OooO0oO;
      OooO00o((Drawable)localObject1, localTintInfo2);
    }
  }
  
  public void OooO0OO()
  {
    this.OooO.OooO00o();
  }
  
  public void OooO0o(WeakReference paramWeakReference, Typeface paramTypeface)
  {
    boolean bool = this.OooOOO0;
    if (bool)
    {
      this.OooOO0o = paramTypeface;
      paramWeakReference = (TextView)paramWeakReference.get();
      if (paramWeakReference != null)
      {
        bool = ViewCompat.o000oOoO(paramWeakReference);
        int i;
        if (bool)
        {
          i = this.OooOO0;
          AppCompatTextHelper.2 local2 = new androidx/appcompat/widget/AppCompatTextHelper$2;
          local2.<init>(this, paramWeakReference, paramTypeface, i);
          paramWeakReference.post(local2);
        }
        else
        {
          i = this.OooOO0;
          paramWeakReference.setTypeface(paramTypeface, i);
        }
      }
    }
  }
  
  public void OooO0o0(AttributeSet paramAttributeSet, int paramInt)
  {
    AppCompatTextHelper localAppCompatTextHelper = this;
    Object localObject1 = paramAttributeSet;
    int i = paramInt;
    Context localContext = this.OooO00o.getContext();
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    Object localObject2 = R.styleable.AppCompatTextHelper;
    TintTypedArray localTintTypedArray = TintTypedArray.OooOOOO(localContext, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = this.OooO00o;
    Object localObject3 = ((View)localObject2).getContext();
    Object localObject4 = R.styleable.AppCompatTextHelper;
    Object localObject5 = localTintTypedArray.getWrappedTypeArray();
    int j = 0;
    Object localObject6 = null;
    Object localObject7 = paramAttributeSet;
    int m = paramInt;
    ViewCompat.o00ooo((View)localObject2, (Context)localObject3, (int[])localObject4, paramAttributeSet, (TypedArray)localObject5, paramInt, 0);
    int i1 = R.styleable.AppCompatTextHelper_android_textAppearance;
    int i5 = -1;
    i1 = localTintTypedArray.OooOO0O(i1, i5);
    int i6 = R.styleable.AppCompatTextHelper_android_drawableLeft;
    boolean bool6 = localTintTypedArray.OooOO0o(i6);
    if (bool6)
    {
      i7 = R.styleable.AppCompatTextHelper_android_drawableLeft;
      i7 = localTintTypedArray.OooOO0O(i7, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i7);
      this.OooO0O0 = ((TintInfo)localObject3);
    }
    int i7 = R.styleable.AppCompatTextHelper_android_drawableTop;
    boolean bool7 = localTintTypedArray.OooOO0o(i7);
    if (bool7)
    {
      i8 = R.styleable.AppCompatTextHelper_android_drawableTop;
      i8 = localTintTypedArray.OooOO0O(i8, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i8);
      localAppCompatTextHelper.OooO0OO = ((TintInfo)localObject3);
    }
    int i8 = R.styleable.AppCompatTextHelper_android_drawableRight;
    boolean bool8 = localTintTypedArray.OooOO0o(i8);
    if (bool8)
    {
      i9 = R.styleable.AppCompatTextHelper_android_drawableRight;
      i9 = localTintTypedArray.OooOO0O(i9, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i9);
      localAppCompatTextHelper.OooO0Oo = ((TintInfo)localObject3);
    }
    int i9 = R.styleable.AppCompatTextHelper_android_drawableBottom;
    boolean bool9 = localTintTypedArray.OooOO0o(i9);
    if (bool9)
    {
      i10 = R.styleable.AppCompatTextHelper_android_drawableBottom;
      i10 = localTintTypedArray.OooOO0O(i10, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i10);
      localAppCompatTextHelper.OooO0o0 = ((TintInfo)localObject3);
    }
    int i10 = R.styleable.AppCompatTextHelper_android_drawableStart;
    boolean bool10 = localTintTypedArray.OooOO0o(i10);
    if (bool10)
    {
      i11 = R.styleable.AppCompatTextHelper_android_drawableStart;
      i11 = localTintTypedArray.OooOO0O(i11, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i11);
      localAppCompatTextHelper.OooO0o = ((TintInfo)localObject3);
    }
    int i11 = R.styleable.AppCompatTextHelper_android_drawableEnd;
    boolean bool11 = localTintTypedArray.OooOO0o(i11);
    if (bool11)
    {
      int i12 = R.styleable.AppCompatTextHelper_android_drawableEnd;
      i12 = localTintTypedArray.OooOO0O(i12, 0);
      localObject3 = OooO0Oo(localContext, localAppCompatDrawableManager, i12);
      localAppCompatTextHelper.OooO0oO = ((TintInfo)localObject3);
    }
    localTintTypedArray.OooOOOo();
    localObject3 = localAppCompatTextHelper.OooO00o.getTransformationMethod();
    boolean bool12 = localObject3 instanceof PasswordTransformationMethod;
    int i15 = 1;
    float f1 = 1.4E-45F;
    localTintTypedArray = null;
    boolean bool15;
    float f2;
    label534:
    int n;
    Object localObject8;
    int k;
    if (i1 != i5)
    {
      localObject7 = R.styleable.TextAppearance;
      localObject2 = TintTypedArray.OooOOO0(localContext, i1, (int[])localObject7);
      if (!bool12)
      {
        int i16 = R.styleable.TextAppearance_textAllCaps;
        boolean bool14 = ((TintTypedArray)localObject2).OooOO0o(i16);
        if (bool14)
        {
          int i17 = R.styleable.TextAppearance_textAllCaps;
          bool15 = ((TintTypedArray)localObject2).OooO00o(i17, false);
          i20 = i15;
          f2 = f1;
          break label534;
        }
      }
      bool15 = false;
      localObject7 = null;
      i20 = 0;
      localObject5 = null;
      f2 = 0.0F;
      localAppCompatTextHelper.OooOOOO(localContext, (TintTypedArray)localObject2);
      m = R.styleable.TextAppearance_textLocale;
      boolean bool2 = ((TintTypedArray)localObject2).OooOO0o(m);
      if (bool2)
      {
        n = R.styleable.TextAppearance_textLocale;
        localObject8 = ((TintTypedArray)localObject2).getString(n);
      }
      else
      {
        n = 0;
        localObject8 = null;
      }
      j = R.styleable.TextAppearance_fontVariationSettings;
      boolean bool1 = ((TintTypedArray)localObject2).OooOO0o(j);
      if (bool1)
      {
        k = R.styleable.TextAppearance_fontVariationSettings;
        localObject6 = ((TintTypedArray)localObject2).getString(k);
      }
      else
      {
        k = 0;
        localObject6 = null;
      }
      ((TintTypedArray)localObject2).OooOOOo();
    }
    else
    {
      bool15 = false;
      localObject7 = null;
      i20 = 0;
      localObject5 = null;
      f2 = 0.0F;
      n = 0;
      localObject8 = null;
      k = 0;
      localObject6 = null;
    }
    localObject2 = R.styleable.TextAppearance;
    localObject2 = TintTypedArray.OooOOOO(localContext, (AttributeSet)localObject1, (int[])localObject2, i, 0);
    boolean bool20;
    boolean bool16;
    if (!bool12)
    {
      int i24 = R.styleable.TextAppearance_textAllCaps;
      bool20 = ((TintTypedArray)localObject2).OooOO0o(i24);
      if (bool20)
      {
        int i18 = R.styleable.TextAppearance_textAllCaps;
        bool16 = ((TintTypedArray)localObject2).OooO00o(i18, false);
        break label730;
      }
    }
    i15 = i20;
    f1 = f2;
    label730:
    int i20 = R.styleable.TextAppearance_textLocale;
    boolean bool17 = ((TintTypedArray)localObject2).OooOO0o(i20);
    if (bool17)
    {
      i21 = R.styleable.TextAppearance_textLocale;
      localObject8 = ((TintTypedArray)localObject2).getString(i21);
    }
    int i21 = R.styleable.TextAppearance_fontVariationSettings;
    boolean bool18 = ((TintTypedArray)localObject2).OooOO0o(i21);
    if (bool18)
    {
      i22 = R.styleable.TextAppearance_fontVariationSettings;
      localObject6 = ((TintTypedArray)localObject2).getString(i22);
    }
    int i22 = R.styleable.TextAppearance_android_textSize;
    boolean bool19 = ((TintTypedArray)localObject2).OooOO0o(i22);
    int i23;
    if (bool19)
    {
      i23 = R.styleable.TextAppearance_android_textSize;
      i23 = ((TintTypedArray)localObject2).OooO0o0(i23, i5);
      if (i23 == 0)
      {
        localObject5 = localAppCompatTextHelper.OooO00o;
        bool20 = false;
        ((TextView)localObject5).setTextSize(0, 0.0F);
      }
    }
    localAppCompatTextHelper.OooOOOO(localContext, (TintTypedArray)localObject2);
    ((TintTypedArray)localObject2).OooOOOo();
    if ((!bool12) && (i15 != 0)) {
      localAppCompatTextHelper.setAllCaps(bool16);
    }
    localObject2 = localAppCompatTextHelper.OooOO0o;
    int i13;
    if (localObject2 != null)
    {
      i13 = localAppCompatTextHelper.OooOO0O;
      if (i13 == i5)
      {
        localObject3 = localAppCompatTextHelper.OooO00o;
        i15 = localAppCompatTextHelper.OooOO0;
        ((TextView)localObject3).setTypeface((Typeface)localObject2, i15);
      }
      else
      {
        localObject3 = localAppCompatTextHelper.OooO00o;
        ((TextView)localObject3).setTypeface((Typeface)localObject2);
      }
    }
    if (localObject6 != null)
    {
      localObject2 = localAppCompatTextHelper.OooO00o;
      AppCompatTextHelper.Api26Impl.OooO0Oo((TextView)localObject2, (String)localObject6);
    }
    if (localObject8 != null)
    {
      localObject2 = localAppCompatTextHelper.OooO00o;
      localObject3 = AppCompatTextHelper.Api24Impl.OooO00o((String)localObject8);
      AppCompatTextHelper.Api24Impl.OooO0O0((TextView)localObject2, (LocaleList)localObject3);
    }
    localObject2 = localAppCompatTextHelper.OooO;
    ((AppCompatTextViewAutoSizeHelper)localObject2).OooO((AttributeSet)localObject1, i);
    boolean bool3 = ViewUtils.OooO0O0;
    float f3;
    int i19;
    if (bool3)
    {
      localObject2 = localAppCompatTextHelper.OooO;
      i2 = ((AppCompatTextViewAutoSizeHelper)localObject2).getAutoSizeTextType();
      if (i2 != 0)
      {
        localObject2 = localAppCompatTextHelper.OooO.getAutoSizeTextAvailableSizes();
        i13 = localObject2.length;
        if (i13 > 0)
        {
          localObject3 = localAppCompatTextHelper.OooO00o;
          f3 = AppCompatTextHelper.Api26Impl.OooO00o((TextView)localObject3);
          i15 = -1082130432;
          f1 = -1.0F;
          boolean bool13 = f3 < f1;
          if (bool13)
          {
            localObject2 = localAppCompatTextHelper.OooO00o;
            localObject3 = localAppCompatTextHelper.OooO;
            i14 = ((AppCompatTextViewAutoSizeHelper)localObject3).getAutoSizeMinTextSize();
            localObject4 = localAppCompatTextHelper.OooO;
            i15 = ((AppCompatTextViewAutoSizeHelper)localObject4).getAutoSizeMaxTextSize();
            localObject7 = localAppCompatTextHelper.OooO;
            i19 = ((AppCompatTextViewAutoSizeHelper)localObject7).getAutoSizeStepGranularity();
            AppCompatTextHelper.Api26Impl.OooO0O0((TextView)localObject2, i14, i15, i19, 0);
          }
          else
          {
            localObject3 = localAppCompatTextHelper.OooO00o;
            AppCompatTextHelper.Api26Impl.OooO0OO((TextView)localObject3, (int[])localObject2, 0);
          }
        }
      }
    }
    localObject2 = R.styleable.AppCompatTextView;
    localObject1 = TintTypedArray.OooOOO(localContext, (AttributeSet)localObject1, (int[])localObject2);
    int i2 = R.styleable.AppCompatTextView_drawableLeftCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject3 = localObject2;
    }
    else
    {
      i14 = 0;
      localObject3 = null;
      f3 = 0.0F;
    }
    i2 = R.styleable.AppCompatTextView_drawableTopCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject4 = localObject2;
    }
    else
    {
      i15 = 0;
      localObject4 = null;
      f1 = 0.0F;
    }
    i2 = R.styleable.AppCompatTextView_drawableRightCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject7 = localObject2;
    }
    else
    {
      i19 = 0;
      localObject7 = null;
    }
    i2 = R.styleable.AppCompatTextView_drawableBottomCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject5 = localObject2;
    }
    else
    {
      i23 = 0;
      localObject5 = null;
      f2 = 0.0F;
    }
    i2 = R.styleable.AppCompatTextView_drawableStartCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject8 = localObject2;
    }
    else
    {
      n = 0;
      localObject8 = null;
    }
    i2 = R.styleable.AppCompatTextView_drawableEndCompat;
    i2 = ((TintTypedArray)localObject1).OooOO0O(i2, i5);
    if (i2 != i5)
    {
      localObject2 = localAppCompatDrawableManager.OooO0O0(localContext, i2);
      localObject6 = localObject2;
    }
    else
    {
      k = 0;
      localObject6 = null;
    }
    localObject2 = this;
    OooOOO0((Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject7, (Drawable)localObject5, (Drawable)localObject8, (Drawable)localObject6);
    i2 = R.styleable.AppCompatTextView_drawableTint;
    boolean bool4 = ((TintTypedArray)localObject1).OooOO0o(i2);
    if (bool4)
    {
      i3 = R.styleable.AppCompatTextView_drawableTint;
      localObject2 = ((TintTypedArray)localObject1).getColorStateList(i3);
      localObject3 = localAppCompatTextHelper.OooO00o;
      TextViewCompat.OooO0oO((TextView)localObject3, (ColorStateList)localObject2);
    }
    int i3 = R.styleable.AppCompatTextView_drawableTintMode;
    boolean bool5 = ((TintTypedArray)localObject1).OooOO0o(i3);
    if (bool5)
    {
      i4 = R.styleable.AppCompatTextView_drawableTintMode;
      i4 = ((TintTypedArray)localObject1).OooO0oo(i4, i5);
      localObject2 = DrawableUtils.OooO0o0(i4, null);
      localObject3 = localAppCompatTextHelper.OooO00o;
      TextViewCompat.OooO0oo((TextView)localObject3, (PorterDuff.Mode)localObject2);
    }
    int i4 = R.styleable.AppCompatTextView_firstBaselineToTopHeight;
    i4 = ((TintTypedArray)localObject1).OooO0o0(i4, i5);
    int i14 = R.styleable.AppCompatTextView_lastBaselineToBottomHeight;
    i14 = ((TintTypedArray)localObject1).OooO0o0(i14, i5);
    i15 = R.styleable.AppCompatTextView_lineHeight;
    i15 = ((TintTypedArray)localObject1).OooO0o0(i15, i5);
    ((TintTypedArray)localObject1).OooOOOo();
    if (i4 != i5)
    {
      localObject7 = localAppCompatTextHelper.OooO00o;
      TextViewCompat.OooOO0((TextView)localObject7, i4);
    }
    if (i14 != i5)
    {
      localObject2 = localAppCompatTextHelper.OooO00o;
      TextViewCompat.OooOO0O((TextView)localObject2, i14);
    }
    if (i15 != i5)
    {
      localObject2 = localAppCompatTextHelper.OooO00o;
      TextViewCompat.OooOO0o((TextView)localObject2, i15);
    }
  }
  
  public void OooO0oO(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = ViewUtils.OooO0O0;
    if (!paramBoolean) {
      OooO0OO();
    }
  }
  
  public void OooO0oo()
  {
    OooO0O0();
  }
  
  public void OooOO0(TextView paramTextView, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if ((i < j) && (paramInputConnection != null))
    {
      paramTextView = paramTextView.getText();
      EditorInfoCompat.OooO0Oo(paramEditorInfo, paramTextView);
    }
  }
  
  public void OooOO0O(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO.OooOO0(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void OooOO0o(int[] paramArrayOfInt, int paramInt)
  {
    this.OooO.OooOO0O(paramArrayOfInt, paramInt);
  }
  
  public final void OooOOO()
  {
    TintInfo localTintInfo = this.OooO0oo;
    this.OooO0O0 = localTintInfo;
    this.OooO0OO = localTintInfo;
    this.OooO0Oo = localTintInfo;
    this.OooO0o0 = localTintInfo;
    this.OooO0o = localTintInfo;
    this.OooO0oO = localTintInfo;
  }
  
  public final void OooOOO0(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4, Drawable paramDrawable5, Drawable paramDrawable6)
  {
    int i = 3;
    int j = 1;
    int k = 2;
    if ((paramDrawable5 == null) && (paramDrawable6 == null))
    {
      if ((paramDrawable1 != null) || (paramDrawable2 != null) || (paramDrawable3 != null) || (paramDrawable4 != null))
      {
        paramDrawable5 = AppCompatTextHelper.Api17Impl.OooO00o(this.OooO00o);
        paramDrawable6 = paramDrawable5[0];
        if (paramDrawable6 == null)
        {
          Object localObject = paramDrawable5[k];
          if (localObject == null)
          {
            paramDrawable5 = this.OooO00o.getCompoundDrawables();
            paramDrawable6 = this.OooO00o;
            if (paramDrawable1 == null) {
              paramDrawable1 = paramDrawable5[0];
            }
            if (paramDrawable2 == null) {
              paramDrawable2 = paramDrawable5[j];
            }
            if (paramDrawable3 == null) {
              paramDrawable3 = paramDrawable5[k];
            }
            if (paramDrawable4 == null) {
              paramDrawable4 = paramDrawable5[i];
            }
            paramDrawable6.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
            return;
          }
        }
        paramDrawable1 = this.OooO00o;
        if (paramDrawable2 == null) {
          paramDrawable2 = paramDrawable5[j];
        }
        paramDrawable3 = paramDrawable5[k];
        if (paramDrawable4 == null) {
          paramDrawable4 = paramDrawable5[i];
        }
        AppCompatTextHelper.Api17Impl.OooO0O0(paramDrawable1, paramDrawable6, paramDrawable2, paramDrawable3, paramDrawable4);
      }
    }
    else
    {
      paramDrawable1 = AppCompatTextHelper.Api17Impl.OooO00o(this.OooO00o);
      paramDrawable3 = this.OooO00o;
      if (paramDrawable5 == null) {
        paramDrawable5 = paramDrawable1[0];
      }
      if (paramDrawable2 == null) {
        paramDrawable2 = paramDrawable1[j];
      }
      if (paramDrawable6 == null) {
        paramDrawable6 = paramDrawable1[k];
      }
      if (paramDrawable4 == null) {
        paramDrawable4 = paramDrawable1[i];
      }
      AppCompatTextHelper.Api17Impl.OooO0O0(paramDrawable3, paramDrawable5, paramDrawable2, paramDrawable6, paramDrawable4);
    }
  }
  
  public final void OooOOOO(Context paramContext, TintTypedArray paramTintTypedArray)
  {
    int i = R.styleable.TextAppearance_android_textStyle;
    int n = this.OooOO0;
    i = paramTintTypedArray.OooO0oo(i, n);
    this.OooOO0 = i;
    i = R.styleable.TextAppearance_android_textFontWeight;
    n = -1;
    i = paramTintTypedArray.OooO0oo(i, n);
    this.OooOO0O = i;
    int i1 = 2;
    boolean bool4 = false;
    if (i != n)
    {
      i = this.OooOO0 & i1 | 0x0;
      this.OooOO0 = i;
    }
    i = R.styleable.TextAppearance_android_fontFamily;
    boolean bool1 = paramTintTypedArray.OooOO0o(i);
    int i2 = 1;
    int i6;
    if (!bool1)
    {
      int j = R.styleable.TextAppearance_fontFamily;
      boolean bool2 = paramTintTypedArray.OooOO0o(j);
      if (!bool2)
      {
        int i3 = R.styleable.TextAppearance_android_typeface;
        boolean bool5 = paramTintTypedArray.OooOO0o(i3);
        if (bool5)
        {
          this.OooOOO0 = false;
          int i4 = R.styleable.TextAppearance_android_typeface;
          i4 = paramTintTypedArray.OooO0oo(i4, i2);
          if (i4 != i2)
          {
            if (i4 != i1)
            {
              i6 = 3;
              if (i4 != i6) {
                break label192;
              }
              paramContext = Typeface.MONOSPACE;
            }
            else
            {
              paramContext = Typeface.SERIF;
            }
          }
          else {
            paramContext = Typeface.SANS_SERIF;
          }
          this.OooOO0o = paramContext;
        }
        label192:
        return;
      }
    }
    this.OooOO0o = null;
    int k = R.styleable.TextAppearance_fontFamily;
    boolean bool3 = paramTintTypedArray.OooOO0o(k);
    int m;
    if (bool3) {
      m = R.styleable.TextAppearance_fontFamily;
    } else {
      m = R.styleable.TextAppearance_android_fontFamily;
    }
    int i7 = this.OooOO0O;
    int i8 = this.OooOO0;
    boolean bool6 = paramContext.isRestricted();
    Object localObject;
    if (!bool6)
    {
      paramContext = new java/lang/ref/WeakReference;
      localObject = this.OooO00o;
      paramContext.<init>(localObject);
      localObject = new androidx/appcompat/widget/AppCompatTextHelper$1;
      ((AppCompatTextHelper.1)localObject).<init>(this, i7, i8, paramContext);
    }
    try
    {
      int i5 = this.OooOO0;
      paramContext = paramTintTypedArray.OooO0oO(m, i5, (ResourcesCompat.FontCallback)localObject);
      if (paramContext != null)
      {
        i7 = this.OooOO0O;
        if (i7 != n)
        {
          paramContext = Typeface.create(paramContext, 0);
          i7 = this.OooOO0O;
          i8 = this.OooOO0 & i1;
          if (i8 != 0) {
            i8 = i2;
          } else {
            i8 = 0;
          }
          paramContext = AppCompatTextHelper.Api28Impl.OooO00o(paramContext, i7, i8);
        }
        this.OooOO0o = paramContext;
      }
      paramContext = this.OooOO0o;
      if (paramContext == null)
      {
        i5 = i2;
      }
      else
      {
        i5 = 0;
        paramContext = null;
      }
      this.OooOOO0 = i5;
    }
    catch (UnsupportedOperationException|Resources.NotFoundException localUnsupportedOperationException)
    {
      label388:
      break label388;
    }
    paramContext = this.OooOO0o;
    if (paramContext == null)
    {
      paramContext = paramTintTypedArray.getString(m);
      if (paramContext != null)
      {
        i6 = this.OooOO0O;
        if (i6 != n)
        {
          paramContext = Typeface.create(paramContext, 0);
          i6 = this.OooOO0O;
          m = this.OooOO0 & i1;
          if (m != 0) {
            bool4 = i2;
          }
          paramContext = AppCompatTextHelper.Api28Impl.OooO00o(paramContext, i6, bool4);
        }
        else
        {
          i6 = this.OooOO0;
          paramContext = Typeface.create(paramContext, i6);
        }
        this.OooOO0o = paramContext;
      }
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    return this.OooO.getAutoSizeMaxTextSize();
  }
  
  public int getAutoSizeMinTextSize()
  {
    return this.OooO.getAutoSizeMinTextSize();
  }
  
  public int getAutoSizeStepGranularity()
  {
    return this.OooO.getAutoSizeStepGranularity();
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    return this.OooO.getAutoSizeTextAvailableSizes();
  }
  
  public int getAutoSizeTextType()
  {
    return this.OooO.getAutoSizeTextType();
  }
  
  public ColorStateList getCompoundDrawableTintList()
  {
    Object localObject = this.OooO0oo;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO00o;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getCompoundDrawableTintMode()
  {
    Object localObject = this.OooO0oo;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO0O0;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public boolean isAutoSizeEnabled()
  {
    return this.OooO.isAutoSizeEnabled();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    this.OooO00o.setAllCaps(paramBoolean);
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    this.OooO.setAutoSizeTextTypeWithDefaults(paramInt);
  }
  
  public void setCompoundDrawableTintList(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo = this.OooO0oo;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0oo = localTintInfo;
    }
    localTintInfo = this.OooO0oo;
    localTintInfo.OooO00o = paramColorStateList;
    boolean bool;
    if (paramColorStateList != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramColorStateList = null;
    }
    localTintInfo.OooO0Oo = bool;
    OooOOO();
  }
  
  public void setCompoundDrawableTintMode(PorterDuff.Mode paramMode)
  {
    TintInfo localTintInfo = this.OooO0oo;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0oo = localTintInfo;
    }
    localTintInfo = this.OooO0oo;
    localTintInfo.OooO0O0 = paramMode;
    boolean bool;
    if (paramMode != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramMode = null;
    }
    localTintInfo.OooO0OO = bool;
    OooOOO();
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = ViewUtils.OooO0O0;
    if (!bool)
    {
      bool = isAutoSizeEnabled();
      if (!bool) {
        setTextSizeInternal(paramInt, paramFloat);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper
 * JD-Core Version:    0.7.0.1
 */