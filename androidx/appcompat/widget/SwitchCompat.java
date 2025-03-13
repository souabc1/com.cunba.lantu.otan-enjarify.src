package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
  implements EmojiCompatConfigurationView
{
  private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
  private static final int[] CHECKED_STATE_SET = { 16842912 };
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private static final int THUMB_ANIMATION_DURATION = 250;
  private static final Property THUMB_POS;
  private static final int TOUCH_MODE_DOWN = 1;
  private static final int TOUCH_MODE_DRAGGING = 2;
  private static final int TOUCH_MODE_IDLE;
  private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
  private SwitchCompat.EmojiCompatInitCallback mEmojiCompatInitCallback;
  private boolean mEnforceSwitchWidth;
  private boolean mHasThumbTint;
  private boolean mHasThumbTintMode;
  private boolean mHasTrackTint;
  private boolean mHasTrackTintMode;
  private int mMinFlingVelocity;
  private Layout mOffLayout;
  private Layout mOnLayout;
  ObjectAnimator mPositionAnimator;
  private boolean mShowText;
  private boolean mSplitTrack;
  private int mSwitchBottom;
  private int mSwitchHeight;
  private int mSwitchLeft;
  private int mSwitchMinWidth;
  private int mSwitchPadding;
  private int mSwitchRight;
  private int mSwitchTop;
  private TransformationMethod mSwitchTransformationMethod;
  private int mSwitchWidth;
  private final Rect mTempRect;
  private ColorStateList mTextColors;
  private final AppCompatTextHelper mTextHelper;
  private CharSequence mTextOff;
  private CharSequence mTextOffTransformed;
  private CharSequence mTextOn;
  private CharSequence mTextOnTransformed;
  private final TextPaint mTextPaint;
  private Drawable mThumbDrawable;
  float mThumbPosition;
  private int mThumbTextPadding;
  private ColorStateList mThumbTintList;
  private PorterDuff.Mode mThumbTintMode;
  private int mThumbWidth;
  private int mTouchMode;
  private int mTouchSlop;
  private float mTouchX;
  private float mTouchY;
  private Drawable mTrackDrawable;
  private ColorStateList mTrackTintList;
  private PorterDuff.Mode mTrackTintMode;
  private VelocityTracker mVelocityTracker;
  
  static
  {
    SwitchCompat.1 local1 = new androidx/appcompat/widget/SwitchCompat$1;
    local1.<init>(Float.class, "thumbPos");
    THUMB_POS = local1;
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    boolean bool1 = false;
    Object localObject1 = null;
    this.mThumbTintList = null;
    this.mThumbTintMode = null;
    this.mHasThumbTint = false;
    this.mHasThumbTintMode = false;
    this.mTrackTintList = null;
    this.mTrackTintMode = null;
    this.mHasTrackTint = false;
    this.mHasTrackTintMode = false;
    VelocityTracker localVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker = localVelocityTracker;
    int j = 1;
    this.mEnforceSwitchWidth = j;
    Object localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    this.mTempRect = ((Rect)localObject2);
    localObject2 = getContext();
    ThemeUtils.OooO00o(this, (Context)localObject2);
    localObject2 = new android/text/TextPaint;
    ((TextPaint)localObject2).<init>(j);
    this.mTextPaint = ((TextPaint)localObject2);
    float f = getResources().getDisplayMetrics().density;
    ((TextPaint)localObject2).density = f;
    localObject2 = R.styleable.SwitchCompat;
    localObject2 = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, (int[])localObject2, paramInt, 0);
    Object localObject3 = R.styleable.SwitchCompat;
    TypedArray localTypedArray = ((TintTypedArray)localObject2).getWrappedTypeArray();
    Object localObject4 = this;
    ViewCompat.o00ooo(this, paramContext, (int[])localObject3, paramAttributeSet, localTypedArray, paramInt, 0);
    int k = R.styleable.SwitchCompat_android_thumb;
    localObject4 = ((TintTypedArray)localObject2).getDrawable(k);
    this.mThumbDrawable = ((Drawable)localObject4);
    if (localObject4 != null) {
      ((Drawable)localObject4).setCallback(this);
    }
    k = R.styleable.SwitchCompat_track;
    localObject4 = ((TintTypedArray)localObject2).getDrawable(k);
    this.mTrackDrawable = ((Drawable)localObject4);
    if (localObject4 != null) {
      ((Drawable)localObject4).setCallback(this);
    }
    k = R.styleable.SwitchCompat_android_textOn;
    localObject4 = ((TintTypedArray)localObject2).getText(k);
    setTextOnInternal((CharSequence)localObject4);
    k = R.styleable.SwitchCompat_android_textOff;
    localObject4 = ((TintTypedArray)localObject2).getText(k);
    setTextOffInternal((CharSequence)localObject4);
    k = R.styleable.SwitchCompat_showText;
    boolean bool2 = ((TintTypedArray)localObject2).OooO00o(k, j);
    this.mShowText = bool2;
    int m = R.styleable.SwitchCompat_thumbTextPadding;
    m = ((TintTypedArray)localObject2).OooO0o0(m, 0);
    this.mThumbTextPadding = m;
    m = R.styleable.SwitchCompat_switchMinWidth;
    m = ((TintTypedArray)localObject2).OooO0o0(m, 0);
    this.mSwitchMinWidth = m;
    m = R.styleable.SwitchCompat_switchPadding;
    m = ((TintTypedArray)localObject2).OooO0o0(m, 0);
    this.mSwitchPadding = m;
    m = R.styleable.SwitchCompat_splitTrack;
    boolean bool3 = ((TintTypedArray)localObject2).OooO00o(m, false);
    this.mSplitTrack = bool3;
    int n = R.styleable.SwitchCompat_thumbTint;
    localObject4 = ((TintTypedArray)localObject2).getColorStateList(n);
    if (localObject4 != null)
    {
      this.mThumbTintList = ((ColorStateList)localObject4);
      this.mHasThumbTint = j;
    }
    n = R.styleable.SwitchCompat_thumbTintMode;
    int i2 = -1;
    n = ((TintTypedArray)localObject2).OooO0oo(n, i2);
    localObject4 = DrawableUtils.OooO0o0(n, null);
    localObject3 = this.mThumbTintMode;
    if (localObject3 != localObject4)
    {
      this.mThumbTintMode = ((PorterDuff.Mode)localObject4);
      this.mHasThumbTintMode = j;
    }
    boolean bool4 = this.mHasThumbTint;
    if (!bool4)
    {
      bool4 = this.mHasThumbTintMode;
      if (!bool4) {}
    }
    else
    {
      OooO0O0();
    }
    int i1 = R.styleable.SwitchCompat_trackTint;
    localObject4 = ((TintTypedArray)localObject2).getColorStateList(i1);
    if (localObject4 != null)
    {
      this.mTrackTintList = ((ColorStateList)localObject4);
      this.mHasTrackTint = j;
    }
    i1 = R.styleable.SwitchCompat_trackTintMode;
    i1 = ((TintTypedArray)localObject2).OooO0oo(i1, i2);
    localObject1 = DrawableUtils.OooO0o0(i1, null);
    localObject4 = this.mTrackTintMode;
    if (localObject4 != localObject1)
    {
      this.mTrackTintMode = ((PorterDuff.Mode)localObject1);
      this.mHasTrackTintMode = j;
    }
    bool1 = this.mHasTrackTint;
    if (!bool1)
    {
      bool1 = this.mHasTrackTintMode;
      if (!bool1) {}
    }
    else
    {
      OooO0OO();
    }
    int i = R.styleable.SwitchCompat_switchTextAppearance;
    i = ((TintTypedArray)localObject2).OooOO0O(i, 0);
    if (i != 0) {
      setSwitchTextAppearance(paramContext, i);
    }
    localObject1 = new androidx/appcompat/widget/AppCompatTextHelper;
    ((AppCompatTextHelper)localObject1).<init>(this);
    this.mTextHelper = ((AppCompatTextHelper)localObject1);
    ((AppCompatTextHelper)localObject1).OooO0o0(paramAttributeSet, paramInt);
    ((TintTypedArray)localObject2).OooOOOo();
    paramContext = ViewConfiguration.get(paramContext);
    i = paramContext.getScaledTouchSlop();
    this.mTouchSlop = i;
    int i3 = paramContext.getScaledMinimumFlingVelocity();
    this.mMinFlingVelocity = i3;
    getEmojiTextViewHelper().OooO0O0(paramAttributeSet, paramInt);
    refreshDrawableState();
    boolean bool5 = isChecked();
    setChecked(bool5);
  }
  
  public static float OooO0o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = paramFloat1 < paramFloat2;
    if (bool1)
    {
      paramFloat1 = paramFloat2;
    }
    else
    {
      boolean bool2 = paramFloat1 < paramFloat3;
      if (bool2) {
        paramFloat1 = paramFloat3;
      }
    }
    return paramFloat1;
  }
  
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    AppCompatEmojiTextHelper localAppCompatEmojiTextHelper = this.mAppCompatEmojiTextHelper;
    if (localAppCompatEmojiTextHelper == null)
    {
      localAppCompatEmojiTextHelper = new androidx/appcompat/widget/AppCompatEmojiTextHelper;
      localAppCompatEmojiTextHelper.<init>(this);
      this.mAppCompatEmojiTextHelper = localAppCompatEmojiTextHelper;
    }
    return this.mAppCompatEmojiTextHelper;
  }
  
  private boolean getTargetCheckedState()
  {
    float f1 = this.mThumbPosition;
    float f2 = 0.5F;
    boolean bool = f1 < f2;
    if (bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    return bool;
  }
  
  private int getThumbOffset()
  {
    boolean bool = ViewUtils.OooO0O0(this);
    float f2;
    if (bool)
    {
      int i = 1065353216;
      f1 = this.mThumbPosition;
      f2 = 1.0F - f1;
    }
    else
    {
      f2 = this.mThumbPosition;
    }
    float f1 = getThumbScrollRange();
    return (int)(f2 * f1 + 0.5F);
  }
  
  private int getThumbScrollRange()
  {
    Object localObject = this.mTrackDrawable;
    if (localObject != null)
    {
      Rect localRect = this.mTempRect;
      ((Drawable)localObject).getPadding(localRect);
      localObject = this.mThumbDrawable;
      if (localObject != null) {
        localObject = DrawableUtils.OooO0Oo((Drawable)localObject);
      } else {
        localObject = DrawableUtils.OooO0OO;
      }
      int i = this.mSwitchWidth;
      int j = this.mThumbWidth;
      i -= j;
      j = localRect.left;
      i -= j;
      int k = localRect.right;
      i -= k;
      k = ((Rect)localObject).left;
      i -= k;
      int m = ((Rect)localObject).right;
      return i - m;
    }
    return 0;
  }
  
  private void setSwitchTypefaceByIndex(int paramInt1, int paramInt2)
  {
    int i = 1;
    Typeface localTypeface;
    if (paramInt1 != i)
    {
      i = 2;
      if (paramInt1 != i)
      {
        i = 3;
        if (paramInt1 != i)
        {
          paramInt1 = 0;
          localTypeface = null;
        }
        else
        {
          localTypeface = Typeface.MONOSPACE;
        }
      }
      else
      {
        localTypeface = Typeface.SERIF;
      }
    }
    else
    {
      localTypeface = Typeface.SANS_SERIF;
    }
    setSwitchTypeface(localTypeface, paramInt2);
  }
  
  private void setTextOffInternal(CharSequence paramCharSequence)
  {
    this.mTextOff = paramCharSequence;
    paramCharSequence = OooO0oO(paramCharSequence);
    this.mTextOffTransformed = paramCharSequence;
    paramCharSequence = null;
    this.mOffLayout = null;
    boolean bool = this.mShowText;
    if (bool) {
      OooOO0o();
    }
  }
  
  private void setTextOnInternal(CharSequence paramCharSequence)
  {
    this.mTextOn = paramCharSequence;
    paramCharSequence = OooO0oO(paramCharSequence);
    this.mTextOnTransformed = paramCharSequence;
    paramCharSequence = null;
    this.mOnLayout = null;
    boolean bool = this.mShowText;
    if (bool) {
      OooOO0o();
    }
  }
  
  public final Layout OooO(CharSequence paramCharSequence)
  {
    StaticLayout localStaticLayout = new android/text/StaticLayout;
    TextPaint localTextPaint = this.mTextPaint;
    float f;
    int i;
    if (paramCharSequence != null)
    {
      f = Layout.getDesiredWidth(paramCharSequence, localTextPaint);
      double d = Math.ceil(f);
      i = (int)d;
    }
    else
    {
      i = 0;
      f = 0.0F;
    }
    Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
    localStaticLayout.<init>(paramCharSequence, localTextPaint, i, localAlignment, 1.0F, 0.0F, true);
    return localStaticLayout;
  }
  
  public final void OooO00o(boolean paramBoolean)
  {
    float f;
    if (paramBoolean)
    {
      paramBoolean = 1065353216;
      f = 1.0F;
    }
    else
    {
      paramBoolean = false;
      f = 0.0F;
      localObjectAnimator = null;
    }
    Property localProperty = THUMB_POS;
    boolean bool = true;
    float[] arrayOfFloat = new float[bool];
    arrayOfFloat[0] = f;
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, localProperty, arrayOfFloat);
    this.mPositionAnimator = localObjectAnimator;
    localObjectAnimator.setDuration(250L);
    SwitchCompat.Api18Impl.OooO00o(this.mPositionAnimator, bool);
    this.mPositionAnimator.start();
  }
  
  public final void OooO0O0()
  {
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null)
    {
      boolean bool1 = this.mHasThumbTint;
      if (!bool1)
      {
        bool1 = this.mHasThumbTintMode;
        if (!bool1) {}
      }
      else
      {
        localDrawable = DrawableCompat.OooOOo(localDrawable).mutate();
        this.mThumbDrawable = localDrawable;
        bool1 = this.mHasThumbTint;
        Object localObject;
        if (bool1)
        {
          localObject = this.mThumbTintList;
          DrawableCompat.OooOOOO(localDrawable, (ColorStateList)localObject);
        }
        boolean bool2 = this.mHasThumbTintMode;
        if (bool2)
        {
          localDrawable = this.mThumbDrawable;
          localObject = this.mThumbTintMode;
          DrawableCompat.OooOOOo(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.mThumbDrawable;
        bool2 = localDrawable.isStateful();
        if (bool2)
        {
          localDrawable = this.mThumbDrawable;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  public final void OooO0OO()
  {
    Drawable localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      boolean bool1 = this.mHasTrackTint;
      if (!bool1)
      {
        bool1 = this.mHasTrackTintMode;
        if (!bool1) {}
      }
      else
      {
        localDrawable = DrawableCompat.OooOOo(localDrawable).mutate();
        this.mTrackDrawable = localDrawable;
        bool1 = this.mHasTrackTint;
        Object localObject;
        if (bool1)
        {
          localObject = this.mTrackTintList;
          DrawableCompat.OooOOOO(localDrawable, (ColorStateList)localObject);
        }
        boolean bool2 = this.mHasTrackTintMode;
        if (bool2)
        {
          localDrawable = this.mTrackDrawable;
          localObject = this.mTrackTintMode;
          DrawableCompat.OooOOOo(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.mTrackDrawable;
        bool2 = localDrawable.isStateful();
        if (bool2)
        {
          localDrawable = this.mTrackDrawable;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  public final void OooO0Oo()
  {
    ObjectAnimator localObjectAnimator = this.mPositionAnimator;
    if (localObjectAnimator != null) {
      localObjectAnimator.cancel();
    }
  }
  
  public final void OooO0o0(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  public final CharSequence OooO0oO(CharSequence paramCharSequence)
  {
    Object localObject = getEmojiTextViewHelper();
    TransformationMethod localTransformationMethod = this.mSwitchTransformationMethod;
    localObject = ((AppCompatEmojiTextHelper)localObject).OooO0OO(localTransformationMethod);
    if (localObject != null) {
      paramCharSequence = ((TransformationMethod)localObject).getTransformation(paramCharSequence, this);
    }
    return paramCharSequence;
  }
  
  public final boolean OooO0oo(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable1 = this.mThumbDrawable;
    boolean bool1 = false;
    if (localDrawable1 == null) {
      return false;
    }
    int i = getThumbOffset();
    Drawable localDrawable2 = this.mThumbDrawable;
    Rect localRect1 = this.mTempRect;
    localDrawable2.getPadding(localRect1);
    int j = this.mSwitchTop;
    int k = this.mTouchSlop;
    j -= k;
    int m = this.mSwitchLeft + i - k;
    i = this.mThumbWidth + m;
    Rect localRect2 = this.mTempRect;
    int n = localRect2.left;
    i += n;
    int i1 = localRect2.right;
    i = i + i1 + k;
    i1 = this.mSwitchBottom + k;
    float f1 = m;
    boolean bool2 = paramFloat1 < f1;
    if (bool2)
    {
      float f2 = i;
      boolean bool3 = paramFloat1 < f2;
      if (bool3)
      {
        paramFloat1 = j;
        bool3 = paramFloat2 < paramFloat1;
        if (bool3)
        {
          paramFloat1 = i1;
          bool3 = paramFloat2 < paramFloat1;
          if (bool3) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final void OooOO0()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      Object localObject = this.mTextOff;
      if (localObject == null)
      {
        localObject = getResources();
        j = R.string.abc_capital_off;
        localObject = ((Resources)localObject).getString(j);
      }
      ViewCompat.o0000Ooo(this, (CharSequence)localObject);
    }
  }
  
  public final void OooOO0O()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      Object localObject = this.mTextOn;
      if (localObject == null)
      {
        localObject = getResources();
        j = R.string.abc_capital_on;
        localObject = ((Resources)localObject).getString(j);
      }
      ViewCompat.o0000Ooo(this, (CharSequence)localObject);
    }
  }
  
  public final void OooOO0o()
  {
    Object localObject = this.mEmojiCompatInitCallback;
    if (localObject == null)
    {
      localObject = this.mAppCompatEmojiTextHelper;
      boolean bool = ((AppCompatEmojiTextHelper)localObject).isEnabled();
      if (bool)
      {
        bool = EmojiCompat.isConfigured();
        if (bool)
        {
          localObject = EmojiCompat.get();
          int i = ((EmojiCompat)localObject).getLoadState();
          int j = 3;
          if ((i == j) || (i == 0))
          {
            SwitchCompat.EmojiCompatInitCallback localEmojiCompatInitCallback = new androidx/appcompat/widget/SwitchCompat$EmojiCompatInitCallback;
            localEmojiCompatInitCallback.<init>(this);
            this.mEmojiCompatInitCallback = localEmojiCompatInitCallback;
            ((EmojiCompat)localObject).OooOOO0(localEmojiCompatInitCallback);
          }
        }
      }
    }
  }
  
  public final void OooOOO0(MotionEvent paramMotionEvent)
  {
    this.mTouchMode = 0;
    int i = paramMotionEvent.getAction();
    int j = 1;
    float f1 = 1.4E-45F;
    if (i == j)
    {
      bool1 = isEnabled();
      if (bool1)
      {
        bool1 = j;
        f2 = f1;
        break label47;
      }
    }
    boolean bool1 = false;
    VelocityTracker localVelocityTracker = null;
    float f2 = 0.0F;
    label47:
    boolean bool3 = isChecked();
    boolean bool2;
    if (bool1)
    {
      this.mVelocityTracker.computeCurrentVelocity(1000);
      localVelocityTracker = this.mVelocityTracker;
      f2 = localVelocityTracker.getXVelocity();
      float f3 = Math.abs(f2);
      int k = this.mMinFlingVelocity;
      float f4 = k;
      boolean bool4 = f3 < f4;
      if (bool4)
      {
        bool4 = ViewUtils.OooO0O0(this);
        k = 0;
        f4 = 0.0F;
        if (bool4)
        {
          bool1 = f2 < 0.0F;
          if (bool1) {
            break label170;
          }
        }
        else
        {
          bool1 = f2 < 0.0F;
          if (bool1) {
            break label170;
          }
        }
        j = 0;
        f1 = 0.0F;
      }
      else
      {
        bool2 = getTargetCheckedState();
      }
    }
    else
    {
      bool2 = bool3;
    }
    label170:
    if (bool2 != bool3) {
      playSoundEffect(0);
    }
    setChecked(bool2);
    OooO0o0(paramMotionEvent);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = this.mTempRect;
    int i = this.mSwitchLeft;
    int j = this.mSwitchTop;
    int k = this.mSwitchRight;
    int m = this.mSwitchBottom;
    int n = getThumbOffset() + i;
    Object localObject2 = this.mThumbDrawable;
    if (localObject2 != null) {
      localObject2 = DrawableUtils.OooO0Oo((Drawable)localObject2);
    } else {
      localObject2 = DrawableUtils.OooO0OO;
    }
    Drawable localDrawable1 = this.mTrackDrawable;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding((Rect)localObject1);
      int i1 = ((Rect)localObject1).left;
      n += i1;
      if (localObject2 != null)
      {
        int i2 = ((Rect)localObject2).left;
        if (i2 > i1)
        {
          i2 -= i1;
          i += i2;
        }
        i1 = ((Rect)localObject2).top;
        i2 = ((Rect)localObject1).top;
        if (i1 > i2) {
          i1 = i1 - i2 + j;
        } else {
          i1 = j;
        }
        i2 = ((Rect)localObject2).right;
        int i3 = ((Rect)localObject1).right;
        if (i2 > i3)
        {
          i2 -= i3;
          k -= i2;
        }
        i4 = ((Rect)localObject2).bottom;
        i2 = ((Rect)localObject1).bottom;
        if (i4 > i2)
        {
          i4 -= i2;
          i4 = m - i4;
          break label240;
        }
      }
      else
      {
        i1 = j;
      }
      int i4 = m;
      label240:
      Drawable localDrawable2 = this.mTrackDrawable;
      localDrawable2.setBounds(i, i1, k, i4);
    }
    Drawable localDrawable3 = this.mThumbDrawable;
    if (localDrawable3 != null)
    {
      localDrawable3.getPadding((Rect)localObject1);
      i = ((Rect)localObject1).left;
      i = n - i;
      k = this.mThumbWidth;
      n += k;
      int i5 = ((Rect)localObject1).right;
      n += i5;
      this.mThumbDrawable.setBounds(i, j, n, m);
      localObject1 = getBackground();
      if (localObject1 != null) {
        DrawableCompat.OooOO0o((Drawable)localObject1, i, j, n, m);
      }
    }
    super.draw(paramCanvas);
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null) {
      DrawableCompat.OooOO0O(localDrawable, paramFloat1, paramFloat2);
    }
    localDrawable = this.mTrackDrawable;
    if (localDrawable != null) {
      DrawableCompat.OooOO0O(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = this.mThumbDrawable;
    boolean bool1 = false;
    boolean bool2;
    if (localDrawable != null)
    {
      bool2 = localDrawable.isStateful();
      if (bool2)
      {
        boolean bool3 = localDrawable.setState(arrayOfInt);
        bool1 = false | bool3;
      }
    }
    localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      bool2 = localDrawable.isStateful();
      if (bool2)
      {
        boolean bool4 = localDrawable.setState(arrayOfInt);
        bool1 |= bool4;
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    boolean bool1 = ViewUtils.OooO0O0(this);
    if (!bool1) {
      return super.getCompoundPaddingLeft();
    }
    int i = super.getCompoundPaddingLeft();
    int j = this.mSwitchWidth;
    i += j;
    CharSequence localCharSequence = getText();
    boolean bool2 = TextUtils.isEmpty(localCharSequence);
    if (!bool2)
    {
      int k = this.mSwitchPadding;
      i += k;
    }
    return i;
  }
  
  public int getCompoundPaddingRight()
  {
    boolean bool1 = ViewUtils.OooO0O0(this);
    if (bool1) {
      return super.getCompoundPaddingRight();
    }
    int i = super.getCompoundPaddingRight();
    int j = this.mSwitchWidth;
    i += j;
    CharSequence localCharSequence = getText();
    boolean bool2 = TextUtils.isEmpty(localCharSequence);
    if (!bool2)
    {
      int k = this.mSwitchPadding;
      i += k;
    }
    return i;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.OooOOOo(super.getCustomSelectionActionModeCallback());
  }
  
  public boolean getShowText()
  {
    return this.mShowText;
  }
  
  public boolean getSplitTrack()
  {
    return this.mSplitTrack;
  }
  
  public int getSwitchMinWidth()
  {
    return this.mSwitchMinWidth;
  }
  
  public int getSwitchPadding()
  {
    return this.mSwitchPadding;
  }
  
  public CharSequence getTextOff()
  {
    return this.mTextOff;
  }
  
  public CharSequence getTextOn()
  {
    return this.mTextOn;
  }
  
  public Drawable getThumbDrawable()
  {
    return this.mThumbDrawable;
  }
  
  public final float getThumbPosition()
  {
    return this.mThumbPosition;
  }
  
  public int getThumbTextPadding()
  {
    return this.mThumbTextPadding;
  }
  
  public ColorStateList getThumbTintList()
  {
    return this.mThumbTintList;
  }
  
  public PorterDuff.Mode getThumbTintMode()
  {
    return this.mThumbTintMode;
  }
  
  public Drawable getTrackDrawable()
  {
    return this.mTrackDrawable;
  }
  
  public ColorStateList getTrackTintList()
  {
    return this.mTrackTintList;
  }
  
  public PorterDuff.Mode getTrackTintMode()
  {
    return this.mTrackTintMode;
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Object localObject = this.mThumbDrawable;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.mTrackDrawable;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.mPositionAnimator;
    if (localObject != null)
    {
      boolean bool = ((Animator)localObject).isStarted();
      if (bool)
      {
        this.mPositionAnimator.end();
        bool = false;
        localObject = null;
        this.mPositionAnimator = null;
      }
    }
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    paramInt += 1;
    int[] arrayOfInt1 = super.onCreateDrawableState(paramInt);
    boolean bool = isChecked();
    if (bool)
    {
      int[] arrayOfInt2 = CHECKED_STATE_SET;
      View.mergeDrawableStates(arrayOfInt1, arrayOfInt2);
    }
    return arrayOfInt1;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect = this.mTempRect;
    Object localObject1 = this.mTrackDrawable;
    if (localObject1 != null) {
      ((Drawable)localObject1).getPadding(localRect);
    } else {
      localRect.setEmpty();
    }
    int i = this.mSwitchTop;
    int j = this.mSwitchBottom;
    int k = localRect.top;
    i += k;
    k = localRect.bottom;
    j -= k;
    Object localObject2 = this.mThumbDrawable;
    Object localObject3;
    int n;
    int m;
    Object localObject4;
    if (localObject1 != null)
    {
      boolean bool1 = this.mSplitTrack;
      if ((bool1) && (localObject2 != null))
      {
        localObject3 = DrawableUtils.OooO0Oo((Drawable)localObject2);
        ((Drawable)localObject2).copyBounds(localRect);
        n = localRect.left;
        int i1 = ((Rect)localObject3).left;
        n += i1;
        localRect.left = n;
        n = localRect.right;
        m = ((Rect)localObject3).right;
        n -= m;
        localRect.right = n;
        m = paramCanvas.save();
        localObject4 = Region.Op.DIFFERENCE;
        paramCanvas.clipRect(localRect, (Region.Op)localObject4);
        ((Drawable)localObject1).draw(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
      else
      {
        ((Drawable)localObject1).draw(paramCanvas);
      }
    }
    int i2 = paramCanvas.save();
    if (localObject2 != null) {
      ((Drawable)localObject2).draw(paramCanvas);
    }
    boolean bool2 = getTargetCheckedState();
    if (bool2) {
      localObject1 = this.mOnLayout;
    } else {
      localObject1 = this.mOffLayout;
    }
    if (localObject1 != null)
    {
      localObject3 = getDrawableState();
      localObject4 = this.mTextColors;
      if (localObject4 != null)
      {
        TextPaint localTextPaint = this.mTextPaint;
        n = ((ColorStateList)localObject4).getColorForState((int[])localObject3, 0);
        localTextPaint.setColor(n);
      }
      localObject4 = this.mTextPaint;
      ((TextPaint)localObject4).drawableState = ((int[])localObject3);
      if (localObject2 != null)
      {
        localObject2 = ((Drawable)localObject2).getBounds();
        m = ((Rect)localObject2).left;
        k = ((Rect)localObject2).right;
        m += k;
      }
      else
      {
        m = getWidth();
      }
      m /= 2;
      k = ((Layout)localObject1).getWidth() / 2;
      m -= k;
      i = (i + j) / 2;
      j = ((Layout)localObject1).getHeight() / 2;
      i -= j;
      float f1 = m;
      float f2 = i;
      paramCanvas.translate(f1, f2);
      ((Layout)localObject1).draw(paramCanvas);
    }
    paramCanvas.restoreToCount(i2);
  }
  
  public void onEmojiCompatInitializedForSwitchText()
  {
    CharSequence localCharSequence = this.mTextOn;
    setTextOnInternal(localCharSequence);
    localCharSequence = this.mTextOff;
    setTextOffInternal(localCharSequence);
    requestLayout();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    Object localObject = "android.widget.Switch";
    paramAccessibilityNodeInfo.setClassName((CharSequence)localObject);
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i < j)
    {
      boolean bool1 = isChecked();
      if (bool1) {
        localObject = this.mTextOn;
      } else {
        localObject = this.mTextOff;
      }
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool2)
      {
        CharSequence localCharSequence = paramAccessibilityNodeInfo.getText();
        boolean bool3 = TextUtils.isEmpty(localCharSequence);
        if (bool3)
        {
          paramAccessibilityNodeInfo.setText((CharSequence)localObject);
        }
        else
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(localCharSequence);
          char c = ' ';
          localStringBuilder.append(c);
          localStringBuilder.append((CharSequence)localObject);
          paramAccessibilityNodeInfo.setText(localStringBuilder);
        }
      }
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = this.mThumbDrawable;
    paramInt1 = 0;
    if (localObject1 != null)
    {
      localObject1 = this.mTempRect;
      Object localObject2 = this.mTrackDrawable;
      if (localObject2 != null) {
        ((Drawable)localObject2).getPadding((Rect)localObject1);
      } else {
        ((Rect)localObject1).setEmpty();
      }
      localObject2 = DrawableUtils.OooO0Oo(this.mThumbDrawable);
      paramInt3 = ((Rect)localObject2).left;
      paramInt4 = ((Rect)localObject1).left;
      paramInt3 -= paramInt4;
      paramInt3 = Math.max(0, paramInt3);
      paramInt2 = ((Rect)localObject2).right;
      paramBoolean = ((Rect)localObject1).right;
      paramInt2 -= paramBoolean;
      paramInt1 = Math.max(0, paramInt2);
    }
    else
    {
      paramInt3 = 0;
    }
    paramBoolean = ViewUtils.OooO0O0(this);
    if (paramBoolean)
    {
      paramBoolean = getPaddingLeft() + paramInt3;
      paramInt2 = this.mSwitchWidth + paramBoolean - paramInt3 - paramInt1;
    }
    else
    {
      paramBoolean = getWidth();
      paramInt2 = getPaddingRight();
      paramInt2 = paramBoolean - paramInt2 - paramInt1;
      paramBoolean = this.mSwitchWidth;
      paramBoolean = paramInt2 - paramBoolean + paramInt3 + paramInt1;
    }
    paramInt1 = getGravity() & 0x70;
    paramInt3 = 16;
    if (paramInt1 != paramInt3)
    {
      paramInt3 = 80;
      if (paramInt1 != paramInt3)
      {
        paramInt1 = getPaddingTop();
        paramInt3 = this.mSwitchHeight;
      }
      else
      {
        paramInt1 = getHeight();
        paramInt3 = getPaddingBottom();
        paramInt3 = paramInt1 - paramInt3;
        paramInt1 = this.mSwitchHeight;
        paramInt1 = paramInt3 - paramInt1;
        break label309;
      }
    }
    else
    {
      paramInt1 = getPaddingTop();
      paramInt3 = getHeight();
      paramInt1 += paramInt3;
      paramInt3 = getPaddingBottom();
      paramInt1 = (paramInt1 - paramInt3) / 2;
      paramInt3 = this.mSwitchHeight;
      paramInt4 = paramInt3 / 2;
      paramInt1 -= paramInt4;
    }
    paramInt3 += paramInt1;
    label309:
    this.mSwitchLeft = paramBoolean;
    this.mSwitchTop = paramInt1;
    this.mSwitchBottom = paramInt3;
    this.mSwitchRight = paramInt2;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.mShowText;
    if (bool1)
    {
      localObject1 = this.mOnLayout;
      if (localObject1 == null)
      {
        localObject1 = this.mTextOnTransformed;
        localObject1 = OooO((CharSequence)localObject1);
        this.mOnLayout = ((Layout)localObject1);
      }
      localObject1 = this.mOffLayout;
      if (localObject1 == null)
      {
        localObject1 = this.mTextOffTransformed;
        localObject1 = OooO((CharSequence)localObject1);
        this.mOffLayout = ((Layout)localObject1);
      }
    }
    Object localObject1 = this.mTempRect;
    Drawable localDrawable1 = this.mThumbDrawable;
    int j = 0;
    int m;
    Drawable localDrawable2;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding((Rect)localObject1);
      localDrawable1 = this.mThumbDrawable;
      k = localDrawable1.getIntrinsicWidth();
      m = ((Rect)localObject1).left;
      k -= m;
      m = ((Rect)localObject1).right;
      k -= m;
      localDrawable2 = this.mThumbDrawable;
      m = localDrawable2.getIntrinsicHeight();
    }
    else
    {
      k = 0;
      localDrawable1 = null;
      m = 0;
      localDrawable2 = null;
    }
    boolean bool2 = this.mShowText;
    int n;
    int i2;
    if (bool2)
    {
      localObject2 = this.mOnLayout;
      n = ((Layout)localObject2).getWidth();
      Layout localLayout = this.mOffLayout;
      i2 = localLayout.getWidth();
      n = Math.max(n, i2);
      i2 = this.mThumbTextPadding * 2;
      n += i2;
    }
    else
    {
      n = 0;
      localObject2 = null;
    }
    int k = Math.max(n, k);
    this.mThumbWidth = k;
    localDrawable1 = this.mTrackDrawable;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding((Rect)localObject1);
      localDrawable1 = this.mTrackDrawable;
      j = localDrawable1.getIntrinsicHeight();
    }
    else
    {
      ((Rect)localObject1).setEmpty();
    }
    k = ((Rect)localObject1).left;
    int i = ((Rect)localObject1).right;
    Object localObject2 = this.mThumbDrawable;
    if (localObject2 != null)
    {
      localObject2 = DrawableUtils.OooO0Oo((Drawable)localObject2);
      i2 = ((Rect)localObject2).left;
      k = Math.max(k, i2);
      n = ((Rect)localObject2).right;
      i = Math.max(i, n);
    }
    boolean bool3 = this.mEnforceSwitchWidth;
    if (bool3)
    {
      int i1 = this.mSwitchMinWidth;
      i2 = this.mThumbWidth * 2 + k + i;
      i = Math.max(i1, i2);
    }
    else
    {
      i = this.mSwitchMinWidth;
    }
    k = Math.max(j, m);
    this.mSwitchWidth = i;
    this.mSwitchHeight = k;
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredHeight();
    if (paramInt1 < k)
    {
      paramInt1 = getMeasuredWidthAndState();
      setMeasuredDimension(paramInt1, k);
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    boolean bool = isChecked();
    CharSequence localCharSequence;
    if (bool) {
      localCharSequence = this.mTextOn;
    } else {
      localCharSequence = this.mTextOff;
    }
    if (localCharSequence != null)
    {
      paramAccessibilityEvent = paramAccessibilityEvent.getText();
      paramAccessibilityEvent.add(localCharSequence);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    localVelocityTracker.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    int m = 1;
    float f1;
    float f5;
    if (i != 0)
    {
      int n = 2;
      f1 = 2.802597E-045F;
      int i1;
      if (i != m)
      {
        int i2;
        float f2;
        if (i != n)
        {
          i2 = 3;
          f2 = 4.203895E-045F;
          if (i != i2) {
            break label460;
          }
        }
        else
        {
          i = this.mTouchMode;
          if (i != m)
          {
            if (i != n) {
              break label460;
            }
            float f3 = paramMotionEvent.getX();
            i = getThumbScrollRange();
            f1 = this.mTouchX;
            f1 = f3 - f1;
            i2 = 1065353216;
            f2 = 1.0F;
            bool4 = false;
            f4 = 0.0F;
            if (i != 0)
            {
              f5 = i;
              f1 /= f5;
            }
            else
            {
              boolean bool1 = f1 < 0.0F;
              if (bool1)
              {
                n = i2;
                f1 = f2;
              }
              else
              {
                int j = -1082130432;
                f5 = -1.0F;
                n = j;
                f1 = f5;
              }
            }
            boolean bool2 = ViewUtils.OooO0O0(this);
            if (bool2) {
              f1 = -f1;
            }
            f5 = OooO0o(this.mThumbPosition + f1, 0.0F, f2);
            f1 = this.mThumbPosition;
            i1 = f5 < f1;
            if (i1 != 0)
            {
              this.mTouchX = f3;
              setThumbPosition(f5);
            }
            return m;
          }
          f5 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          float f4 = this.mTouchX;
          f4 = Math.abs(f5 - f4);
          int i3 = this.mTouchSlop;
          float f6 = i3;
          boolean bool4 = f4 < f6;
          if (!bool4)
          {
            f4 = this.mTouchY;
            f4 = Math.abs(f2 - f4);
            i3 = this.mTouchSlop;
            f6 = i3;
            bool4 = f4 < f6;
            if (!bool4) {
              break label460;
            }
          }
          this.mTouchMode = i1;
          getParent().requestDisallowInterceptTouchEvent(m);
          this.mTouchX = f5;
          this.mTouchY = f2;
          return m;
        }
      }
      int k = this.mTouchMode;
      if (k == i1)
      {
        OooOOO0(paramMotionEvent);
        super.onTouchEvent(paramMotionEvent);
        return m;
      }
      k = 0;
      f5 = 0.0F;
      this.mTouchMode = 0;
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.clear();
    }
    else
    {
      f5 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      boolean bool3 = isEnabled();
      if (bool3)
      {
        bool3 = OooO0oo(f5, f1);
        if (bool3)
        {
          this.mTouchMode = m;
          this.mTouchX = f5;
          this.mTouchY = f1;
        }
      }
    }
    label460:
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (paramBoolean) {
      OooOO0O();
    } else {
      OooOO0();
    }
    IBinder localIBinder = getWindowToken();
    if (localIBinder != null)
    {
      boolean bool = ViewCompat.OoooOOO(this);
      if (bool)
      {
        OooO00o(paramBoolean);
        return;
      }
    }
    OooO0Oo();
    float f;
    if (paramBoolean)
    {
      paramBoolean = 1065353216;
      f = 1.0F;
    }
    else
    {
      paramBoolean = false;
      f = 0.0F;
    }
    setThumbPosition(f);
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    paramCallback = TextViewCompat.OooOOo0(this, paramCallback);
    super.setCustomSelectionActionModeCallback(paramCallback);
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
    CharSequence localCharSequence = this.mTextOn;
    setTextOnInternal(localCharSequence);
    localCharSequence = this.mTextOff;
    setTextOffInternal(localCharSequence);
    requestLayout();
  }
  
  public final void setEnforceSwitchWidth(boolean paramBoolean)
  {
    this.mEnforceSwitchWidth = paramBoolean;
    invalidate();
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    paramArrayOfInputFilter = getEmojiTextViewHelper().OooO00o(paramArrayOfInputFilter);
    super.setFilters(paramArrayOfInputFilter);
  }
  
  public void setShowText(boolean paramBoolean)
  {
    boolean bool = this.mShowText;
    if (bool != paramBoolean)
    {
      this.mShowText = paramBoolean;
      requestLayout();
      if (paramBoolean) {
        OooOO0o();
      }
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    this.mSplitTrack = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    this.mSwitchMinWidth = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    this.mSwitchPadding = paramInt;
    requestLayout();
  }
  
  public void setSwitchTextAppearance(Context paramContext, int paramInt)
  {
    Object localObject1 = R.styleable.TextAppearance;
    paramContext = TintTypedArray.OooOOO0(paramContext, paramInt, (int[])localObject1);
    paramInt = R.styleable.TextAppearance_android_textColor;
    Object localObject2 = paramContext.getColorStateList(paramInt);
    if (localObject2 == null) {
      localObject2 = getTextColors();
    }
    this.mTextColors = ((ColorStateList)localObject2);
    paramInt = R.styleable.TextAppearance_android_textSize;
    localObject1 = null;
    paramInt = paramContext.OooO0o0(paramInt, 0);
    float f1;
    if (paramInt != 0)
    {
      f1 = paramInt;
      TextPaint localTextPaint = this.mTextPaint;
      f2 = localTextPaint.getTextSize();
      boolean bool = f1 < f2;
      if (bool)
      {
        localTextPaint = this.mTextPaint;
        localTextPaint.setTextSize(f1);
        requestLayout();
      }
    }
    paramInt = R.styleable.TextAppearance_android_typeface;
    int i = -1;
    float f2 = 0.0F / 0.0F;
    paramInt = paramContext.OooO0oo(paramInt, i);
    int j = R.styleable.TextAppearance_android_textStyle;
    i = paramContext.OooO0oo(j, i);
    setSwitchTypefaceByIndex(paramInt, i);
    paramInt = R.styleable.TextAppearance_textAllCaps;
    paramInt = paramContext.OooO00o(paramInt, false);
    if (paramInt != 0)
    {
      localObject2 = new androidx/appcompat/text/AllCapsTransformationMethod;
      localObject1 = getContext();
      ((AllCapsTransformationMethod)localObject2).<init>((Context)localObject1);
    }
    else
    {
      paramInt = 0;
      f1 = 0.0F;
      localObject2 = null;
    }
    this.mSwitchTransformationMethod = ((TransformationMethod)localObject2);
    localObject2 = this.mTextOn;
    setTextOnInternal((CharSequence)localObject2);
    localObject2 = this.mTextOff;
    setTextOffInternal((CharSequence)localObject2);
    paramContext.OooOOOo();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    Object localObject = this.mTextPaint.getTypeface();
    if (localObject != null)
    {
      localObject = this.mTextPaint.getTypeface();
      boolean bool = ((Typeface)localObject).equals(paramTypeface);
      if (!bool) {}
    }
    else
    {
      localObject = this.mTextPaint.getTypeface();
      if ((localObject != null) || (paramTypeface == null)) {
        return;
      }
    }
    localObject = this.mTextPaint;
    ((Paint)localObject).setTypeface(paramTypeface);
    requestLayout();
    invalidate();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface, int paramInt)
  {
    float f = 0.0F;
    boolean bool = false;
    TextPaint localTextPaint;
    if (paramInt > 0)
    {
      if (paramTypeface == null) {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
      } else {
        paramTypeface = Typeface.create(paramTypeface, paramInt);
      }
      setSwitchTypeface(paramTypeface);
      if (paramTypeface != null)
      {
        i = paramTypeface.getStyle();
      }
      else
      {
        i = 0;
        paramTypeface = null;
      }
      int i = (i ^ 0xFFFFFFFF) & paramInt;
      localTextPaint = this.mTextPaint;
      int j = i & 0x1;
      if (j != 0) {
        bool = true;
      }
      localTextPaint.setFakeBoldText(bool);
      localTextPaint = this.mTextPaint;
      i &= 0x2;
      if (i != 0) {
        f = -0.25F;
      }
      localTextPaint.setTextSkewX(f);
    }
    else
    {
      this.mTextPaint.setFakeBoldText(false);
      localTextPaint = this.mTextPaint;
      localTextPaint.setTextSkewX(0.0F);
      setSwitchTypeface(paramTypeface);
    }
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    setTextOffInternal(paramCharSequence);
    requestLayout();
    boolean bool = isChecked();
    if (!bool) {
      OooOO0();
    }
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    setTextOnInternal(paramCharSequence);
    requestLayout();
    boolean bool = isChecked();
    if (bool) {
      OooOO0O();
    }
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    this.mThumbDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setThumbPosition(float paramFloat)
  {
    this.mThumbPosition = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setThumbDrawable(localDrawable);
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    this.mThumbTextPadding = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList)
  {
    this.mThumbTintList = paramColorStateList;
    this.mHasThumbTint = true;
    OooO0O0();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode)
  {
    this.mThumbTintMode = paramMode;
    this.mHasThumbTintMode = true;
    OooO0O0();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mTrackDrawable;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    this.mTrackDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setTrackDrawable(localDrawable);
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList)
  {
    this.mTrackTintList = paramColorStateList;
    this.mHasTrackTint = true;
    OooO0OO();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode)
  {
    this.mTrackTintMode = paramMode;
    this.mHasTrackTintMode = true;
    OooO0OO();
  }
  
  public void toggle()
  {
    boolean bool = isChecked() ^ true;
    setChecked(bool);
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool1 = super.verifyDrawable(paramDrawable);
    if (!bool1)
    {
      Drawable localDrawable = this.mThumbDrawable;
      if (paramDrawable != localDrawable)
      {
        localDrawable = this.mTrackDrawable;
        if (paramDrawable != localDrawable)
        {
          bool2 = false;
          paramDrawable = null;
          break label44;
        }
      }
    }
    boolean bool2 = true;
    label44:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SwitchCompat
 * JD-Core Version:    0.7.0.1
 */