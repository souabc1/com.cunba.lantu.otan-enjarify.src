package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class $Gson$Types$ParameterizedTypeImpl
  implements ParameterizedType, Serializable
{
  private static final long serialVersionUID;
  private final Type ownerType;
  private final Type rawType;
  private final Type[] typeArguments;
  
  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool1 = paramType2 instanceof Class;
    int i = 0;
    if (bool1)
    {
      Object localObject = paramType2;
      localObject = (Class)paramType2;
      boolean bool2 = Modifier.isStatic(((Class)localObject).getModifiers());
      boolean bool3 = true;
      if (!bool2)
      {
        localObject = ((Class)localObject).getEnclosingClass();
        if (localObject != null)
        {
          bool1 = false;
          localObject = null;
          break label73;
        }
      }
      bool1 = bool3;
      label73:
      if ((paramType1 == null) && (!bool1)) {
        bool3 = false;
      }
      .Gson.Preconditions.checkArgument(bool3);
    }
    if (paramType1 == null)
    {
      j = 0;
      paramType1 = null;
    }
    else
    {
      paramType1 = .Gson.Types.canonicalize(paramType1);
    }
    this.ownerType = paramType1;
    paramType1 = .Gson.Types.canonicalize(paramType2);
    this.rawType = paramType1;
    paramType1 = (Type[])paramVarArgs.clone();
    this.typeArguments = paramType1;
    int j = paramType1.length;
    while (i < j)
    {
      .Gson.Preconditions.checkNotNull(this.typeArguments[i]);
      .Gson.Types.checkNotPrimitive(this.typeArguments[i]);
      paramType2 = this.typeArguments;
      paramVarArgs = .Gson.Types.canonicalize(paramType2[i]);
      paramType2[i] = paramVarArgs;
      i += 1;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ParameterizedType;
    if (bool1)
    {
      paramObject = (ParameterizedType)paramObject;
      bool2 = .Gson.Types.equals(this, paramObject);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    return bool2;
  }
  
  public Type[] getActualTypeArguments()
  {
    return (Type[])this.typeArguments.clone();
  }
  
  public Type getOwnerType()
  {
    return this.ownerType;
  }
  
  public Type getRawType()
  {
    return this.rawType;
  }
  
  public int hashCode()
  {
    int i = Arrays.hashCode(this.typeArguments);
    int j = this.rawType.hashCode();
    i ^= j;
    j = .Gson.Types.hashCodeOrZero(this.ownerType);
    return i ^ j;
  }
  
  public String toString()
  {
    Type[] arrayOfType = this.typeArguments;
    int i = arrayOfType.length;
    if (i == 0) {
      return .Gson.Types.typeToString(this.rawType);
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int j = (i + 1) * 30;
    localStringBuilder.<init>(j);
    Object localObject = .Gson.Types.typeToString(this.rawType);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("<");
    localObject = this.typeArguments;
    String str = null;
    localObject = .Gson.Types.typeToString(localObject[0]);
    localStringBuilder.append((String)localObject);
    j = 1;
    while (j < i)
    {
      localStringBuilder.append(", ");
      str = .Gson.Types.typeToString(this.typeArguments[j]);
      localStringBuilder.append(str);
      j += 1;
    }
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal..Gson.Types.ParameterizedTypeImpl
 * JD-Core Version:    0.7.0.1
 */