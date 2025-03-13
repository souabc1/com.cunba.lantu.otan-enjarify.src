package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.IOException;
import java.io.InputStream;

public class TypefaceCompatApi29Impl
  extends TypefaceCompatBaseImpl
{
  public static int OooOO0o(FontStyle paramFontStyle1, FontStyle paramFontStyle2)
  {
    int i = paramFontStyle1.getWeight();
    int j = paramFontStyle2.getWeight();
    i = Math.abs(i - j) / 100;
    int k = paramFontStyle1.getSlant();
    int m = paramFontStyle2.getSlant();
    if (k == m)
    {
      k = 0;
      paramFontStyle1 = null;
    }
    else
    {
      k = 2;
    }
    return i + k;
  }
  
  public FontsContractCompat.FontInfo OooO(FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    paramArrayOfFontInfo = new java/lang/RuntimeException;
    paramArrayOfFontInfo.<init>("Do not use this function in API 29 or later.");
    throw paramArrayOfFontInfo;
  }
  
  public Typeface OooO0O0(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    paramContext = null;
    for (;;)
    {
      try
      {
        paramFontFamilyFilesResourceEntry = paramFontFamilyFilesResourceEntry.getEntries();
        int i = paramFontFamilyFilesResourceEntry.length;
        localObject1 = null;
        j = 0;
        if (j < i) {
          localObject2 = paramFontFamilyFilesResourceEntry[j];
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        int j;
        Object localObject2;
        Object localObject3;
        int k;
        int m;
        int n;
        continue;
      }
      try
      {
        localObject3 = new android/graphics/fonts/Font$Builder;
        k = ((FontResourcesParserCompat.FontFileResourceEntry)localObject2).getResourceId();
        ((Font.Builder)localObject3).<init>(paramResources, k);
        k = ((FontResourcesParserCompat.FontFileResourceEntry)localObject2).getWeight();
        localObject3 = ((Font.Builder)localObject3).setWeight(k);
        m = ((FontResourcesParserCompat.FontFileResourceEntry)localObject2).isItalic();
        if (m != 0) {
          m = 1;
        } else {
          m = 0;
        }
        localObject3 = ((Font.Builder)localObject3).setSlant(m);
        n = ((FontResourcesParserCompat.FontFileResourceEntry)localObject2).getTtcIndex();
        localObject3 = ((Font.Builder)localObject3).setTtcIndex(n);
        localObject2 = ((FontResourcesParserCompat.FontFileResourceEntry)localObject2).getVariationSettings();
        localObject2 = ((Font.Builder)localObject3).setFontVariationSettings((String)localObject2);
        localObject2 = ((Font.Builder)localObject2).build();
        if (localObject1 == null)
        {
          localObject3 = new android/graphics/fonts/FontFamily$Builder;
          ((FontFamily.Builder)localObject3).<init>((Font)localObject2);
          localObject1 = localObject3;
        }
        else
        {
          localObject1.addFont((Font)localObject2);
        }
      }
      catch (IOException localIOException)
      {
        continue;
      }
      j += 1;
    }
    if (localObject1 == null) {
      return null;
    }
    paramFontFamilyFilesResourceEntry = localObject1.build();
    paramResources = new android/graphics/Typeface$CustomFallbackBuilder;
    paramResources.<init>(paramFontFamilyFilesResourceEntry);
    paramFontFamilyFilesResourceEntry = OooOO0O(paramFontFamilyFilesResourceEntry, paramInt);
    paramFontFamilyFilesResourceEntry = paramFontFamilyFilesResourceEntry.getStyle();
    paramFontFamilyFilesResourceEntry = paramResources.setStyle(paramFontFamilyFilesResourceEntry);
    paramContext = paramFontFamilyFilesResourceEntry.build();
    return paramContext;
  }
  
  /* Error */
  public Typeface OooO0OO(Context paramContext, android.os.CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 122	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_1
    //   5: aload_3
    //   6: arraylength
    //   7: istore 5
    //   9: aconst_null
    //   10: astore 6
    //   12: iconst_0
    //   13: istore 7
    //   15: iload 7
    //   17: iload 5
    //   19: if_icmpge +196 -> 215
    //   22: aload_3
    //   23: iload 7
    //   25: aaload
    //   26: astore 8
    //   28: aload 8
    //   30: invokevirtual 128	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   33: astore 9
    //   35: ldc 130
    //   37: astore 10
    //   39: aload_1
    //   40: aload 9
    //   42: aload 10
    //   44: aload_2
    //   45: invokevirtual 136	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   48: astore 9
    //   50: aload 9
    //   52: ifnonnull +16 -> 68
    //   55: aload 9
    //   57: ifnull +149 -> 206
    //   60: aload 9
    //   62: invokevirtual 141	android/os/ParcelFileDescriptor:close	()V
    //   65: goto +141 -> 206
    //   68: new 39	android/graphics/fonts/Font$Builder
    //   71: astore 10
    //   73: aload 10
    //   75: aload 9
    //   77: invokespecial 144	android/graphics/fonts/Font$Builder:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   80: aload 8
    //   82: invokevirtual 145	androidx/core/provider/FontsContractCompat$FontInfo:getWeight	()I
    //   85: istore 11
    //   87: aload 10
    //   89: iload 11
    //   91: invokevirtual 52	android/graphics/fonts/Font$Builder:setWeight	(I)Landroid/graphics/fonts/Font$Builder;
    //   94: astore 10
    //   96: aload 8
    //   98: invokevirtual 146	androidx/core/provider/FontsContractCompat$FontInfo:isItalic	()Z
    //   101: istore 11
    //   103: iload 11
    //   105: ifeq +9 -> 114
    //   108: iconst_1
    //   109: istore 11
    //   111: goto +6 -> 117
    //   114: iconst_0
    //   115: istore 11
    //   117: aload 10
    //   119: iload 11
    //   121: invokevirtual 60	android/graphics/fonts/Font$Builder:setSlant	(I)Landroid/graphics/fonts/Font$Builder;
    //   124: astore 10
    //   126: aload 8
    //   128: invokevirtual 147	androidx/core/provider/FontsContractCompat$FontInfo:getTtcIndex	()I
    //   131: istore 12
    //   133: aload 10
    //   135: iload 12
    //   137: invokevirtual 66	android/graphics/fonts/Font$Builder:setTtcIndex	(I)Landroid/graphics/fonts/Font$Builder;
    //   140: astore 8
    //   142: aload 8
    //   144: invokevirtual 78	android/graphics/fonts/Font$Builder:build	()Landroid/graphics/fonts/Font;
    //   147: astore 8
    //   149: aload 6
    //   151: ifnonnull +22 -> 173
    //   154: new 80	android/graphics/fonts/FontFamily$Builder
    //   157: astore 10
    //   159: aload 10
    //   161: aload 8
    //   163: invokespecial 83	android/graphics/fonts/FontFamily$Builder:<init>	(Landroid/graphics/fonts/Font;)V
    //   166: aload 10
    //   168: astore 6
    //   170: goto -110 -> 60
    //   173: aload 6
    //   175: aload 8
    //   177: invokevirtual 87	android/graphics/fonts/FontFamily$Builder:addFont	(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   180: pop
    //   181: goto -121 -> 60
    //   184: astore 8
    //   186: aload 9
    //   188: invokevirtual 141	android/os/ParcelFileDescriptor:close	()V
    //   191: goto +12 -> 203
    //   194: astore 9
    //   196: aload 8
    //   198: aload 9
    //   200: invokevirtual 153	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   203: aload 8
    //   205: athrow
    //   206: iload 7
    //   208: iconst_1
    //   209: iadd
    //   210: istore 7
    //   212: goto -197 -> 15
    //   215: aload 6
    //   217: ifnonnull +5 -> 222
    //   220: aconst_null
    //   221: areturn
    //   222: aload 6
    //   224: invokevirtual 90	android/graphics/fonts/FontFamily$Builder:build	()Landroid/graphics/fonts/FontFamily;
    //   227: astore_1
    //   228: new 92	android/graphics/Typeface$CustomFallbackBuilder
    //   231: astore_2
    //   232: aload_2
    //   233: aload_1
    //   234: invokespecial 95	android/graphics/Typeface$CustomFallbackBuilder:<init>	(Landroid/graphics/fonts/FontFamily;)V
    //   237: aload_0
    //   238: aload_1
    //   239: iload 4
    //   241: invokevirtual 99	androidx/core/graphics/TypefaceCompatApi29Impl:OooOO0O	(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
    //   244: astore_1
    //   245: aload_1
    //   246: invokevirtual 105	android/graphics/fonts/Font:getStyle	()Landroid/graphics/fonts/FontStyle;
    //   249: astore_1
    //   250: aload_2
    //   251: aload_1
    //   252: invokevirtual 109	android/graphics/Typeface$CustomFallbackBuilder:setStyle	(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   255: astore_1
    //   256: aload_1
    //   257: invokevirtual 112	android/graphics/Typeface$CustomFallbackBuilder:build	()Landroid/graphics/Typeface;
    //   260: areturn
    //   261: pop
    //   262: aconst_null
    //   263: areturn
    //   264: pop
    //   265: goto -59 -> 206
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	this	TypefaceCompatApi29Impl
    //   0	268	1	paramContext	Context
    //   0	268	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	268	3	paramArrayOfFontInfo	FontsContractCompat.FontInfo[]
    //   0	268	4	paramInt	int
    //   7	13	5	i	int
    //   10	213	6	localObject1	Object
    //   13	198	7	j	int
    //   26	150	8	localObject2	Object
    //   184	20	8	localObject3	Object
    //   33	154	9	localObject4	Object
    //   194	5	9	localThrowable	java.lang.Throwable
    //   37	130	10	localObject5	Object
    //   85	5	11	k	int
    //   101	19	11	m	int
    //   131	5	12	n	int
    //   261	1	16	localException	Exception
    //   264	1	17	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   68	71	184	finally
    //   75	80	184	finally
    //   80	85	184	finally
    //   89	94	184	finally
    //   96	101	184	finally
    //   119	124	184	finally
    //   126	131	184	finally
    //   135	140	184	finally
    //   142	147	184	finally
    //   154	157	184	finally
    //   161	166	184	finally
    //   175	181	184	finally
    //   186	191	194	finally
    //   5	7	261	java/lang/Exception
    //   23	26	261	java/lang/Exception
    //   28	33	261	java/lang/Exception
    //   44	48	261	java/lang/Exception
    //   60	65	261	java/lang/Exception
    //   198	203	261	java/lang/Exception
    //   203	206	261	java/lang/Exception
    //   222	227	261	java/lang/Exception
    //   228	231	261	java/lang/Exception
    //   233	237	261	java/lang/Exception
    //   239	244	261	java/lang/Exception
    //   245	249	261	java/lang/Exception
    //   251	255	261	java/lang/Exception
    //   256	260	261	java/lang/Exception
    //   28	33	264	java/io/IOException
    //   44	48	264	java/io/IOException
    //   60	65	264	java/io/IOException
    //   198	203	264	java/io/IOException
    //   203	206	264	java/io/IOException
  }
  
  public Typeface OooO0Oo(Context paramContext, InputStream paramInputStream)
  {
    paramContext = new java/lang/RuntimeException;
    paramContext.<init>("Do not use this function in API 29 or later.");
    throw paramContext;
  }
  
  public Typeface OooO0o0(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramContext = new android/graphics/fonts/Font$Builder;
      paramContext.<init>(paramResources, paramInt1);
      paramContext = paramContext.build();
      paramResources = new android/graphics/fonts/FontFamily$Builder;
      paramResources.<init>(paramContext);
      paramResources = paramResources.build();
      Typeface.CustomFallbackBuilder localCustomFallbackBuilder = new android/graphics/Typeface$CustomFallbackBuilder;
      localCustomFallbackBuilder.<init>(paramResources);
      paramContext = paramContext.getStyle();
      paramContext = localCustomFallbackBuilder.setStyle(paramContext);
      return paramContext.build();
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final Font OooOO0O(FontFamily paramFontFamily, int paramInt)
  {
    FontStyle localFontStyle1 = new android/graphics/fonts/FontStyle;
    int i = paramInt & 0x1;
    if (i != 0) {
      i = 700;
    } else {
      i = 400;
    }
    paramInt &= 0x2;
    int j = 0;
    Font localFont1 = null;
    int k = 1;
    if (paramInt != 0)
    {
      paramInt = k;
    }
    else
    {
      paramInt = 0;
      localFont2 = null;
    }
    localFontStyle1.<init>(i, paramInt);
    Font localFont2 = paramFontFamily.getFont(0);
    FontStyle localFontStyle2 = localFont2.getStyle();
    i = OooOO0o(localFontStyle1, localFontStyle2);
    for (;;)
    {
      j = paramFontFamily.getSize();
      if (k >= j) {
        break;
      }
      localFont1 = paramFontFamily.getFont(k);
      FontStyle localFontStyle3 = localFont1.getStyle();
      int m = OooOO0o(localFontStyle1, localFontStyle3);
      if (m < i)
      {
        localFont2 = localFont1;
        i = m;
      }
      k += 1;
    }
    return localFont2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi29Impl
 * JD-Core Version:    0.7.0.1
 */