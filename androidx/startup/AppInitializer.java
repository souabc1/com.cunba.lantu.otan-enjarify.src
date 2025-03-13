package androidx.startup;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer
{
  public static volatile AppInitializer OooO0Oo;
  public static final Object OooO0o0;
  public final Map OooO00o;
  public final Set OooO0O0;
  public final Context OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o0 = localObject;
  }
  
  public AppInitializer(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    this.OooO0OO = paramContext;
    paramContext = new java/util/HashSet;
    paramContext.<init>();
    this.OooO0O0 = paramContext;
    paramContext = new java/util/HashMap;
    paramContext.<init>();
    this.OooO00o = paramContext;
  }
  
  public static AppInitializer OooO0o0(Context paramContext)
  {
    ??? = OooO0Oo;
    if (??? == null) {
      synchronized (OooO0o0)
      {
        AppInitializer localAppInitializer = OooO0Oo;
        if (localAppInitializer == null)
        {
          localAppInitializer = new androidx/startup/AppInitializer;
          localAppInitializer.<init>(paramContext);
          OooO0Oo = localAppInitializer;
        }
      }
    }
    return OooO0Oo;
  }
  
  public static void setDelegate(AppInitializer paramAppInitializer)
  {
    synchronized (OooO0o0)
    {
      OooO0Oo = paramAppInitializer;
      return;
    }
  }
  
  /* Error */
  public void OooO00o()
  {
    // Byte code:
    //   0: ldc 45
    //   2: astore_1
    //   3: aload_1
    //   4: invokestatic 50	androidx/tracing/Trace:OooO00o	(Ljava/lang/String;)V
    //   7: new 52	android/content/ComponentName
    //   10: astore_1
    //   11: aload_0
    //   12: getfield 28	androidx/startup/AppInitializer:OooO0OO	Landroid/content/Context;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 56	android/content/Context:getPackageName	()Ljava/lang/String;
    //   20: astore_2
    //   21: ldc 58
    //   23: astore_3
    //   24: aload_3
    //   25: invokevirtual 63	java/lang/Class:getName	()Ljava/lang/String;
    //   28: astore_3
    //   29: aload_1
    //   30: aload_2
    //   31: aload_3
    //   32: invokespecial 66	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield 28	androidx/startup/AppInitializer:OooO0OO	Landroid/content/Context;
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 70	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   44: astore_2
    //   45: sipush 128
    //   48: istore 4
    //   50: aload_2
    //   51: aload_1
    //   52: iload 4
    //   54: invokevirtual 77	android/content/pm/PackageManager:getProviderInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
    //   57: astore_1
    //   58: aload_1
    //   59: getfield 83	android/content/pm/ProviderInfo:metaData	Landroid/os/Bundle;
    //   62: astore_1
    //   63: aload_0
    //   64: aload_1
    //   65: invokevirtual 86	androidx/startup/AppInitializer:OooO0O0	(Landroid/os/Bundle;)V
    //   68: invokestatic 88	androidx/tracing/Trace:OooO0O0	()V
    //   71: return
    //   72: astore_1
    //   73: goto +15 -> 88
    //   76: astore_1
    //   77: new 90	androidx/startup/StartupException
    //   80: astore_2
    //   81: aload_2
    //   82: aload_1
    //   83: invokespecial 93	androidx/startup/StartupException:<init>	(Ljava/lang/Throwable;)V
    //   86: aload_2
    //   87: athrow
    //   88: invokestatic 88	androidx/tracing/Trace:OooO0O0	()V
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	AppInitializer
    //   2	63	1	localObject1	Object
    //   72	1	1	localObject2	Object
    //   76	16	1	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   15	72	2	localObject3	Object
    //   23	9	3	localObject4	Object
    //   48	5	4	i	int
    // Exception table:
    //   from	to	target	type
    //   3	7	72	finally
    //   7	10	72	finally
    //   11	15	72	finally
    //   16	20	72	finally
    //   24	28	72	finally
    //   31	35	72	finally
    //   35	39	72	finally
    //   40	44	72	finally
    //   52	57	72	finally
    //   58	62	72	finally
    //   64	68	72	finally
    //   77	80	72	finally
    //   82	86	72	finally
    //   86	88	72	finally
    //   3	7	76	android/content/pm/PackageManager$NameNotFoundException
    //   7	10	76	android/content/pm/PackageManager$NameNotFoundException
    //   11	15	76	android/content/pm/PackageManager$NameNotFoundException
    //   16	20	76	android/content/pm/PackageManager$NameNotFoundException
    //   24	28	76	android/content/pm/PackageManager$NameNotFoundException
    //   31	35	76	android/content/pm/PackageManager$NameNotFoundException
    //   35	39	76	android/content/pm/PackageManager$NameNotFoundException
    //   40	44	76	android/content/pm/PackageManager$NameNotFoundException
    //   52	57	76	android/content/pm/PackageManager$NameNotFoundException
    //   58	62	76	android/content/pm/PackageManager$NameNotFoundException
    //   64	68	76	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public void OooO0O0(Bundle paramBundle)
  {
    Object localObject1 = this.OooO0OO;
    int i = R.string.androidx_startup;
    localObject1 = ((Context)localObject1).getString(i);
    if (paramBundle != null) {
      try
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        Object localObject2 = paramBundle.keySet();
        localObject2 = ((Set)localObject2).iterator();
        for (;;)
        {
          boolean bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          Object localObject3 = ((Iterator)localObject2).next();
          localObject3 = (String)localObject3;
          boolean bool2 = false;
          Object localObject4 = null;
          localObject4 = paramBundle.getString((String)localObject3, null);
          bool2 = ((String)localObject1).equals(localObject4);
          if (bool2)
          {
            localObject3 = Class.forName((String)localObject3);
            localObject4 = Initializer.class;
            bool2 = ((Class)localObject4).isAssignableFrom((Class)localObject3);
            if (bool2)
            {
              localObject4 = this.OooO0O0;
              ((Set)localObject4).add(localObject3);
            }
          }
        }
        paramBundle = this.OooO0O0;
        paramBundle = paramBundle.iterator();
        for (;;)
        {
          boolean bool3 = paramBundle.hasNext();
          if (!bool3) {
            break;
          }
          localObject1 = paramBundle.next();
          localObject1 = (Class)localObject1;
          OooO0Oo((Class)localObject1, localHashSet);
        }
        return;
      }
      catch (ClassNotFoundException paramBundle)
      {
        localObject1 = new androidx/startup/StartupException;
        ((StartupException)localObject1).<init>(paramBundle);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public Object OooO0OO(Class paramClass)
  {
    synchronized (OooO0o0)
    {
      Object localObject2 = this.OooO00o;
      localObject2 = ((Map)localObject2).get(paramClass);
      if (localObject2 == null)
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        localObject2 = OooO0Oo(paramClass, (Set)localObject2);
      }
      return localObject2;
    }
  }
  
  public final Object OooO0Oo(Class paramClass, Set paramSet)
  {
    boolean bool1 = Trace.isEnabled();
    if (bool1) {}
    try
    {
      Object localObject1 = paramClass.getSimpleName();
      Trace.OooO00o((String)localObject1);
      bool1 = paramSet.contains(paramClass);
      Object localObject2 = null;
      if (!bool1)
      {
        localObject1 = this.OooO00o;
        bool1 = ((Map)localObject1).containsKey(paramClass);
        if (!bool1)
        {
          paramSet.add(paramClass);
          try
          {
            localObject1 = new Class[0];
            localObject1 = paramClass.getDeclaredConstructor((Class[])localObject1);
            localObject2 = new Object[0];
            localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
            localObject1 = (Initializer)localObject1;
            localObject2 = ((Initializer)localObject1).OooO0O0();
            boolean bool2 = ((List)localObject2).isEmpty();
            if (!bool2)
            {
              localObject2 = ((List)localObject2).iterator();
              for (;;)
              {
                bool2 = ((Iterator)localObject2).hasNext();
                if (!bool2) {
                  break;
                }
                Object localObject3 = ((Iterator)localObject2).next();
                localObject3 = (Class)localObject3;
                Map localMap = this.OooO00o;
                boolean bool3 = localMap.containsKey(localObject3);
                if (!bool3) {
                  OooO0Oo((Class)localObject3, paramSet);
                }
              }
            }
            localObject2 = this.OooO0OO;
            localObject1 = ((Initializer)localObject1).OooO00o((Context)localObject2);
            paramSet.remove(paramClass);
            paramSet = this.OooO00o;
            paramSet.put(paramClass, localObject1);
          }
          finally
          {
            paramSet = new androidx/startup/StartupException;
            paramSet.<init>(paramClass);
          }
        }
        else
        {
          paramSet = this.OooO00o;
          localObject1 = paramSet.get(paramClass);
        }
        return localObject1;
      }
      paramSet = "Cannot initialize %s. Cycle detected.";
      bool1 = true;
      localObject1 = new Object[bool1];
      paramClass = paramClass.getName();
      localObject1[0] = paramClass;
      paramClass = String.format(paramSet, (Object[])localObject1);
      paramSet = new java/lang/IllegalStateException;
      paramSet.<init>(paramClass);
      throw paramSet;
    }
    finally
    {
      Trace.OooO0O0();
    }
  }
  
  public Object OooO0o(Class paramClass)
  {
    return OooO0OO(paramClass);
  }
  
  public boolean OooO0oO(Class paramClass)
  {
    return this.OooO0O0.contains(paramClass);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.startup.AppInitializer
 * JD-Core Version:    0.7.0.1
 */