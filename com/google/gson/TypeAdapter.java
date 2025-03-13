package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter
{
  public final Object fromJson(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    return read(localJsonReader);
  }
  
  public final Object fromJson(String paramString)
  {
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    return fromJson(localStringReader);
  }
  
  public final Object fromJsonTree(JsonElement paramJsonElement)
  {
    try
    {
      localObject = new com/google/gson/internal/bind/JsonTreeReader;
      ((JsonTreeReader)localObject).<init>(paramJsonElement);
      return read((JsonReader)localObject);
    }
    catch (IOException paramJsonElement)
    {
      Object localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(paramJsonElement);
      throw ((Throwable)localObject);
    }
  }
  
  public final TypeAdapter nullSafe()
  {
    TypeAdapter.1 local1 = new com/google/gson/TypeAdapter$1;
    local1.<init>(this);
    return local1;
  }
  
  public abstract Object read(JsonReader paramJsonReader);
  
  public final String toJson(Object paramObject)
  {
    Object localObject = new java/io/StringWriter;
    ((StringWriter)localObject).<init>();
    try
    {
      toJson((Writer)localObject, paramObject);
      return ((StringWriter)localObject).toString();
    }
    catch (IOException paramObject)
    {
      localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>(paramObject);
      throw ((Throwable)localObject);
    }
  }
  
  public final void toJson(Writer paramWriter, Object paramObject)
  {
    JsonWriter localJsonWriter = new com/google/gson/stream/JsonWriter;
    localJsonWriter.<init>(paramWriter);
    write(localJsonWriter, paramObject);
  }
  
  public final JsonElement toJsonTree(Object paramObject)
  {
    try
    {
      localObject = new com/google/gson/internal/bind/JsonTreeWriter;
      ((JsonTreeWriter)localObject).<init>();
      write((JsonWriter)localObject, paramObject);
      return ((JsonTreeWriter)localObject).get();
    }
    catch (IOException paramObject)
    {
      Object localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(paramObject);
      throw ((Throwable)localObject);
    }
  }
  
  public abstract void write(JsonWriter paramJsonWriter, Object paramObject);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.TypeAdapter
 * JD-Core Version:    0.7.0.1
 */