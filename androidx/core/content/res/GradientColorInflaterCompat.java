package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R.styleable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class GradientColorInflaterCompat
{
  public static GradientColorInflaterCompat.ColorStops OooO00o(GradientColorInflaterCompat.ColorStops paramColorStops, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (paramColorStops != null) {
      return paramColorStops;
    }
    paramColorStops = new androidx/core/content/res/GradientColorInflaterCompat$ColorStops;
    if (paramBoolean)
    {
      paramColorStops.<init>(paramInt1, paramInt3, paramInt2);
      return paramColorStops;
    }
    paramColorStops.<init>(paramInt1, paramInt2);
    return paramColorStops;
  }
  
  public static Shader OooO0O0(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = paramXmlPullParser;
    Object localObject2 = paramXmlPullParser.getName();
    Object localObject3 = "gradient";
    boolean bool1 = ((String)localObject2).equals(localObject3);
    if (bool1)
    {
      localObject2 = R.styleable.GradientColor;
      localObject3 = paramResources;
      localObject4 = paramAttributeSet;
      localObject2 = TypedArrayUtils.OooOOo0(paramResources, paramTheme, paramAttributeSet, (int[])localObject2);
      int j = R.styleable.GradientColor_android_startX;
      float f1 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "startX", j, 0.0F);
      j = R.styleable.GradientColor_android_startY;
      float f2 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "startY", j, 0.0F);
      j = R.styleable.GradientColor_android_endX;
      float f3 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "endX", j, 0.0F);
      j = R.styleable.GradientColor_android_endY;
      float f4 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "endY", j, 0.0F);
      j = R.styleable.GradientColor_android_centerX;
      float f5 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "centerX", j, 0.0F);
      j = R.styleable.GradientColor_android_centerY;
      float f6 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, "centerY", j, 0.0F);
      String str1 = "type";
      j = R.styleable.GradientColor_android_type;
      int k = TypedArrayUtils.OooOO0O((TypedArray)localObject2, paramXmlPullParser, str1, j, 0);
      String str2 = "startColor";
      int m = R.styleable.GradientColor_android_startColor;
      j = TypedArrayUtils.OooO0o((TypedArray)localObject2, paramXmlPullParser, str2, m, 0);
      Object localObject5 = "centerColor";
      boolean bool2 = TypedArrayUtils.OooOOOo(paramXmlPullParser, (String)localObject5);
      int i = R.styleable.GradientColor_android_centerColor;
      i = TypedArrayUtils.OooO0o((TypedArray)localObject2, paramXmlPullParser, (String)localObject5, i, 0);
      int n = R.styleable.GradientColor_android_endColor;
      n = TypedArrayUtils.OooO0o((TypedArray)localObject2, paramXmlPullParser, "endColor", n, 0);
      localObject5 = "tileMode";
      int i1 = R.styleable.GradientColor_android_tileMode;
      i1 = TypedArrayUtils.OooOO0O((TypedArray)localObject2, paramXmlPullParser, (String)localObject5, i1, 0);
      Object localObject6 = "gradientRadius";
      m = R.styleable.GradientColor_android_gradientRadius;
      float f7 = f5;
      f5 = 0.0F;
      float[] arrayOfFloat = null;
      float f8 = TypedArrayUtils.OooOO0((TypedArray)localObject2, paramXmlPullParser, (String)localObject6, m, 0.0F);
      ((TypedArray)localObject2).recycle();
      localObject1 = OooO00o(OooO0OO(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme), j, n, bool2, i);
      int i2 = 1;
      if (k != i2)
      {
        i2 = 2;
        if (k != i2)
        {
          localObject2 = new android/graphics/LinearGradient;
          localObject5 = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO00o;
          arrayOfFloat = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO0O0;
          Shader.TileMode localTileMode1 = OooO0Oo(i1);
          localObject6 = localObject2;
          ((LinearGradient)localObject2).<init>(f1, f2, f3, f4, (int[])localObject5, arrayOfFloat, localTileMode1);
          return localObject2;
        }
        localObject2 = new android/graphics/SweepGradient;
        localObject3 = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO00o;
        localObject1 = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO0O0;
        ((SweepGradient)localObject2).<init>(f7, f6, (int[])localObject3, (float[])localObject1);
        return localObject2;
      }
      localObject2 = null;
      boolean bool3 = f8 < 0.0F;
      if (bool3)
      {
        localObject2 = new android/graphics/RadialGradient;
        localObject3 = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO00o;
        localObject1 = ((GradientColorInflaterCompat.ColorStops)localObject1).OooO0O0;
        Shader.TileMode localTileMode2 = OooO0Oo(i1);
        localObject5 = localObject2;
        f5 = f7;
        ((RadialGradient)localObject2).<init>(f7, f6, f8, (int[])localObject3, (float[])localObject1, localTileMode2);
        return localObject2;
      }
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      ((XmlPullParserException)localObject1).<init>("<gradient> tag requires 'gradientRadius' attribute with radial type");
      throw ((Throwable)localObject1);
    }
    localObject3 = new org/xmlpull/v1/XmlPullParserException;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject1 = paramXmlPullParser.getPositionDescription();
    ((StringBuilder)localObject4).append((String)localObject1);
    ((StringBuilder)localObject4).append(": invalid gradient color tag ");
    ((StringBuilder)localObject4).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject4).toString();
    ((XmlPullParserException)localObject3).<init>((String)localObject1);
    throw ((Throwable)localObject3);
  }
  
  public static GradientColorInflaterCompat.ColorStops OooO0OO(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth();
    int j = 1;
    i += j;
    ArrayList localArrayList1 = new java/util/ArrayList;
    int k = 20;
    localArrayList1.<init>(k);
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>(k);
    for (;;)
    {
      k = paramXmlPullParser.next();
      if (k == j) {
        break label312;
      }
      int m = paramXmlPullParser.getDepth();
      if (m < i)
      {
        i1 = 3;
        f = 4.203895E-045F;
        if (k == i1) {
          break label312;
        }
      }
      int i1 = 2;
      float f = 2.802597E-045F;
      if ((k == i1) && (m <= i))
      {
        Object localObject = paramXmlPullParser.getName();
        String str = "item";
        boolean bool1 = ((String)localObject).equals(str);
        if (bool1)
        {
          localObject = R.styleable.GradientColorItem;
          localObject = TypedArrayUtils.OooOOo0(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
          m = R.styleable.GradientColorItem_android_color;
          boolean bool2 = ((TypedArray)localObject).hasValue(m);
          i1 = R.styleable.GradientColorItem_android_offset;
          boolean bool3 = ((TypedArray)localObject).hasValue(i1);
          if ((!bool2) || (!bool3)) {
            break;
          }
          int n = R.styleable.GradientColorItem_android_color;
          n = ((TypedArray)localObject).getColor(n, 0);
          int i2 = R.styleable.GradientColorItem_android_offset;
          f = ((TypedArray)localObject).getFloat(i2, 0.0F);
          ((TypedArray)localObject).recycle();
          localObject = Integer.valueOf(n);
          localArrayList2.add(localObject);
          localObject = Float.valueOf(f);
          localArrayList1.add(localObject);
        }
      }
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramAttributeSet = new java/lang/StringBuilder;
    paramAttributeSet.<init>();
    paramXmlPullParser = paramXmlPullParser.getPositionDescription();
    paramAttributeSet.append(paramXmlPullParser);
    paramAttributeSet.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    paramXmlPullParser = paramAttributeSet.toString();
    paramResources.<init>(paramXmlPullParser);
    throw paramResources;
    label312:
    int i3 = localArrayList2.size();
    if (i3 > 0)
    {
      paramResources = new androidx/core/content/res/GradientColorInflaterCompat$ColorStops;
      paramResources.<init>(localArrayList2, localArrayList1);
      return paramResources;
    }
    return null;
  }
  
  public static Shader.TileMode OooO0Oo(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i) {
        return Shader.TileMode.CLAMP;
      }
      return Shader.TileMode.MIRROR;
    }
    return Shader.TileMode.REPEAT;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.GradientColorInflaterCompat
 * JD-Core Version:    0.7.0.1
 */