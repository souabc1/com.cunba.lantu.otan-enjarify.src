package androidx.core.app;

import java.lang.reflect.Method;

class ActivityRecreator$3
  implements Runnable
{
  public ActivityRecreator$3(Object paramObject1, Object paramObject2) {}
  
  public void run()
  {
    try
    {
      Method localMethod = ActivityRecreator.OooO0Oo;
      bool = true;
      localObject1 = null;
      int i = 2;
      Object localObject2;
      Object localObject3;
      if (localMethod != null)
      {
        localObject2 = this.o00OoOoo;
        int j = 3;
        localObject3 = new Object[j];
        Object localObject4 = this.o00Ooo00;
        localObject3[0] = localObject4;
        localObject1 = Boolean.FALSE;
        localObject3[bool] = localObject1;
        localObject5 = "AppCompat recreation";
        localObject3[i] = localObject5;
        localMethod.invoke(localObject2, (Object[])localObject3);
      }
      else
      {
        localMethod = ActivityRecreator.OooO0o0;
        localObject2 = this.o00OoOoo;
        Object[] arrayOfObject = new Object[i];
        localObject3 = this.o00Ooo00;
        arrayOfObject[0] = localObject3;
        localObject1 = Boolean.FALSE;
        arrayOfObject[bool] = localObject1;
        localMethod.invoke(localObject2, arrayOfObject);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      boolean bool;
      localRuntimeException = localRuntimeException;
      Object localObject5 = localRuntimeException.getClass();
      Object localObject1 = RuntimeException.class;
      if (localObject5 == localObject1)
      {
        localObject5 = localRuntimeException.getMessage();
        if (localObject5 != null)
        {
          localObject5 = localRuntimeException.getMessage();
          localObject1 = "Unable to stop";
          bool = ((String)localObject5).startsWith((String)localObject1);
          if (bool) {
            throw localRuntimeException;
          }
        }
      }
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityRecreator.3
 * JD-Core Version:    0.7.0.1
 */