package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class FieldAttributes
{
  private final Field field;
  
  public FieldAttributes(Field paramField)
  {
    .Gson.Preconditions.checkNotNull(paramField);
    this.field = paramField;
  }
  
  public Object get(Object paramObject)
  {
    return this.field.get(paramObject);
  }
  
  public Annotation getAnnotation(Class paramClass)
  {
    return this.field.getAnnotation(paramClass);
  }
  
  public Collection getAnnotations()
  {
    return Arrays.asList(this.field.getAnnotations());
  }
  
  public Class getDeclaredClass()
  {
    return this.field.getType();
  }
  
  public Type getDeclaredType()
  {
    return this.field.getGenericType();
  }
  
  public Class getDeclaringClass()
  {
    return this.field.getDeclaringClass();
  }
  
  public String getName()
  {
    return this.field.getName();
  }
  
  public boolean hasModifier(int paramInt)
  {
    Field localField = this.field;
    int i = localField.getModifiers();
    paramInt &= i;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public boolean isSynthetic()
  {
    return this.field.isSynthetic();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.FieldAttributes
 * JD-Core Version:    0.7.0.1
 */