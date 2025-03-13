package androidx.appcompat.app;

import android.content.res.Resources.NotFoundException;

class AppCompatDelegateImpl$1
  implements Thread.UncaughtExceptionHandler
{
  public final boolean OooO00o(Throwable paramThrowable)
  {
    boolean bool1 = paramThrowable instanceof Resources.NotFoundException;
    boolean bool2 = false;
    if (bool1)
    {
      paramThrowable = paramThrowable.getMessage();
      if (paramThrowable != null)
      {
        String str = "drawable";
        bool1 = paramThrowable.contains(str);
        if (!bool1)
        {
          str = "Drawable";
          boolean bool3 = paramThrowable.contains(str);
          if (!bool3) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    boolean bool = OooO00o(paramThrowable);
    Object localObject1;
    if (bool)
    {
      localObject1 = new android/content/res/Resources$NotFoundException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = paramThrowable.getMessage();
      ((StringBuilder)localObject2).append(str);
      str = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
      ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((Resources.NotFoundException)localObject1).<init>((String)localObject2);
      localObject2 = paramThrowable.getCause();
      ((Throwable)localObject1).initCause((Throwable)localObject2);
      paramThrowable = paramThrowable.getStackTrace();
      ((Throwable)localObject1).setStackTrace(paramThrowable);
      paramThrowable = this.OooO00o;
      paramThrowable.uncaughtException(paramThread, (Throwable)localObject1);
    }
    else
    {
      localObject1 = this.OooO00o;
      ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.1
 * JD-Core Version:    0.7.0.1
 */