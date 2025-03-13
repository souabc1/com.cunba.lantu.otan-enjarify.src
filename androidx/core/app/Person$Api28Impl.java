package androidx.core.app;

import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

class Person$Api28Impl
{
  public static Person OooO00o(android.app.Person paramPerson)
  {
    Person.Builder localBuilder = new androidx/core/app/Person$Builder;
    localBuilder.<init>();
    Object localObject = paramPerson.getName();
    localBuilder = localBuilder.OooO0o((CharSequence)localObject);
    localObject = paramPerson.getIcon();
    if (localObject != null)
    {
      localObject = IconCompat.OooO00o(paramPerson.getIcon());
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    localBuilder = localBuilder.OooO0OO((IconCompat)localObject);
    localObject = paramPerson.getUri();
    localBuilder = localBuilder.OooO0oO((String)localObject);
    localObject = paramPerson.getKey();
    localBuilder = localBuilder.OooO0o0((String)localObject);
    boolean bool1 = paramPerson.isBot();
    localBuilder = localBuilder.OooO0O0(bool1);
    boolean bool2 = paramPerson.isImportant();
    return localBuilder.OooO0Oo(bool2).OooO00o();
  }
  
  public static android.app.Person OooO0O0(Person paramPerson)
  {
    android.app.Person.Builder localBuilder = new android/app/Person$Builder;
    localBuilder.<init>();
    Object localObject = paramPerson.getName();
    localBuilder = localBuilder.setName((CharSequence)localObject);
    localObject = paramPerson.getIcon();
    if (localObject != null)
    {
      localObject = paramPerson.getIcon().OooOO0o();
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    localBuilder = localBuilder.setIcon((Icon)localObject);
    localObject = paramPerson.getUri();
    localBuilder = localBuilder.setUri((String)localObject);
    localObject = paramPerson.getKey();
    localBuilder = localBuilder.setKey((String)localObject);
    boolean bool1 = paramPerson.isBot();
    localBuilder = localBuilder.setBot(bool1);
    boolean bool2 = paramPerson.isImportant();
    return localBuilder.setImportant(bool2).build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.Person.Api28Impl
 * JD-Core Version:    0.7.0.1
 */