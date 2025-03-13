package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class TypedArrayUtils
{
  public static ComplexColorCompat OooO(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (bool)
    {
      paramXmlPullParser = new android/util/TypedValue;
      paramXmlPullParser.<init>();
      paramTypedArray.getValue(paramInt1, paramXmlPullParser);
      int i = paramXmlPullParser.type;
      int j = 28;
      if (i >= j)
      {
        j = 31;
        if (i <= j) {
          return ComplexColorCompat.OooO0O0(paramXmlPullParser.data);
        }
      }
      paramXmlPullParser = paramTypedArray.getResources();
      i = 0;
      paramString = null;
      int k = paramTypedArray.getResourceId(paramInt1, 0);
      paramTypedArray = ComplexColorCompat.OooO0o0(paramXmlPullParser, k, paramTheme);
      if (paramTypedArray != null) {
        return paramTypedArray;
      }
    }
    return ComplexColorCompat.OooO0O0(paramInt2);
  }
  
  public static int OooO00o(Context paramContext, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    paramContext = paramContext.getTheme();
    boolean bool = true;
    paramContext.resolveAttribute(paramInt1, localTypedValue, bool);
    int i = localTypedValue.resourceId;
    if (i != 0) {
      return paramInt1;
    }
    return paramInt2;
  }
  
  public static boolean OooO0O0(TypedArray paramTypedArray, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramInt2 = paramTypedArray.getBoolean(paramInt2, paramBoolean);
    return paramTypedArray.getBoolean(paramInt1, paramInt2);
  }
  
  public static Drawable OooO0OO(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    Drawable localDrawable = paramTypedArray.getDrawable(paramInt1);
    if (localDrawable == null) {
      localDrawable = paramTypedArray.getDrawable(paramInt2);
    }
    return localDrawable;
  }
  
  public static int OooO0Oo(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = paramTypedArray.getInt(paramInt2, paramInt3);
    return paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static int OooO0o(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (!bool) {
      return paramInt2;
    }
    return paramTypedArray.getColor(paramInt1, paramInt2);
  }
  
  public static boolean OooO0o0(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (!bool) {
      return paramBoolean;
    }
    return paramTypedArray.getBoolean(paramInt, paramBoolean);
  }
  
  public static ColorStateList OooO0oO(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (bool)
    {
      paramXmlPullParser = new android/util/TypedValue;
      paramXmlPullParser.<init>();
      paramTypedArray.getValue(paramInt, paramXmlPullParser);
      int i = paramXmlPullParser.type;
      int j = 2;
      if (i != j)
      {
        j = 28;
        if (i >= j)
        {
          j = 31;
          if (i <= j) {
            return OooO0oo(paramXmlPullParser);
          }
        }
        paramXmlPullParser = paramTypedArray.getResources();
        int k = paramTypedArray.getResourceId(paramInt, 0);
        return ColorStateListInflaterCompat.OooO0OO(paramXmlPullParser, k, paramTheme);
      }
      paramTypedArray = new java/lang/UnsupportedOperationException;
      paramTheme = new java/lang/StringBuilder;
      paramTheme.<init>();
      paramTheme.append("Failed to resolve attribute at index ");
      paramTheme.append(paramInt);
      paramTheme.append(": ");
      paramTheme.append(paramXmlPullParser);
      paramXmlPullParser = paramTheme.toString();
      paramTypedArray.<init>(paramXmlPullParser);
      throw paramTypedArray;
    }
    return null;
  }
  
  public static ColorStateList OooO0oo(TypedValue paramTypedValue)
  {
    return ColorStateList.valueOf(paramTypedValue.data);
  }
  
  public static float OooOO0(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (!bool) {
      return paramFloat;
    }
    return paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int OooOO0O(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = OooOOOo(paramXmlPullParser, paramString);
    if (!bool) {
      return paramInt2;
    }
    return paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static int OooOO0o(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = paramTypedArray.getResourceId(paramInt2, paramInt3);
    return paramTypedArray.getResourceId(paramInt1, paramInt2);
  }
  
  public static CharSequence OooOOO(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = paramTypedArray.getText(paramInt1);
    if (localCharSequence == null) {
      localCharSequence = paramTypedArray.getText(paramInt2);
    }
    return localCharSequence;
  }
  
  public static String OooOOO0(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    String str = paramTypedArray.getString(paramInt1);
    if (str == null) {
      str = paramTypedArray.getString(paramInt2);
    }
    return str;
  }
  
  public static CharSequence[] OooOOOO(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    CharSequence[] arrayOfCharSequence = paramTypedArray.getTextArray(paramInt1);
    if (arrayOfCharSequence == null) {
      arrayOfCharSequence = paramTypedArray.getTextArray(paramInt2);
    }
    return arrayOfCharSequence;
  }
  
  public static boolean OooOOOo(XmlPullParser paramXmlPullParser, String paramString)
  {
    String str = "http://schemas.android.com/apk/res/android";
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(str, paramString);
    boolean bool;
    if (paramXmlPullParser != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramXmlPullParser = null;
    }
    return bool;
  }
  
  public static TypedArray OooOOo0(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.TypedArrayUtils
 * JD-Core Version:    0.7.0.1
 */