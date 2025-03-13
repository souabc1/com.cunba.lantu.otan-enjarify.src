package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R.styleable;
import androidx.core.provider.FontRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class FontResourcesParserCompat
{
  public static int OooO00o(TypedArray paramTypedArray, int paramInt)
  {
    return FontResourcesParserCompat.Api21Impl.OooO00o(paramTypedArray, paramInt);
  }
  
  public static FontResourcesParserCompat.FamilyResourceEntry OooO0O0(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
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
      return OooO0Oo(paramXmlPullParser, paramResources);
    }
    paramXmlPullParser = new org/xmlpull/v1/XmlPullParserException;
    paramXmlPullParser.<init>("No start tag found");
    throw paramXmlPullParser;
  }
  
  public static List OooO0OO(Resources paramResources, int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
    try
    {
      int i = localTypedArray.length();
      if (i == 0)
      {
        paramResources = Collections.emptyList();
        return paramResources;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = OooO00o(localTypedArray, 0);
      int k = 1;
      if (j == k)
      {
        paramInt = 0;
        for (;;)
        {
          j = localTypedArray.length();
          if (paramInt >= j) {
            break;
          }
          j = localTypedArray.getResourceId(paramInt, 0);
          if (j != 0)
          {
            Object localObject = paramResources.getStringArray(j);
            localObject = OooO0oo((String[])localObject);
            localArrayList.add(localObject);
          }
          paramInt += 1;
        }
      }
      paramResources = paramResources.getStringArray(paramInt);
      paramResources = OooO0oo(paramResources);
      localArrayList.add(paramResources);
      return localArrayList;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public static FontResourcesParserCompat.FamilyResourceEntry OooO0Oo(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    String str1 = "font-family";
    paramXmlPullParser.require(2, null, str1);
    String str2 = paramXmlPullParser.getName();
    boolean bool = str2.equals(str1);
    if (bool) {
      return OooO0o0(paramXmlPullParser, paramResources);
    }
    OooO0oO(paramXmlPullParser);
    return null;
  }
  
  public static FontResourcesParserCompat.FontFileResourceEntry OooO0o(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.FontFamilyFont;
    paramResources = paramResources.obtainAttributes(localAttributeSet, arrayOfInt);
    int i = R.styleable.FontFamilyFont_fontWeight;
    boolean bool1 = paramResources.hasValue(i);
    if (bool1) {
      j = R.styleable.FontFamilyFont_fontWeight;
    } else {
      j = R.styleable.FontFamilyFont_android_fontWeight;
    }
    int i1 = 400;
    int i2 = paramResources.getInt(j, i1);
    int j = R.styleable.FontFamilyFont_fontStyle;
    boolean bool2 = paramResources.hasValue(j);
    if (bool2) {
      k = R.styleable.FontFamilyFont_fontStyle;
    } else {
      k = R.styleable.FontFamilyFont_android_fontStyle;
    }
    i1 = 0;
    arrayOfInt = null;
    int k = paramResources.getInt(k, 0);
    int i3 = 1;
    int i5;
    if (i3 == k) {
      i5 = i3;
    } else {
      i5 = 0;
    }
    k = R.styleable.FontFamilyFont_ttcIndex;
    boolean bool3 = paramResources.hasValue(k);
    if (bool3) {
      m = R.styleable.FontFamilyFont_ttcIndex;
    } else {
      m = R.styleable.FontFamilyFont_android_ttcIndex;
    }
    i3 = R.styleable.FontFamilyFont_fontVariationSettings;
    boolean bool5 = paramResources.hasValue(i3);
    int i4;
    if (bool5) {
      i4 = R.styleable.FontFamilyFont_fontVariationSettings;
    } else {
      i4 = R.styleable.FontFamilyFont_android_fontVariationSettings;
    }
    String str1 = paramResources.getString(i4);
    int i6 = paramResources.getInt(m, 0);
    int m = R.styleable.FontFamilyFont_font;
    boolean bool4 = paramResources.hasValue(m);
    int n;
    if (bool4) {
      n = R.styleable.FontFamilyFont_font;
    } else {
      n = R.styleable.FontFamilyFont_android_font;
    }
    int i7 = paramResources.getResourceId(n, 0);
    String str2 = paramResources.getString(n);
    paramResources.recycle();
    for (;;)
    {
      int i8 = paramXmlPullParser.next();
      n = 3;
      if (i8 == n) {
        break;
      }
      OooO0oO(paramXmlPullParser);
    }
    paramXmlPullParser = new androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;
    paramXmlPullParser.<init>(str2, i2, i5, str1, i6, i7);
    return paramXmlPullParser;
  }
  
  public static FontResourcesParserCompat.FamilyResourceEntry OooO0o0(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    Object localObject1 = Xml.asAttributeSet(paramXmlPullParser);
    Object localObject2 = R.styleable.FontFamily;
    localObject1 = paramResources.obtainAttributes((AttributeSet)localObject1, (int[])localObject2);
    int i = R.styleable.FontFamily_fontProviderAuthority;
    localObject2 = ((TypedArray)localObject1).getString(i);
    int j = R.styleable.FontFamily_fontProviderPackage;
    Object localObject3 = ((TypedArray)localObject1).getString(j);
    int k = R.styleable.FontFamily_fontProviderQuery;
    String str1 = ((TypedArray)localObject1).getString(k);
    int m = R.styleable.FontFamily_fontProviderCerts;
    int n = 0;
    m = ((TypedArray)localObject1).getResourceId(m, 0);
    int i1 = R.styleable.FontFamily_fontProviderFetchStrategy;
    i1 = ((TypedArray)localObject1).getInteger(i1, 1);
    int i2 = R.styleable.FontFamily_fontProviderFetchTimeout;
    i2 = ((TypedArray)localObject1).getInteger(i2, 500);
    int i3 = R.styleable.FontFamily_fontProviderSystemFontFamily;
    String str2 = ((TypedArray)localObject1).getString(i3);
    ((TypedArray)localObject1).recycle();
    int i4 = 3;
    if ((localObject2 != null) && (localObject3 != null) && (str1 != null))
    {
      for (;;)
      {
        n = paramXmlPullParser.next();
        if (n == i4) {
          break;
        }
        OooO0oO(paramXmlPullParser);
      }
      paramXmlPullParser = OooO0OO(paramResources, m);
      paramResources = new androidx/core/content/res/FontResourcesParserCompat$ProviderResourceEntry;
      localObject1 = new androidx/core/provider/FontRequest;
      ((FontRequest)localObject1).<init>((String)localObject2, (String)localObject3, str1, paramXmlPullParser);
      paramResources.<init>((FontRequest)localObject1, i1, i2, str2);
      return paramResources;
    }
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    for (;;)
    {
      j = paramXmlPullParser.next();
      if (j == i4) {
        break;
      }
      j = paramXmlPullParser.getEventType();
      k = 2;
      if (j == k)
      {
        localObject3 = paramXmlPullParser.getName();
        str1 = "font";
        boolean bool1 = ((String)localObject3).equals(str1);
        if (bool1)
        {
          localObject3 = OooO0o(paramXmlPullParser, paramResources);
          ((List)localObject2).add(localObject3);
        }
        else
        {
          OooO0oO(paramXmlPullParser);
        }
      }
    }
    boolean bool2 = ((List)localObject2).isEmpty();
    if (bool2) {
      return null;
    }
    paramXmlPullParser = new androidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry;
    paramResources = new FontResourcesParserCompat.FontFileResourceEntry[0];
    paramResources = (FontResourcesParserCompat.FontFileResourceEntry[])((List)localObject2).toArray(paramResources);
    paramXmlPullParser.<init>(paramResources);
    return paramXmlPullParser;
  }
  
  public static void OooO0oO(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlPullParser.next();
      int k = 2;
      if (j != k)
      {
        k = 3;
        if (j == k) {
          i += -1;
        }
      }
      else
      {
        i += 1;
      }
    }
  }
  
  public static List OooO0oo(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte = Base64.decode(paramArrayOfString[j], 0);
      localArrayList.add(arrayOfByte);
      j += 1;
    }
    return localArrayList;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat
 * JD-Core Version:    0.7.0.1
 */