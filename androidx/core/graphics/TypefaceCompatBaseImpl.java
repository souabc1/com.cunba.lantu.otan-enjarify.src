package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

class TypefaceCompatBaseImpl
{
  public ConcurrentHashMap OooO00o;
  
  public TypefaceCompatBaseImpl()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.OooO00o = localConcurrentHashMap;
  }
  
  public static Object OooO0oO(Object[] paramArrayOfObject, int paramInt, TypefaceCompatBaseImpl.StyleExtractor paramStyleExtractor)
  {
    int i = paramInt & 0x1;
    if (i == 0) {
      i = 400;
    } else {
      i = 700;
    }
    paramInt &= 0x2;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return OooO0oo(paramArrayOfObject, i, paramInt, paramStyleExtractor);
  }
  
  public static Object OooO0oo(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean, TypefaceCompatBaseImpl.StyleExtractor paramStyleExtractor)
  {
    int i = paramArrayOfObject.length;
    Object localObject1 = null;
    int j = -1 >>> 1;
    int k = 0;
    while (k < i)
    {
      Object localObject2 = paramArrayOfObject[k];
      boolean bool1 = Math.abs(paramStyleExtractor.OooO00o(localObject2) - paramInt) * 2;
      boolean bool2 = paramStyleExtractor.OooO0O0(localObject2);
      if (bool2 == paramBoolean) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      bool1 += bool2;
      if ((localObject1 == null) || (j > bool1))
      {
        localObject1 = localObject2;
        j = bool1;
      }
      k += 1;
    }
    return localObject1;
  }
  
  public static long OooOO0(Typeface paramTypeface)
  {
    long l = 0L;
    if (paramTypeface == null) {
      return l;
    }
    Object localObject = Typeface.class;
    String str = "native_instance";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      paramTypeface = ((Field)localObject).get(paramTypeface);
      paramTypeface = (Number)paramTypeface;
      l = paramTypeface.longValue();
    }
    catch (NoSuchFieldException|IllegalAccessException localNoSuchFieldException)
    {
      label47:
      break label47;
    }
    return l;
  }
  
  public FontsContractCompat.FontInfo OooO(FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    TypefaceCompatBaseImpl.1 local1 = new androidx/core/graphics/TypefaceCompatBaseImpl$1;
    local1.<init>(this);
    return (FontsContractCompat.FontInfo)OooO0oO(paramArrayOfFontInfo, paramInt, local1);
  }
  
  public final void OooO00o(Typeface paramTypeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry)
  {
    long l1 = OooOO0(paramTypeface);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramTypeface = this.OooO00o;
      Long localLong = Long.valueOf(l1);
      paramTypeface.put(localLong, paramFontFamilyFilesResourceEntry);
    }
  }
  
  public Typeface OooO0O0(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    Object localObject = OooO0o(paramFontFamilyFilesResourceEntry, paramInt);
    if (localObject == null) {
      return null;
    }
    int i = ((FontResourcesParserCompat.FontFileResourceEntry)localObject).getResourceId();
    String str = ((FontResourcesParserCompat.FontFileResourceEntry)localObject).getFileName();
    localObject = paramContext;
    paramContext = TypefaceCompat.OooO0Oo(paramContext, paramResources, i, str, 0, paramInt);
    OooO00o(paramContext, paramFontFamilyFilesResourceEntry);
    return paramContext;
  }
  
  /* Error */
  public Typeface OooO0OO(Context paramContext, android.os.CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: istore 5
    //   4: iconst_1
    //   5: istore 6
    //   7: aconst_null
    //   8: astore 7
    //   10: iload 5
    //   12: iload 6
    //   14: if_icmpge +5 -> 19
    //   17: aconst_null
    //   18: areturn
    //   19: aload_0
    //   20: aload_3
    //   21: iload 4
    //   23: invokevirtual 121	androidx/core/graphics/TypefaceCompatBaseImpl:OooO	([Landroidx/core/provider/FontsContractCompat$FontInfo;I)Landroidx/core/provider/FontsContractCompat$FontInfo;
    //   26: astore_2
    //   27: aload_1
    //   28: invokevirtual 127	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   31: astore_3
    //   32: aload_2
    //   33: invokevirtual 131	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   36: astore_2
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 137	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   42: astore_2
    //   43: aload_0
    //   44: aload_1
    //   45: aload_2
    //   46: invokevirtual 140	androidx/core/graphics/TypefaceCompatBaseImpl:OooO0Oo	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   49: astore_1
    //   50: aload_2
    //   51: invokestatic 145	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   54: aload_1
    //   55: areturn
    //   56: astore_1
    //   57: aload_2
    //   58: astore 7
    //   60: goto +4 -> 64
    //   63: astore_1
    //   64: aload 7
    //   66: invokestatic 145	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   69: aload_1
    //   70: athrow
    //   71: pop
    //   72: iconst_0
    //   73: istore 5
    //   75: aconst_null
    //   76: astore_2
    //   77: aload_2
    //   78: invokestatic 145	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   81: aconst_null
    //   82: areturn
    //   83: pop
    //   84: goto -7 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	TypefaceCompatBaseImpl
    //   0	87	1	paramContext	Context
    //   0	87	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	87	3	paramArrayOfFontInfo	FontsContractCompat.FontInfo[]
    //   0	87	4	paramInt	int
    //   2	72	5	i	int
    //   5	10	6	j	int
    //   8	57	7	localCancellationSignal	android.os.CancellationSignal
    //   71	1	8	localIOException1	java.io.IOException
    //   83	1	9	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   45	49	56	finally
    //   27	31	63	finally
    //   32	36	63	finally
    //   38	42	63	finally
    //   27	31	71	java/io/IOException
    //   32	36	71	java/io/IOException
    //   38	42	71	java/io/IOException
    //   45	49	83	java/io/IOException
  }
  
  /* Error */
  public Typeface OooO0Oo(Context paramContext, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 151	androidx/core/graphics/TypefaceCompatUtil:OooO0o0	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: invokestatic 154	androidx/core/graphics/TypefaceCompatUtil:OooO0Oo	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 160	java/io/File:delete	()Z
    //   25: pop
    //   26: aconst_null
    //   27: areturn
    //   28: aload_1
    //   29: invokevirtual 163	java/io/File:getPath	()Ljava/lang/String;
    //   32: astore_2
    //   33: aload_2
    //   34: invokestatic 167	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   37: astore_2
    //   38: aload_1
    //   39: invokevirtual 160	java/io/File:delete	()Z
    //   42: pop
    //   43: aload_2
    //   44: areturn
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 160	java/io/File:delete	()Z
    //   50: pop
    //   51: aload_2
    //   52: athrow
    //   53: pop
    //   54: aload_1
    //   55: invokevirtual 160	java/io/File:delete	()Z
    //   58: pop
    //   59: aconst_null
    //   60: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	TypefaceCompatBaseImpl
    //   0	61	1	paramContext	Context
    //   0	61	2	paramInputStream	java.io.InputStream
    //   16	2	3	bool	boolean
    //   53	1	4	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   12	16	45	finally
    //   28	32	45	finally
    //   33	37	45	finally
    //   12	16	53	java/lang/RuntimeException
    //   28	32	53	java/lang/RuntimeException
    //   33	37	53	java/lang/RuntimeException
  }
  
  public final FontResourcesParserCompat.FontFileResourceEntry OooO0o(FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, int paramInt)
  {
    paramFontFamilyFilesResourceEntry = paramFontFamilyFilesResourceEntry.getEntries();
    TypefaceCompatBaseImpl.2 local2 = new androidx/core/graphics/TypefaceCompatBaseImpl$2;
    local2.<init>(this);
    return (FontResourcesParserCompat.FontFileResourceEntry)OooO0oO(paramFontFamilyFilesResourceEntry, paramInt, local2);
  }
  
  /* Error */
  public Typeface OooO0o0(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 151	androidx/core/graphics/TypefaceCompatUtil:OooO0o0	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: iload_3
    //   14: invokestatic 182	androidx/core/graphics/TypefaceCompatUtil:OooO0OO	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   17: istore 6
    //   19: iload 6
    //   21: ifne +10 -> 31
    //   24: aload_1
    //   25: invokevirtual 160	java/io/File:delete	()Z
    //   28: pop
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 163	java/io/File:getPath	()Ljava/lang/String;
    //   35: astore_2
    //   36: aload_2
    //   37: invokestatic 167	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   40: astore_2
    //   41: aload_1
    //   42: invokevirtual 160	java/io/File:delete	()Z
    //   45: pop
    //   46: aload_2
    //   47: areturn
    //   48: astore_2
    //   49: aload_1
    //   50: invokevirtual 160	java/io/File:delete	()Z
    //   53: pop
    //   54: aload_2
    //   55: athrow
    //   56: pop
    //   57: aload_1
    //   58: invokevirtual 160	java/io/File:delete	()Z
    //   61: pop
    //   62: aconst_null
    //   63: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	TypefaceCompatBaseImpl
    //   0	64	1	paramContext	Context
    //   0	64	2	paramResources	Resources
    //   0	64	3	paramInt1	int
    //   0	64	4	paramString	String
    //   0	64	5	paramInt2	int
    //   17	3	6	bool	boolean
    //   56	1	7	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   13	17	48	finally
    //   31	35	48	finally
    //   36	40	48	finally
    //   13	17	56	java/lang/RuntimeException
    //   31	35	56	java/lang/RuntimeException
    //   36	40	56	java/lang/RuntimeException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatBaseImpl
 * JD-Core Version:    0.7.0.1
 */