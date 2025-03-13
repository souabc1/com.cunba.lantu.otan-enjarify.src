package androidx.core.app;

import android.os.BaseBundle;
import android.os.PersistableBundle;

class Person$Api22Impl
{
  public static Person OooO00o(PersistableBundle paramPersistableBundle)
  {
    Person.Builder localBuilder = new androidx/core/app/Person$Builder;
    localBuilder.<init>();
    String str = paramPersistableBundle.getString("name");
    localBuilder = localBuilder.OooO0o(str);
    str = paramPersistableBundle.getString("uri");
    localBuilder = localBuilder.OooO0oO(str);
    str = paramPersistableBundle.getString("key");
    localBuilder = localBuilder.OooO0o0(str);
    boolean bool1 = paramPersistableBundle.getBoolean("isBot");
    localBuilder = localBuilder.OooO0O0(bool1);
    boolean bool2 = paramPersistableBundle.getBoolean("isImportant");
    return localBuilder.OooO0Oo(bool2).OooO00o();
  }
  
  public static PersistableBundle OooO0O0(Person paramPerson)
  {
    PersistableBundle localPersistableBundle = new android/os/PersistableBundle;
    localPersistableBundle.<init>();
    Object localObject = paramPerson.OooO00o;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    localPersistableBundle.putString("name", (String)localObject);
    String str = paramPerson.OooO0OO;
    localPersistableBundle.putString("uri", str);
    str = paramPerson.OooO0Oo;
    localPersistableBundle.putString("key", str);
    boolean bool1 = paramPerson.OooO0o0;
    localPersistableBundle.putBoolean("isBot", bool1);
    boolean bool2 = paramPerson.OooO0o;
    localPersistableBundle.putBoolean("isImportant", bool2);
    return localPersistableBundle;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.Person.Api22Impl
 * JD-Core Version:    0.7.0.1
 */