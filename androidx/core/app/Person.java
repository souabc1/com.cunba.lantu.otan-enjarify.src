package androidx.core.app;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class Person
{
  public CharSequence OooO00o;
  public IconCompat OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  
  public Person(Person.Builder paramBuilder)
  {
    Object localObject = paramBuilder.OooO00o;
    this.OooO00o = ((CharSequence)localObject);
    localObject = paramBuilder.OooO0O0;
    this.OooO0O0 = ((IconCompat)localObject);
    localObject = paramBuilder.OooO0OO;
    this.OooO0OO = ((String)localObject);
    localObject = paramBuilder.OooO0Oo;
    this.OooO0Oo = ((String)localObject);
    boolean bool1 = paramBuilder.OooO0o0;
    this.OooO0o0 = bool1;
    boolean bool2 = paramBuilder.OooO0o;
    this.OooO0o = bool2;
  }
  
  public android.app.Person OooO00o()
  {
    return Person.Api28Impl.OooO0O0(this);
  }
  
  public Bundle OooO0O0()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = this.OooO00o;
    localBundle.putCharSequence("name", (CharSequence)localObject1);
    Object localObject2 = this.OooO0O0;
    if (localObject2 != null) {
      localObject2 = ((IconCompat)localObject2).OooOO0O();
    } else {
      localObject2 = null;
    }
    localBundle.putBundle("icon", (Bundle)localObject2);
    localObject1 = this.OooO0OO;
    localBundle.putString("uri", (String)localObject1);
    localObject1 = this.OooO0Oo;
    localBundle.putString("key", (String)localObject1);
    boolean bool = this.OooO0o0;
    localBundle.putBoolean("isBot", bool);
    bool = this.OooO0o;
    localBundle.putBoolean("isImportant", bool);
    return localBundle;
  }
  
  public IconCompat getIcon()
  {
    return this.OooO0O0;
  }
  
  public String getKey()
  {
    return this.OooO0Oo;
  }
  
  public CharSequence getName()
  {
    return this.OooO00o;
  }
  
  public String getUri()
  {
    return this.OooO0OO;
  }
  
  public boolean isBot()
  {
    return this.OooO0o0;
  }
  
  public boolean isImportant()
  {
    return this.OooO0o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.Person
 * JD-Core Version:    0.7.0.1
 */