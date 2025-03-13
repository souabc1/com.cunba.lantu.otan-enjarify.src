package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

abstract class ReflectiveTypeAdapterFactory$BoundField
{
  final boolean deserialized;
  final String name;
  final boolean serialized;
  
  public ReflectiveTypeAdapterFactory$BoundField(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.name = paramString;
    this.serialized = paramBoolean1;
    this.deserialized = paramBoolean2;
  }
  
  public abstract void read(JsonReader paramJsonReader, Object paramObject);
  
  public abstract void write(JsonWriter paramJsonWriter, Object paramObject);
  
  public abstract boolean writeField(Object paramObject);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
 * JD-Core Version:    0.7.0.1
 */