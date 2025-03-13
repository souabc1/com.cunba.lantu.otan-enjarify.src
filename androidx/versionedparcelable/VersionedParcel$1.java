package androidx.versionedparcelable;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class VersionedParcel$1
  extends ObjectInputStream
{
  public Class resolveClass(ObjectStreamClass paramObjectStreamClass)
  {
    Object localObject = paramObjectStreamClass.getName();
    ClassLoader localClassLoader = getClass().getClassLoader();
    localObject = Class.forName((String)localObject, false, localClassLoader);
    if (localObject != null) {
      return localObject;
    }
    return super.resolveClass(paramObjectStreamClass);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.versionedparcelable.VersionedParcel.1
 * JD-Core Version:    0.7.0.1
 */