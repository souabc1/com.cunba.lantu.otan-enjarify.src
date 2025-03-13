package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class PagerTitleStrip
  extends ViewGroup
{
  public static final int[] o00o000O = tmp17_4;
  public static final int[] o00o000o = { 16843660 };
  public ViewPager o00OoOoo;
  public TextView o00Ooo0;
  public TextView o00Ooo00;
  public TextView o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public float o00OooO0;
  public int o00OooOO;
  public boolean o00OooOo;
  public final PagerTitleStrip.PageListener o00OoooO;
  public WeakReference o00Ooooo;
  public int o00o000;
  public int o00o0000;
  public boolean o0O00o0;
  
  static
  {
    int[] tmp3_1 = new int[4];
    int[] tmp4_3 = tmp3_1;
    int[] tmp4_3 = tmp3_1;
    tmp4_3[0] = 16842804;
    tmp4_3[1] = 16842901;
    tmp4_3[2] = 16842904;
    int[] tmp17_4 = tmp4_3;
    tmp17_4[3] = 16842927;
  }
  
  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    PagerTitleStrip.SingleLineAllCapsTransform localSingleLineAllCapsTransform = new androidx/viewpager/widget/PagerTitleStrip$SingleLineAllCapsTransform;
    Context localContext = paramTextView.getContext();
    localSingleLineAllCapsTransform.<init>(localContext);
    paramTextView.setTransformationMethod(localSingleLineAllCapsTransform);
  }
  
  public void OooO00o(PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
  {
    int i;
    if (paramPagerAdapter1 != null)
    {
      PagerTitleStrip.PageListener localPageListener = this.o00OoooO;
      paramPagerAdapter1.OooOOo0(localPageListener);
      i = 0;
      paramPagerAdapter1 = null;
      this.o00Ooooo = null;
    }
    if (paramPagerAdapter2 != null)
    {
      paramPagerAdapter1 = this.o00OoooO;
      paramPagerAdapter2.OooOO0(paramPagerAdapter1);
      paramPagerAdapter1 = new java/lang/ref/WeakReference;
      paramPagerAdapter1.<init>(paramPagerAdapter2);
      this.o00Ooooo = paramPagerAdapter1;
    }
    paramPagerAdapter1 = this.o00OoOoo;
    if (paramPagerAdapter1 != null)
    {
      this.o00Ooo0o = -1;
      float f = -1.0F;
      this.o00OooO0 = f;
      i = paramPagerAdapter1.getCurrentItem();
      OooO0O0(i, paramPagerAdapter2);
      requestLayout();
    }
  }
  
  public void OooO0O0(int paramInt, PagerAdapter paramPagerAdapter)
  {
    if (paramPagerAdapter != null) {
      i = paramPagerAdapter.getCount();
    } else {
      i = 0;
    }
    int j = 1;
    this.o00OooOo = j;
    int k = 0;
    CharSequence localCharSequence = null;
    if ((paramInt >= j) && (paramPagerAdapter != null))
    {
      j = paramInt + -1;
      localObject1 = paramPagerAdapter.getPageTitle(j);
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    Object localObject2 = this.o00Ooo00;
    ((TextView)localObject2).setText((CharSequence)localObject1);
    Object localObject1 = this.o00Ooo0;
    if ((paramPagerAdapter != null) && (paramInt < i)) {
      localObject2 = paramPagerAdapter.getPageTitle(paramInt);
    } else {
      localObject2 = null;
    }
    ((TextView)localObject1).setText((CharSequence)localObject2);
    j = paramInt + 1;
    if ((j < i) && (paramPagerAdapter != null)) {
      localCharSequence = paramPagerAdapter.getPageTitle(j);
    }
    paramPagerAdapter = this.o00Ooo0O;
    paramPagerAdapter.setText(localCharSequence);
    int m = getWidth();
    int i = getPaddingLeft();
    m -= i;
    i = getPaddingRight();
    float f = (m - i) * 0.8F;
    m = (int)f;
    m = Math.max(0, m);
    i = -1 << -1;
    m = View.MeasureSpec.makeMeasureSpec(m, i);
    j = getHeight();
    k = getPaddingTop();
    j -= k;
    k = getPaddingBottom();
    j -= k;
    j = Math.max(0, j);
    i = View.MeasureSpec.makeMeasureSpec(j, i);
    this.o00Ooo00.measure(m, i);
    this.o00Ooo0.measure(m, i);
    localObject1 = this.o00Ooo0O;
    ((View)localObject1).measure(m, i);
    this.o00Ooo0o = paramInt;
    boolean bool = this.o0O00o0;
    if (!bool)
    {
      f = this.o00OooO0;
      OooO0OO(paramInt, f, false);
    }
    this.o00OooOo = false;
  }
  
  public void OooO0OO(int paramInt, float paramFloat, boolean paramBoolean)
  {
    PagerTitleStrip localPagerTitleStrip = this;
    int i = paramInt;
    float f1 = paramFloat;
    int k = this.o00Ooo0o;
    if (paramInt != k)
    {
      localObject = this.o00OoOoo.getAdapter();
      OooO0O0(paramInt, (PagerAdapter)localObject);
    }
    else if (!paramBoolean)
    {
      f2 = this.o00OooO0;
      boolean bool1 = paramFloat < f2;
      if (!bool1) {
        return;
      }
    }
    float f2 = 1.4E-45F;
    localPagerTitleStrip.o0O00o0 = true;
    TextView localTextView1 = localPagerTitleStrip.o00Ooo00;
    int j = localTextView1.getMeasuredWidth();
    Object localObject = localPagerTitleStrip.o00Ooo0;
    k = ((View)localObject).getMeasuredWidth();
    TextView localTextView2 = localPagerTitleStrip.o00Ooo0O;
    int m = localTextView2.getMeasuredWidth();
    int n = k / 2;
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = getPaddingLeft();
    int i4 = getPaddingRight();
    int i5 = getPaddingTop();
    int i6 = getPaddingBottom();
    int i7 = i3 + n;
    int i8 = i4 + n;
    i7 = i1 - i7 - i8;
    int i9 = 1056964608;
    float f3 = 0.5F + f1;
    int i10 = 1065353216;
    float f4 = 1.0F;
    boolean bool2 = f3 < f4;
    if (bool2) {
      f3 -= f4;
    }
    i8 = i1 - i8;
    float f5 = i7 * f3;
    i7 = (int)f5;
    i8 = i8 - i7 - n;
    k += i8;
    TextView localTextView3 = localPagerTitleStrip.o00Ooo00;
    n = localTextView3.getBaseline();
    TextView localTextView4 = localPagerTitleStrip.o00Ooo0;
    i7 = localTextView4.getBaseline();
    i9 = localPagerTitleStrip.o00Ooo0O.getBaseline();
    i10 = Math.max(Math.max(n, i7), i9);
    n = i10 - n;
    i7 = i10 - i7;
    i10 -= i9;
    TextView localTextView5 = localPagerTitleStrip.o00Ooo00;
    i9 = localTextView5.getMeasuredHeight() + n;
    TextView localTextView6 = localPagerTitleStrip.o00Ooo0;
    int i11 = localTextView6.getMeasuredHeight() + i7;
    paramInt = m;
    localTextView2 = localPagerTitleStrip.o00Ooo0O;
    m = localTextView2.getMeasuredHeight() + i10;
    i11 = Math.max(Math.max(i9, i11), m);
    m = localPagerTitleStrip.o00OooOO & 0x70;
    i9 = 16;
    f3 = 2.242078E-044F;
    if (m != i9)
    {
      i9 = 80;
      f3 = 1.121039E-043F;
      if (m != i9)
      {
        n += i5;
        i7 += i5;
        i5 += i10;
        break label509;
      }
      i2 = i2 - i6 - i11;
    }
    else
    {
      i2 = (i2 - i5 - i6 - i11) / 2;
    }
    n += i2;
    i7 += i2;
    i5 = i2 + i10;
    label509:
    localTextView6 = localPagerTitleStrip.o00Ooo0;
    m = localTextView6.getMeasuredHeight() + i7;
    localTextView6.layout(i8, i7, k, m);
    i11 = localPagerTitleStrip.o00OooO;
    i8 = i8 - i11 - j;
    i11 = Math.min(i3, i8);
    localTextView2 = localPagerTitleStrip.o00Ooo00;
    j += i11;
    i2 = localTextView2.getMeasuredHeight() + n;
    localTextView2.layout(i11, n, j, i2);
    i1 = i1 - i4 - paramInt;
    j = localPagerTitleStrip.o00OooO;
    k += j;
    j = Math.max(i1, k);
    localTextView6 = localPagerTitleStrip.o00Ooo0O;
    m = j + paramInt;
    k = localTextView6.getMeasuredHeight() + i5;
    localTextView6.layout(j, i5, m, k);
    f2 = paramFloat;
    localPagerTitleStrip.o00OooO0 = paramFloat;
    localPagerTitleStrip.o0O00o0 = false;
  }
  
  public int getMinHeight()
  {
    Drawable localDrawable = getBackground();
    int i;
    if (localDrawable != null)
    {
      i = localDrawable.getIntrinsicHeight();
    }
    else
    {
      i = 0;
      localDrawable = null;
    }
    return i;
  }
  
  public int getTextSpacing()
  {
    return this.o00OooO;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    boolean bool = localObject instanceof ViewPager;
    if (bool)
    {
      localObject = (ViewPager)localObject;
      PagerAdapter localPagerAdapter = ((ViewPager)localObject).getAdapter();
      PagerTitleStrip.PageListener localPageListener = this.o00OoooO;
      ((ViewPager)localObject).OoooO00(localPageListener);
      localPageListener = this.o00OoooO;
      ((ViewPager)localObject).OooO0O0(localPageListener);
      this.o00OoOoo = ((ViewPager)localObject);
      localObject = this.o00Ooooo;
      if (localObject != null) {
        localObject = (PagerAdapter)((Reference)localObject).get();
      } else {
        localObject = null;
      }
      OooO00o((PagerAdapter)localObject, localPagerAdapter);
      return;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("PagerTitleStrip must be a direct child of a ViewPager.");
    throw ((Throwable)localObject);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.o00OoOoo;
    if (localObject != null)
    {
      localObject = ((ViewPager)localObject).getAdapter();
      OooO00o((PagerAdapter)localObject, null);
      this.o00OoOoo.OoooO00(null);
      localObject = this.o00OoOoo;
      PagerTitleStrip.PageListener localPageListener = this.o00OoooO;
      ((ViewPager)localObject).Oooo0O0(localPageListener);
      this.o00OoOoo = null;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewPager localViewPager = this.o00OoOoo;
    if (localViewPager != null)
    {
      float f = this.o00OooO0;
      paramInt1 = 0;
      paramInt2 = f < 0.0F;
      if (paramInt2 < 0)
      {
        localViewPager = null;
        f = 0.0F;
      }
      paramInt1 = this.o00Ooo0o;
      paramInt2 = 1;
      OooO0OO(paramInt1, f, paramInt2);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == j)
    {
      i = getPaddingTop();
      int k = getPaddingBottom();
      i += k;
      k = -2;
      int m = ViewGroup.getChildMeasureSpec(paramInt2, i, k);
      int n = View.MeasureSpec.getSize(paramInt1);
      float f1 = n;
      float f2 = 0.2F;
      f1 *= f2;
      int i1 = (int)f1;
      paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, i1, k);
      this.o00Ooo00.measure(paramInt1, m);
      this.o00Ooo0.measure(paramInt1, m);
      TextView localTextView = this.o00Ooo0O;
      localTextView.measure(paramInt1, m);
      paramInt1 = View.MeasureSpec.getMode(paramInt2);
      if (paramInt1 == j)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt2);
      }
      else
      {
        localObject = this.o00Ooo0;
        paramInt1 = ((View)localObject).getMeasuredHeight();
        j = getMinHeight();
        paramInt1 += i;
        paramInt1 = Math.max(j, paramInt1);
      }
      i = this.o00Ooo0.getMeasuredState() << 16;
      paramInt1 = View.resolveSizeAndState(paramInt1, paramInt2, i);
      setMeasuredDimension(n, paramInt1);
      return;
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Must measure with an exact width");
    throw ((Throwable)localObject);
  }
  
  public void requestLayout()
  {
    boolean bool = this.o00OooOo;
    if (!bool) {
      super.requestLayout();
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.o00OooOO = paramInt;
    requestLayout();
  }
  
  public void setNonPrimaryAlpha(float paramFloat)
  {
    int i = (int)(paramFloat * 255.0F) & 0xFF;
    this.o00o0000 = i;
    i <<= 24;
    int j = this.o00o000 & 0xFFFFFF;
    i |= j;
    this.o00Ooo00.setTextColor(i);
    this.o00Ooo0O.setTextColor(i);
  }
  
  public void setTextColor(int paramInt)
  {
    this.o00o000 = paramInt;
    this.o00Ooo0.setTextColor(paramInt);
    paramInt = this.o00o0000 << 24;
    int i = this.o00o000 & 0xFFFFFF;
    paramInt |= i;
    this.o00Ooo00.setTextColor(paramInt);
    this.o00Ooo0O.setTextColor(paramInt);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    this.o00Ooo00.setTextSize(paramInt, paramFloat);
    this.o00Ooo0.setTextSize(paramInt, paramFloat);
    this.o00Ooo0O.setTextSize(paramInt, paramFloat);
  }
  
  public void setTextSpacing(int paramInt)
  {
    this.o00OooO = paramInt;
    requestLayout();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.PagerTitleStrip
 * JD-Core Version:    0.7.0.1
 */