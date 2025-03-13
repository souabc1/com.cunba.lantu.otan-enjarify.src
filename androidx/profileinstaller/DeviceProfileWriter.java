package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class DeviceProfileWriter
{
  public boolean OooO = false;
  public final AssetManager OooO00o;
  public final Executor OooO0O0;
  public final ProfileInstaller.DiagnosticsCallback OooO0OO;
  public final byte[] OooO0Oo;
  public final String OooO0o;
  public final File OooO0o0;
  public final String OooO0oO;
  public final String OooO0oo;
  public DexProfileData[] OooOO0;
  public byte[] OooOO0O;
  
  public DeviceProfileWriter(AssetManager paramAssetManager, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback, String paramString1, String paramString2, String paramString3, File paramFile)
  {
    this.OooO00o = paramAssetManager;
    this.OooO0O0 = paramExecutor;
    this.OooO0OO = paramDiagnosticsCallback;
    this.OooO0o = paramString1;
    this.OooO0oO = paramString2;
    this.OooO0oo = paramString3;
    this.OooO0o0 = paramFile;
    paramAssetManager = OooO0Oo();
    this.OooO0Oo = paramAssetManager;
  }
  
  public static byte[] OooO0Oo()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i > j) {
      return null;
    }
    switch (i)
    {
    default: 
      return null;
    case 31: 
    case 32: 
    case 33: 
      return ProfileVersion.OooO00o;
    }
    return ProfileVersion.OooO0O0;
  }
  
  public static boolean OooOO0O()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i > j) {
      return false;
    }
    switch (i)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public DeviceProfileWriter OooO()
  {
    OooO0OO();
    Object localObject = this.OooO0Oo;
    if (localObject == null) {
      return this;
    }
    localObject = this.OooO00o;
    localObject = OooO0o((AssetManager)localObject);
    if (localObject != null)
    {
      localObject = OooOO0((InputStream)localObject);
      this.OooOO0 = ((DexProfileData[])localObject);
    }
    localObject = this.OooOO0;
    if (localObject != null)
    {
      boolean bool = OooOO0O();
      if (bool)
      {
        byte[] arrayOfByte = this.OooO0Oo;
        localObject = OooO0O0((DexProfileData[])localObject, arrayOfByte);
        if (localObject != null) {
          return localObject;
        }
      }
    }
    return this;
  }
  
  /* Error */
  public final DeviceProfileWriter OooO0O0(DexProfileData[] paramArrayOfDexProfileData, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	androidx/profileinstaller/DeviceProfileWriter:OooO00o	Landroid/content/res/AssetManager;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield 41	androidx/profileinstaller/DeviceProfileWriter:OooO0oo	Ljava/lang/String;
    //   9: astore 4
    //   11: aload_0
    //   12: aload_3
    //   13: aload 4
    //   15: invokevirtual 88	androidx/profileinstaller/DeviceProfileWriter:OooO0oo	(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull +52 -> 72
    //   23: getstatic 91	androidx/profileinstaller/ProfileTranscoder:OooO0O0	[B
    //   26: astore 4
    //   28: aload_3
    //   29: aload 4
    //   31: invokestatic 95	androidx/profileinstaller/ProfileTranscoder:OooOOO	(Ljava/io/InputStream;[B)[B
    //   34: astore 4
    //   36: aload_3
    //   37: aload 4
    //   39: aload_2
    //   40: aload_1
    //   41: invokestatic 99	androidx/profileinstaller/ProfileTranscoder:OooOOOo	(Ljava/io/InputStream;[B[B[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;
    //   44: astore_1
    //   45: aload_0
    //   46: aload_1
    //   47: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   50: aload_3
    //   51: invokevirtual 104	java/io/InputStream:close	()V
    //   54: aload_0
    //   55: areturn
    //   56: astore_1
    //   57: aload_3
    //   58: invokevirtual 104	java/io/InputStream:close	()V
    //   61: goto +9 -> 70
    //   64: astore_2
    //   65: aload_1
    //   66: aload_2
    //   67: invokevirtual 110	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   70: aload_1
    //   71: athrow
    //   72: aload_3
    //   73: ifnull +60 -> 133
    //   76: aload_3
    //   77: invokevirtual 104	java/io/InputStream:close	()V
    //   80: goto +53 -> 133
    //   83: astore_1
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   89: aload_0
    //   90: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   93: astore_2
    //   94: bipush 8
    //   96: istore 5
    //   98: goto +26 -> 124
    //   101: astore_1
    //   102: aload_0
    //   103: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   106: astore_2
    //   107: bipush 7
    //   109: istore 5
    //   111: goto +13 -> 124
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   119: astore_2
    //   120: bipush 9
    //   122: istore 5
    //   124: aload_2
    //   125: iload 5
    //   127: aload_1
    //   128: invokeinterface 68 3 0
    //   133: aconst_null
    //   134: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	DeviceProfileWriter
    //   0	135	1	paramArrayOfDexProfileData	DexProfileData[]
    //   0	135	2	paramArrayOfByte	byte[]
    //   4	73	3	localObject1	Object
    //   9	29	4	localObject2	Object
    //   96	30	5	i	int
    // Exception table:
    //   from	to	target	type
    //   23	26	56	finally
    //   29	34	56	finally
    //   40	44	56	finally
    //   46	50	56	finally
    //   57	61	64	finally
    //   0	4	83	java/lang/IllegalStateException
    //   5	9	83	java/lang/IllegalStateException
    //   13	18	83	java/lang/IllegalStateException
    //   50	54	83	java/lang/IllegalStateException
    //   66	70	83	java/lang/IllegalStateException
    //   70	72	83	java/lang/IllegalStateException
    //   76	80	83	java/lang/IllegalStateException
    //   0	4	101	java/io/IOException
    //   5	9	101	java/io/IOException
    //   13	18	101	java/io/IOException
    //   50	54	101	java/io/IOException
    //   66	70	101	java/io/IOException
    //   70	72	101	java/io/IOException
    //   76	80	101	java/io/IOException
    //   0	4	114	java/io/FileNotFoundException
    //   5	9	114	java/io/FileNotFoundException
    //   13	18	114	java/io/FileNotFoundException
    //   50	54	114	java/io/FileNotFoundException
    //   66	70	114	java/io/FileNotFoundException
    //   70	72	114	java/io/FileNotFoundException
    //   76	80	114	java/io/FileNotFoundException
  }
  
  public final void OooO0OO()
  {
    boolean bool = this.OooO;
    if (bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    throw localIllegalStateException;
  }
  
  public final InputStream OooO0o(AssetManager paramAssetManager)
  {
    Object localObject;
    int i;
    try
    {
      localObject = this.OooO0oO;
      paramAssetManager = OooO0oo(paramAssetManager, (String)localObject);
    }
    catch (IOException paramAssetManager)
    {
      localObject = this.OooO0OO;
      i = 7;
    }
    catch (FileNotFoundException paramAssetManager)
    {
      localObject = this.OooO0OO;
      i = 6;
    }
    ((ProfileInstaller.DiagnosticsCallback)localObject).OooO0O0(i, paramAssetManager);
    paramAssetManager = null;
    return paramAssetManager;
  }
  
  public boolean OooO0o0()
  {
    Object localObject = this.OooO0Oo;
    if (localObject == null)
    {
      localObject = Integer.valueOf(Build.VERSION.SDK_INT);
      OooOO0o(3, localObject);
      return false;
    }
    localObject = this.OooO0o0;
    boolean bool = ((File)localObject).canWrite();
    if (!bool)
    {
      OooOO0o(4, null);
      return false;
    }
    bool = true;
    this.OooO = bool;
    return bool;
  }
  
  public final InputStream OooO0oo(AssetManager paramAssetManager, String paramString)
  {
    try
    {
      paramAssetManager = paramAssetManager.openFd(paramString);
      paramAssetManager = paramAssetManager.createInputStream();
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      paramAssetManager = localFileNotFoundException.getMessage();
      paramString = null;
      if (paramAssetManager != null)
      {
        String str = "compressed";
        bool = paramAssetManager.contains(str);
        if (bool)
        {
          paramAssetManager = this.OooO0OO;
          int i = 5;
          paramAssetManager.OooO00o(i, null);
        }
      }
      boolean bool = false;
      paramAssetManager = null;
    }
    return paramAssetManager;
  }
  
  /* Error */
  public final DexProfileData[] OooOO0(InputStream paramInputStream)
  {
    // Byte code:
    //   0: bipush 7
    //   2: istore_2
    //   3: getstatic 169	androidx/profileinstaller/ProfileTranscoder:OooO00o	[B
    //   6: astore_3
    //   7: aload_1
    //   8: aload_3
    //   9: invokestatic 95	androidx/profileinstaller/ProfileTranscoder:OooOOO	(Ljava/io/InputStream;[B)[B
    //   12: astore_3
    //   13: aload_0
    //   14: getfield 37	androidx/profileinstaller/DeviceProfileWriter:OooO0o	Ljava/lang/String;
    //   17: astore 4
    //   19: aload_1
    //   20: aload_3
    //   21: aload 4
    //   23: invokestatic 173	androidx/profileinstaller/ProfileTranscoder:OooOo0O	(Ljava/io/InputStream;[BLjava/lang/String;)[Landroidx/profileinstaller/DexProfileData;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 104	java/io/InputStream:close	()V
    //   31: goto +93 -> 124
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   39: astore 4
    //   41: aload 4
    //   43: iload_2
    //   44: aload_1
    //   45: invokeinterface 68 3 0
    //   50: goto +74 -> 124
    //   53: astore_3
    //   54: goto +72 -> 126
    //   57: astore_3
    //   58: aload_0
    //   59: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   62: astore 4
    //   64: bipush 8
    //   66: istore 5
    //   68: aload 4
    //   70: iload 5
    //   72: aload_3
    //   73: invokeinterface 68 3 0
    //   78: aload_1
    //   79: invokevirtual 104	java/io/InputStream:close	()V
    //   82: goto +40 -> 122
    //   85: astore_3
    //   86: aload_0
    //   87: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   90: astore 4
    //   92: aload 4
    //   94: iload_2
    //   95: aload_3
    //   96: invokeinterface 68 3 0
    //   101: aload_1
    //   102: invokevirtual 104	java/io/InputStream:close	()V
    //   105: goto +17 -> 122
    //   108: astore_1
    //   109: aload_0
    //   110: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   113: astore_3
    //   114: aload_3
    //   115: iload_2
    //   116: aload_1
    //   117: invokeinterface 68 3 0
    //   122: aconst_null
    //   123: astore_3
    //   124: aload_3
    //   125: areturn
    //   126: aload_1
    //   127: invokevirtual 104	java/io/InputStream:close	()V
    //   130: goto +19 -> 149
    //   133: astore_1
    //   134: aload_0
    //   135: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   138: astore 4
    //   140: aload 4
    //   142: iload_2
    //   143: aload_1
    //   144: invokeinterface 68 3 0
    //   149: aload_3
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	DeviceProfileWriter
    //   0	151	1	paramInputStream	InputStream
    //   2	141	2	i	int
    //   6	21	3	localObject1	Object
    //   53	1	3	localObject2	Object
    //   57	16	3	localIllegalStateException	IllegalStateException
    //   85	11	3	localIOException	IOException
    //   113	37	3	localDiagnosticsCallback	ProfileInstaller.DiagnosticsCallback
    //   17	124	4	localObject3	Object
    //   66	5	5	j	int
    // Exception table:
    //   from	to	target	type
    //   27	31	34	java/io/IOException
    //   3	6	53	finally
    //   8	12	53	finally
    //   13	17	53	finally
    //   21	26	53	finally
    //   58	62	53	finally
    //   72	78	53	finally
    //   86	90	53	finally
    //   95	101	53	finally
    //   3	6	57	java/lang/IllegalStateException
    //   8	12	57	java/lang/IllegalStateException
    //   13	17	57	java/lang/IllegalStateException
    //   21	26	57	java/lang/IllegalStateException
    //   3	6	85	java/io/IOException
    //   8	12	85	java/io/IOException
    //   13	17	85	java/io/IOException
    //   21	26	85	java/io/IOException
    //   78	82	108	java/io/IOException
    //   101	105	108	java/io/IOException
    //   126	130	133	java/io/IOException
  }
  
  public final void OooOO0o(int paramInt, Object paramObject)
  {
    Executor localExecutor = this.OooO0O0;
    OooO00o localOooO00o = new androidx/profileinstaller/OooO00o;
    localOooO00o.<init>(this, paramInt, paramObject);
    localExecutor.execute(localOooO00o);
  }
  
  /* Error */
  public boolean OooOOO()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 186	androidx/profileinstaller/DeviceProfileWriter:OooOO0O	[B
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_0
    //   12: invokevirtual 71	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	()V
    //   15: new 188	java/io/ByteArrayInputStream
    //   18: astore_2
    //   19: aload_2
    //   20: aload_1
    //   21: invokespecial 191	java/io/ByteArrayInputStream:<init>	([B)V
    //   24: new 193	java/io/FileOutputStream
    //   27: astore_1
    //   28: aload_0
    //   29: getfield 43	androidx/profileinstaller/DeviceProfileWriter:OooO0o0	Ljava/io/File;
    //   32: astore_3
    //   33: aload_1
    //   34: aload_3
    //   35: invokespecial 196	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   38: aload_2
    //   39: aload_1
    //   40: invokestatic 201	androidx/profileinstaller/Encoding:OooOO0o	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   43: iconst_1
    //   44: istore 4
    //   46: aload_0
    //   47: iload 4
    //   49: aconst_null
    //   50: invokevirtual 135	androidx/profileinstaller/DeviceProfileWriter:OooOO0o	(ILjava/lang/Object;)V
    //   53: aload_1
    //   54: invokevirtual 204	java/io/OutputStream:close	()V
    //   57: aload_2
    //   58: invokevirtual 104	java/io/InputStream:close	()V
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 186	androidx/profileinstaller/DeviceProfileWriter:OooOO0O	[B
    //   66: aload_0
    //   67: aconst_null
    //   68: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   71: iload 4
    //   73: ireturn
    //   74: astore_3
    //   75: aload_1
    //   76: invokevirtual 204	java/io/OutputStream:close	()V
    //   79: goto +9 -> 88
    //   82: astore_1
    //   83: aload_3
    //   84: aload_1
    //   85: invokevirtual 110	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_3
    //   89: athrow
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 104	java/io/InputStream:close	()V
    //   95: goto +9 -> 104
    //   98: astore_2
    //   99: aload_1
    //   100: aload_2
    //   101: invokevirtual 110	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   104: aload_1
    //   105: athrow
    //   106: astore_1
    //   107: goto +42 -> 149
    //   110: astore_1
    //   111: bipush 7
    //   113: istore 5
    //   115: aload_0
    //   116: iload 5
    //   118: aload_1
    //   119: invokevirtual 135	androidx/profileinstaller/DeviceProfileWriter:OooOO0o	(ILjava/lang/Object;)V
    //   122: goto +15 -> 137
    //   125: astore_1
    //   126: bipush 6
    //   128: istore 5
    //   130: aload_0
    //   131: iload 5
    //   133: aload_1
    //   134: invokevirtual 135	androidx/profileinstaller/DeviceProfileWriter:OooOO0o	(ILjava/lang/Object;)V
    //   137: aload_0
    //   138: aconst_null
    //   139: putfield 186	androidx/profileinstaller/DeviceProfileWriter:OooOO0O	[B
    //   142: aload_0
    //   143: aconst_null
    //   144: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   147: iconst_0
    //   148: ireturn
    //   149: aload_0
    //   150: aconst_null
    //   151: putfield 186	androidx/profileinstaller/DeviceProfileWriter:OooOO0O	[B
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   159: aload_1
    //   160: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	DeviceProfileWriter
    //   4	72	1	localObject1	Object
    //   82	3	1	localThrowable1	Throwable
    //   90	15	1	localObject2	Object
    //   106	1	1	localObject3	Object
    //   110	9	1	localIOException	IOException
    //   125	35	1	localFileNotFoundException	FileNotFoundException
    //   18	74	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   98	3	2	localThrowable2	Throwable
    //   32	3	3	localFile	File
    //   74	15	3	localObject4	Object
    //   44	28	4	i	int
    //   113	19	5	j	int
    // Exception table:
    //   from	to	target	type
    //   39	43	74	finally
    //   49	53	74	finally
    //   75	79	82	finally
    //   24	27	90	finally
    //   28	32	90	finally
    //   34	38	90	finally
    //   53	57	90	finally
    //   84	88	90	finally
    //   88	90	90	finally
    //   91	95	98	finally
    //   15	18	106	finally
    //   20	24	106	finally
    //   57	61	106	finally
    //   100	104	106	finally
    //   104	106	106	finally
    //   118	122	106	finally
    //   133	137	106	finally
    //   15	18	110	java/io/IOException
    //   20	24	110	java/io/IOException
    //   57	61	110	java/io/IOException
    //   100	104	110	java/io/IOException
    //   104	106	110	java/io/IOException
    //   15	18	125	java/io/FileNotFoundException
    //   20	24	125	java/io/FileNotFoundException
    //   57	61	125	java/io/FileNotFoundException
    //   100	104	125	java/io/FileNotFoundException
    //   104	106	125	java/io/FileNotFoundException
  }
  
  /* Error */
  public DeviceProfileWriter OooOOO0()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 48	androidx/profileinstaller/DeviceProfileWriter:OooO0Oo	[B
    //   9: astore_2
    //   10: aload_1
    //   11: ifnull +138 -> 149
    //   14: aload_2
    //   15: ifnonnull +6 -> 21
    //   18: goto +131 -> 149
    //   21: aload_0
    //   22: invokevirtual 71	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	()V
    //   25: new 206	java/io/ByteArrayOutputStream
    //   28: astore_3
    //   29: aload_3
    //   30: invokespecial 207	java/io/ByteArrayOutputStream:<init>	()V
    //   33: aload_3
    //   34: aload_2
    //   35: invokestatic 211	androidx/profileinstaller/ProfileTranscoder:OooOooO	(Ljava/io/OutputStream;[B)V
    //   38: aload_3
    //   39: aload_2
    //   40: aload_1
    //   41: invokestatic 215	androidx/profileinstaller/ProfileTranscoder:OooOoOO	(Ljava/io/OutputStream;[B[Landroidx/profileinstaller/DexProfileData;)Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifne +31 -> 79
    //   51: aload_0
    //   52: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   55: astore_1
    //   56: iconst_5
    //   57: istore 5
    //   59: aload_1
    //   60: iload 5
    //   62: aconst_null
    //   63: invokeinterface 68 3 0
    //   68: aload_0
    //   69: aconst_null
    //   70: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   73: aload_3
    //   74: invokevirtual 216	java/io/ByteArrayOutputStream:close	()V
    //   77: aload_0
    //   78: areturn
    //   79: aload_3
    //   80: invokevirtual 219	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   83: astore_1
    //   84: aload_0
    //   85: aload_1
    //   86: putfield 186	androidx/profileinstaller/DeviceProfileWriter:OooOO0O	[B
    //   89: aload_3
    //   90: invokevirtual 216	java/io/ByteArrayOutputStream:close	()V
    //   93: goto +51 -> 144
    //   96: astore_1
    //   97: aload_3
    //   98: invokevirtual 216	java/io/ByteArrayOutputStream:close	()V
    //   101: goto +9 -> 110
    //   104: astore_2
    //   105: aload_1
    //   106: aload_2
    //   107: invokevirtual 110	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   110: aload_1
    //   111: athrow
    //   112: astore_1
    //   113: aload_0
    //   114: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   117: astore_2
    //   118: bipush 8
    //   120: istore 6
    //   122: goto +13 -> 135
    //   125: astore_1
    //   126: aload_0
    //   127: getfield 35	androidx/profileinstaller/DeviceProfileWriter:OooO0OO	Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;
    //   130: astore_2
    //   131: bipush 7
    //   133: istore 6
    //   135: aload_2
    //   136: iload 6
    //   138: aload_1
    //   139: invokeinterface 68 3 0
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield 79	androidx/profileinstaller/DeviceProfileWriter:OooOO0	[Landroidx/profileinstaller/DexProfileData;
    //   149: aload_0
    //   150: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	DeviceProfileWriter
    //   4	82	1	localObject1	Object
    //   96	15	1	localObject2	Object
    //   112	1	1	localIllegalStateException	IllegalStateException
    //   125	14	1	localIOException	IOException
    //   9	31	2	arrayOfByte	byte[]
    //   104	3	2	localThrowable	Throwable
    //   117	19	2	localDiagnosticsCallback	ProfileInstaller.DiagnosticsCallback
    //   28	70	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   44	3	4	bool	boolean
    //   57	4	5	i	int
    //   120	17	6	j	int
    // Exception table:
    //   from	to	target	type
    //   34	38	96	finally
    //   40	44	96	finally
    //   51	55	96	finally
    //   62	68	96	finally
    //   69	73	96	finally
    //   79	83	96	finally
    //   85	89	96	finally
    //   97	101	104	finally
    //   25	28	112	java/lang/IllegalStateException
    //   29	33	112	java/lang/IllegalStateException
    //   73	77	112	java/lang/IllegalStateException
    //   89	93	112	java/lang/IllegalStateException
    //   106	110	112	java/lang/IllegalStateException
    //   110	112	112	java/lang/IllegalStateException
    //   25	28	125	java/io/IOException
    //   29	33	125	java/io/IOException
    //   73	77	125	java/io/IOException
    //   89	93	125	java/io/IOException
    //   106	110	125	java/io/IOException
    //   110	112	125	java/io/IOException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.DeviceProfileWriter
 * JD-Core Version:    0.7.0.1
 */