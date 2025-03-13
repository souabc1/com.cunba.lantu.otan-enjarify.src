package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

class DocumentsContractApi19
{
  /* Error */
  public static long OooO(Context paramContext, Uri paramUri, String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 14	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore_0
    //   8: iconst_1
    //   9: anewarray 16	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: aload_2
    //   15: aastore
    //   16: astore 6
    //   18: aload 5
    //   20: aload_1
    //   21: aload 6
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 22	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_0
    //   30: aload_0
    //   31: invokeinterface 28 1 0
    //   36: istore 7
    //   38: iload 7
    //   40: ifeq +38 -> 78
    //   43: iconst_0
    //   44: istore 7
    //   46: aconst_null
    //   47: astore_1
    //   48: aload_0
    //   49: iconst_0
    //   50: invokeinterface 32 2 0
    //   55: istore 8
    //   57: iload 8
    //   59: ifne +19 -> 78
    //   62: aload_0
    //   63: iconst_0
    //   64: invokeinterface 36 2 0
    //   69: lstore 9
    //   71: aload_0
    //   72: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   75: lload 9
    //   77: lreturn
    //   78: aload_0
    //   79: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   82: lload_3
    //   83: lreturn
    //   84: astore_1
    //   85: goto +35 -> 120
    //   88: astore_1
    //   89: new 42	java/lang/StringBuilder
    //   92: astore_2
    //   93: aload_2
    //   94: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   97: ldc 45
    //   99: astore 5
    //   101: aload_2
    //   102: aload 5
    //   104: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_2
    //   109: aload_1
    //   110: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload_0
    //   115: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   118: lload_3
    //   119: lreturn
    //   120: aload_0
    //   121: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   124: aload_1
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramContext	Context
    //   0	126	1	paramUri	Uri
    //   0	126	2	paramString	String
    //   0	126	3	paramLong	long
    //   4	99	5	localObject	Object
    //   16	6	6	arrayOfString	String[]
    //   36	9	7	bool1	boolean
    //   55	3	8	bool2	boolean
    //   69	7	9	l	long
    // Exception table:
    //   from	to	target	type
    //   8	16	84	finally
    //   25	29	84	finally
    //   30	36	84	finally
    //   49	55	84	finally
    //   63	69	84	finally
    //   89	92	84	finally
    //   93	97	84	finally
    //   102	108	84	finally
    //   109	114	84	finally
    //   8	16	88	java/lang/Exception
    //   25	29	88	java/lang/Exception
    //   30	36	88	java/lang/Exception
    //   49	55	88	java/lang/Exception
    //   63	69	88	java/lang/Exception
  }
  
  public static void OooO00o(AutoCloseable paramAutoCloseable)
  {
    if (paramAutoCloseable != null) {
      try
      {
        paramAutoCloseable.close();
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
      catch (Exception localException) {}
    }
  }
  
  public static long OooO0O0(Context paramContext, Uri paramUri)
  {
    return OooO(paramContext, paramUri, "flags", 0L);
  }
  
  public static String OooO0OO(Context paramContext, Uri paramUri)
  {
    return OooOO0(paramContext, paramUri, "_display_name", null);
  }
  
  public static String OooO0Oo(Context paramContext, Uri paramUri)
  {
    return OooOO0(paramContext, paramUri, "mime_type", null);
  }
  
  public static boolean OooO0o(Context paramContext, Uri paramUri)
  {
    paramContext = OooO0Oo(paramContext, paramUri);
    return "vnd.android.document/directory".equals(paramContext);
  }
  
  public static String OooO0o0(Context paramContext, Uri paramUri)
  {
    paramContext = OooO0Oo(paramContext, paramUri);
    paramUri = "vnd.android.document/directory";
    boolean bool = paramUri.equals(paramContext);
    if (bool) {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static boolean OooO0oO(Context paramContext, Uri paramUri)
  {
    paramContext = OooO0Oo(paramContext, paramUri);
    paramUri = "vnd.android.document/directory";
    boolean bool1 = paramUri.equals(paramContext);
    if (!bool1)
    {
      boolean bool2 = TextUtils.isEmpty(paramContext);
      if (!bool2) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean OooO0oo(Context paramContext, Uri paramUri)
  {
    boolean bool1 = DocumentsContract.isDocumentUri(paramContext, paramUri);
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    long l1 = OooO0O0(paramContext, paramUri) & 0x200;
    long l2 = 0L;
    boolean bool3 = l1 < l2;
    if (bool3) {
      bool2 = true;
    }
    return bool2;
  }
  
  /* Error */
  public static String OooOO0(Context paramContext, Uri paramUri, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 14	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 4
    //   6: aconst_null
    //   7: astore_0
    //   8: iconst_1
    //   9: anewarray 16	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: aload_2
    //   15: aastore
    //   16: astore 5
    //   18: aload 4
    //   20: aload_1
    //   21: aload 5
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 22	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_0
    //   30: aload_0
    //   31: invokeinterface 28 1 0
    //   36: istore 6
    //   38: iload 6
    //   40: ifeq +36 -> 76
    //   43: iconst_0
    //   44: istore 6
    //   46: aconst_null
    //   47: astore_1
    //   48: aload_0
    //   49: iconst_0
    //   50: invokeinterface 32 2 0
    //   55: istore 7
    //   57: iload 7
    //   59: ifne +17 -> 76
    //   62: aload_0
    //   63: iconst_0
    //   64: invokeinterface 110 2 0
    //   69: astore_1
    //   70: aload_0
    //   71: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   74: aload_1
    //   75: areturn
    //   76: aload_0
    //   77: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   80: aload_3
    //   81: areturn
    //   82: astore_1
    //   83: goto +35 -> 118
    //   86: astore_1
    //   87: new 42	java/lang/StringBuilder
    //   90: astore_2
    //   91: aload_2
    //   92: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   95: ldc 45
    //   97: astore 4
    //   99: aload_2
    //   100: aload 4
    //   102: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_2
    //   107: aload_1
    //   108: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_0
    //   113: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   116: aload_3
    //   117: areturn
    //   118: aload_0
    //   119: invokestatic 40	androidx/documentfile/provider/DocumentsContractApi19:OooO00o	(Ljava/lang/AutoCloseable;)V
    //   122: aload_1
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	paramContext	Context
    //   0	124	1	paramUri	Uri
    //   0	124	2	paramString1	String
    //   0	124	3	paramString2	String
    //   4	97	4	localObject	Object
    //   16	6	5	arrayOfString	String[]
    //   36	9	6	bool1	boolean
    //   55	3	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   8	16	82	finally
    //   25	29	82	finally
    //   30	36	82	finally
    //   49	55	82	finally
    //   63	69	82	finally
    //   87	90	82	finally
    //   91	95	82	finally
    //   100	106	82	finally
    //   107	112	82	finally
    //   8	16	86	java/lang/Exception
    //   25	29	86	java/lang/Exception
    //   30	36	86	java/lang/Exception
    //   49	55	86	java/lang/Exception
    //   63	69	86	java/lang/Exception
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.documentfile.provider.DocumentsContractApi19
 * JD-Core Version:    0.7.0.1
 */