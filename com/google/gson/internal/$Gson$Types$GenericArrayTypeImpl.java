package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class $Gson$Types$GenericArrayTypeImpl
  implements GenericArrayType, Serializable
{
  private static final long serialVersionUID;
  private final Type componentType;
  
  public $Gson$Types$GenericArrayTypeImpl(Type paramType)
  {
    paramType = .Gson.Types.canonicalize(paramType);
    this.componentType = paramType;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof GenericArrayType;
    if (bool1)
    {
      paramObject = (GenericArrayType)paramObject;
      bool2 = .Gson.Types.equals(this, paramObject);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    return bool2;
  }
  
  public Type getGenericComponentType()
  {
    return this.componentType;
  }
  
  public int hashCode()
  {
    return this.componentType.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = .Gson.Types.typeToString(this.componentType);
    localStringBuilder.append(str);
    localStringBuilder.append("[]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal..Gson.Types.GenericArrayTypeImpl
 * JD-Core Version:    0.7.0.1
 */