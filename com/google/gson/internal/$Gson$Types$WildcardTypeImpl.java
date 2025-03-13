package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import m54207b69;

final class $Gson$Types$WildcardTypeImpl
  implements WildcardType, Serializable
{
  private static final long serialVersionUID;
  private final Type lowerBound;
  private final Type upperBound;
  
  public $Gson$Types$WildcardTypeImpl(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    int i = paramArrayOfType2.length;
    int m = 1;
    Object localObject;
    if (i <= m)
    {
      i = m;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    .Gson.Preconditions.checkArgument(i);
    int j = paramArrayOfType1.length;
    if (j == m)
    {
      j = m;
    }
    else
    {
      j = 0;
      localObject = null;
    }
    .Gson.Preconditions.checkArgument(j);
    int k = paramArrayOfType2.length;
    if (k == m)
    {
      .Gson.Preconditions.checkNotNull(paramArrayOfType2[0]);
      .Gson.Types.checkNotPrimitive(paramArrayOfType2[0]);
      paramArrayOfType1 = paramArrayOfType1[0];
      localObject = Object.class;
      boolean bool;
      if (paramArrayOfType1 != localObject) {
        bool = false;
      }
      .Gson.Preconditions.checkArgument(bool);
      paramArrayOfType1 = .Gson.Types.canonicalize(paramArrayOfType2[0]);
      this.lowerBound = paramArrayOfType1;
      this.upperBound = localObject;
    }
    else
    {
      .Gson.Preconditions.checkNotNull(paramArrayOfType1[0]);
      .Gson.Types.checkNotPrimitive(paramArrayOfType1[0]);
      paramArrayOfType2 = null;
      this.lowerBound = null;
      paramArrayOfType1 = .Gson.Types.canonicalize(paramArrayOfType1[0]);
      this.upperBound = paramArrayOfType1;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof WildcardType;
    if (bool1)
    {
      paramObject = (WildcardType)paramObject;
      bool2 = .Gson.Types.equals(this, paramObject);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    return bool2;
  }
  
  public Type[] getLowerBounds()
  {
    Type localType = this.lowerBound;
    Type[] arrayOfType;
    if (localType != null)
    {
      int i = 1;
      arrayOfType = new Type[i];
      arrayOfType[0] = localType;
    }
    else
    {
      arrayOfType = .Gson.Types.EMPTY_TYPE_ARRAY;
    }
    return arrayOfType;
  }
  
  public Type[] getUpperBounds()
  {
    Type[] arrayOfType = new Type[1];
    Type localType = this.upperBound;
    arrayOfType[0] = localType;
    return arrayOfType;
  }
  
  public int hashCode()
  {
    Type localType = this.lowerBound;
    int i;
    if (localType != null) {
      i = localType.hashCode() + 31;
    } else {
      i = 1;
    }
    int j = this.upperBound.hashCode() + 31;
    return i ^ j;
  }
  
  public String toString()
  {
    Object localObject1 = this.lowerBound;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("SG786836353B273B6E");
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (Object localObject2 = this.lowerBound;; localObject2 = this.upperBound)
    {
      localObject2 = .Gson.Types.typeToString((Type)localObject2);
      ((StringBuilder)localObject1).append((String)localObject2);
      return ((StringBuilder)localObject1).toString();
      localObject1 = this.upperBound;
      localObject2 = Object.class;
      if (localObject1 == localObject2) {
        return "?";
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("3a5E42061C1909150C1A4A");
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal..Gson.Types.WildcardTypeImpl
 * JD-Core Version:    0.7.0.1
 */