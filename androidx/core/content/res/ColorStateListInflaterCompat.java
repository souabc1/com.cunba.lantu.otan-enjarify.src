package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R.attr;
import androidx.core.R.styleable;
import androidx.core.math.MathUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ColorStateListInflaterCompat
{
  public static final ThreadLocal OooO00o;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO00o = localThreadLocal;
  }
  
  public static ColorStateList OooO00o(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    int j;
    int k;
    do
    {
      i = paramXmlPullParser.next();
      j = 2;
      if (i == j) {
        break;
      }
      k = 1;
    } while (i != k);
    if (i == j) {
      return OooO0O0(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramResources.<init>("No start tag found");
    throw paramResources;
  }
  
  public static ColorStateList OooO0O0(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    String str1 = paramXmlPullParser.getName();
    String str2 = "selector";
    boolean bool = str1.equals(str2);
    if (bool) {
      return OooO0Oo(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramAttributeSet = new java/lang/StringBuilder;
    paramAttributeSet.<init>();
    paramXmlPullParser = paramXmlPullParser.getPositionDescription();
    paramAttributeSet.append(paramXmlPullParser);
    paramAttributeSet.append(": invalid color state list tag ");
    paramAttributeSet.append(str1);
    paramXmlPullParser = paramAttributeSet.toString();
    paramResources.<init>(paramXmlPullParser);
    throw paramResources;
  }
  
  public static ColorStateList OooO0OO(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
      return OooO00o(paramResources, localXmlResourceParser, paramTheme);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static ColorStateList OooO0Oo(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = paramResources;
    Object localObject2 = paramAttributeSet;
    Object localObject3 = paramTheme;
    int i = paramXmlPullParser.getDepth();
    int j = 1;
    i += j;
    int k = 20;
    Object localObject4 = new int[k][];
    int[] arrayOfInt1 = new int[k];
    int m = 0;
    for (;;)
    {
      int n = paramXmlPullParser.next();
      if (n == j) {
        break;
      }
      int i2 = paramXmlPullParser.getDepth();
      if (i2 < i)
      {
        i3 = 3;
        f1 = 4.203895E-045F;
        if (n == i3) {
          break;
        }
      }
      int i3 = 2;
      float f1 = 2.802597E-045F;
      if ((n == i3) && (i2 <= i))
      {
        Object localObject5 = paramXmlPullParser.getName();
        Object localObject6 = "item";
        boolean bool1 = ((String)localObject5).equals(localObject6);
        if (bool1)
        {
          localObject5 = R.styleable.ColorStateListItem;
          localObject5 = OooO0oO((Resources)localObject1, (Resources.Theme)localObject3, (AttributeSet)localObject2, (int[])localObject5);
          i2 = R.styleable.ColorStateListItem_android_color;
          i3 = -1;
          f1 = 0.0F / 0.0F;
          i2 = ((TypedArray)localObject5).getResourceId(i2, i3);
          int i8 = -65281;
          float f2 = 0.0F / 0.0F;
          if (i2 != i3)
          {
            boolean bool2 = OooO0o0((Resources)localObject1, i2);
            if (!bool2) {
              try
              {
                localObject6 = ((Resources)localObject1).getXml(i2);
                localObject6 = OooO00o((Resources)localObject1, (XmlPullParser)localObject6, (Resources.Theme)localObject3);
                i2 = ((ColorStateList)localObject6).getDefaultColor();
              }
              catch (Exception localException) {}
            }
          }
          i2 = R.styleable.ColorStateListItem_android_color;
          i2 = ((TypedArray)localObject5).getColor(i2, i8);
          int i4 = R.styleable.ColorStateListItem_android_alpha;
          boolean bool3 = ((TypedArray)localObject5).hasValue(i4);
          i8 = 1065353216;
          f2 = 1.0F;
          if (bool3) {}
          for (int i5 = R.styleable.ColorStateListItem_android_alpha;; i6 = R.styleable.ColorStateListItem_alpha)
          {
            f2 = ((TypedArray)localObject5).getFloat(i5, f2);
            break;
            i5 = R.styleable.ColorStateListItem_alpha;
            boolean bool4 = ((TypedArray)localObject5).hasValue(i5);
            if (!bool4) {
              break;
            }
          }
          int i6 = Build.VERSION.SDK_INT;
          int i9 = 31;
          int i10 = -1082130432;
          float f3 = -1.0F;
          if (i6 >= i9)
          {
            i6 = R.styleable.ColorStateListItem_android_lStar;
            boolean bool5 = ((TypedArray)localObject5).hasValue(i6);
            if (bool5)
            {
              i7 = R.styleable.ColorStateListItem_android_lStar;
              break label389;
            }
          }
          int i7 = R.styleable.ColorStateListItem_lStar;
          label389:
          f1 = ((TypedArray)localObject5).getFloat(i7, f3);
          ((TypedArray)localObject5).recycle();
          int i1 = paramAttributeSet.getAttributeCount();
          int[] arrayOfInt2 = new int[i1];
          i10 = 0;
          f3 = 0.0F;
          int i11 = 0;
          while (i10 < i1)
          {
            j = ((AttributeSet)localObject2).getAttributeNameResource(i10);
            int i12 = 16843173;
            if (j != i12)
            {
              i12 = 16843551;
              if (j != i12)
              {
                i12 = R.attr.alpha;
                if (j != i12)
                {
                  i12 = R.attr.lStar;
                  if (j != i12)
                  {
                    i12 = i11 + 1;
                    localObject1 = null;
                    boolean bool6 = ((AttributeSet)localObject2).getAttributeBooleanValue(i10, false);
                    if (!bool6) {
                      j = -j;
                    }
                    arrayOfInt2[i11] = j;
                    i11 = i12;
                  }
                }
              }
            }
            i10 += 1;
            j = 1;
            localObject1 = paramResources;
          }
          localObject1 = StateSet.trimStateSet(arrayOfInt2, i11);
          j = OooO0o(i2, f2, f1);
          arrayOfInt1 = GrowingArrayUtils.OooO00o(arrayOfInt1, m, j);
          localObject1 = GrowingArrayUtils.OooO0O0((Object[])localObject4, m, localObject1);
          localObject4 = localObject1;
          localObject4 = (int[][])localObject1;
          m += 1;
        }
      }
      j = 1;
      localObject1 = paramResources;
    }
    localObject1 = new int[m];
    localObject2 = new int[m][];
    System.arraycopy(arrayOfInt1, 0, localObject1, 0, m);
    System.arraycopy(localObject4, 0, localObject2, 0, m);
    localObject3 = new android/content/res/ColorStateList;
    ((ColorStateList)localObject3).<init>((int[][])localObject2, (int[])localObject1);
    return localObject3;
  }
  
  public static int OooO0o(int paramInt, float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    boolean bool1 = paramFloat2 < 0.0F;
    if (!bool1)
    {
      f1 = 100.0F;
      bool1 = paramFloat2 < f1;
      if (!bool1)
      {
        bool1 = true;
        f1 = 1.4E-45F;
        break label39;
      }
    }
    bool1 = false;
    f1 = 0.0F;
    label39:
    float f2 = 1.0F;
    boolean bool2 = paramFloat1 < f2;
    if ((!bool2) && (!bool1)) {
      return paramInt;
    }
    f2 = Color.alpha(paramInt) * paramFloat1;
    paramFloat1 = 0.5F;
    int j = (int)(f2 + paramFloat1);
    int i = 255;
    f2 = 3.573311E-043F;
    j = MathUtils.OooO0O0(j, 0, i);
    if (bool1)
    {
      CamColor localCamColor = CamColor.OooO0OO(paramInt);
      f1 = localCamColor.getHue();
      float f3 = localCamColor.getChroma();
      paramInt = CamColor.OooO0oO(f1, f3, paramFloat2);
    }
    paramInt &= 0xFFFFFF;
    j <<= 24;
    return paramInt | j;
  }
  
  public static boolean OooO0o0(Resources paramResources, int paramInt)
  {
    TypedValue localTypedValue = getTypedValue();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, bool);
    int i = localTypedValue.type;
    paramInt = 28;
    if (i >= paramInt)
    {
      paramInt = 31;
      if (i <= paramInt) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static TypedArray OooO0oO(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    } else {
      paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
    }
    return paramResources;
  }
  
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = OooO00o;
    TypedValue localTypedValue = (TypedValue)localThreadLocal.get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      localThreadLocal.set(localTypedValue);
    }
    return localTypedValue;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ColorStateListInflaterCompat
 * JD-Core Version:    0.7.0.1
 */