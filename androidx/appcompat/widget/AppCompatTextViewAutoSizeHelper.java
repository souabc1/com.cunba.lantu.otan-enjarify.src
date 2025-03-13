package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class AppCompatTextViewAutoSizeHelper
{
  public static final RectF OooOO0o;
  public static ConcurrentHashMap OooOOO;
  public static ConcurrentHashMap OooOOO0;
  public final TextView OooO;
  public int OooO00o = 0;
  public boolean OooO0O0 = false;
  public float OooO0OO;
  public float OooO0Oo;
  public int[] OooO0o;
  public float OooO0o0;
  public boolean OooO0oO;
  public TextPaint OooO0oo;
  public final Context OooOO0;
  public final AppCompatTextViewAutoSizeHelper.Impl OooOO0O;
  
  static
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    OooOO0o = (RectF)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooOOO0 = (ConcurrentHashMap)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooOOO = (ConcurrentHashMap)localObject;
  }
  
  public AppCompatTextViewAutoSizeHelper(TextView paramTextView)
  {
    float f = -1.0F;
    this.OooO0OO = f;
    this.OooO0Oo = f;
    this.OooO0o0 = f;
    int[] arrayOfInt = new int[0];
    this.OooO0o = arrayOfInt;
    this.OooO0oO = false;
    this.OooO = paramTextView;
    paramTextView = paramTextView.getContext();
    this.OooOO0 = paramTextView;
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      paramTextView = new androidx/appcompat/widget/AppCompatTextViewAutoSizeHelper$Impl29;
      paramTextView.<init>();
    }
    for (;;)
    {
      this.OooOO0O = paramTextView;
      break;
      paramTextView = new androidx/appcompat/widget/AppCompatTextViewAutoSizeHelper$Impl23;
      paramTextView.<init>();
    }
  }
  
  public static Method OooO0o(String paramString)
  {
    try
    {
      localObject1 = OooOOO0;
      localObject1 = ((ConcurrentHashMap)localObject1).get(paramString);
      localObject1 = (Method)localObject1;
      if (localObject1 == null)
      {
        localObject1 = TextView.class;
        boolean bool = false;
        Object localObject2 = null;
        localObject2 = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredMethod(paramString, (Class[])localObject2);
        if (localObject1 != null)
        {
          bool = true;
          ((AccessibleObject)localObject1).setAccessible(bool);
          localObject2 = OooOOO0;
          ((ConcurrentHashMap)localObject2).put(paramString, localObject1);
        }
      }
      return localObject1;
    }
    catch (Exception localException)
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Failed to retrieve TextView#");
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("() method");
    }
    return null;
  }
  
  /* Error */
  public static Object OooO0oo(Object paramObject1, String paramString, Object paramObject2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 125	androidx/appcompat/widget/AppCompatTextViewAutoSizeHelper:OooO0o	(Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: iconst_0
    //   9: anewarray 4	java/lang/Object
    //   12: astore 4
    //   14: aload_3
    //   15: aload_0
    //   16: aload 4
    //   18: invokevirtual 129	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   21: astore_2
    //   22: goto +37 -> 59
    //   25: athrow
    //   26: pop
    //   27: new 111	java/lang/StringBuilder
    //   30: astore_0
    //   31: aload_0
    //   32: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   35: ldc 131
    //   37: astore_3
    //   38: aload_0
    //   39: aload_3
    //   40: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: ldc 120
    //   52: astore_1
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramObject1	Object
    //   0	61	1	paramString	String
    //   0	61	2	paramObject2	Object
    //   4	36	3	localObject	Object
    //   6	11	4	arrayOfObject	Object[]
    //   26	1	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	4	25	finally
    //   8	12	25	finally
    //   16	21	25	finally
    //   0	4	26	java/lang/Exception
    //   8	12	26	java/lang/Exception
    //   16	21	26	java/lang/Exception
  }
  
  private void setRawTextSize(float paramFloat)
  {
    Object localObject1 = this.OooO.getPaint();
    float f = ((Paint)localObject1).getTextSize();
    boolean bool1 = paramFloat < f;
    boolean bool2;
    Object localObject2;
    if (bool1)
    {
      this.OooO.getPaint().setTextSize(paramFloat);
      localTextView1 = this.OooO;
      bool2 = AppCompatTextViewAutoSizeHelper.Api18Impl.OooO00o(localTextView1);
      localObject1 = this.OooO.getLayout();
      if (localObject1 != null)
      {
        bool1 = false;
        f = 0.0F;
        localObject1 = null;
        this.OooO0O0 = false;
        localObject2 = "nullLayouts";
      }
    }
    try
    {
      localObject2 = OooO0o((String)localObject2);
      if (localObject2 != null)
      {
        TextView localTextView2 = this.OooO;
        localObject1 = new Object[0];
        ((Method)localObject2).invoke(localTextView2, (Object[])localObject1);
      }
    }
    catch (Exception localException)
    {
      label107:
      break label107;
    }
    if (!bool2)
    {
      localTextView1 = this.OooO;
      localTextView1.requestLayout();
    }
    else
    {
      localTextView1 = this.OooO;
      localTextView1.forceLayout();
    }
    TextView localTextView1 = this.OooO;
    localTextView1.invalidate();
  }
  
  private void setupAutoSizeUniformPresetSizes(TypedArray paramTypedArray)
  {
    int i = paramTypedArray.length();
    int[] arrayOfInt = new int[i];
    if (i > 0)
    {
      int j = 0;
      while (j < i)
      {
        int k = paramTypedArray.getDimensionPixelSize(j, -1);
        arrayOfInt[j] = k;
        j += 1;
      }
      paramTypedArray = OooO0O0(arrayOfInt);
      this.OooO0o = paramTypedArray;
      OooOOO0();
    }
  }
  
  public void OooO(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooOO0;
    int[] arrayOfInt = R.styleable.AppCompatTextView;
    int i = 0;
    float f1 = 0.0F;
    localObject1 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    TextView localTextView = this.OooO;
    Object localObject2 = localTextView.getContext();
    Object localObject3 = R.styleable.AppCompatTextView;
    ViewCompat.o00ooo(localTextView, (Context)localObject2, (int[])localObject3, paramAttributeSet, (TypedArray)localObject1, paramInt, 0);
    int k = R.styleable.AppCompatTextView_autoSizeTextType;
    boolean bool1 = ((TypedArray)localObject1).hasValue(k);
    if (bool1)
    {
      m = R.styleable.AppCompatTextView_autoSizeTextType;
      m = ((TypedArray)localObject1).getInt(m, 0);
      this.OooO00o = m;
    }
    int m = R.styleable.AppCompatTextView_autoSizeStepGranularity;
    boolean bool2 = ((TypedArray)localObject1).hasValue(m);
    paramInt = -1082130432;
    float f2 = -1.0F;
    int n;
    float f3;
    if (bool2)
    {
      n = R.styleable.AppCompatTextView_autoSizeStepGranularity;
      f3 = ((TypedArray)localObject1).getDimension(n, f2);
    }
    else
    {
      n = paramInt;
      f3 = f2;
    }
    int i1 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
    boolean bool3 = ((TypedArray)localObject1).hasValue(i1);
    int i2;
    float f4;
    if (bool3)
    {
      i2 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
      f4 = ((TypedArray)localObject1).getDimension(i2, f2);
    }
    else
    {
      i2 = paramInt;
      f4 = f2;
    }
    int i3 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
    boolean bool4 = ((TypedArray)localObject1).hasValue(i3);
    int i4;
    float f5;
    if (bool4)
    {
      i4 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
      f5 = ((TypedArray)localObject1).getDimension(i4, f2);
    }
    else
    {
      i4 = paramInt;
      f5 = f2;
    }
    int i5 = R.styleable.AppCompatTextView_autoSizePresetSizes;
    boolean bool5 = ((TypedArray)localObject1).hasValue(i5);
    int i6;
    if (bool5)
    {
      i6 = R.styleable.AppCompatTextView_autoSizePresetSizes;
      i6 = ((TypedArray)localObject1).getResourceId(i6, 0);
      if (i6 > 0)
      {
        localObject3 = ((TypedArray)localObject1).getResources();
        localObject2 = ((Resources)localObject3).obtainTypedArray(i6);
        setupAutoSizeUniformPresetSizes((TypedArray)localObject2);
        ((TypedArray)localObject2).recycle();
      }
    }
    ((TypedArray)localObject1).recycle();
    boolean bool6 = OooOOOO();
    if (bool6)
    {
      int i7 = this.OooO00o;
      i = 1;
      f1 = 1.4E-45F;
      if (i7 == i)
      {
        boolean bool7 = this.OooO0oO;
        if (!bool7)
        {
          localObject1 = this.OooOO0.getResources().getDisplayMetrics();
          i = f4 < f2;
          i6 = 2;
          if (i == 0)
          {
            i2 = 1094713344;
            f4 = TypedValue.applyDimension(i6, 12.0F, (DisplayMetrics)localObject1);
          }
          i = f5 < f2;
          if (i == 0)
          {
            int j = 1121976320;
            f1 = 112.0F;
            f5 = TypedValue.applyDimension(i6, f1, (DisplayMetrics)localObject1);
          }
          paramInt = f3 < f2;
          if (paramInt == 0)
          {
            n = 1065353216;
            f3 = 1.0F;
          }
          OooOOOo(f4, f5, f3);
        }
        OooOO0o();
      }
    }
    else
    {
      this.OooO00o = 0;
    }
  }
  
  public void OooO00o()
  {
    boolean bool1 = isAutoSizeEnabled();
    if (!bool1) {
      return;
    }
    bool1 = this.OooO0O0;
    if (bool1)
    {
      Object localObject1 = this.OooO;
      int i = ((View)localObject1).getMeasuredHeight();
      if (i > 0)
      {
        localObject1 = this.OooO;
        i = ((View)localObject1).getMeasuredWidth();
        if (i > 0)
        {
          localObject1 = this.OooOO0O;
          TextView localTextView = this.OooO;
          boolean bool2 = ((AppCompatTextViewAutoSizeHelper.Impl)localObject1).OooO0O0(localTextView);
          int j;
          float f1;
          if (bool2)
          {
            j = 1048576;
            f1 = 1.469368E-039F;
          }
          else
          {
            localObject1 = this.OooO;
            j = ((View)localObject1).getMeasuredWidth();
            k = this.OooO.getTotalPaddingLeft();
            j -= k;
            localTextView = this.OooO;
            k = localTextView.getTotalPaddingRight();
            j -= k;
          }
          localTextView = this.OooO;
          int k = localTextView.getHeight();
          int m = this.OooO.getCompoundPaddingBottom();
          k -= m;
          ??? = this.OooO;
          m = ((TextView)???).getCompoundPaddingTop();
          k -= m;
          if ((j > 0) && (k > 0)) {
            synchronized (OooOO0o)
            {
              ((RectF)???).setEmpty();
              f1 = j;
              ((RectF)???).right = f1;
              f1 = k;
              ((RectF)???).bottom = f1;
              j = OooO0o0((RectF)???);
              f1 = j;
              localTextView = this.OooO;
              float f2 = localTextView.getTextSize();
              boolean bool3 = f1 < f2;
              if (bool3)
              {
                bool3 = false;
                f2 = 0.0F;
                localTextView = null;
                setTextSizeInternal(0, f1);
              }
            }
          }
        }
      }
      return;
    }
    this.OooO0O0 = true;
  }
  
  public final int[] OooO0O0(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    if (i == 0) {
      return paramArrayOfInt;
    }
    Arrays.sort(paramArrayOfInt);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    int k = 0;
    Integer localInteger1 = null;
    while (k < i)
    {
      int m = paramArrayOfInt[k];
      if (m > 0)
      {
        Integer localInteger2 = Integer.valueOf(m);
        int n = Collections.binarySearch(localArrayList, localInteger2);
        if (n < 0)
        {
          Integer localInteger3 = Integer.valueOf(m);
          localArrayList.add(localInteger3);
        }
      }
      k += 1;
    }
    k = localArrayList.size();
    if (i == k) {
      return paramArrayOfInt;
    }
    int i1 = localArrayList.size();
    int[] arrayOfInt = new int[i1];
    while (j < i1)
    {
      localInteger1 = (Integer)localArrayList.get(j);
      k = localInteger1.intValue();
      arrayOfInt[j] = k;
      j += 1;
    }
    return arrayOfInt;
  }
  
  public final void OooO0OO()
  {
    this.OooO00o = 0;
    float f = -1.0F;
    this.OooO0Oo = f;
    this.OooO0o0 = f;
    this.OooO0OO = f;
    int[] arrayOfInt = new int[0];
    this.OooO0o = arrayOfInt;
    this.OooO0O0 = false;
  }
  
  public StaticLayout OooO0Oo(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    TextView localTextView = this.OooO;
    TextPaint localTextPaint = this.OooO0oo;
    AppCompatTextViewAutoSizeHelper.Impl localImpl = this.OooOO0O;
    return AppCompatTextViewAutoSizeHelper.Api23Impl.OooO00o(paramCharSequence, paramAlignment, paramInt1, paramInt2, localTextView, localTextPaint, localImpl);
  }
  
  public final int OooO0o0(RectF paramRectF)
  {
    int[] arrayOfInt1 = this.OooO0o;
    int i = arrayOfInt1.length;
    if (i != 0)
    {
      int j = 1;
      i -= j;
      int k = 0;
      while (j <= i)
      {
        k = (j + i) / 2;
        int[] arrayOfInt2 = this.OooO0o;
        int m = arrayOfInt2[k];
        boolean bool = OooOOO(m, paramRectF);
        if (bool)
        {
          int n = k + 1;
          k = j;
          j = n;
        }
        else
        {
          k += -1;
          i = k;
        }
      }
      return this.OooO0o[k];
    }
    paramRectF = new java/lang/IllegalStateException;
    paramRectF.<init>("No available text sizes to choose from.");
    throw paramRectF;
  }
  
  public void OooO0oO(int paramInt)
  {
    TextPaint localTextPaint1 = this.OooO0oo;
    if (localTextPaint1 == null)
    {
      localTextPaint1 = new android/text/TextPaint;
      localTextPaint1.<init>();
      this.OooO0oo = localTextPaint1;
    }
    else
    {
      localTextPaint1.reset();
    }
    localTextPaint1 = this.OooO0oo;
    TextPaint localTextPaint2 = this.OooO.getPaint();
    localTextPaint1.set(localTextPaint2);
    localTextPaint1 = this.OooO0oo;
    float f = paramInt;
    localTextPaint1.setTextSize(f);
  }
  
  public void OooOO0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = OooOOOO();
    if (bool)
    {
      DisplayMetrics localDisplayMetrics = this.OooOO0.getResources().getDisplayMetrics();
      float f1 = paramInt1;
      f1 = TypedValue.applyDimension(paramInt4, f1, localDisplayMetrics);
      float f2 = paramInt2;
      f2 = TypedValue.applyDimension(paramInt4, f2, localDisplayMetrics);
      float f3 = paramInt3;
      f3 = TypedValue.applyDimension(paramInt4, f3, localDisplayMetrics);
      OooOOOo(f1, f2, f3);
      paramInt1 = OooOO0o();
      if (paramInt1 != 0) {
        OooO00o();
      }
    }
  }
  
  public void OooOO0O(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = OooOOOO();
    if (bool1)
    {
      int i = paramArrayOfInt.length;
      int j = 0;
      if (i > 0)
      {
        int[] arrayOfInt = new int[i];
        if (paramInt == 0)
        {
          arrayOfInt = Arrays.copyOf(paramArrayOfInt, i);
        }
        else
        {
          DisplayMetrics localDisplayMetrics = this.OooOO0.getResources().getDisplayMetrics();
          while (j < i)
          {
            float f = paramArrayOfInt[j];
            f = TypedValue.applyDimension(paramInt, f, localDisplayMetrics);
            int k = Math.round(f);
            arrayOfInt[j] = k;
            j += 1;
          }
        }
        Object localObject = OooO0O0(arrayOfInt);
        this.OooO0o = ((int[])localObject);
        paramInt = OooOOO0();
        if (paramInt == 0)
        {
          localObject = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("None of the preset sizes is valid: ");
          paramArrayOfInt = Arrays.toString(paramArrayOfInt);
          localStringBuilder.append(paramArrayOfInt);
          paramArrayOfInt = localStringBuilder.toString();
          ((IllegalArgumentException)localObject).<init>(paramArrayOfInt);
          throw ((Throwable)localObject);
        }
      }
      else
      {
        this.OooO0oO = false;
      }
      boolean bool2 = OooOO0o();
      if (bool2) {
        OooO00o();
      }
    }
  }
  
  public final boolean OooOO0o()
  {
    boolean bool1 = OooOOOO();
    int k = 0;
    if (bool1)
    {
      int i = this.OooO00o;
      int m = 1;
      if (i == m)
      {
        boolean bool2 = this.OooO0oO;
        int[] arrayOfInt1;
        int j;
        if (bool2)
        {
          arrayOfInt1 = this.OooO0o;
          j = arrayOfInt1.length;
          if (j != 0) {}
        }
        else
        {
          float f1 = this.OooO0o0;
          float f2 = this.OooO0Oo;
          f1 -= f2;
          f2 = this.OooO0OO;
          f1 /= f2;
          double d = Math.floor(f1);
          j = (int)d + m;
          int[] arrayOfInt2 = new int[j];
          while (k < j)
          {
            float f3 = this.OooO0Oo;
            float f4 = k;
            float f5 = this.OooO0OO;
            f4 *= f5;
            f3 += f4;
            int n = Math.round(f3);
            arrayOfInt2[k] = n;
            k += 1;
          }
          arrayOfInt1 = OooO0O0(arrayOfInt2);
          this.OooO0o = arrayOfInt1;
        }
        this.OooO0O0 = m;
        break label179;
      }
    }
    this.OooO0O0 = false;
    label179:
    return this.OooO0O0;
  }
  
  public final boolean OooOOO(int paramInt, RectF paramRectF)
  {
    Object localObject1 = this.OooO.getText();
    Object localObject2 = this.OooO.getTransformationMethod();
    if (localObject2 != null)
    {
      localObject3 = this.OooO;
      localObject2 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, (View)localObject3);
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    localObject2 = this.OooO;
    int i = AppCompatTextViewAutoSizeHelper.Api16Impl.OooO0O0((TextView)localObject2);
    OooO0oO(paramInt);
    Object localObject4 = this.OooO;
    Object localObject3 = "getLayoutAlignment";
    Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
    localObject4 = (Layout.Alignment)OooO0oo(localObject4, (String)localObject3, localAlignment);
    int j = Math.round(paramRectF.right);
    localObject4 = OooO0Oo((CharSequence)localObject1, (Layout.Alignment)localObject4, j, i);
    j = -1;
    localAlignment = null;
    int k = 1;
    if (i != j)
    {
      j = ((StaticLayout)localObject4).getLineCount();
      if (j <= i)
      {
        i = ((StaticLayout)localObject4).getLineCount() - k;
        i = ((Layout)localObject4).getLineEnd(i);
        int m = ((CharSequence)localObject1).length();
        if (i == m) {}
      }
      else
      {
        return false;
      }
    }
    float f1 = ((Layout)localObject4).getHeight();
    float f2 = paramRectF.bottom;
    paramInt = f1 < f2;
    if (paramInt > 0) {
      return false;
    }
    return k;
  }
  
  public final boolean OooOOO0()
  {
    int[] arrayOfInt = this.OooO0o;
    int i = arrayOfInt.length;
    int j = 0;
    float f1 = 0.0F;
    int k = 1;
    int m;
    if (i > 0) {
      m = k;
    } else {
      m = 0;
    }
    this.OooO0oO = m;
    if (m != 0)
    {
      this.OooO00o = k;
      j = arrayOfInt[0];
      f1 = j;
      this.OooO0Oo = f1;
      i -= k;
      float f2 = arrayOfInt[i];
      this.OooO0o0 = f2;
      f2 = -1.0F;
      this.OooO0OO = f2;
    }
    return m;
  }
  
  public final boolean OooOOOO()
  {
    return this.OooO instanceof AppCompatEditText ^ true;
  }
  
  public final void OooOOOo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = false;
    StringBuilder localStringBuilder = null;
    boolean bool2 = paramFloat1 < 0.0F;
    String str = "px) is less or equal to (0px)";
    if (bool2)
    {
      bool2 = paramFloat2 < paramFloat1;
      if (bool2)
      {
        bool1 = paramFloat3 < 0.0F;
        if (bool1)
        {
          this.OooO00o = 1;
          this.OooO0Oo = paramFloat1;
          this.OooO0o0 = paramFloat2;
          this.OooO0OO = paramFloat3;
          this.OooO0oO = false;
          return;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("The auto-size step granularity (");
        ((StringBuilder)localObject2).append(paramFloat3);
        ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject3 = new java/lang/IllegalArgumentException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Maximum auto-size text size (");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append("px) is less or equal to minimum auto-size text size (");
      localStringBuilder.append(paramFloat1);
      localStringBuilder.append("px)");
      localObject1 = localStringBuilder.toString();
      ((IllegalArgumentException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append("Minimum auto-size text size (");
    ((StringBuilder)localObject3).append(paramFloat1);
    ((StringBuilder)localObject3).append(str);
    Object localObject1 = ((StringBuilder)localObject3).toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public int getAutoSizeMaxTextSize()
  {
    return Math.round(this.OooO0o0);
  }
  
  public int getAutoSizeMinTextSize()
  {
    return Math.round(this.OooO0Oo);
  }
  
  public int getAutoSizeStepGranularity()
  {
    return Math.round(this.OooO0OO);
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    return this.OooO0o;
  }
  
  public int getAutoSizeTextType()
  {
    return this.OooO00o;
  }
  
  public boolean isAutoSizeEnabled()
  {
    boolean bool = OooOOOO();
    if (bool)
    {
      i = this.OooO00o;
      if (i != 0) {
        return 1;
      }
    }
    int i = 0;
    return i;
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    int i = OooOOOO();
    if (i != 0) {
      if (paramInt != 0)
      {
        i = 1;
        float f1 = 1.4E-45F;
        Object localObject;
        if (paramInt == i)
        {
          localObject = this.OooOO0.getResources().getDisplayMetrics();
          i = 1094713344;
          int j = 2;
          f1 = TypedValue.applyDimension(j, 12.0F, (DisplayMetrics)localObject);
          float f2 = 112.0F;
          float f3 = TypedValue.applyDimension(j, f2, (DisplayMetrics)localObject);
          j = 1065353216;
          float f4 = 1.0F;
          OooOOOo(f1, f3, f4);
          paramInt = OooOO0o();
          if (paramInt != 0) {
            OooO00o();
          }
        }
        else
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Unknown auto-size text type: ");
          localStringBuilder.append(paramInt);
          localObject = localStringBuilder.toString();
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
      else
      {
        OooO0OO();
      }
    }
  }
  
  public void setTextSizeInternal(int paramInt, float paramFloat)
  {
    Object localObject = this.OooOO0;
    if (localObject == null) {
      localObject = Resources.getSystem();
    } else {
      localObject = ((Context)localObject).getResources();
    }
    localObject = ((Resources)localObject).getDisplayMetrics();
    float f = TypedValue.applyDimension(paramInt, paramFloat, (DisplayMetrics)localObject);
    setRawTextSize(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
 * JD-Core Version:    0.7.0.1
 */