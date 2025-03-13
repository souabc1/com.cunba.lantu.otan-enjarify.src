package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

class AppLocalesStorageHelper
{
  /* Error */
  public static void OooO00o(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 10
    //   2: astore_2
    //   3: ldc 12
    //   5: astore_3
    //   6: aload_1
    //   7: aload_3
    //   8: invokevirtual 18	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   11: istore 4
    //   13: ldc 20
    //   15: astore 5
    //   17: iload 4
    //   19: ifeq +11 -> 30
    //   22: aload_0
    //   23: aload 5
    //   25: invokevirtual 26	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   28: pop
    //   29: return
    //   30: iconst_0
    //   31: istore 4
    //   33: aconst_null
    //   34: astore_3
    //   35: aload_0
    //   36: aload 5
    //   38: iconst_0
    //   39: invokevirtual 30	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   42: astore_0
    //   43: invokestatic 36	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   46: astore_3
    //   47: aconst_null
    //   48: astore 5
    //   50: aload_3
    //   51: aload_0
    //   52: aconst_null
    //   53: invokeinterface 42 3 0
    //   58: ldc 44
    //   60: astore 6
    //   62: getstatic 50	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   65: astore 7
    //   67: aload_3
    //   68: aload 6
    //   70: aload 7
    //   72: invokeinterface 54 3 0
    //   77: aload_3
    //   78: aconst_null
    //   79: aload_2
    //   80: invokeinterface 58 3 0
    //   85: pop
    //   86: ldc 60
    //   88: astore 6
    //   90: aload_3
    //   91: aconst_null
    //   92: aload 6
    //   94: aload_1
    //   95: invokeinterface 64 4 0
    //   100: pop
    //   101: aload_3
    //   102: aconst_null
    //   103: aload_2
    //   104: invokeinterface 67 3 0
    //   109: pop
    //   110: aload_3
    //   111: invokeinterface 70 1 0
    //   116: new 72	java/lang/StringBuilder
    //   119: astore_2
    //   120: aload_2
    //   121: invokespecial 73	java/lang/StringBuilder:<init>	()V
    //   124: ldc 75
    //   126: astore_3
    //   127: aload_2
    //   128: aload_3
    //   129: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_2
    //   134: aload_1
    //   135: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: ldc 81
    //   141: astore_3
    //   142: aload_2
    //   143: aload_3
    //   144: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_0
    //   149: ifnull +46 -> 195
    //   152: aload_0
    //   153: invokevirtual 86	java/io/FileOutputStream:close	()V
    //   156: goto +39 -> 195
    //   159: astore_1
    //   160: goto +36 -> 196
    //   163: pop
    //   164: new 72	java/lang/StringBuilder
    //   167: astore_2
    //   168: aload_2
    //   169: invokespecial 73	java/lang/StringBuilder:<init>	()V
    //   172: ldc 88
    //   174: astore_3
    //   175: aload_2
    //   176: aload_3
    //   177: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_2
    //   182: aload_1
    //   183: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_0
    //   188: ifnull +7 -> 195
    //   191: goto -39 -> 152
    //   194: pop
    //   195: return
    //   196: aload_0
    //   197: ifnull +7 -> 204
    //   200: aload_0
    //   201: invokevirtual 86	java/io/FileOutputStream:close	()V
    //   204: aload_1
    //   205: athrow
    //   206: pop
    //   207: iconst_1
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload 5
    //   215: aastore
    //   216: astore_1
    //   217: ldc 90
    //   219: aload_1
    //   220: invokestatic 94	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   223: pop
    //   224: return
    //   225: pop
    //   226: goto -22 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	paramContext	Context
    //   0	229	1	paramString	String
    //   2	180	2	localObject1	Object
    //   5	172	3	localObject2	Object
    //   11	21	4	bool	boolean
    //   15	199	5	str1	String
    //   60	33	6	str2	String
    //   65	6	7	localBoolean	java.lang.Boolean
    //   163	1	8	localException	java.lang.Exception
    //   194	1	9	localIOException1	java.io.IOException
    //   206	1	10	localFileNotFoundException	java.io.FileNotFoundException
    //   225	1	11	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   52	58	159	finally
    //   62	65	159	finally
    //   70	77	159	finally
    //   79	86	159	finally
    //   94	101	159	finally
    //   103	110	159	finally
    //   110	116	159	finally
    //   116	119	159	finally
    //   120	124	159	finally
    //   128	133	159	finally
    //   134	139	159	finally
    //   143	148	159	finally
    //   164	167	159	finally
    //   168	172	159	finally
    //   176	181	159	finally
    //   182	187	159	finally
    //   52	58	163	java/lang/Exception
    //   62	65	163	java/lang/Exception
    //   70	77	163	java/lang/Exception
    //   79	86	163	java/lang/Exception
    //   94	101	163	java/lang/Exception
    //   103	110	163	java/lang/Exception
    //   110	116	163	java/lang/Exception
    //   116	119	163	java/lang/Exception
    //   120	124	163	java/lang/Exception
    //   128	133	163	java/lang/Exception
    //   134	139	163	java/lang/Exception
    //   143	148	163	java/lang/Exception
    //   152	156	194	java/io/IOException
    //   38	42	206	java/io/FileNotFoundException
    //   200	204	225	java/io/IOException
  }
  
  /* Error */
  public static String OooO0O0(Context paramContext)
  {
    // Byte code:
    //   0: ldc 20
    //   2: astore_1
    //   3: ldc 12
    //   5: astore_2
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 104	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_3
    //   12: invokestatic 108	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 4
    //   17: ldc 44
    //   19: astore 5
    //   21: aload 4
    //   23: aload_3
    //   24: aload 5
    //   26: invokeinterface 114 3 0
    //   31: aload 4
    //   33: invokeinterface 118 1 0
    //   38: istore 6
    //   40: aload 4
    //   42: invokeinterface 121 1 0
    //   47: istore 7
    //   49: iconst_1
    //   50: istore 8
    //   52: iload 7
    //   54: iload 8
    //   56: if_icmpeq +97 -> 153
    //   59: iconst_3
    //   60: istore 8
    //   62: iload 7
    //   64: iload 8
    //   66: if_icmpne +19 -> 85
    //   69: aload 4
    //   71: invokeinterface 118 1 0
    //   76: istore 9
    //   78: iload 9
    //   80: iload 6
    //   82: if_icmple +71 -> 153
    //   85: iload 7
    //   87: iload 8
    //   89: if_icmpeq -49 -> 40
    //   92: iconst_4
    //   93: istore 8
    //   95: iload 7
    //   97: iload 8
    //   99: if_icmpne +6 -> 105
    //   102: goto -62 -> 40
    //   105: aload 4
    //   107: invokeinterface 128 1 0
    //   112: astore 10
    //   114: ldc 10
    //   116: astore 11
    //   118: aload 10
    //   120: aload 11
    //   122: invokevirtual 18	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   125: istore 7
    //   127: iload 7
    //   129: ifeq -89 -> 40
    //   132: ldc 60
    //   134: astore 5
    //   136: iconst_0
    //   137: istore 7
    //   139: aconst_null
    //   140: astore 10
    //   142: aload 4
    //   144: aconst_null
    //   145: aload 5
    //   147: invokeinterface 132 3 0
    //   152: astore_2
    //   153: aload_3
    //   154: ifnull +30 -> 184
    //   157: aload_3
    //   158: invokevirtual 135	java/io/FileInputStream:close	()V
    //   161: goto +23 -> 184
    //   164: astore_0
    //   165: aload_3
    //   166: ifnull +7 -> 173
    //   169: aload_3
    //   170: invokevirtual 135	java/io/FileInputStream:close	()V
    //   173: aload_0
    //   174: athrow
    //   175: pop
    //   176: aload_3
    //   177: ifnull +7 -> 184
    //   180: goto -23 -> 157
    //   183: pop
    //   184: aload_2
    //   185: invokevirtual 139	java/lang/String:isEmpty	()Z
    //   188: istore 12
    //   190: iload 12
    //   192: ifne +29 -> 221
    //   195: new 72	java/lang/StringBuilder
    //   198: astore_0
    //   199: aload_0
    //   200: invokespecial 73	java/lang/StringBuilder:<init>	()V
    //   203: ldc 141
    //   205: astore_1
    //   206: aload_0
    //   207: aload_1
    //   208: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload_0
    //   213: aload_2
    //   214: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: goto +9 -> 227
    //   221: aload_0
    //   222: aload_1
    //   223: invokevirtual 26	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   226: pop
    //   227: aload_2
    //   228: areturn
    //   229: pop
    //   230: goto -57 -> 173
    //   233: pop
    //   234: goto -7 -> 227
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	paramContext	Context
    //   2	221	1	str1	String
    //   5	223	2	str2	String
    //   11	166	3	localFileInputStream	java.io.FileInputStream
    //   15	128	4	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   19	127	5	str3	String
    //   38	45	6	i	int
    //   47	53	7	j	int
    //   125	13	7	bool1	boolean
    //   50	50	8	k	int
    //   76	7	9	m	int
    //   112	29	10	str4	String
    //   116	5	11	str5	String
    //   188	3	12	bool2	boolean
    //   175	1	14	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   183	1	15	localIOException1	java.io.IOException
    //   229	1	16	localIOException2	java.io.IOException
    //   233	1	17	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   12	15	164	finally
    //   24	31	164	finally
    //   31	38	164	finally
    //   40	47	164	finally
    //   69	76	164	finally
    //   105	112	164	finally
    //   120	125	164	finally
    //   145	152	164	finally
    //   12	15	175	org/xmlpull/v1/XmlPullParserException
    //   12	15	175	java/io/IOException
    //   24	31	175	org/xmlpull/v1/XmlPullParserException
    //   24	31	175	java/io/IOException
    //   31	38	175	org/xmlpull/v1/XmlPullParserException
    //   31	38	175	java/io/IOException
    //   40	47	175	org/xmlpull/v1/XmlPullParserException
    //   40	47	175	java/io/IOException
    //   69	76	175	org/xmlpull/v1/XmlPullParserException
    //   69	76	175	java/io/IOException
    //   105	112	175	org/xmlpull/v1/XmlPullParserException
    //   105	112	175	java/io/IOException
    //   120	125	175	org/xmlpull/v1/XmlPullParserException
    //   120	125	175	java/io/IOException
    //   145	152	175	org/xmlpull/v1/XmlPullParserException
    //   145	152	175	java/io/IOException
    //   157	161	183	java/io/IOException
    //   169	173	229	java/io/IOException
    //   7	11	233	java/io/FileNotFoundException
  }
  
  public static void OooO0OO(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, "androidx.appcompat.app.AppLocalesMetadataHolderService");
      Object localObject1 = paramContext.getPackageManager();
      j = ((PackageManager)localObject1).getComponentEnabledSetting(localComponentName);
      int k = 1;
      if (j != k)
      {
        localObject1 = AppCompatDelegate.getApplicationLocales();
        boolean bool = ((LocaleListCompat)localObject1).isEmpty();
        if (bool)
        {
          localObject1 = OooO0O0(paramContext);
          Object localObject2 = paramContext.getSystemService("locale");
          if (localObject2 != null)
          {
            localObject1 = AppCompatDelegate.Api24Impl.OooO00o((String)localObject1);
            AppCompatDelegate.Api33Impl.OooO0O0(localObject2, (LocaleList)localObject1);
          }
        }
        paramContext = paramContext.getPackageManager();
        paramContext.setComponentEnabledSetting(localComponentName, k, k);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppLocalesStorageHelper
 * JD-Core Version:    0.7.0.1
 */