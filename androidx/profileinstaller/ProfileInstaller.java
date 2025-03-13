package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import java.io.File;
import java.util.concurrent.Executor;

public class ProfileInstaller
{
  public static final ProfileInstaller.DiagnosticsCallback OooO00o;
  public static final ProfileInstaller.DiagnosticsCallback OooO0O0;
  
  static
  {
    Object localObject = new androidx/profileinstaller/ProfileInstaller$1;
    ((ProfileInstaller.1)localObject).<init>();
    OooO00o = (ProfileInstaller.DiagnosticsCallback)localObject;
    localObject = new androidx/profileinstaller/ProfileInstaller$2;
    ((ProfileInstaller.2)localObject).<init>();
    OooO0O0 = (ProfileInstaller.DiagnosticsCallback)localObject;
  }
  
  public static void OooO(Context paramContext)
  {
    OooO0O0 localOooO0O0 = new androidx/profileinstaller/OooO0O0;
    localOooO0O0.<init>();
    ProfileInstaller.DiagnosticsCallback localDiagnosticsCallback = OooO00o;
    OooOO0(paramContext, localOooO0O0, localDiagnosticsCallback);
  }
  
  public static boolean OooO0O0(File paramFile)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramFile, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
    return localFile.delete();
  }
  
  public static void OooO0OO(Context paramContext, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    OooO0O0(paramContext.getFilesDir());
    OooO0oO(paramExecutor, paramDiagnosticsCallback, 11, null);
  }
  
  /* Error */
  public static boolean OooO0Oo(PackageInfo paramPackageInfo, File paramFile, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    // Byte code:
    //   0: new 34	java/io/File
    //   3: astore_3
    //   4: aload_3
    //   5: aload_1
    //   6: ldc 36
    //   8: invokespecial 39	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   11: aload_3
    //   12: invokevirtual 60	java/io/File:exists	()Z
    //   15: istore 4
    //   17: iconst_0
    //   18: istore 5
    //   20: iload 4
    //   22: ifne +5 -> 27
    //   25: iconst_0
    //   26: ireturn
    //   27: new 62	java/io/DataInputStream
    //   30: astore_1
    //   31: new 64	java/io/FileInputStream
    //   34: astore 6
    //   36: aload 6
    //   38: aload_3
    //   39: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   42: aload_1
    //   43: aload 6
    //   45: invokespecial 70	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: aload_1
    //   49: invokevirtual 74	java/io/DataInputStream:readLong	()J
    //   52: lstore 7
    //   54: aload_1
    //   55: invokevirtual 79	java/io/InputStream:close	()V
    //   58: aload_0
    //   59: getfield 85	android/content/pm/PackageInfo:lastUpdateTime	J
    //   62: lstore 9
    //   64: lload 7
    //   66: lload 9
    //   68: lcmp
    //   69: istore 11
    //   71: iload 11
    //   73: ifne +6 -> 79
    //   76: iconst_1
    //   77: istore 5
    //   79: iload 5
    //   81: ifeq +20 -> 101
    //   84: iconst_2
    //   85: istore 11
    //   87: iconst_0
    //   88: istore 4
    //   90: aconst_null
    //   91: astore_1
    //   92: aload_2
    //   93: iload 11
    //   95: aconst_null
    //   96: invokeinterface 92 3 0
    //   101: iload 5
    //   103: ireturn
    //   104: astore_0
    //   105: aload_1
    //   106: invokevirtual 79	java/io/InputStream:close	()V
    //   109: goto +9 -> 118
    //   112: astore_1
    //   113: aload_0
    //   114: aload_1
    //   115: invokevirtual 98	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   118: aload_0
    //   119: athrow
    //   120: iconst_0
    //   121: ireturn
    //   122: pop
    //   123: goto -3 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramPackageInfo	PackageInfo
    //   0	126	1	paramFile	File
    //   0	126	2	paramDiagnosticsCallback	ProfileInstaller.DiagnosticsCallback
    //   3	36	3	localFile	File
    //   15	74	4	bool1	boolean
    //   18	84	5	bool2	boolean
    //   34	10	6	localFileInputStream	java.io.FileInputStream
    //   52	13	7	l1	long
    //   62	5	9	l2	long
    //   69	3	11	bool3	boolean
    //   85	9	11	i	int
    //   122	1	11	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   48	52	104	finally
    //   105	109	112	finally
    //   27	30	122	java/io/IOException
    //   31	34	122	java/io/IOException
    //   38	42	122	java/io/IOException
    //   43	48	122	java/io/IOException
    //   54	58	122	java/io/IOException
    //   114	118	122	java/io/IOException
    //   118	120	122	java/io/IOException
  }
  
  /* Error */
  public static void OooO0o(PackageInfo paramPackageInfo, File paramFile)
  {
    // Byte code:
    //   0: new 34	java/io/File
    //   3: astore_2
    //   4: ldc 36
    //   6: astore_3
    //   7: aload_2
    //   8: aload_1
    //   9: aload_3
    //   10: invokespecial 39	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: new 102	java/io/DataOutputStream
    //   16: astore_1
    //   17: new 104	java/io/FileOutputStream
    //   20: astore_3
    //   21: aload_3
    //   22: aload_2
    //   23: invokespecial 105	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   26: aload_1
    //   27: aload_3
    //   28: invokespecial 108	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   31: aload_0
    //   32: getfield 85	android/content/pm/PackageInfo:lastUpdateTime	J
    //   35: lstore 4
    //   37: aload_1
    //   38: lload 4
    //   40: invokevirtual 112	java/io/DataOutputStream:writeLong	(J)V
    //   43: aload_1
    //   44: invokevirtual 115	java/io/OutputStream:close	()V
    //   47: goto +19 -> 66
    //   50: astore_0
    //   51: aload_1
    //   52: invokevirtual 115	java/io/OutputStream:close	()V
    //   55: goto +9 -> 64
    //   58: astore_1
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual 98	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   64: aload_0
    //   65: athrow
    //   66: return
    //   67: pop
    //   68: goto -2 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramPackageInfo	PackageInfo
    //   0	71	1	paramFile	File
    //   3	20	2	localFile	File
    //   6	22	3	localObject	Object
    //   35	4	4	l	long
    //   67	1	5	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   31	35	50	finally
    //   38	43	50	finally
    //   51	55	58	finally
    //   13	16	67	java/io/IOException
    //   17	20	67	java/io/IOException
    //   22	26	67	java/io/IOException
    //   27	31	67	java/io/IOException
    //   43	47	67	java/io/IOException
    //   60	64	67	java/io/IOException
    //   64	66	67	java/io/IOException
  }
  
  public static void OooO0oO(Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback, int paramInt, Object paramObject)
  {
    OooO0OO localOooO0OO = new androidx/profileinstaller/OooO0OO;
    localOooO0OO.<init>(paramDiagnosticsCallback, paramInt, paramObject);
    paramExecutor.execute(localOooO0OO);
  }
  
  public static boolean OooO0oo(AssetManager paramAssetManager, String paramString1, PackageInfo paramPackageInfo, File paramFile, String paramString2, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    File localFile = new java/io/File;
    Object localObject = new java/io/File;
    ((File)localObject).<init>("/data/misc/profiles/cur/0", paramString1);
    localFile.<init>((File)localObject, "primary.prof");
    paramString1 = new androidx/profileinstaller/DeviceProfileWriter;
    String str1 = "dexopt/baseline.prof";
    String str2 = "dexopt/baseline.profm";
    localObject = paramString1;
    paramString1.<init>(paramAssetManager, paramExecutor, paramDiagnosticsCallback, paramString2, str1, str2, localFile);
    boolean bool = paramString1.OooO0o0();
    if (!bool) {
      return false;
    }
    paramAssetManager = paramString1.OooO().OooOOO0();
    bool = paramAssetManager.OooOOO();
    if (bool) {
      OooO0o(paramPackageInfo, paramFile);
    }
    return bool;
  }
  
  public static void OooOO0(Context paramContext, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    OooOO0O(paramContext, paramExecutor, paramDiagnosticsCallback, false);
  }
  
  public static void OooOO0O(Context paramContext, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback, boolean paramBoolean)
  {
    Object localObject1 = paramContext.getApplicationContext();
    String str1 = ((Context)localObject1).getPackageName();
    Object localObject2 = ((Context)localObject1).getApplicationInfo();
    localObject1 = ((Context)localObject1).getAssets();
    Object localObject3 = new java/io/File;
    localObject2 = ((ApplicationInfo)localObject2).sourceDir;
    ((File)localObject3).<init>((String)localObject2);
    String str2 = ((File)localObject3).getName();
    localObject2 = paramContext.getPackageManager();
    boolean bool1 = false;
    try
    {
      localObject3 = ((PackageManager)localObject2).getPackageInfo(str1, 0);
      File localFile = paramContext.getFilesDir();
      if (!paramBoolean)
      {
        boolean bool2 = OooO0Oo((PackageInfo)localObject3, localFile, paramDiagnosticsCallback);
        if (bool2)
        {
          paramExecutor = new java/lang/StringBuilder;
          paramExecutor.<init>();
          paramExecutor.append("Skipping profile installation for ");
          paramDiagnosticsCallback = paramContext.getPackageName();
          paramExecutor.append(paramDiagnosticsCallback);
        }
      }
      for (;;)
      {
        ProfileVerifier.OooO0OO(paramContext, bool1);
        break;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Installing profile for ");
        Object localObject4 = paramContext.getPackageName();
        ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = localObject1;
        localObject4 = paramExecutor;
        boolean bool3 = OooO0oo((AssetManager)localObject1, str1, (PackageInfo)localObject3, localFile, str2, paramExecutor, paramDiagnosticsCallback);
        if ((bool3) && (paramBoolean)) {
          bool1 = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramExecutor)
    {
      paramDiagnosticsCallback.OooO0O0(7, paramExecutor);
      ProfileVerifier.OooO0OO(paramContext, false);
    }
  }
  
  public static void OooOO0o(Context paramContext, Executor paramExecutor, ProfileInstaller.DiagnosticsCallback paramDiagnosticsCallback)
  {
    Object localObject = paramContext.getApplicationContext().getPackageName();
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      localObject = localPackageManager.getPackageInfo((String)localObject, 0);
      paramContext = paramContext.getFilesDir();
      OooO0o((PackageInfo)localObject, paramContext);
      OooO0oO(paramExecutor, paramDiagnosticsCallback, 10, null);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      OooO0oO(paramExecutor, paramDiagnosticsCallback, 7, paramContext);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileInstaller
 * JD-Core Version:    0.7.0.1
 */