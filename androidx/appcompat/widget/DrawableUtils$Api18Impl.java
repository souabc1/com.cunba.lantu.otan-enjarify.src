package androidx.appcompat.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DrawableUtils$Api18Impl
{
  public static final boolean OooO00o = false;
  public static final Method OooO0O0;
  public static final Field OooO0OO;
  public static final Field OooO0Oo;
  public static final Field OooO0o;
  public static final Field OooO0o0;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 16
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: astore_1
    //   10: ldc 24
    //   12: astore_2
    //   13: ldc 26
    //   15: astore_3
    //   16: iconst_0
    //   17: anewarray 18	java/lang/Class
    //   20: astore 4
    //   22: aload_2
    //   23: aload_3
    //   24: aload 4
    //   26: invokevirtual 30	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   29: astore_2
    //   30: ldc 32
    //   32: astore_3
    //   33: aload_1
    //   34: aload_3
    //   35: invokevirtual 36	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore_3
    //   39: ldc 38
    //   41: astore 4
    //   43: aload_1
    //   44: aload 4
    //   46: invokevirtual 36	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   49: astore 4
    //   51: ldc 40
    //   53: astore 5
    //   55: aload_1
    //   56: aload 5
    //   58: invokevirtual 36	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   61: astore 5
    //   63: ldc 42
    //   65: astore 6
    //   67: aload_1
    //   68: aload 6
    //   70: invokevirtual 36	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   73: astore_1
    //   74: iload_0
    //   75: istore 7
    //   77: goto +90 -> 167
    //   80: pop
    //   81: aconst_null
    //   82: astore 5
    //   84: goto +75 -> 159
    //   87: pop
    //   88: aconst_null
    //   89: astore 4
    //   91: goto +65 -> 156
    //   94: pop
    //   95: aconst_null
    //   96: astore 4
    //   98: goto +58 -> 156
    //   101: pop
    //   102: aconst_null
    //   103: astore 4
    //   105: goto +51 -> 156
    //   108: pop
    //   109: aconst_null
    //   110: astore_3
    //   111: goto +20 -> 131
    //   114: pop
    //   115: aconst_null
    //   116: astore_3
    //   117: goto +25 -> 142
    //   120: pop
    //   121: aconst_null
    //   122: astore_3
    //   123: goto +30 -> 153
    //   126: pop
    //   127: aconst_null
    //   128: astore_2
    //   129: aconst_null
    //   130: astore_3
    //   131: aconst_null
    //   132: astore 4
    //   134: goto +22 -> 156
    //   137: pop
    //   138: aconst_null
    //   139: astore_2
    //   140: aconst_null
    //   141: astore_3
    //   142: aconst_null
    //   143: astore 4
    //   145: goto +11 -> 156
    //   148: pop
    //   149: aconst_null
    //   150: astore_2
    //   151: aconst_null
    //   152: astore_3
    //   153: aconst_null
    //   154: astore 4
    //   156: aconst_null
    //   157: astore 5
    //   159: aconst_null
    //   160: astore_1
    //   161: iconst_0
    //   162: istore 7
    //   164: aconst_null
    //   165: astore 6
    //   167: iload 7
    //   169: ifeq +32 -> 201
    //   172: aload_2
    //   173: putstatic 44	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0O0	Ljava/lang/reflect/Method;
    //   176: aload_3
    //   177: putstatic 46	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0OO	Ljava/lang/reflect/Field;
    //   180: aload 4
    //   182: putstatic 48	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0Oo	Ljava/lang/reflect/Field;
    //   185: aload 5
    //   187: putstatic 50	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0o0	Ljava/lang/reflect/Field;
    //   190: aload_1
    //   191: putstatic 52	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0o	Ljava/lang/reflect/Field;
    //   194: iload_0
    //   195: putstatic 54	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO00o	Z
    //   198: goto +27 -> 225
    //   201: aconst_null
    //   202: putstatic 44	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0O0	Ljava/lang/reflect/Method;
    //   205: aconst_null
    //   206: putstatic 46	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0OO	Ljava/lang/reflect/Field;
    //   209: aconst_null
    //   210: putstatic 48	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0Oo	Ljava/lang/reflect/Field;
    //   213: aconst_null
    //   214: putstatic 50	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0o0	Ljava/lang/reflect/Field;
    //   217: aconst_null
    //   218: putstatic 52	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO0o	Ljava/lang/reflect/Field;
    //   221: iconst_0
    //   222: putstatic 54	androidx/appcompat/widget/DrawableUtils$Api18Impl:OooO00o	Z
    //   225: return
    //   226: pop
    //   227: goto -68 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	194	0	bool	boolean
    //   4	187	1	localObject1	Object
    //   12	161	2	localObject2	Object
    //   15	162	3	localObject3	Object
    //   20	161	4	localObject4	Object
    //   53	133	5	localObject5	Object
    //   65	101	6	str	java.lang.String
    //   75	93	7	i	int
    //   80	1	8	localNoSuchMethodException1	java.lang.NoSuchMethodException
    //   87	1	9	localNoSuchFieldException1	java.lang.NoSuchFieldException
    //   94	1	10	localClassNotFoundException1	java.lang.ClassNotFoundException
    //   101	1	11	localNoSuchMethodException2	java.lang.NoSuchMethodException
    //   108	1	12	localNoSuchFieldException2	java.lang.NoSuchFieldException
    //   114	1	13	localClassNotFoundException2	java.lang.ClassNotFoundException
    //   120	1	14	localNoSuchMethodException3	java.lang.NoSuchMethodException
    //   126	1	15	localNoSuchFieldException3	java.lang.NoSuchFieldException
    //   137	1	16	localClassNotFoundException3	java.lang.ClassNotFoundException
    //   148	1	17	localNoSuchMethodException4	java.lang.NoSuchMethodException
    //   226	1	18	localNoSuchMethodException5	java.lang.NoSuchMethodException
    // Exception table:
    //   from	to	target	type
    //   56	61	80	java/lang/NoSuchMethodException
    //   56	61	80	java/lang/ClassNotFoundException
    //   56	61	80	java/lang/NoSuchFieldException
    //   44	49	87	java/lang/NoSuchFieldException
    //   44	49	94	java/lang/ClassNotFoundException
    //   44	49	101	java/lang/NoSuchMethodException
    //   34	38	108	java/lang/NoSuchFieldException
    //   34	38	114	java/lang/ClassNotFoundException
    //   34	38	120	java/lang/NoSuchMethodException
    //   5	9	126	java/lang/NoSuchFieldException
    //   16	20	126	java/lang/NoSuchFieldException
    //   24	29	126	java/lang/NoSuchFieldException
    //   5	9	137	java/lang/ClassNotFoundException
    //   16	20	137	java/lang/ClassNotFoundException
    //   24	29	137	java/lang/ClassNotFoundException
    //   5	9	148	java/lang/NoSuchMethodException
    //   16	20	148	java/lang/NoSuchMethodException
    //   24	29	148	java/lang/NoSuchMethodException
    //   68	73	226	java/lang/NoSuchMethodException
    //   68	73	226	java/lang/ClassNotFoundException
    //   68	73	226	java/lang/NoSuchFieldException
  }
  
  public static Rect OooO00o(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j)
    {
      boolean bool = OooO00o;
      if (bool) {
        try
        {
          Object localObject1 = OooO0O0;
          j = 0;
          Object localObject2 = null;
          localObject2 = new Object[0];
          paramDrawable = ((Method)localObject1).invoke(paramDrawable, (Object[])localObject2);
          if (paramDrawable != null)
          {
            localObject1 = new android/graphics/Rect;
            localObject2 = OooO0OO;
            j = ((Field)localObject2).getInt(paramDrawable);
            Field localField1 = OooO0Oo;
            int k = localField1.getInt(paramDrawable);
            Field localField2 = OooO0o0;
            int m = localField2.getInt(paramDrawable);
            Field localField3 = OooO0o;
            int n = localField3.getInt(paramDrawable);
            ((Rect)localObject1).<init>(j, k, m, n);
            return localObject1;
          }
        }
        catch (IllegalAccessException|InvocationTargetException localIllegalAccessException) {}
      }
    }
    return DrawableUtils.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DrawableUtils.Api18Impl
 * JD-Core Version:    0.7.0.1
 */